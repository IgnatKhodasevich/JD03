package com.company.carservice.entities;

import javax.persistence.*;

/**
 * Created by Ignat on 04.11.16.
 */
@Entity
@Table(name = "product_type", schema = "cars", catalog = "")
public class ProductType {
    private int productTypeId;
    private String productType;

    @Id
    @Column(name = "product_type_id")
    public int getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(int productTypeId) {
        this.productTypeId = productTypeId;
    }

    @Basic
    @Column(name = "product_type")
    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductType that = (ProductType) o;

        if (productTypeId != that.productTypeId) return false;
        if (productType != null ? !productType.equals(that.productType) : that.productType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = productTypeId;
        result = 31 * result + (productType != null ? productType.hashCode() : 0);
        return result;
    }
}
