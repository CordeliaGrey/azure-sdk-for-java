// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.analytics.defender.easm.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** The collection of asset summaries. */
@Immutable
public final class AssetSummaryResult {

    /*
     * The name of the summary response.  Depending on the request time this will either be the asset filter, risk
     * category, or risk metric.
     */
    @Generated
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * The description of the summary response.  Filters don't have a description.
     */
    @Generated
    @JsonProperty(value = "description")
    private String description;

    /*
     * The last time risk categories or risk metrics were captured. Set to the current time for asset filter requests,
     * which always pull the live asset data.
     */
    @Generated
    @JsonProperty(value = "updatedAt")
    private OffsetDateTime updatedAt;

    /*
     * If the request is for a metric category, this will contain the requested unique category name.
     */
    @Generated
    @JsonProperty(value = "metricCategory")
    private String metricCategory;

    /*
     * If the request is for a metric, this will contain the requested unique metric name.
     */
    @Generated
    @JsonProperty(value = "metric")
    private String metric;

    /*
     * If the request is for an asset filter, this will contain the corresponding filter.
     */
    @Generated
    @JsonProperty(value = "filter")
    private String filter;

    /*
     * An optional label used to filter requests results.
     */
    @Generated
    @JsonProperty(value = "labelName")
    private String labelName;

    /*
     * The count of assets matching the request parameters.
     */
    @Generated
    @JsonProperty(value = "count")
    private Long count;

    /*
     * The link to the corresponding asset details.
     */
    @Generated
    @JsonProperty(value = "link")
    private String link;

    /*
     * The corresponding child entities.  For metric categories this will contain metrics.  For filters with groupBy
     * and segmentBy this will contain facets.
     */
    @Generated
    @JsonProperty(value = "children")
    private List<AssetSummaryResult> children;

    /** Creates an instance of AssetSummaryResult class. */
    @Generated
    private AssetSummaryResult() {}

    /**
     * Get the displayName property: The name of the summary response. Depending on the request time this will either be
     * the asset filter, risk category, or risk metric.
     *
     * @return the displayName value.
     */
    @Generated
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * Get the description property: The description of the summary response. Filters don't have a description.
     *
     * @return the description value.
     */
    @Generated
    public String getDescription() {
        return this.description;
    }

    /**
     * Get the updatedAt property: The last time risk categories or risk metrics were captured. Set to the current time
     * for asset filter requests, which always pull the live asset data.
     *
     * @return the updatedAt value.
     */
    @Generated
    public OffsetDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Get the metricCategory property: If the request is for a metric category, this will contain the requested unique
     * category name.
     *
     * @return the metricCategory value.
     */
    @Generated
    public String getMetricCategory() {
        return this.metricCategory;
    }

    /**
     * Get the metric property: If the request is for a metric, this will contain the requested unique metric name.
     *
     * @return the metric value.
     */
    @Generated
    public String getMetric() {
        return this.metric;
    }

    /**
     * Get the filter property: If the request is for an asset filter, this will contain the corresponding filter.
     *
     * @return the filter value.
     */
    @Generated
    public String getFilter() {
        return this.filter;
    }

    /**
     * Get the labelName property: An optional label used to filter requests results.
     *
     * @return the labelName value.
     */
    @Generated
    public String getLabelName() {
        return this.labelName;
    }

    /**
     * Get the count property: The count of assets matching the request parameters.
     *
     * @return the count value.
     */
    @Generated
    public Long getCount() {
        return this.count;
    }

    /**
     * Get the link property: The link to the corresponding asset details.
     *
     * @return the link value.
     */
    @Generated
    public String getLink() {
        return this.link;
    }

    /**
     * Get the children property: The corresponding child entities. For metric categories this will contain metrics. For
     * filters with groupBy and segmentBy this will contain facets.
     *
     * @return the children value.
     */
    @Generated
    public List<AssetSummaryResult> getChildren() {
        return this.children;
    }
}
