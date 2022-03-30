package com.gtm.ilern.rm.repo;

import com.gtm.ilern.rm.entity.RolePermissionMapping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolePermissionMappingRepository extends JpaRepository<RolePermissionMapping, Integer> {
}