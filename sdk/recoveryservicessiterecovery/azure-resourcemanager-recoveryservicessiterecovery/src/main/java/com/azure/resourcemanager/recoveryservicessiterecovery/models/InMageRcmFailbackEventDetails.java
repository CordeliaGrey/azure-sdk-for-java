// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Event details for InMageRcmFailback provider. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("InMageRcmFailback")
@Immutable
public final class InMageRcmFailbackEventDetails extends EventProviderSpecificDetails {
    /*
     * The protected item name.
     */
    @JsonProperty(value = "protectedItemName", access = JsonProperty.Access.WRITE_ONLY)
    private String protectedItemName;

    /*
     * The protected item name.
     */
    @JsonProperty(value = "vmName", access = JsonProperty.Access.WRITE_ONLY)
    private String vmName;

    /*
     * The appliance name.
     */
    @JsonProperty(value = "applianceName", access = JsonProperty.Access.WRITE_ONLY)
    private String applianceName;

    /*
     * The server type.
     */
    @JsonProperty(value = "serverType", access = JsonProperty.Access.WRITE_ONLY)
    private String serverType;

    /*
     * The component display name.
     */
    @JsonProperty(value = "componentDisplayName", access = JsonProperty.Access.WRITE_ONLY)
    private String componentDisplayName;

    /** Creates an instance of InMageRcmFailbackEventDetails class. */
    public InMageRcmFailbackEventDetails() {
    }

    /**
     * Get the protectedItemName property: The protected item name.
     *
     * @return the protectedItemName value.
     */
    public String protectedItemName() {
        return this.protectedItemName;
    }

    /**
     * Get the vmName property: The protected item name.
     *
     * @return the vmName value.
     */
    public String vmName() {
        return this.vmName;
    }

    /**
     * Get the applianceName property: The appliance name.
     *
     * @return the applianceName value.
     */
    public String applianceName() {
        return this.applianceName;
    }

    /**
     * Get the serverType property: The server type.
     *
     * @return the serverType value.
     */
    public String serverType() {
        return this.serverType;
    }

    /**
     * Get the componentDisplayName property: The component display name.
     *
     * @return the componentDisplayName value.
     */
    public String componentDisplayName() {
        return this.componentDisplayName;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
