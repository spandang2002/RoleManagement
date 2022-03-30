package com.gtm.ilern.rm.repo;

import com.gtm.ilern.rm.entity.Action;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActionRepository extends JpaRepository<Action, Integer> {
    Action findByName(String actionName);
}