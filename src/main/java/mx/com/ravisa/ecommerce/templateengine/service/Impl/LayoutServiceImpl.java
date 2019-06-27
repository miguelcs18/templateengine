package mx.com.ravisa.ecommerce.templateengine.service.Impl;

import lombok.Getter;
import lombok.Setter;
import mx.com.ravisa.ecommerce.templateengine.bean.LayoutBean;
import mx.com.ravisa.ecommerce.templateengine.bean.RegionBean;
import mx.com.ravisa.ecommerce.templateengine.model.Layout;
import mx.com.ravisa.ecommerce.templateengine.model.Region;
import mx.com.ravisa.ecommerce.templateengine.repository.LayoutRepository;
import mx.com.ravisa.ecommerce.templateengine.repository.RegionRepository;
import mx.com.ravisa.ecommerce.templateengine.service.LayoutService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service(value = "layoutService")
public class LayoutServiceImpl implements LayoutService {

    @Resource
    @Getter
    @Setter
    private LayoutRepository layoutRepository;

    @Resource
    private RegionRepository regionRepository;


    @Override
    public LayoutBean getLayout(int idLayout) {
        LayoutBean layoutBeanTarget = new LayoutBean();
        mx.com.ravisa.ecommerce.templateengine.model.Layout layoutSource = getLayoutRepository().findByIdLayout(idLayout);
        BeanUtils.copyProperties(layoutSource, layoutBeanTarget);
        return layoutBeanTarget;

    }

    @Override
    public Layout saveLayout(LayoutBean layoutBean) {
        mx.com.ravisa.ecommerce.templateengine.model.Layout layoutTarget = new mx.com.ravisa.ecommerce.templateengine.model.Layout();

        List<Region> regions = new ArrayList<>();
        BeanUtils.copyProperties(layoutBean, layoutTarget);
        for (RegionBean regionBean : layoutBean.getRegions()) {
            Region region= new Region();
            BeanUtils.copyProperties(regionBean, region);
            regions.add(region);
        }
        layoutTarget.setRegions(regions);
        mx.com.ravisa.ecommerce.templateengine.model.Layout layout1 = getLayoutRepository().save(layoutTarget);
        for (Region region : layoutTarget.getRegions()) {
            region.setLayout(layout1);
        }
        regionRepository.saveAll(layoutTarget.getRegions());
        return layoutRepository.save(layoutTarget);
    }

    @Override
    public List<LayoutBean> getAllLayout() {
        List<mx.com.ravisa.ecommerce.templateengine.model.Layout> layouts = getLayoutRepository().findAll();
        List<LayoutBean> targetList = new ArrayList<>();
        for (mx.com.ravisa.ecommerce.templateengine.model.Layout layoutModel : layouts) {
            LayoutBean layoutBean1 = new LayoutBean();
            BeanUtils.copyProperties(layoutModel, layoutBean1);
            targetList.add(layoutBean1);
        }
        return targetList;
    }

    @Override
    public List<LayoutBean> getAllLayoutActive() {
        List<mx.com.ravisa.ecommerce.templateengine.model.Layout> layouts = getLayoutRepository().findAllByLayoutStatusIsTrue();
        List<LayoutBean> targetList = new ArrayList<>();
        for (mx.com.ravisa.ecommerce.templateengine.model.Layout layoutModel : layouts) {
            LayoutBean layoutBean1 = new LayoutBean();
            BeanUtils.copyProperties(layoutModel, layoutBean1);
            targetList.add(layoutBean1);
        }
        return targetList;
    }
}
