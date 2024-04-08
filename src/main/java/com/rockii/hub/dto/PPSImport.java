package com.rockii.hub.dto;


import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "PPSImport")
@XmlAccessorType(XmlAccessType.FIELD)
public class PPSImport {
    @XmlElementWrapper(name = "ProductionOrders")
    @XmlElement(name = "ProductionOrder")
    private List<ProductionOrder> productionOrders;

    @XmlElementWrapper(name = "Parts")
    @XmlElement(name = "Part")
    private List<Part> parts;

    public List<ProductionOrder> getProductionOrders() {
        return productionOrders;
    }
    public void setProductionOrders(List<ProductionOrder> productionOrders) {
        this.productionOrders = productionOrders;
    }
    public List<Part> getParts() {
        return parts;
    }
    public void setParts(List<Part> parts) {
        this.parts = parts;
    }
}
