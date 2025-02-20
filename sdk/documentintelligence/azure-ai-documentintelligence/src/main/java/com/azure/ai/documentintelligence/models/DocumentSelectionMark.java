// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.ai.documentintelligence.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A selection mark object representing check boxes, radio buttons, and other elements indicating a selection. */
@Immutable
public final class DocumentSelectionMark {
    /*
     * State of the selection mark.
     */
    @Generated
    @JsonProperty(value = "state")
    private DocumentSelectionMarkState state;

    /*
     * Bounding polygon of the selection mark, with coordinates specified relative
     * to the top-left of the page. The numbers represent the x, y values of the
     * polygon vertices, clockwise from the left (-180 degrees inclusive) relative
     * to the element orientation.
     */
    @Generated
    @JsonProperty(value = "polygon")
    private List<Double> polygon;

    /*
     * Location of the selection mark in the reading order concatenated content.
     */
    @Generated
    @JsonProperty(value = "span")
    private DocumentSpan span;

    /*
     * Confidence of correctly extracting the selection mark.
     */
    @Generated
    @JsonProperty(value = "confidence")
    private double confidence;

    /**
     * Creates an instance of DocumentSelectionMark class.
     *
     * @param state the state value to set.
     * @param span the span value to set.
     * @param confidence the confidence value to set.
     */
    @Generated
    @JsonCreator
    private DocumentSelectionMark(
            @JsonProperty(value = "state") DocumentSelectionMarkState state,
            @JsonProperty(value = "span") DocumentSpan span,
            @JsonProperty(value = "confidence") double confidence) {
        this.state = state;
        this.span = span;
        this.confidence = confidence;
    }

    /**
     * Get the state property: State of the selection mark.
     *
     * @return the state value.
     */
    @Generated
    public DocumentSelectionMarkState getState() {
        return this.state;
    }

    /**
     * Get the polygon property: Bounding polygon of the selection mark, with coordinates specified relative to the
     * top-left of the page. The numbers represent the x, y values of the polygon vertices, clockwise from the left
     * (-180 degrees inclusive) relative to the element orientation.
     *
     * @return the polygon value.
     */
    @Generated
    public List<Double> getPolygon() {
        return this.polygon;
    }

    /**
     * Get the span property: Location of the selection mark in the reading order concatenated content.
     *
     * @return the span value.
     */
    @Generated
    public DocumentSpan getSpan() {
        return this.span;
    }

    /**
     * Get the confidence property: Confidence of correctly extracting the selection mark.
     *
     * @return the confidence value.
     */
    @Generated
    public double getConfidence() {
        return this.confidence;
    }
}
