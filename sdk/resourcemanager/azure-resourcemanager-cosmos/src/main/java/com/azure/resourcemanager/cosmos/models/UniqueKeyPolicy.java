// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The unique key policy configuration for specifying uniqueness constraints on documents in the collection in the Azure
 * Cosmos DB service.
 */
@Fluent
public final class UniqueKeyPolicy {
    /*
     * List of unique keys on that enforces uniqueness constraint on documents in the collection in the Azure Cosmos DB
     * service.
     */
    @JsonProperty(value = "uniqueKeys")
    private List<UniqueKey> uniqueKeys;

    /** Creates an instance of UniqueKeyPolicy class. */
    public UniqueKeyPolicy() {
    }

    /**
     * Get the uniqueKeys property: List of unique keys on that enforces uniqueness constraint on documents in the
     * collection in the Azure Cosmos DB service.
     *
     * @return the uniqueKeys value.
     */
    public List<UniqueKey> uniqueKeys() {
        return this.uniqueKeys;
    }

    /**
     * Set the uniqueKeys property: List of unique keys on that enforces uniqueness constraint on documents in the
     * collection in the Azure Cosmos DB service.
     *
     * @param uniqueKeys the uniqueKeys value to set.
     * @return the UniqueKeyPolicy object itself.
     */
    public UniqueKeyPolicy withUniqueKeys(List<UniqueKey> uniqueKeys) {
        this.uniqueKeys = uniqueKeys;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (uniqueKeys() != null) {
            uniqueKeys().forEach(e -> e.validate());
        }
    }
}
