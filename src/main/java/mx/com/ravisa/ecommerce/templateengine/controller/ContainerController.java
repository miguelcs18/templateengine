package mx.com.ravisa.ecommerce.templateengine.controller;

import lombok.Getter;
import lombok.Setter;
import mx.com.ravisa.ecommerce.templateengine.bean.WidgetContainerDTO;
import mx.com.ravisa.ecommerce.templateengine.model.Container;
import mx.com.ravisa.ecommerce.templateengine.service.ContainerService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT})
@RestController
public class ContainerController {

    @Resource
    @Getter
    @Setter
    private ContainerService containerService;

    @PutMapping(value = "/container/addWidget")
    public Container addWidgetToContainer(@RequestBody WidgetContainerDTO data) {
        return getContainerService().addWidgetToContainer(data.getWidget(), data.getContainer());

    }

    @PutMapping(value = "/container/removeWidget")
    public Container removeWidgetFromContainer(@RequestBody WidgetContainerDTO data) {
        return getContainerService().removeWidgetFromContainer(data.getWidget(), data.getContainer());
    }


}
