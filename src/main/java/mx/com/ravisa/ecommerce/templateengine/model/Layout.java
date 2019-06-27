package mx.com.ravisa.ecommerce.templateengine.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@Table(name = "LAYOUT")
@ToString
public class Layout implements Serializable {

    private static final long serialVersionUID = 2657237139574804569L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idLayout;

    @Column
    private String layoutName;
    @Column
    private String layoutDescription;
    @Column
    private String layoutImagePreview;
    @Column
    private boolean layoutStatus;

    @OneToMany(mappedBy="layout",cascade = CascadeType.REMOVE)
    private List<Region> regions;

    @JsonIgnore
    @OneToMany(mappedBy = "layout")
    private List<Page> page;

}
