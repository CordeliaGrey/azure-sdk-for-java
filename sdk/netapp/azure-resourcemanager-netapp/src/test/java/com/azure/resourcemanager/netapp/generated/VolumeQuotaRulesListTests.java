// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.fluent.models.VolumeQuotaRuleInner;
import com.azure.resourcemanager.netapp.models.Type;
import com.azure.resourcemanager.netapp.models.VolumeQuotaRulesList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class VolumeQuotaRulesListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VolumeQuotaRulesList model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"provisioningState\":\"Deleting\",\"quotaSizeInKiBs\":4528392326800353907,\"quotaType\":\"IndividualGroupQuota\",\"quotaTarget\":\"wem\"},\"location\":\"rncsdtclu\",\"tags\":{\"lfeadcygq\":\"pbsfgytgu\",\"elolppvksrpqvuj\":\"kyhejhzisxgf\",\"wib\":\"raehtwdwrft\",\"cstwity\":\"rcdlbhshfwpr\"},\"id\":\"hevxcced\",\"name\":\"pnmdyodnwzxltjcv\",\"type\":\"hlt\"}]}")
                .toObject(VolumeQuotaRulesList.class);
        Assertions.assertEquals("rncsdtclu", model.value().get(0).location());
        Assertions.assertEquals("pbsfgytgu", model.value().get(0).tags().get("lfeadcygq"));
        Assertions.assertEquals(4528392326800353907L, model.value().get(0).quotaSizeInKiBs());
        Assertions.assertEquals(Type.INDIVIDUAL_GROUP_QUOTA, model.value().get(0).quotaType());
        Assertions.assertEquals("wem", model.value().get(0).quotaTarget());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VolumeQuotaRulesList model =
            new VolumeQuotaRulesList()
                .withValue(
                    Arrays
                        .asList(
                            new VolumeQuotaRuleInner()
                                .withLocation("rncsdtclu")
                                .withTags(
                                    mapOf(
                                        "lfeadcygq",
                                        "pbsfgytgu",
                                        "elolppvksrpqvuj",
                                        "kyhejhzisxgf",
                                        "wib",
                                        "raehtwdwrft",
                                        "cstwity",
                                        "rcdlbhshfwpr"))
                                .withQuotaSizeInKiBs(4528392326800353907L)
                                .withQuotaType(Type.INDIVIDUAL_GROUP_QUOTA)
                                .withQuotaTarget("wem")));
        model = BinaryData.fromObject(model).toObject(VolumeQuotaRulesList.class);
        Assertions.assertEquals("rncsdtclu", model.value().get(0).location());
        Assertions.assertEquals("pbsfgytgu", model.value().get(0).tags().get("lfeadcygq"));
        Assertions.assertEquals(4528392326800353907L, model.value().get(0).quotaSizeInKiBs());
        Assertions.assertEquals(Type.INDIVIDUAL_GROUP_QUOTA, model.value().get(0).quotaType());
        Assertions.assertEquals("wem", model.value().get(0).quotaTarget());
    }

    // Use "Map.of" if available
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
