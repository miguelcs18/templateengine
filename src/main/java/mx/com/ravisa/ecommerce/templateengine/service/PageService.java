package mx.com.ravisa.ecommerce.templateengine.service;

import mx.com.ravisa.ecommerce.templateengine.bean.PageBean;

import java.util.List;

public interface PageService {

    public List<PageBean> getPageBySite(int idSite);

}
