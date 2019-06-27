package mx.com.ravisa.ecommerce.templateengine.controller;

import lombok.Getter;
import lombok.Setter;
import mx.com.ravisa.ecommerce.templateengine.model.Widget;
import mx.com.ravisa.ecommerce.templateengine.service.WidgetService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT})
@RestController
public class WidgetController {

    @Resource
    @Getter
    @Setter
    private WidgetService widgetService;

    @PostMapping(value = "/widget/save")
    public Widget addWidget(@RequestBody Widget widget){
        return widgetService.addWidget(widget);
    }

    @GetMapping(value = "/widget/getAll")
    public List<Widget> getAll(){
        return widgetService.getAllWidgets();
    }

    @GetMapping(value = "/widget/getAllActive")
    public List<Widget> getAllActive(){
        return widgetService.getAllWidgetsActive();
    }


    //TODO add attributes to widget

}
