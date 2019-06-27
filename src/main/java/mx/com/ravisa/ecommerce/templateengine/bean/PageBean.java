package mx.com.ravisa.ecommerce.templateengine.bean;

import lombok.Data;

import java.io.Serializable;
@Data
public class PageBean implements Serializable {

    private static final long serialVersionUID = 3903209770731592538L;
    private int idPage;
    private String name;
    private String description;
    private String url;
    private LayoutBean layout;


}
