package com.gtm.ilern.rm.repo;

import com.gtm.ilern.rm.entity.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermissionRepository extends JpaRepository<Permission, Integer> {
}