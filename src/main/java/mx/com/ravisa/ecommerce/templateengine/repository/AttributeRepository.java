package mx.com.ravisa.ecommerce.templateengine.repository;

import mx.com.ravisa.ecommerce.templateengine.model.Attribute;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AttributeRepository extends CrudRepository<Attribute,Integer>, ExtendedRepository<Attribute,Integer> {

}
