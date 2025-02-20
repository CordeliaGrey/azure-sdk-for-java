// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.ai.documentintelligence.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** File list in Azure Blob Storage. */
@Immutable
public final class AzureBlobFileListContentSource {
    /*
     * Azure Blob Storage container URL.
     */
    @Generated
    @JsonProperty(value = "containerUrl")
    private String containerUrl;

    /*
     * Path to a JSONL file within the container specifying a subset of documents.
     */
    @Generated
    @JsonProperty(value = "fileList")
    private String fileList;

    /**
     * Creates an instance of AzureBlobFileListContentSource class.
     *
     * @param containerUrl the containerUrl value to set.
     * @param fileList the fileList value to set.
     */
    @Generated
    @JsonCreator
    public AzureBlobFileListContentSource(
            @JsonProperty(value = "containerUrl") String containerUrl,
            @JsonProperty(value = "fileList") String fileList) {
        this.containerUrl = containerUrl;
        this.fileList = fileList;
    }

    /**
     * Get the containerUrl property: Azure Blob Storage container URL.
     *
     * @return the containerUrl value.
     */
    @Generated
    public String getContainerUrl() {
        return this.containerUrl;
    }

    /**
     * Get the fileList property: Path to a JSONL file within the container specifying a subset of documents.
     *
     * @return the fileList value.
     */
    @Generated
    public String getFileList() {
        return this.fileList;
    }
}
