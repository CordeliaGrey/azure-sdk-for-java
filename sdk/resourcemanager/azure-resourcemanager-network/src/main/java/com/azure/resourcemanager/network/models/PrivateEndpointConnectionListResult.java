// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.fluent.models.PrivateEndpointConnectionInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Response for the ListPrivateEndpointConnection API service call. */
@Fluent
public final class PrivateEndpointConnectionListResult {
    /*
     * A list of PrivateEndpointConnection resources for a specific private link service.
     */
    @JsonProperty(value = "value")
    private List<PrivateEndpointConnectionInner> value;

    /*
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /** Creates an instance of PrivateEndpointConnectionListResult class. */
    public PrivateEndpointConnectionListResult() {
    }

    /**
     * Get the value property: A list of PrivateEndpointConnection resources for a specific private link service.
     *
     * @return the value value.
     */
    public List<PrivateEndpointConnectionInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of PrivateEndpointConnection resources for a specific private link service.
     *
     * @param value the value value to set.
     * @return the PrivateEndpointConnectionListResult object itself.
     */
    public PrivateEndpointConnectionListResult withValue(List<PrivateEndpointConnectionInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
