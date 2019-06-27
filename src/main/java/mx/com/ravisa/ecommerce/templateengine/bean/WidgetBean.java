package mx.com.ravisa.ecommerce.templateengine.bean;

import lombok.Data;
import mx.com.ravisa.ecommerce.templateengine.model.Attribute;

import java.io.Serializable;
import java.util.List;

@Data
public class WidgetBean implements Serializable {

    private static final long serialVersionUID = 661498501846692203L;
    private int idWidget;
    private String widgetName;
    private String widgetTag;
    private String widgetWidth;
    private String widgetDescription;
    private boolean widgetStatus;
    private String widgetImagePreview;

    private List<Attribute> attributes;

}
