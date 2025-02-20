// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.communication.jobrouter.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Request payload for declining offers. */
@Fluent
public final class DeclineJobOfferOptions {

    /*
     * If the RetryOfferAt is not provided, then this job will not be offered again to the worker who declined this job
     * unless the worker is de-registered and re-registered.  If a RetryOfferAt time is provided, then the job will be
     * re-matched to eligible workers at the retry time in UTC.  The worker that declined the job will also be eligible
     * for the job at that time.
     */
    @Generated
    @JsonProperty(value = "retryOfferAt")
    private OffsetDateTime retryOfferAt;

    /** Creates an instance of DeclineJobOfferOptions class. */
    @Generated
    public DeclineJobOfferOptions() {}

    /**
     * Get the retryOfferAt property: If the RetryOfferAt is not provided, then this job will not be offered again to
     * the worker who declined this job unless the worker is de-registered and re-registered. If a RetryOfferAt time is
     * provided, then the job will be re-matched to eligible workers at the retry time in UTC. The worker that declined
     * the job will also be eligible for the job at that time.
     *
     * @return the retryOfferAt value.
     */
    @Generated
    public OffsetDateTime getRetryOfferAt() {
        return this.retryOfferAt;
    }

    /**
     * Set the retryOfferAt property: If the RetryOfferAt is not provided, then this job will not be offered again to
     * the worker who declined this job unless the worker is de-registered and re-registered. If a RetryOfferAt time is
     * provided, then the job will be re-matched to eligible workers at the retry time in UTC. The worker that declined
     * the job will also be eligible for the job at that time.
     *
     * @param retryOfferAt the retryOfferAt value to set.
     * @return the DeclineJobOfferOptions object itself.
     */
    @Generated
    public DeclineJobOfferOptions setRetryOfferAt(OffsetDateTime retryOfferAt) {
        this.retryOfferAt = retryOfferAt;
        return this;
    }
}
