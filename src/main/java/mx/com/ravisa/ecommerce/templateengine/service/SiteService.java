package mx.com.ravisa.ecommerce.templateengine.service;

import mx.com.ravisa.ecommerce.templateengine.model.Page;
import mx.com.ravisa.ecommerce.templateengine.model.Site;

import java.util.List;

public interface SiteService {

    Site getSite(int idSite);

    Site saveSite(Site site);

    List<Site> getAllSites();

    List<Site> getAllSitesActive();

    Page addPageToSite(Page page,Site site);
}
