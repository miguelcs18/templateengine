package mx.com.ravisa.ecommerce.templateengine.service.Impl;

import lombok.Getter;
import lombok.Setter;
import mx.com.ravisa.ecommerce.templateengine.bean.*;
import mx.com.ravisa.ecommerce.templateengine.model.Page;
import mx.com.ravisa.ecommerce.templateengine.model.Widget;
import mx.com.ravisa.ecommerce.templateengine.model.WidgetContainer;
import mx.com.ravisa.ecommerce.templateengine.repository.PageRepository;
import mx.com.ravisa.ecommerce.templateengine.repository.SiteRepository;
import mx.com.ravisa.ecommerce.templateengine.repository.WidgetContainerRepository;
import mx.com.ravisa.ecommerce.templateengine.repository.WidgetRepository;
import mx.com.ravisa.ecommerce.templateengine.service.PageService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service(value = "pageService")
public class PageServiceImpl implements PageService {

    @Resource
    @Setter
    @Getter
    private PageRepository pageRepository;

    @Resource
    @Setter
    @Getter
    private SiteRepository siteRepository;

    @Resource
    @Setter
    @Getter
    private WidgetContainerRepository widgetContainerRepository;

    @Resource
    @Setter
    @Getter
    private WidgetRepository widgetRepository;

    @Override
    public List<PageBean> getPageBySite(int idSite) {
        List<Page> pages = getPageRepository().findPagesBySite(getSiteRepository().findSiteByidSite(idSite));
        List<PageBean> pagesBean=new ArrayList<>();
        castPageToPageBean(pages, pagesBean);
        return pagesBean;
    }

    private void castPageToPageBean(List<Page> pages, List<PageBean> pagesBean) {
        for (Page page:pages) {
            PageBean pageBean =  new PageBean();
            BeanUtils.copyProperties(page,pageBean);
            LayoutBean layoutBean = new LayoutBean();
            BeanUtils.copyProperties(page.getLayout(),layoutBean);
            pageBean.setLayout(layoutBean);
            List<RegionBean> regionBeans= new ArrayList<>();
            setData(page, pageBean, regionBeans);
            pagesBean.add(pageBean);
        }
    }

    private void setData(Page page, PageBean pageBean, List<RegionBean> regionBeans) {
        for (int i = 0; i < page.getLayout().getRegions().size(); i++) {
            RegionBean regionBean = new RegionBean();
            BeanUtils.copyProperties(page.getLayout().getRegions().get(i), regionBean);
            regionBeans.add(regionBean);
            pageBean.getLayout().setRegions(regionBeans);
            List<ContainerBean> containers= new ArrayList<>();
            setDataContainer(page, i, containers);
            pageBean.getLayout().getRegions().get(i).setContainers(containers);
        }
    }

    private void setDataContainer(Page page, int i, List<ContainerBean> containers) {
        for (int j = 0; j < page.getLayout().getRegions().get(i).getContainers().size(); j++) {
            ContainerBean containerBean= new ContainerBean();
            BeanUtils.copyProperties(page.getLayout().getRegions().get(i).getContainers().get(j), containerBean);
            List<WidgetContainer> widgetContainers= getWidgetContainerRepository().findAllByIdContainer(containerBean.getIdContainer());
            List<WidgetBean> widgetBeans= new ArrayList<>();
            setWidgetsToContainer(widgetContainers, widgetBeans);
            containerBean.setWidgets(widgetBeans);
            containers.add(containerBean);

        }
    }

    private void setWidgetsToContainer(List<WidgetContainer> widgetContainers, List<WidgetBean> widgetBeans) {
        for (WidgetContainer widgetContainer:widgetContainers) {
            Widget widget = getWidgetRepository().findByIdWidget(widgetContainer.getIdWidget());
            WidgetBean widgetBean= new WidgetBean();
            BeanUtils.copyProperties(widget,widgetBean);
            widgetBean.setAttributes(widgetContainer.getAttributes());
            widgetBeans.add(widgetBean);
        }
    }


}
