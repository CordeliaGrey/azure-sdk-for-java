// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.ai.documentintelligence.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

/** An object representing the content and location of a field value. */
@Immutable
public final class DocumentField {
    /*
     * Data type of the field value.
     */
    @Generated
    @JsonProperty(value = "type")
    private DocumentFieldType type;

    /*
     * String value.
     */
    @Generated
    @JsonProperty(value = "valueString")
    private String valueString;

    /*
     * Date value in YYYY-MM-DD format (ISO 8601).
     */
    @Generated
    @JsonProperty(value = "valueDate")
    private LocalDate valueDate;

    /*
     * Time value in hh:mm:ss format (ISO 8601).
     */
    @Generated
    @JsonProperty(value = "valueTime")
    private String valueTime;

    /*
     * Phone number value in E.164 format (ex. +19876543210).
     */
    @Generated
    @JsonProperty(value = "valuePhoneNumber")
    private String valuePhoneNumber;

    /*
     * Floating point value.
     */
    @Generated
    @JsonProperty(value = "valueNumber")
    private Double valueNumber;

    /*
     * Integer value.
     */
    @Generated
    @JsonProperty(value = "valueInteger")
    private Long valueInteger;

    /*
     * Selection mark value.
     */
    @Generated
    @JsonProperty(value = "valueSelectionMark")
    private DocumentSelectionMarkState valueSelectionMark;

    /*
     * Presence of signature.
     */
    @Generated
    @JsonProperty(value = "valueSignature")
    private DocumentSignatureType valueSignature;

    /*
     * 3-letter country code value (ISO 3166-1 alpha-3).
     */
    @Generated
    @JsonProperty(value = "valueCountryRegion")
    private String valueCountryRegion;

    /*
     * Array of field values.
     */
    @Generated
    @JsonProperty(value = "valueArray")
    private List<DocumentField> valueArray;

    /*
     * Dictionary of named field values.
     */
    @Generated
    @JsonProperty(value = "valueObject")
    private Map<String, DocumentField> valueObject;

    /*
     * Currency value.
     */
    @Generated
    @JsonProperty(value = "valueCurrency")
    private CurrencyValue valueCurrency;

    /*
     * Address value.
     */
    @Generated
    @JsonProperty(value = "valueAddress")
    private AddressValue valueAddress;

    /*
     * Boolean value.
     */
    @Generated
    @JsonProperty(value = "valueBoolean")
    private Boolean valueBoolean;

    /*
     * Field content.
     */
    @Generated
    @JsonProperty(value = "content")
    private String content;

    /*
     * Bounding regions covering the field.
     */
    @Generated
    @JsonProperty(value = "boundingRegions")
    private List<BoundingRegion> boundingRegions;

    /*
     * Location of the field in the reading order concatenated content.
     */
    @Generated
    @JsonProperty(value = "spans")
    private List<DocumentSpan> spans;

    /*
     * Confidence of correctly extracting the field.
     */
    @Generated
    @JsonProperty(value = "confidence")
    private Double confidence;

    /**
     * Creates an instance of DocumentField class.
     *
     * @param type the type value to set.
     */
    @Generated
    @JsonCreator
    private DocumentField(@JsonProperty(value = "type") DocumentFieldType type) {
        this.type = type;
    }

    /**
     * Get the type property: Data type of the field value.
     *
     * @return the type value.
     */
    @Generated
    public DocumentFieldType getType() {
        return this.type;
    }

    /**
     * Get the valueString property: String value.
     *
     * @return the valueString value.
     */
    @Generated
    public String getValueString() {
        return this.valueString;
    }

    /**
     * Get the valueDate property: Date value in YYYY-MM-DD format (ISO 8601).
     *
     * @return the valueDate value.
     */
    @Generated
    public LocalDate getValueDate() {
        return this.valueDate;
    }

    /**
     * Get the valueTime property: Time value in hh:mm:ss format (ISO 8601).
     *
     * @return the valueTime value.
     */
    @Generated
    public String getValueTime() {
        return this.valueTime;
    }

    /**
     * Get the valuePhoneNumber property: Phone number value in E.164 format (ex. +19876543210).
     *
     * @return the valuePhoneNumber value.
     */
    @Generated
    public String getValuePhoneNumber() {
        return this.valuePhoneNumber;
    }

    /**
     * Get the valueNumber property: Floating point value.
     *
     * @return the valueNumber value.
     */
    @Generated
    public Double getValueNumber() {
        return this.valueNumber;
    }

    /**
     * Get the valueInteger property: Integer value.
     *
     * @return the valueInteger value.
     */
    @Generated
    public Long getValueInteger() {
        return this.valueInteger;
    }

    /**
     * Get the valueSelectionMark property: Selection mark value.
     *
     * @return the valueSelectionMark value.
     */
    @Generated
    public DocumentSelectionMarkState getValueSelectionMark() {
        return this.valueSelectionMark;
    }

    /**
     * Get the valueSignature property: Presence of signature.
     *
     * @return the valueSignature value.
     */
    @Generated
    public DocumentSignatureType getValueSignature() {
        return this.valueSignature;
    }

    /**
     * Get the valueCountryRegion property: 3-letter country code value (ISO 3166-1 alpha-3).
     *
     * @return the valueCountryRegion value.
     */
    @Generated
    public String getValueCountryRegion() {
        return this.valueCountryRegion;
    }

    /**
     * Get the valueArray property: Array of field values.
     *
     * @return the valueArray value.
     */
    @Generated
    public List<DocumentField> getValueArray() {
        return this.valueArray;
    }

    /**
     * Get the valueObject property: Dictionary of named field values.
     *
     * @return the valueObject value.
     */
    @Generated
    public Map<String, DocumentField> getValueObject() {
        return this.valueObject;
    }

    /**
     * Get the valueCurrency property: Currency value.
     *
     * @return the valueCurrency value.
     */
    @Generated
    public CurrencyValue getValueCurrency() {
        return this.valueCurrency;
    }

    /**
     * Get the valueAddress property: Address value.
     *
     * @return the valueAddress value.
     */
    @Generated
    public AddressValue getValueAddress() {
        return this.valueAddress;
    }

    /**
     * Get the valueBoolean property: Boolean value.
     *
     * @return the valueBoolean value.
     */
    @Generated
    public Boolean isValueBoolean() {
        return this.valueBoolean;
    }

    /**
     * Get the content property: Field content.
     *
     * @return the content value.
     */
    @Generated
    public String getContent() {
        return this.content;
    }

    /**
     * Get the boundingRegions property: Bounding regions covering the field.
     *
     * @return the boundingRegions value.
     */
    @Generated
    public List<BoundingRegion> getBoundingRegions() {
        return this.boundingRegions;
    }

    /**
     * Get the spans property: Location of the field in the reading order concatenated content.
     *
     * @return the spans value.
     */
    @Generated
    public List<DocumentSpan> getSpans() {
        return this.spans;
    }

    /**
     * Get the confidence property: Confidence of correctly extracting the field.
     *
     * @return the confidence value.
     */
    @Generated
    public Double getConfidence() {
        return this.confidence;
    }
}
