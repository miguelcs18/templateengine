package mx.com.ravisa.ecommerce.templateengine.service.Impl;

import mx.com.ravisa.ecommerce.templateengine.model.Container;
import mx.com.ravisa.ecommerce.templateengine.model.Region;
import mx.com.ravisa.ecommerce.templateengine.repository.ContainerRepository;
import mx.com.ravisa.ecommerce.templateengine.repository.RegionRepository;
import mx.com.ravisa.ecommerce.templateengine.service.RegionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service(value = "regionService")
public class RegionServiceImpl implements RegionService {

    @Resource
    private ContainerRepository containerRepository;

    @Resource
    private RegionRepository regionRepository;


    @Override
    public Region addContainerToRegion(Container container, Region region) {
        container = containerRepository.save(container);
        region = regionRepository.findByIdRegion(region.getIdRegion());
        region.getContainers().add(container);
        return regionRepository.save(region);
    }

    @Override
    public Region removeContainerFromRegion(Container container, Region region) {
        region = regionRepository.findByIdRegion(region.getIdRegion());
        container = containerRepository.findContainerByIdContainer(container.getIdContainer());
        region.getContainers().remove(container);
        return regionRepository.save(region);
    }
}
