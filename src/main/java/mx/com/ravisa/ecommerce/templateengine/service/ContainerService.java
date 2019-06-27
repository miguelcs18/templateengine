package mx.com.ravisa.ecommerce.templateengine.service;

import mx.com.ravisa.ecommerce.templateengine.bean.WidgetBean;
import mx.com.ravisa.ecommerce.templateengine.model.Container;

public interface ContainerService {

    public Container addWidgetToContainer(WidgetBean widget, Container container);
    public Container removeWidgetFromContainer(WidgetBean widget, Container container);
}
