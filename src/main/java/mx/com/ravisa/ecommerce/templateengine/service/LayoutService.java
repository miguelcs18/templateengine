package mx.com.ravisa.ecommerce.templateengine.service;


import mx.com.ravisa.ecommerce.templateengine.bean.LayoutBean;
import mx.com.ravisa.ecommerce.templateengine.model.Layout;

import java.util.List;

public interface LayoutService {

    LayoutBean getLayout(int idLayout);

    Layout saveLayout(LayoutBean layoutBean);

    List<LayoutBean> getAllLayout();

    List<LayoutBean> getAllLayoutActive();

}
