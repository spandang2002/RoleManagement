package com.gtm.ilern.rm.service;

import com.gtm.ilern.rm.dto.ResourceDTO;
import com.gtm.ilern.rm.entity.Resource;
import com.gtm.ilern.rm.repo.ResourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ResourceService {


    @Autowired
    ResourceRepository resourceRepository;

    public List<ResourceDTO> getAllResource()
    {
        List<Resource> resources = resourceRepository.findAll();
        List<ResourceDTO> resourceDTOS = new ArrayList<ResourceDTO>();
        for(Resource resource : resources)
        {
            resourceDTOS.add(new ResourceDTO(resource.getId()+"", resource.getName()));
        }
        return resourceDTOS;
    }

    public Resource createResource(Resource resource)
    {
        return resourceRepository.save(resource);
    }

    public Resource getResourceByName(String resourceName) {
        return resourceRepository.findByName(resourceName);
    }
}
