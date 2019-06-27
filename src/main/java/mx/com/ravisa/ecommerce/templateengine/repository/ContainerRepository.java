package mx.com.ravisa.ecommerce.templateengine.repository;

import mx.com.ravisa.ecommerce.templateengine.model.Container;
import mx.com.ravisa.ecommerce.templateengine.model.Layout;
import mx.com.ravisa.ecommerce.templateengine.model.Page;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository(value = "containerRepository")
public interface ContainerRepository extends CrudRepository<Container,Integer>, ExtendedRepository<Container,Integer> {

    Container findContainerByIdContainer(int idContainer);



}
