package mx.com.ravisa.ecommerce.templateengine.controller;

import lombok.Getter;
import lombok.Setter;
import mx.com.ravisa.ecommerce.templateengine.bean.PageBean;
import mx.com.ravisa.ecommerce.templateengine.bean.PageSiteDTO;
import mx.com.ravisa.ecommerce.templateengine.model.Page;
import mx.com.ravisa.ecommerce.templateengine.model.Site;
import mx.com.ravisa.ecommerce.templateengine.service.PageService;
import mx.com.ravisa.ecommerce.templateengine.service.SiteService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT})
@RestController
public class SiteController {

    @Resource
    @Getter
    @Setter
    private PageService pageService;

    @Resource
    @Getter
    @Setter
    private SiteService siteService;

    @GetMapping("/site/{idSite}/")
    public List<PageBean> getPagesBySite(@PathVariable int idSite){
        return getPageService().getPageBySite(idSite);
    }

    @PostMapping(value = "/site/save")
    public Site saveSite(Site site){
        return getSiteService().saveSite(site);
    }

    @PostMapping(value = "/site/addPage")
    public Page addPageToSite(@RequestBody PageSiteDTO dto){
        return getSiteService().addPageToSite(dto.getPage(),dto.getSite());
    }

}
