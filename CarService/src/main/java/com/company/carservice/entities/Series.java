package com.company.carservice.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by Ignat on 04.11.16.
 */
@Entity
public class Series {
    private Integer seriesId;
    private Integer modelId;
    private String seriesName;
    private Long generationId;

    @Basic
    @Column(name = "series_id")
    public Integer getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(Integer seriesId) {
        this.seriesId = seriesId;
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
    @Column(name = "series_name")
    public String getSeriesName() {
        return seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    @Basic
    @Column(name = "generation_id")
    public Long getGenerationId() {
        return generationId;
    }

    public void setGenerationId(Long generationId) {
        this.generationId = generationId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Series series = (Series) o;

        if (seriesId != null ? !seriesId.equals(series.seriesId) : series.seriesId != null) return false;
        if (modelId != null ? !modelId.equals(series.modelId) : series.modelId != null) return false;
        if (seriesName != null ? !seriesName.equals(series.seriesName) : series.seriesName != null) return false;
        if (generationId != null ? !generationId.equals(series.generationId) : series.generationId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = seriesId != null ? seriesId.hashCode() : 0;
        result = 31 * result + (modelId != null ? modelId.hashCode() : 0);
        result = 31 * result + (seriesName != null ? seriesName.hashCode() : 0);
        result = 31 * result + (generationId != null ? generationId.hashCode() : 0);
        return result;
    }
}
