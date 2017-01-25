package com.company.carservice.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by Ignat on 04.11.16.
 */
@Entity
public class Models {
    private Integer modelId;
    private Integer brandId;
    private String modelName;

    @Basic
    @Column(name = "model_id")
    public Integer getModelId() {
        return modelId;
    }

    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }

    @Basic
    @Column(name = "brand_id")
    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    @Basic
    @Column(name = "model_name")
    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Models models = (Models) o;

        if (modelId != null ? !modelId.equals(models.modelId) : models.modelId != null) return false;
        if (brandId != null ? !brandId.equals(models.brandId) : models.brandId != null) return false;
        if (modelName != null ? !modelName.equals(models.modelName) : models.modelName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = modelId != null ? modelId.hashCode() : 0;
        result = 31 * result + (brandId != null ? brandId.hashCode() : 0);
        result = 31 * result + (modelName != null ? modelName.hashCode() : 0);
        return result;
    }
}
