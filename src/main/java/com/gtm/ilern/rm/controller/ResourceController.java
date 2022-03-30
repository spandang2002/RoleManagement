package com.gtm.ilern.rm.controller;

import com.gtm.ilern.rm.entity.Resource;
import com.gtm.ilern.rm.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/resource")
public class ResourceController {


    @Autowired
    ResourceService resourceService;

    @GetMapping
    public List<Resource> getAllResource()
    {
        return resourceService.getAllResource();
    }

    @PostMapping
    public Resource createAction(@RequestBody Resource resource)
    {
        return resourceService.createResource(resource);
    }
}
