package com.rockii.hub.dto;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class WorkingStep {
    @XmlAttribute(name = "OperationNo")
    private String operationNo;

    @XmlElement(name = "Activity")
    private String activity;

    @XmlElement(name = "WorkPlace")
    private String workPlace;

    @XmlElement(name = "TargetProcessingTime")
    private String targetProcessingTime;

    @XmlElement(name = "TargetSetupTime")
    private String targetSetupTime;

    @XmlElement(name = "TargetRestTime")
    private String targetRestTime;


    @XmlElement(name = "ActivityDescription")
    private String activityDescription;

    @XmlElement(name = "IsQuantityDependent")
    private String isQuantityDependent;


    @XmlElement(name = "DueDate")
    private String DueDate;

    @XmlElementWrapper(name = "Resources")
    @XmlElement(name = "Resource")
    private List<Resource> resources;

    public String getTargetProcessingTime() {
        return targetProcessingTime;
    }

    public void setTargetProcessingTime(String targetProcessingTime) {
        this.targetProcessingTime = targetProcessingTime;
    }

    public String getTargetSetupTime() {
        return targetSetupTime;
    }

    public void setTargetSetupTime(String targetSetupTime) {
        this.targetSetupTime = targetSetupTime;
    }

    public String getTargetRestTime() {
        return targetRestTime;
    }

    public void setTargetRestTime(String targetRestTime) {
        this.targetRestTime = targetRestTime;
    }

    public String getActivityDescription() {
        return activityDescription;
    }

    public void setActivityDescription(String activityDescription) {
        this.activityDescription = activityDescription;
    }

    public String getIsQuantityDependent() {
        return isQuantityDependent;
    }

    public void setIsQuantityDependent(String isQuantityDependent) {
        this.isQuantityDependent = isQuantityDependent;
    }

    public String getDueDate() {
        return DueDate;
    }

    public void setDueDate(String dueDate) {
        DueDate = dueDate;
    }

    public List<Resource> getResources() {
        return resources;
    }

    public void setResources(List<Resource> resources) {
        this.resources = resources;
    }

    public String getOperationNo() {
        return operationNo;
    }

    public void setOperationNo(String operationNo) {
        this.operationNo = operationNo;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }
}


