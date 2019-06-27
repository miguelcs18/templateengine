package mx.com.ravisa.ecommerce.templateengine.service;


import mx.com.ravisa.ecommerce.templateengine.model.Container;
import mx.com.ravisa.ecommerce.templateengine.model.Region;

public interface RegionService {
    public Region addContainerToRegion(Container container, Region region);
    public Region removeContainerFromRegion(Container container, Region region);

}
