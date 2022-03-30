package com.gtm.ilern.rm.repo;

import com.gtm.ilern.rm.entity.Resource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResourceRepository extends JpaRepository<Resource, Integer> {
    Resource findByName(String resourceName);
}