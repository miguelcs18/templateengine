package mx.com.ravisa.ecommerce.templateengine.service.Impl;

import lombok.Getter;
import lombok.Setter;
import mx.com.ravisa.ecommerce.templateengine.model.Attribute;
import mx.com.ravisa.ecommerce.templateengine.model.Widget;
import mx.com.ravisa.ecommerce.templateengine.repository.AttributeRepository;
import mx.com.ravisa.ecommerce.templateengine.repository.ContainerRepository;
import mx.com.ravisa.ecommerce.templateengine.repository.WidgetRepository;
import mx.com.ravisa.ecommerce.templateengine.service.WidgetService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "widgetService")
public class WidgetServiceImpl implements WidgetService {

    @Resource
    @Getter
    @Setter
    private ContainerRepository containerRepository;

    @Resource
    @Getter
    @Setter
    private WidgetRepository widgetRepository;

    @Resource
    @Getter
    @Setter
    private AttributeRepository attributeRepository;


//    @Override
//    public ContainerBean addWidgetToContainer(Widget widget, ContainerBean container) {
//        container = containerRepository.findContainerByIdContainer(container.getIdContainer());
//        widget = widgetRepository.findByIdWidget(widget.getIdWidget());
//        container.getWidgets().add(widget);
//        container = containerRepository.save(container);
//        return container;
//    }

    @Override
    public Widget addWidget(Widget widget) {
        widget = widgetRepository.save(widget);
        for (Attribute attribute:widget.getAttributes()) {
            attribute.setWidget(widget);
        }
        attributeRepository.saveAll(widget.getAttributes());
        return widgetRepository.findByIdWidget(widget.getIdWidget());
    }

    @Override
    public List<Widget> getAllWidgets() {
        return widgetRepository.findAll();
    }

    @Override
    public List<Widget> getAllWidgetsActive() {
        return widgetRepository.findAllByWidgetStatusIsTrue();
    }
}
