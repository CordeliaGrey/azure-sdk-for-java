// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.communication.jobrouter.implementation.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Contains the weight percentage and worker selectors to be applied if selected for weighted distributions. */
@Immutable
public final class WorkerWeightedAllocationInternal {

    /*
     * The percentage of this weight, expressed as a fraction of 1.
     */
    @Generated
    @JsonProperty(value = "weight")
    private double weight;

    /*
     * A collection of worker selectors that will be applied if this allocation is selected.
     */
    @Generated
    @JsonProperty(value = "workerSelectors")
    private List<RouterWorkerSelectorInternal> workerSelectors;

    /**
     * Creates an instance of WorkerWeightedAllocationInternal class.
     *
     * @param weight the weight value to set.
     * @param workerSelectors the workerSelectors value to set.
     */
    @Generated
    @JsonCreator
    public WorkerWeightedAllocationInternal(
            @JsonProperty(value = "weight") double weight,
            @JsonProperty(value = "workerSelectors") List<RouterWorkerSelectorInternal> workerSelectors) {
        this.weight = weight;
        this.workerSelectors = workerSelectors;
    }

    /**
     * Get the weight property: The percentage of this weight, expressed as a fraction of 1.
     *
     * @return the weight value.
     */
    @Generated
    public double getWeight() {
        return this.weight;
    }

    /**
     * Get the workerSelectors property: A collection of worker selectors that will be applied if this allocation is
     * selected.
     *
     * @return the workerSelectors value.
     */
    @Generated
    public List<RouterWorkerSelectorInternal> getWorkerSelectors() {
        return this.workerSelectors;
    }
}
