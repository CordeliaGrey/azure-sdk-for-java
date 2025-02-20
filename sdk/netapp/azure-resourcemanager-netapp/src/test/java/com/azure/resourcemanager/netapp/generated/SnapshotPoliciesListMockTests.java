// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.netapp.NetAppFilesManager;
import com.azure.resourcemanager.netapp.models.SnapshotPolicy;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class SnapshotPoliciesListMockTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"etag\":\"prtujwsawdd\",\"properties\":{\"hourlySchedule\":{\"snapshotsToKeep\":1148238938,\"minute\":149022358,\"usedBytes\":6958305132617717680},\"dailySchedule\":{\"snapshotsToKeep\":177247655,\"hour\":1297733750,\"minute\":1671083084,\"usedBytes\":8033750853148480276},\"weeklySchedule\":{\"snapshotsToKeep\":1119410287,\"day\":\"glecdmdqbwpypq\",\"hour\":543854908,\"minute\":1969231562,\"usedBytes\":7692078568165207428},\"monthlySchedule\":{\"snapshotsToKeep\":1318047091,\"daysOfMonth\":\"xudb\",\"hour\":1229147679,\"minute\":1337444270,\"usedBytes\":5506706101384890254},\"enabled\":true,\"provisioningState\":\"dhzmmesckdlp\"},\"location\":\"zrcxfailcfxwmdbo\",\"tags\":{\"ckknhxkizvy\":\"gsftufqobrjlnacg\",\"nok\":\"nrzvuljraaer\",\"a\":\"gukkjqnvbroy\"},\"id\":\"xulcdisdos\",\"name\":\"jbjsvgjrwh\",\"type\":\"yvycytdclxgcckn\"}]}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        NetAppFilesManager manager =
            NetAppFilesManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<SnapshotPolicy> response =
            manager.snapshotPolicies().list("vecuijpx", "xs", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("zrcxfailcfxwmdbo", response.iterator().next().location());
        Assertions.assertEquals("gsftufqobrjlnacg", response.iterator().next().tags().get("ckknhxkizvy"));
        Assertions.assertEquals(1148238938, response.iterator().next().hourlySchedule().snapshotsToKeep());
        Assertions.assertEquals(149022358, response.iterator().next().hourlySchedule().minute());
        Assertions.assertEquals(6958305132617717680L, response.iterator().next().hourlySchedule().usedBytes());
        Assertions.assertEquals(177247655, response.iterator().next().dailySchedule().snapshotsToKeep());
        Assertions.assertEquals(1297733750, response.iterator().next().dailySchedule().hour());
        Assertions.assertEquals(1671083084, response.iterator().next().dailySchedule().minute());
        Assertions.assertEquals(8033750853148480276L, response.iterator().next().dailySchedule().usedBytes());
        Assertions.assertEquals(1119410287, response.iterator().next().weeklySchedule().snapshotsToKeep());
        Assertions.assertEquals("glecdmdqbwpypq", response.iterator().next().weeklySchedule().day());
        Assertions.assertEquals(543854908, response.iterator().next().weeklySchedule().hour());
        Assertions.assertEquals(1969231562, response.iterator().next().weeklySchedule().minute());
        Assertions.assertEquals(7692078568165207428L, response.iterator().next().weeklySchedule().usedBytes());
        Assertions.assertEquals(1318047091, response.iterator().next().monthlySchedule().snapshotsToKeep());
        Assertions.assertEquals("xudb", response.iterator().next().monthlySchedule().daysOfMonth());
        Assertions.assertEquals(1229147679, response.iterator().next().monthlySchedule().hour());
        Assertions.assertEquals(1337444270, response.iterator().next().monthlySchedule().minute());
        Assertions.assertEquals(5506706101384890254L, response.iterator().next().monthlySchedule().usedBytes());
        Assertions.assertEquals(true, response.iterator().next().enabled());
    }
}
