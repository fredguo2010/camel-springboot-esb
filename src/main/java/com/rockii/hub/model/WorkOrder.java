package com.rockii.hub.model;

import javax.persistence.*;

@Entity
public class WorkOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "cOrderNo")
    private String orderNo;
    @Column(name = "cDescription")
    private String description;
    @Column(name = "cBarcode")
    private String barcode;
    @Column(name = "cCustomerOrderNo")
    private String customerOrderNo;
    @Column(name = "cCustomerBookingNo")
    private String customerBookingNo;
    @Column(name = "cCustomerName")
    private String customerName;
    @Column(name = "cCustomerNo")
    private String customerNo;
    @Column(name = "cCategory")
    private String category;
    @Column(name = "cPartNo")
    private String partNo;
    @Column(name = "dDueDate")
    private String dueDate;
    @Column(name = "iPriority")
    private Integer priority;
    @Column(name = "dDesiredQuantity")
    private Double desiredQuantity;
    @Column(name = "iStatus")
    private Integer status;
    @Column(name = "cWorkplanName")
    private String workplanName;
    @Column(name = "cCadFilename")
    private String CADFilename;
    @Column(name = "cAssembly")
    private String assembly;
    @Column(name = "cFillerPartsOrder")
    private String fillerPartsOrder;
    @Column(name = "cStockOrder")
    private String stockOrder;
    @Column(name = "cMonitoringFlag")
    private String monitoringFlag;
    @Column(name = "cMaterial")
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
