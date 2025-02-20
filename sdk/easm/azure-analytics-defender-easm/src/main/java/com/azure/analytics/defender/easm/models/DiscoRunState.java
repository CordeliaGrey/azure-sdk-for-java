// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.analytics.defender.easm.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The State of the disco run. */
public final class DiscoRunState extends ExpandableStringEnum<DiscoRunState> {

    /** Static value pending for DiscoRunState. */
    @Generated public static final DiscoRunState PENDING = fromString("pending");

    /** Static value running for DiscoRunState. */
    @Generated public static final DiscoRunState RUNNING = fromString("running");

    /** Static value completed for DiscoRunState. */
    @Generated public static final DiscoRunState COMPLETED = fromString("completed");

    /** Static value failed for DiscoRunState. */
    @Generated public static final DiscoRunState FAILED = fromString("failed");

    /**
     * Creates a new instance of DiscoRunState value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public DiscoRunState() {}

    /**
     * Creates or finds a DiscoRunState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DiscoRunState.
     */
    @Generated
    @JsonCreator
    public static DiscoRunState fromString(String name) {
        return fromString(name, DiscoRunState.class);
    }

    /**
     * Gets known DiscoRunState values.
     *
     * @return known DiscoRunState values.
     */
    @Generated
    public static Collection<DiscoRunState> values() {
        return values(DiscoRunState.class);
    }
}
