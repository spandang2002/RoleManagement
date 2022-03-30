package com.gtm.ilern.rm.service;

import com.gtm.ilern.rm.entity.Resource;
import com.gtm.ilern.rm.repo.ResourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResourceService {


    @Autowired
    ResourceRepository resourceRepository;

    public List<Resource> getAllResource()
    {
        return resourceRepository.findAll();
    }

    public Resource createResource(Resource resource)
    {
        return resourceRepository.save(resource);
    }

    public Resource getResourceByName(String resourceName) {
        return resourceRepository.findByName(resourceName);
    }
}
