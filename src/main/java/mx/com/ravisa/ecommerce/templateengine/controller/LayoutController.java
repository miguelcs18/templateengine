package mx.com.ravisa.ecommerce.templateengine.controller;

import lombok.Getter;
import lombok.Setter;
import mx.com.ravisa.ecommerce.templateengine.bean.LayoutBean;
import mx.com.ravisa.ecommerce.templateengine.model.Layout;
import mx.com.ravisa.ecommerce.templateengine.service.LayoutService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT})
@RestController
public class LayoutController {

    @Resource
    @Getter
    @Setter
    private LayoutService layoutService;

    @PostMapping(value = "/layout/save")
    @ResponseBody
    public Layout saveLayout(@RequestBody LayoutBean layoutBean) {
        return getLayoutService().saveLayout(layoutBean);
    }

    @GetMapping(value = "/layout/getAllActive")
    public List<LayoutBean> getAllLayoutActive() {
        return getLayoutService().getAllLayoutActive();
    }

    @GetMapping(value = "/layout/getAll")
    public List<LayoutBean> getAllLayout() {
        return getLayoutService().getAllLayout();
    }


}
