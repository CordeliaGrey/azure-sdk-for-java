// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated;

import com.azure.core.util.Context;

/** Samples for Skus List. */
public final class SkusListSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/stable/2022-12-01/examples/Skus_List.json
     */
    /**
     * Sample code: Skus_List.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void skusList(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.springServices().manager().serviceClient().getSkus().list(Context.NONE);
    }
}
