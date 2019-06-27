package mx.com.ravisa.ecommerce.templateengine.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data@Table(name = "PAGE")
public class Page implements Serializable {

    private static final long serialVersionUID = 5704149334568279326L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idPage;

    @Column
    private String name;

    @Column
    private String description;

    @Column
    private String url;


    @ManyToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name="idLayout")
    private Layout layout;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="idSite")
    private Site site;


}
