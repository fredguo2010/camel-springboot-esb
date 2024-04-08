package com.rockii.hub.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class ProductionOrder {
    @XmlAttribute(name = "OrderNo")
    private String orderNo;

    @XmlElement(name = "Description")
    private String description;

    @XmlElement(name = "Barcode")
    private String barcode;

    @XmlElement(name = "CustomerOrderNo")
    private String customerOrderNo;

    @XmlElement(name = "CustomerBookingNo")
    private String customerBookingNo;

    @XmlElement(name = "CustomerName")
    private String customerName;

    @XmlElement(name = "CustomerNo")
    private String customerNo;

    @XmlElement(name = "Category")
    private String category;

    @XmlElement(name = "PartNo")
    private String partNo;

    @XmlElement(name = "DueDate")
    private String dueDate;

    @XmlElement(name = "Priority")
    private Integer priority;

    @XmlElement(name = "DesiredQuantity")
    private Double desiredQuantity;

    @XmlElement(name = "Status")
    private Integer status;

    @XmlElement(name = "WorkplanName")
    private String workplanName;

    @XmlElement(name = "CADFilename")
    private String CADFilename;
    @XmlElement(name = "Assembly")
    private String assembly;
    @XmlElement(name = "FillerPartsOrder")
    private String fillerPartsOrder;
    @XmlElement(name = "StockOrder")
    private String stockOrder;
    @XmlElement(name = "MonitoringFlag")
    private String monitoringFlag;
    @XmlElement(name = "Material")
    private String material;


    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getCustomerOrderNo() {
        return customerOrderNo;
    }

    public void setCustomerOrderNo(String customerOrderNo) {
        this.customerOrderNo = customerOrderNo;
    }

    public String getCustomerBookingNo() {
        return customerBookingNo;
    }

    public void setCustomerBookingNo(String customerBookingNo) {
        this.customerBookingNo = customerBookingNo;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPartNo() {
        return partNo;
    }

    public void setPartNo(String partNo) {
        this.partNo = partNo;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Double getDesiredQuantity() {
        return desiredQuantity;
    }

    public void setDesiredQuantity(Double desiredQuantity) {
        this.desiredQuantity = desiredQuantity;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getWorkplanName() {
        return workplanName;
    }

    public void setWorkplanName(String workplanName) {
        this.workplanName = workplanName;
    }

    public String getCADFilename() {
        return CADFilename;
    }

    public void setCADFilename(String CADFilename) {
        this.CADFilename = CADFilename;
    }

    public String getAssembly() {
        return assembly;
    }

    public void setAssembly(String assembly) {
        this.assembly = assembly;
    }

    public String getFillerPartsOrder() {
        return fillerPartsOrder;
    }

    public void setFillerPartsOrder(String fillerPartsOrder) {
        this.fillerPartsOrder = fillerPartsOrder;
    }

    public String getStockOrder() {
        return stockOrder;
    }

    public void setStockOrder(String stockOrder) {
        this.stockOrder = stockOrder;
    }

    public String getMonitoringFlag() {
        return monitoringFlag;
    }

    public void setMonitoringFlag(String monitoringFlag) {
        this.monitoringFlag = monitoringFlag;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
