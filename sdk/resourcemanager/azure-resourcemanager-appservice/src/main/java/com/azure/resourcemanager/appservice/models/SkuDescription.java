// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.fluent.models.CapabilityInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Description of a SKU for a scalable resource. */
@Fluent
public final class SkuDescription {
    /*
     * Name of the resource SKU.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Service tier of the resource SKU.
     */
    @JsonProperty(value = "tier")
    private String tier;

    /*
     * Size specifier of the resource SKU.
     */
    @JsonProperty(value = "size")
    private String size;

    /*
     * Family code of the resource SKU.
     */
    @JsonProperty(value = "family")
    private String family;

    /*
     * Current number of instances assigned to the resource.
     */
    @JsonProperty(value = "capacity")
    private Integer capacity;

    /*
     * Min, max, and default scale values of the SKU.
     */
    @JsonProperty(value = "skuCapacity")
    private SkuCapacity skuCapacity;

    /*
     * Locations of the SKU.
     */
    @JsonProperty(value = "locations")
    private List<String> locations;

    /*
     * Capabilities of the SKU, e.g., is traffic manager enabled?
     */
    @JsonProperty(value = "capabilities")
    private List<CapabilityInner> capabilities;

    /** Creates an instance of SkuDescription class. */
    public SkuDescription() {
    }

    /**
     * Get the name property: Name of the resource SKU.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the resource SKU.
     *
     * @param name the name value to set.
     * @return the SkuDescription object itself.
     */
    public SkuDescription withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the tier property: Service tier of the resource SKU.
     *
     * @return the tier value.
     */
    public String tier() {
        return this.tier;
    }

    /**
     * Set the tier property: Service tier of the resource SKU.
     *
     * @param tier the tier value to set.
     * @return the SkuDescription object itself.
     */
    public SkuDescription withTier(String tier) {
        this.tier = tier;
        return this;
    }

    /**
     * Get the size property: Size specifier of the resource SKU.
     *
     * @return the size value.
     */
    public String size() {
        return this.size;
    }

    /**
     * Set the size property: Size specifier of the resource SKU.
     *
     * @param size the size value to set.
     * @return the SkuDescription object itself.
     */
    public SkuDescription withSize(String size) {
        this.size = size;
        return this;
    }

    /**
     * Get the family property: Family code of the resource SKU.
     *
     * @return the family value.
     */
    public String family() {
        return this.family;
    }

    /**
     * Set the family property: Family code of the resource SKU.
     *
     * @param family the family value to set.
     * @return the SkuDescription object itself.
     */
    public SkuDescription withFamily(String family) {
        this.family = family;
        return this;
    }

    /**
     * Get the capacity property: Current number of instances assigned to the resource.
     *
     * @return the capacity value.
     */
    public Integer capacity() {
        return this.capacity;
    }

    /**
     * Set the capacity property: Current number of instances assigned to the resource.
     *
     * @param capacity the capacity value to set.
     * @return the SkuDescription object itself.
     */
    public SkuDescription withCapacity(Integer capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * Get the skuCapacity property: Min, max, and default scale values of the SKU.
     *
     * @return the skuCapacity value.
     */
    public SkuCapacity skuCapacity() {
        return this.skuCapacity;
    }

    /**
     * Set the skuCapacity property: Min, max, and default scale values of the SKU.
     *
     * @param skuCapacity the skuCapacity value to set.
     * @return the SkuDescription object itself.
     */
    public SkuDescription withSkuCapacity(SkuCapacity skuCapacity) {
        this.skuCapacity = skuCapacity;
        return this;
    }

    /**
     * Get the locations property: Locations of the SKU.
     *
     * @return the locations value.
     */
    public List<String> locations() {
        return this.locations;
    }

    /**
     * Set the locations property: Locations of the SKU.
     *
     * @param locations the locations value to set.
     * @return the SkuDescription object itself.
     */
    public SkuDescription withLocations(List<String> locations) {
        this.locations = locations;
        return this;
    }

    /**
     * Get the capabilities property: Capabilities of the SKU, e.g., is traffic manager enabled?.
     *
     * @return the capabilities value.
     */
    public List<CapabilityInner> capabilities() {
        return this.capabilities;
    }

    /**
     * Set the capabilities property: Capabilities of the SKU, e.g., is traffic manager enabled?.
     *
     * @param capabilities the capabilities value to set.
     * @return the SkuDescription object itself.
     */
    public SkuDescription withCapabilities(List<CapabilityInner> capabilities) {
        this.capabilities = capabilities;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (skuCapacity() != null) {
            skuCapacity().validate();
        }
        if (capabilities() != null) {
            capabilities().forEach(e -> e.validate());
        }
    }
}
