package com.rockii.hub.dto;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class Part {
    @XmlAttribute(name = "PartNo")
    private String partNo;

    @XmlElement(name = "PartNoExt")
    private String PartNoExt;

    @XmlElement(name = "Description")
    private String description;

    @XmlElement(name = "Note")
    private String note;

    @XmlElement(name = "Note2")
    private String note2;

    @XmlElement(name = "Category")
    private String category;

    @XmlElement(name = "DrawingNo")
    private String drawingNo;

    @XmlElement(name = "CADFilename")
    private String cadFilename;

    @XmlElement(name = "Material")
    private String material;

    @XmlElement(name = "IsAutoRemoveable")
    private String isAutoRemoveable;

    @XmlElementWrapper(name = "WorkingPlan")
    @XmlElement(name = "WorkingStep")
    private List<WorkingStep> workingSteps;

    public String getPartNoExt() {
        return PartNoExt;
    }

    public void setPartNoExt(String partNoExt) {
        PartNoExt = partNoExt;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getNote2() {
        return note2;
    }

    public void setNote2(String note2) {
        this.note2 = note2;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDrawingNo() {
        return drawingNo;
    }

    public void setDrawingNo(String drawingNo) {
        this.drawingNo = drawingNo;
    }

    public String getCadFilename() {
        return cadFilename;
    }

    public void setCadFilename(String cadFilename) {
        this.cadFilename = cadFilename;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getIsAutoRemoveable() {
        return isAutoRemoveable;
    }

    public void setIsAutoRemoveable(String isAutoRemoveable) {
        this.isAutoRemoveable = isAutoRemoveable;
    }

    public String getPartNo() {
        return partNo;
    }

    public void setPartNo(String partNo) {
        this.partNo = partNo;
    }

    public List<WorkingStep> getWorkingSteps() {
        return workingSteps;
    }

    public void setWorkingSteps(List<WorkingStep> workingSteps) {
        this.workingSteps = workingSteps;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}