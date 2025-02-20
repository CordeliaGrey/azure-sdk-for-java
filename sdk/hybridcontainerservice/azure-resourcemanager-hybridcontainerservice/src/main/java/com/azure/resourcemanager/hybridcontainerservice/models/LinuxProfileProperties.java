// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** LinuxProfile - Profile for Linux VMs in the container service cluster. */
@Fluent
public final class LinuxProfileProperties {
    /*
     * AdminUsername - The administrator username to use for Linux VMs.
     */
    @JsonProperty(value = "adminUsername")
    private String adminUsername;

    /*
     * SSH - SSH configuration for Linux-based VMs running on Azure.
     */
    @JsonProperty(value = "ssh")
    private LinuxProfilePropertiesSsh ssh;

    /** Creates an instance of LinuxProfileProperties class. */
    public LinuxProfileProperties() {
    }

    /**
     * Get the adminUsername property: AdminUsername - The administrator username to use for Linux VMs.
     *
     * @return the adminUsername value.
     */
    public String adminUsername() {
        return this.adminUsername;
    }

    /**
     * Set the adminUsername property: AdminUsername - The administrator username to use for Linux VMs.
     *
     * @param adminUsername the adminUsername value to set.
     * @return the LinuxProfileProperties object itself.
     */
    public LinuxProfileProperties withAdminUsername(String adminUsername) {
        this.adminUsername = adminUsername;
        return this;
    }

    /**
     * Get the ssh property: SSH - SSH configuration for Linux-based VMs running on Azure.
     *
     * @return the ssh value.
     */
    public LinuxProfilePropertiesSsh ssh() {
        return this.ssh;
    }

    /**
     * Set the ssh property: SSH - SSH configuration for Linux-based VMs running on Azure.
     *
     * @param ssh the ssh value to set.
     * @return the LinuxProfileProperties object itself.
     */
    public LinuxProfileProperties withSsh(LinuxProfilePropertiesSsh ssh) {
        this.ssh = ssh;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (ssh() != null) {
            ssh().validate();
        }
    }
}
