package mx.com.ravisa.ecommerce.templateengine.bean;

import lombok.Data;
import mx.com.ravisa.ecommerce.templateengine.model.Widget;

import java.io.Serializable;
import java.util.List;

@Data
public class ContainerBean implements Serializable {

    private static final long serialVersionUID = 1559071102840830183L;
    private int idContainer;
    private String width;
    private List<WidgetBean> widgets;
}
