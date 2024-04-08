package com.rockii.hub.importer;
import com.rockii.hub.model.WorkOrder;
import org.apache.camel.Handler;
import com.rockii.hub.dto.*;
import com.rockii.hub.repository.ProductionOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import org.springframework.stereotype.Component;
@Component
public class PPSImporter {

    @Autowired
    private ProductionOrderRepository productionOrderRepository;

    @Handler
    public void processObject(PPSImport ppsImport) {
        // Process the converted Java object here
        // Access the properties of the PPSImport object
        List<ProductionOrder> productionOrders = ppsImport.getProductionOrders();
        List<Part> parts = ppsImport.getParts();

        // Perform desired operations with the data
        for (ProductionOrder productionOrder : productionOrders) {
            System.out.println("OrderNo: " + productionOrder.getOrderNo());
            System.out.println("Description: " + productionOrder.getDescription());
            System.out.println("CustomerOrderNo: " + productionOrder.getCustomerOrderNo());
            System.out.println("PartNo: " + productionOrder.getPartNo());
            System.out.println("DueDate: " + productionOrder.getDueDate());
            System.out.println("Priority: " + productionOrder.getPriority());
            System.out.println("DesiredQuantity: " + productionOrder.getDesiredQuantity());

            WorkOrder wo = new WorkOrder();
            wo.setOrderNo(productionOrder.getOrderNo());
            wo.setDescription(productionOrder.getDescription());
            wo.setCustomerOrderNo(productionOrder.getCustomerOrderNo());
            wo.setPartNo(productionOrder.getPartNo());
            wo.setDueDate(productionOrder.getDueDate());
            wo.setPriority(productionOrder.getPriority());
            wo.setDesiredQuantity(productionOrder.getDesiredQuantity());
            productionOrderRepository.save(wo);
        }

        for (Part part : parts) {
            System.out.println("PartNo: " + part.getPartNo());
            System.out.println("Description: " + part.getDescription());
            System.out.println("Category: " + part.getCategory());
            System.out.println("DrawingNo: " + part.getDrawingNo());
            // ... access and process other properties

            List<WorkingStep> steps = part.getWorkingSteps();

            for (WorkingStep step : steps){
                System.out.println("WorkingStep - OperationNo: " + step.getOperationNo());
                System.out.println("WorkingStep - Activity: " + step.getActivity());
                System.out.println("WorkingStep - TargetSetupTime: " + step.getTargetSetupTime());
                System.out.println("WorkingStep - TargetRestTime: " + step.getTargetRestTime());
                System.out.println("WorkingStep - ActivityDescription: " + step.getActivityDescription());
                System.out.println("WorkingStep - IsQuantityDependent: " + step.getIsQuantityDependent());
                System.out.println("WorkingStep - IsQuantityDependent: " + step.getIsQuantityDependent());
                System.out.println("WorkingStep - DueDate: " + step.getDueDate());

                List<Resource> resources = step.getResources();
                for (Resource resource : resources){
                    System.out.println("Resources - Material: " + resource.getMaterial());
                    System.out.println("Resources - Quantity: " + resource.getQuantity());
                    System.out.println("Resources - UnitOfQuantity: " + resource.getUnitOfQuantity());

                }
            }
        }

        // Perform any other custom processing logic as needed
    }

}
