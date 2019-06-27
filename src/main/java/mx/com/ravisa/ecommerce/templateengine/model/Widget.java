package mx.com.ravisa.ecommerce.templateengine.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data@Table(name = "WIDGET")
public class Widget implements Serializable {

    private static final long serialVersionUID = 6633578602881070344L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idWidget;

    @Column
    private String widgetName;

    @Column
    private String widgetTag;

    @Column
    private String widgetWidth;

    @Column
    private String widgetDescription;

    @Column
    private String widgetImagePreview;

    @Column
    private boolean widgetStatus;

    @OneToMany(mappedBy = "widget")
    private List<Attribute> attributes;

    @JsonIgnore
    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "WIDGET_CONTAINER",
            joinColumns = { @JoinColumn(name = "id_widget") },
            inverseJoinColumns = { @JoinColumn(name = "id_container") }
    )
    private List<Container> containers;


}
