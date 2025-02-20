// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.communication.jobrouter.implementation.models;

import com.azure.communication.jobrouter.models.OAuth2WebhookClientCredential;
import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A rule providing a binding to an external web server. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("webhook-rule")
@Fluent
public final class WebhookRouterRuleInternal extends RouterRuleInternal {

    /*
     * Uri for Authorization Server.
     */
    @Generated
    @JsonProperty(value = "authorizationServerUri")
    private String authorizationServerUri;

    /*
     * OAuth2.0 Credentials used to Contoso's Authorization server. Reference:
     * https://www.oauth.com/oauth2-servers/access-tokens/client-credentials/
     */
    @Generated
    @JsonProperty(value = "clientCredential")
    private OAuth2WebhookClientCredential clientCredential;

    /*
     * Uri for Contoso's Web Server.
     */
    @Generated
    @JsonProperty(value = "webhookUri")
    private String webhookUri;

    /** Creates an instance of WebhookRouterRule class. */
    @Generated
    public WebhookRouterRuleInternal() {}

    /**
     * Get the authorizationServerUri property: Uri for Authorization Server.
     *
     * @return the authorizationServerUri value.
     */
    @Generated
    public String getAuthorizationServerUri() {
        return this.authorizationServerUri;
    }

    /**
     * Set the authorizationServerUri property: Uri for Authorization Server.
     *
     * @param authorizationServerUri the authorizationServerUri value to set.
     * @return the WebhookRouterRule object itself.
     */
    @Generated
    public WebhookRouterRuleInternal setAuthorizationServerUri(String authorizationServerUri) {
        this.authorizationServerUri = authorizationServerUri;
        return this;
    }

    /**
     * Get the clientCredential property: OAuth2.0 Credentials used to Contoso's Authorization server. Reference:
     * https://www.oauth.com/oauth2-servers/access-tokens/client-credentials/.
     *
     * @return the clientCredential value.
     */
    @Generated
    public OAuth2WebhookClientCredential getClientCredential() {
        return this.clientCredential;
    }

    /**
     * Get the webhookUri property: Uri for Contoso's Web Server.
     *
     * @return the webhookUri value.
     */
    @Generated
    public String getWebhookUri() {
        return this.webhookUri;
    }

    /**
     * Set the webhookUri property: Uri for Contoso's Web Server.
     *
     * @param webhookUri the webhookUri value to set.
     * @return the WebhookRouterRule object itself.
     */
    @Generated
    public WebhookRouterRuleInternal setWebhookUri(String webhookUri) {
        this.webhookUri = webhookUri;
        return this;
    }

    /**
     * Set the clientCredential property: OAuth2.0 Credentials used to Contoso's Authorization server. Reference:
     * https://www.oauth.com/oauth2-servers/access-tokens/client-credentials/.
     *
     * @param clientCredential the clientCredential value to set.
     * @return the WebhookRouterRule object itself.
     */
    @Generated
    public WebhookRouterRuleInternal setClientCredential(OAuth2WebhookClientCredential clientCredential) {
        this.clientCredential = clientCredential;
        return this;
    }
}
