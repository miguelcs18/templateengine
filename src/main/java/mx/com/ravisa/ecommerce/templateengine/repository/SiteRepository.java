package mx.com.ravisa.ecommerce.templateengine.repository;

import mx.com.ravisa.ecommerce.templateengine.model.Site;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository(value = "siteRepository")
public interface SiteRepository extends CrudRepository<Site,Integer>, ExtendedRepository<Site,Integer> {
    Site findSiteByidSite(int idSite);
    List<Site> findAllSitesBySiteStatusIsTrue();
}
