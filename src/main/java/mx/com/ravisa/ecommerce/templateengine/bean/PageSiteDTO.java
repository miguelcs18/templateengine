package mx.com.ravisa.ecommerce.templateengine.bean;

import lombok.Data;
import mx.com.ravisa.ecommerce.templateengine.model.Page;
import mx.com.ravisa.ecommerce.templateengine.model.Site;

import java.io.Serializable;

@Data
public class PageSiteDTO implements Serializable {

    private static final long serialVersionUID = 6378505042109452944L;
    private Page page;
    private Site site;
}
