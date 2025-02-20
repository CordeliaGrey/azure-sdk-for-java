// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.communication.jobrouter.implementation.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Trigger for an exception action on exceeding wait time. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("wait-time")
@Immutable
public final class WaitTimeExceptionTriggerInternal extends ExceptionTriggerInternal {

    /*
     * Threshold for wait time for this trigger.
     */
    @Generated
    @JsonProperty(value = "thresholdSeconds")
    private double thresholdSeconds;

    /**
     * Creates an instance of WaitTimeExceptionTrigger class.
     *
     * @param thresholdSeconds the thresholdSeconds value to set.
     */
    @Generated
    @JsonCreator
    public WaitTimeExceptionTriggerInternal(@JsonProperty(value = "thresholdSeconds") double thresholdSeconds) {
        this.thresholdSeconds = thresholdSeconds;
    }

    /**
     * Get the thresholdSeconds property: Threshold for wait time for this trigger.
     *
     * @return the thresholdSeconds value.
     */
    @Generated
    public double getThresholdSeconds() {
        return this.thresholdSeconds;
    }
}
