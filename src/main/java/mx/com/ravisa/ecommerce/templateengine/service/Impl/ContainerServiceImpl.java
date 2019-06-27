package mx.com.ravisa.ecommerce.templateengine.service.Impl;

import lombok.Getter;
import lombok.Setter;
import mx.com.ravisa.ecommerce.templateengine.bean.WidgetBean;
import mx.com.ravisa.ecommerce.templateengine.model.Attribute;
import mx.com.ravisa.ecommerce.templateengine.model.Container;
import mx.com.ravisa.ecommerce.templateengine.model.Widget;
import mx.com.ravisa.ecommerce.templateengine.model.WidgetContainer;
import mx.com.ravisa.ecommerce.templateengine.repository.*;
import mx.com.ravisa.ecommerce.templateengine.service.ContainerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;


@Service(value = "containerService")
public class ContainerServiceImpl implements ContainerService {

    @Resource
    @Getter
    @Setter
    private WidgetRepository widgetRepository;

    @Resource
    @Getter
    @Setter
    private ContainerRepository containerRepository;

    @Resource
    @Getter
    @Setter
    private WidgetContainerRepository widgetContainerRepository;

    @Resource
    @Getter
    @Setter
    private AttributeRepository attributeRepository;

    @Resource
    @Getter
    @Setter
    private RegionRepository regionRepository;

    @Override
    public Container addWidgetToContainer(WidgetBean widgetBean, Container container) {
        if(container.getIdContainer()==0) {
            container = containerRepository.save(container);
        }else{
            container = containerRepository.findContainerByIdContainer(container.getIdContainer());
        }

        Widget widget = widgetRepository.findByIdWidget(widgetBean.getIdWidget());

        WidgetContainer widgetContainer =new WidgetContainer();
        widgetContainer.setIdContainer(container.getIdContainer());
        widgetContainer.setIdWidget(widgetBean.getIdWidget());
        if(widgetBean.getAttributes()!=null && !widgetBean.getAttributes().isEmpty()){
            widgetContainer.setAttributes(widgetBean.getAttributes());

        }
        widgetContainer = widgetContainerRepository.save(widgetContainer);
        for (Attribute attribute: widgetBean.getAttributes()) {
            attribute.setWidgetContainer(widgetContainer);
        }
        attributeRepository.saveAll(widgetBean.getAttributes());
        if(container.getWidgets()==null){
            container.setWidgets(new ArrayList<Widget>());
        }
        container.setRegion(regionRepository.findByIdRegion(container.getRegion().getIdRegion()));

        container.getWidgets().add(widget);
        return containerRepository.save(container);
    }

    @Override
    public Container removeWidgetFromContainer(WidgetBean widgetBean, Container container) {
        WidgetContainer widgetContainer = widgetContainerRepository.findByIdContainerAndIdWidget(container.getIdContainer(), widgetBean.getIdWidget());
        widgetContainerRepository.delete(widgetContainer);
        return containerRepository.save(container);
    }


}
