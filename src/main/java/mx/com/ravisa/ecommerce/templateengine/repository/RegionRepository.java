package mx.com.ravisa.ecommerce.templateengine.repository;

import mx.com.ravisa.ecommerce.templateengine.model.Container;
import mx.com.ravisa.ecommerce.templateengine.model.Region;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository(value = "regionRepository")
public interface RegionRepository extends CrudRepository<Region,Integer>, ExtendedRepository<Region,Integer>{
    //List<RegionBean> findRegionByLayoutandPAge(LayoutBean layout, PageBean page);

    Region findByIdRegion(int idRegion);

    //public RegionBean addContainerToRegion(ContainerBean container, RegionBean region);


}
