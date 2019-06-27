package mx.com.ravisa.ecommerce.templateengine.repository;

import mx.com.ravisa.ecommerce.templateengine.model.Layout;
import mx.com.ravisa.ecommerce.templateengine.model.Page;
import mx.com.ravisa.ecommerce.templateengine.model.Site;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository(value = "pageRepository")
public interface PageRepository extends CrudRepository<Page,Integer>, ExtendedRepository<Page,Integer> {
    List<Page> findPagesBySite(Site Site);

    Page findByIdPage(int idPage);


}
