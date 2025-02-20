// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.analytics.defender.easm.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Template model for observed values. */
@Immutable
public class ObservedValue {

    /*
     * The firstSeen property.
     */
    @Generated
    @JsonProperty(value = "firstSeen")
    private OffsetDateTime firstSeen;

    /*
     * The lastSeen property.
     */
    @Generated
    @JsonProperty(value = "lastSeen")
    private OffsetDateTime lastSeen;

    /*
     * The count property.
     */
    @Generated
    @JsonProperty(value = "count")
    private Long count;

    /*
     * The recent property.
     */
    @Generated
    @JsonProperty(value = "recent")
    private Boolean recent;

    /** Creates an instance of ObservedValue class. */
    @Generated
    protected ObservedValue() {}

    /**
     * Get the firstSeen property: The firstSeen property.
     *
     * @return the firstSeen value.
     */
    @Generated
    public OffsetDateTime getFirstSeen() {
        return this.firstSeen;
    }

    /**
     * Get the lastSeen property: The lastSeen property.
     *
     * @return the lastSeen value.
     */
    @Generated
    public OffsetDateTime getLastSeen() {
        return this.lastSeen;
    }

    /**
     * Get the count property: The count property.
     *
     * @return the count value.
     */
    @Generated
    public Long getCount() {
        return this.count;
    }

    /**
     * Get the recent property: The recent property.
     *
     * @return the recent value.
     */
    @Generated
    public Boolean isRecent() {
        return this.recent;
    }
}
