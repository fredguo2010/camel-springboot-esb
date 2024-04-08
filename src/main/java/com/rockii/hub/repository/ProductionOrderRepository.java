package com.rockii.hub.repository;

import com.rockii.hub.model.WorkOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  ProductionOrderRepository extends JpaRepository<WorkOrder, Long> {
}
