package mx.com.ravisa.ecommerce.templateengine.repository;

import mx.com.ravisa.ecommerce.templateengine.model.Widget;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository(value = "widgetRepository")
public interface WidgetRepository extends CrudRepository<Widget, Integer>, ExtendedRepository<Widget, Integer> {

    List<Widget> findAllByWidgetStatusIsTrue();
    List<Widget> findAll();
    Widget findByIdWidget(int idWidget);


}
