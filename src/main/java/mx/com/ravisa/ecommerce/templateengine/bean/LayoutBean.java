package mx.com.ravisa.ecommerce.templateengine.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class LayoutBean implements Serializable {

    private static final long serialVersionUID = -7308946337761630070L;
    private int idLayout;
    private String layoutName;
    private String layoutDescription;
    private String layoutImagePreview;
    private boolean layoutStatus;

//    @JsonIgnoreProperties("containers")
    private List<RegionBean> regions;
}
