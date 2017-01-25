package com.company.carservice.entities;

import javax.persistence.*;

/**
 * Created by Ignat on 04.11.16.
 */
@Entity
@Table(name = "repair_data", schema = "cars", catalog = "")
public class RepairData {
    private int repairId;
    private String customerName;
    private String customerPhone;
    private String district;
    private String deadline;
    private String carBrand;
    private String carModel;
    private String capacity;
    private String engineType;
    private String year;
    private String repairTypes;
    private String description;

    @Id
    @Column(name = "RepairId")
    public int getRepairId() {
        return repairId;
    }

    public void setRepairId(int repairId) {
        this.repairId = repairId;
    }

    @Basic
    @Column(name = "CustomerName")
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Basic
    @Column(name = "CustomerPhone")
    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    @Basic
    @Column(name = "District")
    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    @Basic
    @Column(name = "Deadline")
    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    @Basic
    @Column(name = "CarBrand")
    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    @Basic
    @Column(name = "CarModel")
    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    @Basic
    @Column(name = "Capacity")
    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    @Basic
    @Column(name = "EngineType")
    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Basic
    @Column(name = "Year")
    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Basic
    @Column(name = "RepairTypes")
    public String getRepairTypes() {
        return repairTypes;
    }

    public void setRepairTypes(String repairTypes) {
        this.repairTypes = repairTypes;
    }

    @Basic
    @Column(name = "Description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RepairData that = (RepairData) o;

        if (repairId != that.repairId) return false;
        if (customerName != null ? !customerName.equals(that.customerName) : that.customerName != null) return false;
        if (customerPhone != null ? !customerPhone.equals(that.customerPhone) : that.customerPhone != null)
            return false;
        if (district != null ? !district.equals(that.district) : that.district != null) return false;
        if (deadline != null ? !deadline.equals(that.deadline) : that.deadline != null) return false;
        if (carBrand != null ? !carBrand.equals(that.carBrand) : that.carBrand != null) return false;
        if (carModel != null ? !carModel.equals(that.carModel) : that.carModel != null) return false;
        if (capacity != null ? !capacity.equals(that.capacity) : that.capacity != null) return false;
        if (engineType != null ? !engineType.equals(that.engineType) : that.engineType != null) return false;
        if (year != null ? !year.equals(that.year) : that.year != null) return false;
        if (repairTypes != null ? !repairTypes.equals(that.repairTypes) : that.repairTypes != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = repairId;
        result = 31 * result + (customerName != null ? customerName.hashCode() : 0);
        result = 31 * result + (customerPhone != null ? customerPhone.hashCode() : 0);
        result = 31 * result + (district != null ? district.hashCode() : 0);
        result = 31 * result + (deadline != null ? deadline.hashCode() : 0);
        result = 31 * result + (carBrand != null ? carBrand.hashCode() : 0);
        result = 31 * result + (carModel != null ? carModel.hashCode() : 0);
        result = 31 * result + (capacity != null ? capacity.hashCode() : 0);
        result = 31 * result + (engineType != null ? engineType.hashCode() : 0);
        result = 31 * result + (year != null ? year.hashCode() : 0);
        result = 31 * result + (repairTypes != null ? repairTypes.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
