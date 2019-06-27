package mx.com.ravisa.ecommerce.templateengine.service.Impl;

import lombok.Getter;
import lombok.Setter;
import mx.com.ravisa.ecommerce.templateengine.model.Page;
import mx.com.ravisa.ecommerce.templateengine.model.Site;
import mx.com.ravisa.ecommerce.templateengine.repository.LayoutRepository;
import mx.com.ravisa.ecommerce.templateengine.repository.PageRepository;
import mx.com.ravisa.ecommerce.templateengine.repository.SiteRepository;
import mx.com.ravisa.ecommerce.templateengine.service.SiteService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "siteService")
public class SiteServiceImpl implements SiteService {

    @Resource
    @Getter
    @Setter
    private SiteRepository siteRepository;

    @Resource
    @Getter
    @Setter
    private PageRepository pageRepository;

    @Resource
    @Getter
    @Setter
    private LayoutRepository layoutRepository;

    @Override
    public Site getSite(int idSite) {
        return getSiteRepository().findSiteByidSite(idSite);
    }

    @Override
    public Site saveSite(Site site) {
        return getSiteRepository().save(site);
    }

    @Override
    public List<Site> getAllSites() {
        return getSiteRepository().findAllSitesBySiteStatusIsTrue();
    }

    @Override
    public List<Site> getAllSitesActive() {
        return null;
    }

    @Override
    public Page addPageToSite(Page page, Site site) {
        site = getSiteRepository().findSiteByidSite(site.getIdSite());
        page.setLayout(layoutRepository.findByIdLayout(page.getLayout().getIdLayout()));
        page.setSite(site);
        page = pageRepository.save(page);
        site.getPages().add(page);
        siteRepository.save(site);
        return page;
    }


}
