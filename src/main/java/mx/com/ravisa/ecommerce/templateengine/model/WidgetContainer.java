package mx.com.ravisa.ecommerce.templateengine.model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@Table(name = "WIDGET_CONTAINER")
public class WidgetContainer implements Serializable{
    private static final long serialVersionUID = 3631705506656447583L;

    @Id
    @GeneratedValue(generator ="UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", updatable = false, nullable = false)
    private UUID idWidgetContainer;

    @Column(name = "id_widget")
    private int idWidget;

    @Column(name = "id_container")
    private int idContainer;

    @OneToMany(mappedBy = "widgetContainer", cascade = CascadeType.REMOVE)
    private List<Attribute> attributes;
}
