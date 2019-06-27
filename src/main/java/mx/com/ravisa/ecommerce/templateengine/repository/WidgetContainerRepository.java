package mx.com.ravisa.ecommerce.templateengine.repository;

import mx.com.ravisa.ecommerce.templateengine.model.WidgetContainer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WidgetContainerRepository extends CrudRepository<WidgetContainer,Integer>, ExtendedRepository<WidgetContainer,Integer>{

    WidgetContainer findByIdContainerAndIdWidget(int idContainer, int idWidget);
    List<WidgetContainer> findAllByIdContainer(int idContainer);
}
