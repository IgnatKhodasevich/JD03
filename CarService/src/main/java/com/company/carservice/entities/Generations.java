package com.company.carservice.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by Ignat on 04.11.16.
 */
@Entity
public class Generations {
    private Integer generationId;
    private String generationName;
    private Integer modelId;
    private Integer yearBegin;
    private Long yearEnd;

    @Basic
    @Column(name = "generation_id")
    public Integer getGenerationId() {
        return generationId;
    }

    public void setGenerationId(Integer generationId) {
        this.generationId = generationId;
    }

    @Basic
    @Column(name = "generation_name")
    public String getGenerationName() {
        return generationName;
    }

    public void setGenerationName(String generationName) {
        this.generationName = generationName;
    }

    @Basic
    @Column(name = "model_id")
    public Integer getModelId() {
        return modelId;
    }

    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }

    @Basic
    @Column(name = "year_begin")
    public Integer getYearBegin() {
        return yearBegin;
    }

    public void setYearBegin(Integer yearBegin) {
        this.yearBegin = yearBegin;
    }

    @Basic
    @Column(name = "year_end")
    public Long getYearEnd() {
        return yearEnd;
    }

    public void setYearEnd(Long yearEnd) {
        this.yearEnd = yearEnd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Generations that = (Generations) o;

        if (generationId != null ? !generationId.equals(that.generationId) : that.generationId != null) return false;
        if (generationName != null ? !generationName.equals(that.generationName) : that.generationName != null)
            return false;
        if (modelId != null ? !modelId.equals(that.modelId) : that.modelId != null) return false;
        if (yearBegin != null ? !yearBegin.equals(that.yearBegin) : that.yearBegin != null) return false;
        if (yearEnd != null ? !yearEnd.equals(that.yearEnd) : that.yearEnd != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = generationId != null ? generationId.hashCode() : 0;
        result = 31 * result + (generationName != null ? generationName.hashCode() : 0);
        result = 31 * result + (modelId != null ? modelId.hashCode() : 0);
        result = 31 * result + (yearBegin != null ? yearBegin.hashCode() : 0);
        result = 31 * result + (yearEnd != null ? yearEnd.hashCode() : 0);
        return result;
    }
}
