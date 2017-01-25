package com.company.carservice.entities;

import javax.persistence.*;

/**
 * Created by Ignat on 04.11.16.
 */
@Entity
@Table(name = "orders_data", schema = "cars", catalog = "")
public class OrdersData {
    private int orderId;
    private String customerName;
    private String customerPhone;
    private String customerMessage;
    private String sparePart;
    private String sparePartType;
    private String carBrand;
    private String carModel;
    private String year;
    private String capacity;
    private String engineType;

    @Id
    @Column(name = "OrderId")
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
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
    @Column(name = "CustomerMessage")
    public String getCustomerMessage() {
        return customerMessage;
    }

    public void setCustomerMessage(String customerMessage) {
        this.customerMessage = customerMessage;
    }

    @Basic
    @Column(name = "SparePart")
    public String getSparePart() {
        return sparePart;
    }

    public void setSparePart(String sparePart) {
        this.sparePart = sparePart;
    }

    @Basic
    @Column(name = "SparePartType")
    public String getSparePartType() {
        return sparePartType;
    }

    public void setSparePartType(String sparePartType) {
        this.sparePartType = sparePartType;
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
    @Column(name = "Year")
    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrdersData that = (OrdersData) o;

        if (orderId != that.orderId) return false;
        if (customerName != null ? !customerName.equals(that.customerName) : that.customerName != null) return false;
        if (customerPhone != null ? !customerPhone.equals(that.customerPhone) : that.customerPhone != null)
            return false;
        if (customerMessage != null ? !customerMessage.equals(that.customerMessage) : that.customerMessage != null)
            return false;
        if (sparePart != null ? !sparePart.equals(that.sparePart) : that.sparePart != null) return false;
        if (sparePartType != null ? !sparePartType.equals(that.sparePartType) : that.sparePartType != null)
            return false;
        if (carBrand != null ? !carBrand.equals(that.carBrand) : that.carBrand != null) return false;
        if (carModel != null ? !carModel.equals(that.carModel) : that.carModel != null) return false;
        if (year != null ? !year.equals(that.year) : that.year != null) return false;
        if (capacity != null ? !capacity.equals(that.capacity) : that.capacity != null) return false;
        if (engineType != null ? !engineType.equals(that.engineType) : that.engineType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = orderId;
        result = 31 * result + (customerName != null ? customerName.hashCode() : 0);
        result = 31 * result + (customerPhone != null ? customerPhone.hashCode() : 0);
        result = 31 * result + (customerMessage != null ? customerMessage.hashCode() : 0);
        result = 31 * result + (sparePart != null ? sparePart.hashCode() : 0);
        result = 31 * result + (sparePartType != null ? sparePartType.hashCode() : 0);
        result = 31 * result + (carBrand != null ? carBrand.hashCode() : 0);
        result = 31 * result + (carModel != null ? carModel.hashCode() : 0);
        result = 31 * result + (year != null ? year.hashCode() : 0);
        result = 31 * result + (capacity != null ? capacity.hashCode() : 0);
        result = 31 * result + (engineType != null ? engineType.hashCode() : 0);
        return result;
    }
}
