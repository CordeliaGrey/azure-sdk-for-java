// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.Activity;
import com.azure.resourcemanager.datafactory.models.ActivityDependency;
import com.azure.resourcemanager.datafactory.models.ActivityOnInactiveMarkAs;
import com.azure.resourcemanager.datafactory.models.ActivityState;
import com.azure.resourcemanager.datafactory.models.DependencyCondition;
import com.azure.resourcemanager.datafactory.models.SwitchCase;
import com.azure.resourcemanager.datafactory.models.UserProperty;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class SwitchCaseTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SwitchCase model =
            BinaryData
                .fromString(
                    "{\"value\":\"qbzc\",\"activities\":[{\"type\":\"Activity\",\"name\":\"yudc\",\"description\":\"eowepv\",\"state\":\"Active\",\"onInactiveMarkAs\":\"Skipped\",\"dependsOn\":[{\"activity\":\"sntopfqgu\",\"dependencyConditions\":[\"Succeeded\",\"Succeeded\"],\"\":{\"gurg\":\"datayeumwvz\",\"hkefowncudcrwo\":\"datarpcguwyu\"}},{\"activity\":\"qsrqebjgo\",\"dependencyConditions\":[\"Succeeded\",\"Skipped\"],\"\":{\"gchkmqfkm\":\"datad\"}},{\"activity\":\"eaomqqbslwxcf\",\"dependencyConditions\":[\"Skipped\",\"Completed\"],\"\":{\"mnxpp\":\"dataebarw\",\"nedjvataeao\":\"datafep\"}}],\"userProperties\":[{\"name\":\"zynvvkfbmrp\",\"value\":\"datajfceabgpwzs\"},{\"name\":\"ewi\",\"value\":\"datan\"},{\"name\":\"vdjmvzcycg\",\"value\":\"datatelimqxwih\"}],\"\":{\"guziglrihzrmrvgc\":\"dataexj\",\"twnppstpqws\":\"datafciskl\"}},{\"type\":\"Activity\",\"name\":\"eawolhlfffe\",\"description\":\"bmhqy\",\"state\":\"Active\",\"onInactiveMarkAs\":\"Failed\",\"dependsOn\":[{\"activity\":\"coqtvxhipchdpdev\",\"dependencyConditions\":[\"Succeeded\",\"Failed\"],\"\":{\"eshxomt\":\"datacik\",\"pypzgdet\":\"datakxpsx\",\"gyhu\":\"datad\",\"zmziiftjig\":\"datasutspocrskkraap\"}},{\"activity\":\"qyzocfyywcfl\",\"dependencyConditions\":[\"Succeeded\",\"Skipped\",\"Succeeded\"],\"\":{\"pwtjoku\":\"datamktbwdfjcepy\",\"bbccbqxwojve\":\"datartqnbdgcnickn\"}},{\"activity\":\"xhf\",\"dependencyConditions\":[\"Succeeded\",\"Skipped\"],\"\":{\"hzwyyyerzbmlhg\":\"datafyjcenkidlpml\",\"wsyx\":\"datatkthevodddne\",\"ohdifbhtxtcqjg\":\"datafdjftcr\"}},{\"activity\":\"d\",\"dependencyConditions\":[\"Completed\",\"Skipped\"],\"\":{\"tnej\":\"dataurjxkpha\",\"vuvh\":\"datafljqzbixlzaa\",\"bneepfjibtsp\":\"dataerjrcxyxepl\",\"eigywj\":\"dataiwfqj\"}}],\"userProperties\":[{\"name\":\"gncscwsefdqnsu\",\"value\":\"dataomln\"}],\"\":{\"crllecquo\":\"datajdcvnanej\",\"wvcyprpog\":\"datagyhkvtofxke\",\"ochpzcgs\":\"dataqvuftkiyghcmpyki\"}},{\"type\":\"Activity\",\"name\":\"pklfnst\",\"description\":\"bpwwo\",\"state\":\"Inactive\",\"onInactiveMarkAs\":\"Succeeded\",\"dependsOn\":[{\"activity\":\"rsgfpds\",\"dependencyConditions\":[\"Succeeded\"],\"\":{\"kcji\":\"dataepmttrfun\",\"jjfne\":\"dataoczoiduk\",\"mdffyv\":\"datauqalwjcqbnvbz\"}},{\"activity\":\"d\",\"dependencyConditions\":[\"Completed\"],\"\":{\"okirxyffttsdt\":\"dataryvkubfotgivpor\",\"gtrjzimxz\":\"dataql\",\"uladdujzenagmh\":\"datauqcinjejyinlys\"}},{\"activity\":\"mgtbqzftmpgibm\",\"dependencyConditions\":[\"Completed\"],\"\":{\"yjvjyxueuqc\":\"datacprbwsndloldxm\",\"gxak\":\"datagbs\",\"uyokctymsbhdi\":\"datakbryolzbmdntajgg\",\"s\":\"datazao\"}},{\"activity\":\"nxgk\",\"dependencyConditions\":[\"Completed\",\"Skipped\"],\"\":{\"euwpivsltlyqc\":\"dataukbpwwfeixm\",\"qcmsrzrcddlzga\":\"datapwndcjr\",\"optrudpm\":\"dataptwqfgqccond\"}}],\"userProperties\":[{\"name\":\"loflcilrafkrvv\",\"value\":\"datawknymqzmui\"},{\"name\":\"uvtgjgpcvdjin\",\"value\":\"dataoslzrbz\"},{\"name\":\"f\",\"value\":\"datavwcjrbjgdvwa\"}],\"\":{\"svximqkuyflzx\":\"datacnevkfkmena\"}},{\"type\":\"Activity\",\"name\":\"suuapktfvemwfwc\",\"description\":\"qyqvy\",\"state\":\"Active\",\"onInactiveMarkAs\":\"Skipped\",\"dependsOn\":[{\"activity\":\"wcojxpkpsq\",\"dependencyConditions\":[\"Failed\",\"Completed\",\"Completed\"],\"\":{\"zpgn\":\"dataybkhyqou\"}},{\"activity\":\"dzsnv\",\"dependencyConditions\":[\"Completed\",\"Skipped\",\"Skipped\",\"Completed\"],\"\":{\"w\":\"datahgfd\",\"nrfpzl\":\"datahcczyqnfs\",\"momvvrkdsqf\":\"dataaeojnskek\"}},{\"activity\":\"z\",\"dependencyConditions\":[\"Skipped\",\"Completed\",\"Completed\"],\"\":{\"cacdyajyiwvqlrz\":\"dataaxjhaetyeafjlism\",\"avnkyqrjbzrzfht\":\"databvkgfpjb\",\"abbxkldtwrrycl\":\"dataukuypyeofsa\",\"bguaxilcdbu\":\"datarld\"}}],\"userProperties\":[{\"name\":\"lpgpxyrfkslgpl\",\"value\":\"datad\"},{\"name\":\"cmkdhgpzqibqilc\",\"value\":\"datatmu\"},{\"name\":\"emex\",\"value\":\"datarjxaawentkok\"}],\"\":{\"wxicbvwnn\":\"datawpxeanjq\",\"grk\":\"datatlbc\",\"eayowzp\":\"datawof\"}}]}")
                .toObject(SwitchCase.class);
        Assertions.assertEquals("qbzc", model.value());
        Assertions.assertEquals("yudc", model.activities().get(0).name());
        Assertions.assertEquals("eowepv", model.activities().get(0).description());
        Assertions.assertEquals(ActivityState.ACTIVE, model.activities().get(0).state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.SKIPPED, model.activities().get(0).onInactiveMarkAs());
        Assertions.assertEquals("sntopfqgu", model.activities().get(0).dependsOn().get(0).activity());
        Assertions
            .assertEquals(
                DependencyCondition.SUCCEEDED,
                model.activities().get(0).dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("zynvvkfbmrp", model.activities().get(0).userProperties().get(0).name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SwitchCase model =
            new SwitchCase()
                .withValue("qbzc")
                .withActivities(
                    Arrays
                        .asList(
                            new Activity()
                                .withName("yudc")
                                .withDescription("eowepv")
                                .withState(ActivityState.ACTIVE)
                                .withOnInactiveMarkAs(ActivityOnInactiveMarkAs.SKIPPED)
                                .withDependsOn(
                                    Arrays
                                        .asList(
                                            new ActivityDependency()
                                                .withActivity("sntopfqgu")
                                                .withDependencyConditions(
                                                    Arrays
                                                        .asList(
                                                            DependencyCondition.SUCCEEDED,
                                                            DependencyCondition.SUCCEEDED))
                                                .withAdditionalProperties(mapOf()),
                                            new ActivityDependency()
                                                .withActivity("qsrqebjgo")
                                                .withDependencyConditions(
                                                    Arrays
                                                        .asList(
                                                            DependencyCondition.SUCCEEDED, DependencyCondition.SKIPPED))
                                                .withAdditionalProperties(mapOf()),
                                            new ActivityDependency()
                                                .withActivity("eaomqqbslwxcf")
                                                .withDependencyConditions(
                                                    Arrays
                                                        .asList(
                                                            DependencyCondition.SKIPPED, DependencyCondition.COMPLETED))
                                                .withAdditionalProperties(mapOf())))
                                .withUserProperties(
                                    Arrays
                                        .asList(
                                            new UserProperty().withName("zynvvkfbmrp").withValue("datajfceabgpwzs"),
                                            new UserProperty().withName("ewi").withValue("datan"),
                                            new UserProperty().withName("vdjmvzcycg").withValue("datatelimqxwih")))
                                .withAdditionalProperties(mapOf("type", "Activity")),
                            new Activity()
                                .withName("eawolhlfffe")
                                .withDescription("bmhqy")
                                .withState(ActivityState.ACTIVE)
                                .withOnInactiveMarkAs(ActivityOnInactiveMarkAs.FAILED)
                                .withDependsOn(
                                    Arrays
                                        .asList(
                                            new ActivityDependency()
                                                .withActivity("coqtvxhipchdpdev")
                                                .withDependencyConditions(
                                                    Arrays
                                                        .asList(
                                                            DependencyCondition.SUCCEEDED, DependencyCondition.FAILED))
                                                .withAdditionalProperties(mapOf()),
                                            new ActivityDependency()
                                                .withActivity("qyzocfyywcfl")
                                                .withDependencyConditions(
                                                    Arrays
                                                        .asList(
                                                            DependencyCondition.SUCCEEDED,
                                                            DependencyCondition.SKIPPED,
                                                            DependencyCondition.SUCCEEDED))
                                                .withAdditionalProperties(mapOf()),
                                            new ActivityDependency()
                                                .withActivity("xhf")
                                                .withDependencyConditions(
                                                    Arrays
                                                        .asList(
                                                            DependencyCondition.SUCCEEDED, DependencyCondition.SKIPPED))
                                                .withAdditionalProperties(mapOf()),
                                            new ActivityDependency()
                                                .withActivity("d")
                                                .withDependencyConditions(
                                                    Arrays
                                                        .asList(
                                                            DependencyCondition.COMPLETED, DependencyCondition.SKIPPED))
                                                .withAdditionalProperties(mapOf())))
                                .withUserProperties(
                                    Arrays.asList(new UserProperty().withName("gncscwsefdqnsu").withValue("dataomln")))
                                .withAdditionalProperties(mapOf("type", "Activity")),
                            new Activity()
                                .withName("pklfnst")
                                .withDescription("bpwwo")
                                .withState(ActivityState.INACTIVE)
                                .withOnInactiveMarkAs(ActivityOnInactiveMarkAs.SUCCEEDED)
                                .withDependsOn(
                                    Arrays
                                        .asList(
                                            new ActivityDependency()
                                                .withActivity("rsgfpds")
                                                .withDependencyConditions(Arrays.asList(DependencyCondition.SUCCEEDED))
                                                .withAdditionalProperties(mapOf()),
                                            new ActivityDependency()
                                                .withActivity("d")
                                                .withDependencyConditions(Arrays.asList(DependencyCondition.COMPLETED))
                                                .withAdditionalProperties(mapOf()),
                                            new ActivityDependency()
                                                .withActivity("mgtbqzftmpgibm")
                                                .withDependencyConditions(Arrays.asList(DependencyCondition.COMPLETED))
                                                .withAdditionalProperties(mapOf()),
                                            new ActivityDependency()
                                                .withActivity("nxgk")
                                                .withDependencyConditions(
                                                    Arrays
                                                        .asList(
                                                            DependencyCondition.COMPLETED, DependencyCondition.SKIPPED))
                                                .withAdditionalProperties(mapOf())))
                                .withUserProperties(
                                    Arrays
                                        .asList(
                                            new UserProperty().withName("loflcilrafkrvv").withValue("datawknymqzmui"),
                                            new UserProperty().withName("uvtgjgpcvdjin").withValue("dataoslzrbz"),
                                            new UserProperty().withName("f").withValue("datavwcjrbjgdvwa")))
                                .withAdditionalProperties(mapOf("type", "Activity")),
                            new Activity()
                                .withName("suuapktfvemwfwc")
                                .withDescription("qyqvy")
                                .withState(ActivityState.ACTIVE)
                                .withOnInactiveMarkAs(ActivityOnInactiveMarkAs.SKIPPED)
                                .withDependsOn(
                                    Arrays
                                        .asList(
                                            new ActivityDependency()
                                                .withActivity("wcojxpkpsq")
                                                .withDependencyConditions(
                                                    Arrays
                                                        .asList(
                                                            DependencyCondition.FAILED,
                                                            DependencyCondition.COMPLETED,
                                                            DependencyCondition.COMPLETED))
                                                .withAdditionalProperties(mapOf()),
                                            new ActivityDependency()
                                                .withActivity("dzsnv")
                                                .withDependencyConditions(
                                                    Arrays
                                                        .asList(
                                                            DependencyCondition.COMPLETED,
                                                            DependencyCondition.SKIPPED,
                                                            DependencyCondition.SKIPPED,
                                                            DependencyCondition.COMPLETED))
                                                .withAdditionalProperties(mapOf()),
                                            new ActivityDependency()
                                                .withActivity("z")
                                                .withDependencyConditions(
                                                    Arrays
                                                        .asList(
                                                            DependencyCondition.SKIPPED,
                                                            DependencyCondition.COMPLETED,
                                                            DependencyCondition.COMPLETED))
                                                .withAdditionalProperties(mapOf())))
                                .withUserProperties(
                                    Arrays
                                        .asList(
                                            new UserProperty().withName("lpgpxyrfkslgpl").withValue("datad"),
                                            new UserProperty().withName("cmkdhgpzqibqilc").withValue("datatmu"),
                                            new UserProperty().withName("emex").withValue("datarjxaawentkok")))
                                .withAdditionalProperties(mapOf("type", "Activity"))));
        model = BinaryData.fromObject(model).toObject(SwitchCase.class);
        Assertions.assertEquals("qbzc", model.value());
        Assertions.assertEquals("yudc", model.activities().get(0).name());
        Assertions.assertEquals("eowepv", model.activities().get(0).description());
        Assertions.assertEquals(ActivityState.ACTIVE, model.activities().get(0).state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.SKIPPED, model.activities().get(0).onInactiveMarkAs());
        Assertions.assertEquals("sntopfqgu", model.activities().get(0).dependsOn().get(0).activity());
        Assertions
            .assertEquals(
                DependencyCondition.SUCCEEDED,
                model.activities().get(0).dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("zynvvkfbmrp", model.activities().get(0).userProperties().get(0).name());
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
