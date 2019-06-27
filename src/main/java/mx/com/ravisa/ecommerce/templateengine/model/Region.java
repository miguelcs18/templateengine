package mx.com.ravisa.ecommerce.templateengine.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@Table(name = "Region")
public class Region implements Serializable {

    private static final long serialVersionUID = 8813753382857842767L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idRegion;

    @Column
    private String regionName;
    @Column
    private String regionWidth;

    @JsonIgnore
    @OneToMany(mappedBy = "region", cascade = CascadeType.REMOVE)
    private List<Container> containers;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="idLayout")
    private Layout layout;



}
