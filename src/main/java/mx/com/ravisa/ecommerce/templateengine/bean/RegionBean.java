package mx.com.ravisa.ecommerce.templateengine.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import mx.com.ravisa.ecommerce.templateengine.model.Layout;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
public class RegionBean implements Serializable {

    private static final long serialVersionUID = 2423586063692280567L;
    private int idRegion;
    private String regionName;
    private String regionWidth;
    private List<ContainerBean> containers;



}
