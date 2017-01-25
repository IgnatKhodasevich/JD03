package com.company.carservice.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Ignat on 04.11.16.
 */
@Entity
public class Brands {
    private int brandId;
    private String brandName;

    @Id
    @Column(name = "brand_id")
    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    @Basic
    @Column(name = "brand_name")
    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Brands brands = (Brands) o;

        if (brandId != brands.brandId) return false;
        if (brandName != null ? !brandName.equals(brands.brandName) : brands.brandName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = brandId;
        result = 31 * result + (brandName != null ? brandName.hashCode() : 0);
        return result;
    }
}
