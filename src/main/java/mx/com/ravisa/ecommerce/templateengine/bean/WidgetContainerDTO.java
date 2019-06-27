package mx.com.ravisa.ecommerce.templateengine.bean;

import lombok.Data;
import mx.com.ravisa.ecommerce.templateengine.model.Container;

import java.io.Serializable;

@Data
public class WidgetContainerDTO implements Serializable {

    private static final long serialVersionUID = -6369437011957690603L;

    private WidgetBean widget;
    private Container container;
}
