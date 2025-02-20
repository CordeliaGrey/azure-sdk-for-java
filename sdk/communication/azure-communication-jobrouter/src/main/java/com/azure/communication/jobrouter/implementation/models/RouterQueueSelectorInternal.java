// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.communication.jobrouter.implementation.models;

import com.azure.communication.jobrouter.models.LabelOperator;
import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes a condition that must be met against a set of labels for queue selection. */
@Fluent
public final class RouterQueueSelectorInternal {

    /*
     * The label key to query against
     */
    @Generated
    @JsonProperty(value = "key")
    private String key;

    /*
     * Describes how the value of the label is compared to the value defined on the label selector
     */
    @Generated
    @JsonProperty(value = "labelOperator")
    private LabelOperator labelOperator;

    /*
     * The value to compare against the actual label value with the given operator
     */
    @Generated
    @JsonProperty(value = "value")
    private Object value;

    /**
     * Creates an instance of RouterQueueSelectorInternal class.
     *
     * @param key the key value to set.
     * @param labelOperator the labelOperator value to set.
     */
    @Generated
    @JsonCreator
    public RouterQueueSelectorInternal(
            @JsonProperty(value = "key") String key,
            @JsonProperty(value = "labelOperator") LabelOperator labelOperator) {
        this.key = key;
        this.labelOperator = labelOperator;
    }

    /**
     * Get the key property: The label key to query against.
     *
     * @return the key value.
     */
    @Generated
    public String getKey() {
        return this.key;
    }

    /**
     * Get the labelOperator property: Describes how the value of the label is compared to the value defined on the
     * label selector.
     *
     * @return the labelOperator value.
     */
    @Generated
    public LabelOperator getLabelOperator() {
        return this.labelOperator;
    }

    /**
     * Get the value property: The value to compare against the actual label value with the given operator.
     *
     * @return the value value.
     */
    @Generated
    public Object getValue() {
        return this.value;
    }

    /**
     * Set the value property: The value to compare against the actual label value with the given operator.
     *
     * @param value the value value to set.
     * @return the RouterQueueSelectorInternal object itself.
     */
    @Generated
    public RouterQueueSelectorInternal setValue(Object value) {
        this.value = value;
        return this;
    }
}
