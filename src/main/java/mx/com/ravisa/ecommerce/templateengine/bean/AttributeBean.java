package mx.com.ravisa.ecommerce.templateengine.bean;

import lombok.Data;

import java.io.Serializable;
@Data
public class AttributeBean implements Serializable {

    private static final long serialVersionUID = -2890812047498512408L;
    private int idAttribute;
    private String attributeName;
    private String attributeDescription;

}
