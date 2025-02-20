// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.models.AzureBackupFindRestorableTimeRangesRequest;
import com.azure.resourcemanager.dataprotection.models.AzureBackupFindRestorableTimeRangesRequestResource;
import com.azure.resourcemanager.dataprotection.models.RestoreSourceDataStoreType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class AzureBackupFindRestorableTimeRangesRequestResourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureBackupFindRestorableTimeRangesRequestResource model =
            BinaryData
                .fromString(
                    "{\"content\":{\"sourceDataStoreType\":\"OperationalStore\",\"startTime\":\"yijejvegrhbpnaix\",\"endTime\":\"ccbdre\"},\"subscriptionId\":\"hcexdrrvqa\",\"uri\":\"kghtpwijnh\",\"headers\":{\"mtg\":[\"f\",\"cxzbfvoowvr\"],\"pnsxkmcwaek\":[\"ppyostronzmyhgf\"],\"elfk\":[\"jreafxtsgum\",\"jglikkxwslolb\",\"pvuzlmv\"]},\"supportedGroupVersions\":[\"lcrpw\",\"xeznoi\",\"brnjwmw\",\"pn\"],\"cultureInfo\":\"azej\",\"parameters\":{\"ugzxnf\":\"kagfhsxtt\",\"uenvrkp\":\"azpxdtnkdmkqjjl\",\"ibreb\":\"ou\"},\"httpMethod\":\"aysjkixqtnqttez\"}")
                .toObject(AzureBackupFindRestorableTimeRangesRequestResource.class);
        Assertions.assertEquals("hcexdrrvqa", model.subscriptionId());
        Assertions.assertEquals("kghtpwijnh", model.uri());
        Assertions.assertEquals("f", model.headers().get("mtg").get(0));
        Assertions.assertEquals("lcrpw", model.supportedGroupVersions().get(0));
        Assertions.assertEquals("azej", model.cultureInfo());
        Assertions.assertEquals("kagfhsxtt", model.parameters().get("ugzxnf"));
        Assertions.assertEquals("aysjkixqtnqttez", model.httpMethod());
        Assertions.assertEquals(RestoreSourceDataStoreType.OPERATIONAL_STORE, model.content().sourceDataStoreType());
        Assertions.assertEquals("yijejvegrhbpnaix", model.content().startTime());
        Assertions.assertEquals("ccbdre", model.content().endTime());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureBackupFindRestorableTimeRangesRequestResource model =
            new AzureBackupFindRestorableTimeRangesRequestResource()
                .withSubscriptionId("hcexdrrvqa")
                .withUri("kghtpwijnh")
                .withHeaders(
                    mapOf(
                        "mtg",
                        Arrays.asList("f", "cxzbfvoowvr"),
                        "pnsxkmcwaek",
                        Arrays.asList("ppyostronzmyhgf"),
                        "elfk",
                        Arrays.asList("jreafxtsgum", "jglikkxwslolb", "pvuzlmv")))
                .withSupportedGroupVersions(Arrays.asList("lcrpw", "xeznoi", "brnjwmw", "pn"))
                .withCultureInfo("azej")
                .withParameters(mapOf("ugzxnf", "kagfhsxtt", "uenvrkp", "azpxdtnkdmkqjjl", "ibreb", "ou"))
                .withHttpMethod("aysjkixqtnqttez")
                .withContent(
                    new AzureBackupFindRestorableTimeRangesRequest()
                        .withSourceDataStoreType(RestoreSourceDataStoreType.OPERATIONAL_STORE)
                        .withStartTime("yijejvegrhbpnaix")
                        .withEndTime("ccbdre"));
        model = BinaryData.fromObject(model).toObject(AzureBackupFindRestorableTimeRangesRequestResource.class);
        Assertions.assertEquals("hcexdrrvqa", model.subscriptionId());
        Assertions.assertEquals("kghtpwijnh", model.uri());
        Assertions.assertEquals("f", model.headers().get("mtg").get(0));
        Assertions.assertEquals("lcrpw", model.supportedGroupVersions().get(0));
        Assertions.assertEquals("azej", model.cultureInfo());
        Assertions.assertEquals("kagfhsxtt", model.parameters().get("ugzxnf"));
        Assertions.assertEquals("aysjkixqtnqttez", model.httpMethod());
        Assertions.assertEquals(RestoreSourceDataStoreType.OPERATIONAL_STORE, model.content().sourceDataStoreType());
        Assertions.assertEquals("yijejvegrhbpnaix", model.content().startTime());
        Assertions.assertEquals("ccbdre", model.content().endTime());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
