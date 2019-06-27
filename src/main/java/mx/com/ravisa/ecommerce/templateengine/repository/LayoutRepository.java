package mx.com.ravisa.ecommerce.templateengine.repository;

import mx.com.ravisa.ecommerce.templateengine.model.Layout;
import mx.com.ravisa.ecommerce.templateengine.model.Page;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository(value = "layoutRepository")
public interface LayoutRepository extends CrudRepository<Layout,Integer>, ExtendedRepository<Layout,Integer> {
    Layout findByIdLayout(int idLayout);
    List<Layout> findAll();
    List<Layout> findAllByLayoutStatusIsTrue();



}
