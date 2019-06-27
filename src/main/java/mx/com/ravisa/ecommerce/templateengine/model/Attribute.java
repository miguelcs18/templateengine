package mx.com.ravisa.ecommerce.templateengine.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data@Table(name = "ATTRIBUTE")
public class Attribute implements Serializable {

    private static final long serialVersionUID = 5356477016079329611L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idAttribute;

    @Column
    private String attributeName;

    @Column
    private String attributeDescription;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="idWidget")
    private Widget widget;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "idWidgetContainer")
    private WidgetContainer widgetContainer;

}
