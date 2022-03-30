package com.gtm.ilern.rm.repo;

import com.gtm.ilern.rm.entity.Resource;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResourceRepository extends JpaRepository<Resource, Integer> {
}