// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.AzureBlobStorageLinkedServiceTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** The azure blob storage linked service. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureBlobStorage")
@Fluent
public final class AzureBlobStorageLinkedService extends LinkedService {
    /*
     * Azure Blob Storage linked service properties.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private AzureBlobStorageLinkedServiceTypeProperties innerTypeProperties =
        new AzureBlobStorageLinkedServiceTypeProperties();

    /** Creates an instance of AzureBlobStorageLinkedService class. */
    public AzureBlobStorageLinkedService() {
    }

    /**
     * Get the innerTypeProperties property: Azure Blob Storage linked service properties.
     *
     * @return the innerTypeProperties value.
     */
    private AzureBlobStorageLinkedServiceTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /** {@inheritDoc} */
    @Override
    public AzureBlobStorageLinkedService withConnectVia(IntegrationRuntimeReference connectVia) {
        super.withConnectVia(connectVia);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureBlobStorageLinkedService withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureBlobStorageLinkedService withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureBlobStorageLinkedService withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /**
     * Get the connectionString property: The connection string. It is mutually exclusive with sasUri, serviceEndpoint
     * property. Type: string, SecureString or AzureKeyVaultSecretReference.
     *
     * @return the connectionString value.
     */
    public Object connectionString() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().connectionString();
    }

    /**
     * Set the connectionString property: The connection string. It is mutually exclusive with sasUri, serviceEndpoint
     * property. Type: string, SecureString or AzureKeyVaultSecretReference.
     *
     * @param connectionString the connectionString value to set.
     * @return the AzureBlobStorageLinkedService object itself.
     */
    public AzureBlobStorageLinkedService withConnectionString(Object connectionString) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureBlobStorageLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withConnectionString(connectionString);
        return this;
    }

    /**
     * Get the accountKey property: The Azure key vault secret reference of accountKey in connection string.
     *
     * @return the accountKey value.
     */
    public AzureKeyVaultSecretReference accountKey() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().accountKey();
    }

    /**
     * Set the accountKey property: The Azure key vault secret reference of accountKey in connection string.
     *
     * @param accountKey the accountKey value to set.
     * @return the AzureBlobStorageLinkedService object itself.
     */
    public AzureBlobStorageLinkedService withAccountKey(AzureKeyVaultSecretReference accountKey) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureBlobStorageLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withAccountKey(accountKey);
        return this;
    }

    /**
     * Get the sasUri property: SAS URI of the Azure Blob Storage resource. It is mutually exclusive with
     * connectionString, serviceEndpoint property. Type: string, SecureString or AzureKeyVaultSecretReference.
     *
     * @return the sasUri value.
     */
    public Object sasUri() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().sasUri();
    }

    /**
     * Set the sasUri property: SAS URI of the Azure Blob Storage resource. It is mutually exclusive with
     * connectionString, serviceEndpoint property. Type: string, SecureString or AzureKeyVaultSecretReference.
     *
     * @param sasUri the sasUri value to set.
     * @return the AzureBlobStorageLinkedService object itself.
     */
    public AzureBlobStorageLinkedService withSasUri(Object sasUri) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureBlobStorageLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withSasUri(sasUri);
        return this;
    }

    /**
     * Get the sasToken property: The Azure key vault secret reference of sasToken in sas uri.
     *
     * @return the sasToken value.
     */
    public AzureKeyVaultSecretReference sasToken() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().sasToken();
    }

    /**
     * Set the sasToken property: The Azure key vault secret reference of sasToken in sas uri.
     *
     * @param sasToken the sasToken value to set.
     * @return the AzureBlobStorageLinkedService object itself.
     */
    public AzureBlobStorageLinkedService withSasToken(AzureKeyVaultSecretReference sasToken) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureBlobStorageLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withSasToken(sasToken);
        return this;
    }

    /**
     * Get the serviceEndpoint property: Blob service endpoint of the Azure Blob Storage resource. It is mutually
     * exclusive with connectionString, sasUri property.
     *
     * @return the serviceEndpoint value.
     */
    public Object serviceEndpoint() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().serviceEndpoint();
    }

    /**
     * Set the serviceEndpoint property: Blob service endpoint of the Azure Blob Storage resource. It is mutually
     * exclusive with connectionString, sasUri property.
     *
     * @param serviceEndpoint the serviceEndpoint value to set.
     * @return the AzureBlobStorageLinkedService object itself.
     */
    public AzureBlobStorageLinkedService withServiceEndpoint(Object serviceEndpoint) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureBlobStorageLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withServiceEndpoint(serviceEndpoint);
        return this;
    }

    /**
     * Get the servicePrincipalId property: The ID of the service principal used to authenticate against Azure SQL Data
     * Warehouse. Type: string (or Expression with resultType string).
     *
     * @return the servicePrincipalId value.
     */
    public Object servicePrincipalId() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().servicePrincipalId();
    }

    /**
     * Set the servicePrincipalId property: The ID of the service principal used to authenticate against Azure SQL Data
     * Warehouse. Type: string (or Expression with resultType string).
     *
     * @param servicePrincipalId the servicePrincipalId value to set.
     * @return the AzureBlobStorageLinkedService object itself.
     */
    public AzureBlobStorageLinkedService withServicePrincipalId(Object servicePrincipalId) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureBlobStorageLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withServicePrincipalId(servicePrincipalId);
        return this;
    }

    /**
     * Get the servicePrincipalKey property: The key of the service principal used to authenticate against Azure SQL
     * Data Warehouse.
     *
     * @return the servicePrincipalKey value.
     */
    public SecretBase servicePrincipalKey() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().servicePrincipalKey();
    }

    /**
     * Set the servicePrincipalKey property: The key of the service principal used to authenticate against Azure SQL
     * Data Warehouse.
     *
     * @param servicePrincipalKey the servicePrincipalKey value to set.
     * @return the AzureBlobStorageLinkedService object itself.
     */
    public AzureBlobStorageLinkedService withServicePrincipalKey(SecretBase servicePrincipalKey) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureBlobStorageLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withServicePrincipalKey(servicePrincipalKey);
        return this;
    }

    /**
     * Get the tenant property: The name or ID of the tenant to which the service principal belongs. Type: string (or
     * Expression with resultType string).
     *
     * @return the tenant value.
     */
    public Object tenant() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().tenant();
    }

    /**
     * Set the tenant property: The name or ID of the tenant to which the service principal belongs. Type: string (or
     * Expression with resultType string).
     *
     * @param tenant the tenant value to set.
     * @return the AzureBlobStorageLinkedService object itself.
     */
    public AzureBlobStorageLinkedService withTenant(Object tenant) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureBlobStorageLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withTenant(tenant);
        return this;
    }

    /**
     * Get the azureCloudType property: Indicates the azure cloud type of the service principle auth. Allowed values are
     * AzurePublic, AzureChina, AzureUsGovernment, AzureGermany. Default value is the data factory regions’ cloud type.
     * Type: string (or Expression with resultType string).
     *
     * @return the azureCloudType value.
     */
    public Object azureCloudType() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().azureCloudType();
    }

    /**
     * Set the azureCloudType property: Indicates the azure cloud type of the service principle auth. Allowed values are
     * AzurePublic, AzureChina, AzureUsGovernment, AzureGermany. Default value is the data factory regions’ cloud type.
     * Type: string (or Expression with resultType string).
     *
     * @param azureCloudType the azureCloudType value to set.
     * @return the AzureBlobStorageLinkedService object itself.
     */
    public AzureBlobStorageLinkedService withAzureCloudType(Object azureCloudType) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureBlobStorageLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withAzureCloudType(azureCloudType);
        return this;
    }

    /**
     * Get the accountKind property: Specify the kind of your storage account. Allowed values are: Storage (general
     * purpose v1), StorageV2 (general purpose v2), BlobStorage, or BlockBlobStorage. Type: string (or Expression with
     * resultType string).
     *
     * @return the accountKind value.
     */
    public Object accountKind() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().accountKind();
    }

    /**
     * Set the accountKind property: Specify the kind of your storage account. Allowed values are: Storage (general
     * purpose v1), StorageV2 (general purpose v2), BlobStorage, or BlockBlobStorage. Type: string (or Expression with
     * resultType string).
     *
     * @param accountKind the accountKind value to set.
     * @return the AzureBlobStorageLinkedService object itself.
     */
    public AzureBlobStorageLinkedService withAccountKind(Object accountKind) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureBlobStorageLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withAccountKind(accountKind);
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string.
     *
     * @return the encryptedCredential value.
     */
    public String encryptedCredential() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().encryptedCredential();
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string.
     *
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the AzureBlobStorageLinkedService object itself.
     */
    public AzureBlobStorageLinkedService withEncryptedCredential(String encryptedCredential) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureBlobStorageLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withEncryptedCredential(encryptedCredential);
        return this;
    }

    /**
     * Get the credential property: The credential reference containing authentication information.
     *
     * @return the credential value.
     */
    public CredentialReference credential() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().credential();
    }

    /**
     * Set the credential property: The credential reference containing authentication information.
     *
     * @param credential the credential value to set.
     * @return the AzureBlobStorageLinkedService object itself.
     */
    public AzureBlobStorageLinkedService withCredential(CredentialReference credential) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureBlobStorageLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withCredential(credential);
        return this;
    }

    /**
     * Get the authenticationType property: The type used for authentication. Type: string.
     *
     * @return the authenticationType value.
     */
    public AzureStorageAuthenticationType authenticationType() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().authenticationType();
    }

    /**
     * Set the authenticationType property: The type used for authentication. Type: string.
     *
     * @param authenticationType the authenticationType value to set.
     * @return the AzureBlobStorageLinkedService object itself.
     */
    public AzureBlobStorageLinkedService withAuthenticationType(AzureStorageAuthenticationType authenticationType) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureBlobStorageLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withAuthenticationType(authenticationType);
        return this;
    }

    /**
     * Get the containerUri property: Container uri of the Azure Blob Storage resource only support for anonymous
     * access. Type: string (or Expression with resultType string).
     *
     * @return the containerUri value.
     */
    public Object containerUri() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().containerUri();
    }

    /**
     * Set the containerUri property: Container uri of the Azure Blob Storage resource only support for anonymous
     * access. Type: string (or Expression with resultType string).
     *
     * @param containerUri the containerUri value to set.
     * @return the AzureBlobStorageLinkedService object itself.
     */
    public AzureBlobStorageLinkedService withContainerUri(Object containerUri) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureBlobStorageLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withContainerUri(containerUri);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerTypeProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerTypeProperties in model AzureBlobStorageLinkedService"));
        } else {
            innerTypeProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AzureBlobStorageLinkedService.class);
}
