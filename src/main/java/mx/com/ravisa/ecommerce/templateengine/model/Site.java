package mx.com.ravisa.ecommerce.templateengine.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@Table(name = "SITE")
@ToString
public class Site implements Serializable {

    private static final long serialVersionUID = 7348975818914663958L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idSite;

    @Column
    private String siteName;

    @Column
    private boolean siteStatus;

    @JsonIgnore
    @OneToMany(mappedBy="site", cascade = CascadeType.REMOVE)
    private List<Page> pages;







}
