package mx.com.ravisa.ecommerce.templateengine.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@Table(name = "CONTAINER")
public class Container implements Serializable {

    private static final long serialVersionUID = -4490421754483692354L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idContainer;

    @Column
    private String width;

    @ManyToMany(mappedBy = "containers", cascade = CascadeType.REMOVE)
    private List<Widget> widgets;

    @ManyToOne
    @JoinColumn(name="idRegion")
    private Region region;



}
