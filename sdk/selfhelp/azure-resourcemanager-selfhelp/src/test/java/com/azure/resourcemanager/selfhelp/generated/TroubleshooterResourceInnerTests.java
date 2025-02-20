// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.selfhelp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.selfhelp.fluent.models.TroubleshooterResourceInner;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class TroubleshooterResourceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TroubleshooterResourceInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"solutionId\":\"ymuctqhjfbebrj\",\"parameters\":{\"xfvjrbirp\":\"rfuwutt\",\"jky\":\"xepcyvahfn\",\"ljyoxgvcltb\":\"xjvuujqgidokg\"},\"provisioningState\":\"Failed\",\"steps\":[{\"id\":\"kjeszz\",\"title\":\"ijhtxf\",\"description\":\"xbf\",\"guidance\":\"xnehmpvec\",\"executionStatus\":\"Warning\",\"executionStatusDescription\":\"ebfqkkrbm\",\"type\":\"Insight\",\"isLastStep\":true,\"inputs\":[{\"questionId\":\"lzlfbxzpuz\",\"questionType\":\"ispnqzahmgkbrp\",\"questionContent\":\"dhibnuq\",\"questionContentType\":\"Html\",\"responseHint\":\"kadrgvt\",\"recommendedOption\":\"gnbuy\",\"selectedOptionValue\":\"ijggmebfsiar\",\"responseValidationProperties\":{},\"responseOptions\":[{},{},{},{}]},{\"questionId\":\"vpnazzm\",\"questionType\":\"runmp\",\"questionContent\":\"tdbhrbnla\",\"questionContentType\":\"Text\",\"responseHint\":\"yskpbhen\",\"recommendedOption\":\"kcxywnyt\",\"selectedOptionValue\":\"synlqidybyxczfc\",\"responseValidationProperties\":{},\"responseOptions\":[{},{}]},{\"questionId\":\"dbabp\",\"questionType\":\"wrqlfktsthsuco\",\"questionContent\":\"nyyazttbtwwrqpue\",\"questionContentType\":\"Text\",\"responseHint\":\"ywbiexzfeyueax\",\"recommendedOption\":\"xujwbhqwalmuzyo\",\"selectedOptionValue\":\"epdkzja\",\"responseValidationProperties\":{},\"responseOptions\":[{},{},{},{}]},{\"questionId\":\"hdwbavxbniwdjs\",\"questionType\":\"tsdbpgn\",\"questionContent\":\"txhp\",\"questionContentType\":\"Markdown\",\"responseHint\":\"pfza\",\"recommendedOption\":\"lcuhxwtctyqiklb\",\"selectedOptionValue\":\"vplwzbhv\",\"responseValidationProperties\":{},\"responseOptions\":[{}]}],\"automatedCheckResults\":{\"result\":\"svmkfssxquk\",\"type\":\"Error\"},\"insights\":[{\"id\":\"gsxnkjzkdeslpv\",\"title\":\"pwiyig\",\"results\":\"pkdwzbai\",\"importanceLevel\":\"Critical\"},{\"id\":\"a\",\"title\":\"nyqupedeojnabck\",\"results\":\"mtxpsiebtfh\",\"importanceLevel\":\"Critical\"},{\"id\":\"apskrdqm\",\"title\":\"jdhtldwkyzxu\",\"results\":\"kn\",\"importanceLevel\":\"Warning\"}]},{\"id\":\"svlxotogtwrup\",\"title\":\"xvnmicykvceov\",\"description\":\"lo\",\"guidance\":\"oty\",\"executionStatus\":\"Success\",\"executionStatusDescription\":\"njbkcnxdhbttkph\",\"type\":\"AutomatedCheck\",\"isLastStep\":true,\"inputs\":[{\"questionId\":\"qnermclfplphoxu\",\"questionType\":\"rpabg\",\"questionContent\":\"psbjta\",\"questionContentType\":\"Markdown\",\"responseHint\":\"xywpmueefjzwfqkq\",\"recommendedOption\":\"ids\",\"selectedOptionValue\":\"onobglaocqx\",\"responseValidationProperties\":{},\"responseOptions\":[{},{},{},{}]}],\"automatedCheckResults\":{\"result\":\"udxytlmoyrx\",\"type\":\"Warning\"},\"insights\":[{\"id\":\"pz\",\"title\":\"xhdzhlrqjbhckf\",\"results\":\"hrxsbk\",\"importanceLevel\":\"Information\"}]},{\"id\":\"anuzbpzkafkuw\",\"title\":\"rnwb\",\"description\":\"hhseyv\",\"guidance\":\"srtslhspkdeem\",\"executionStatus\":\"Success\",\"executionStatusDescription\":\"xagkvtmelmqkrh\",\"type\":\"Solution\",\"isLastStep\":true,\"inputs\":[{\"questionId\":\"aquhcdhm\",\"questionType\":\"alaexqpvfadmwsrc\",\"questionContent\":\"vxpvgomz\",\"questionContentType\":\"Text\",\"responseHint\":\"sgwbnbbeld\",\"recommendedOption\":\"k\",\"selectedOptionValue\":\"ali\",\"responseValidationProperties\":{},\"responseOptions\":[{},{},{}]},{\"questionId\":\"akauha\",\"questionType\":\"sfwxosowzxc\",\"questionContent\":\"i\",\"questionContentType\":\"Html\",\"responseHint\":\"xdje\",\"recommendedOption\":\"pucwwfvovbvme\",\"selectedOptionValue\":\"civyhzceuo\",\"responseValidationProperties\":{},\"responseOptions\":[{}]}],\"automatedCheckResults\":{\"result\":\"ueiotwmcdyt\",\"type\":\"Success\"},\"insights\":[{\"id\":\"nrjawgqwg\",\"title\":\"ni\",\"results\":\"x\",\"importanceLevel\":\"Warning\"},{\"id\":\"y\",\"title\":\"klwndnhjdauwhv\",\"results\":\"wzbtdhxu\",\"importanceLevel\":\"Critical\"}]}]},\"id\":\"pow\",\"name\":\"wpr\",\"type\":\"qlveualupjmkh\"}")
                .toObject(TroubleshooterResourceInner.class);
        Assertions.assertEquals("ymuctqhjfbebrj", model.solutionId());
        Assertions.assertEquals("rfuwutt", model.parameters().get("xfvjrbirp"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TroubleshooterResourceInner model =
            new TroubleshooterResourceInner()
                .withSolutionId("ymuctqhjfbebrj")
                .withParameters(mapOf("xfvjrbirp", "rfuwutt", "jky", "xepcyvahfn", "ljyoxgvcltb", "xjvuujqgidokg"));
        model = BinaryData.fromObject(model).toObject(TroubleshooterResourceInner.class);
        Assertions.assertEquals("ymuctqhjfbebrj", model.solutionId());
        Assertions.assertEquals("rfuwutt", model.parameters().get("xfvjrbirp"));
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
