// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.documentintelligence.administration;

import com.azure.ai.documentintelligence.DocumentModelAdministrationAsyncClient;
import com.azure.ai.documentintelligence.DocumentModelAdministrationClientBuilder;
import com.azure.core.credential.AzureKeyCredential;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;


/**
 * Async sample demonstrating common document classifier management operations on your Form
 * Recognizer resource.
 * To learn how to build your own classifiers, look at BuildDocumentClassifierAsync.java and BuildDocumentClassifier.java.
 */
public class ManageDocumentClassifiersAsync {

    /**
     * Main program to invoke the demo.
     *
     * @param args Unused. Arguments to the program.
     */
    public static void main(final String[] args) {
        // Instantiate a client that will be used to call the service.
        DocumentModelAdministrationAsyncClient client = new DocumentModelAdministrationClientBuilder()
            .credential(new AzureKeyCredential("{key}"))
            .endpoint("https://{endpoint}.cognitiveservices.azure.com/")
            .buildAsyncClient();

        AtomicReference<String> classifierId = new AtomicReference<>();

        // Next, we get a paged list of all document classifiers
        System.out.println("We have following classifiers in the account:");
        client.listClassifiers().subscribe(documentClassifierDetails -> {
            System.out.println();
            // get Classifier info
            classifierId.set(documentClassifierDetails.getClassifierId());
            client.getClassifier(documentClassifierDetails.getClassifierId()).subscribe(documentClassifier -> {
                System.out.printf("Classifier ID: %s%n", documentClassifier.getClassifierId());
                System.out.printf("Classifier Description: %s%n", documentClassifier.getDescription());
                System.out.printf("Classifier created on: %s%n", documentClassifier.getCreatedDateTime());
                documentClassifier.getDocTypes().forEach((key, documentTypeDetails) -> {
                    if (documentTypeDetails.getAzureBlobSource() != null) {
                        System.out.printf("Blob Source container Url: %s%n", (documentTypeDetails
                            .getAzureBlobSource()).getContainerUrl());
                    }
                });
            });
        });


        // Delete classifier
        client.deleteClassifier(classifierId.get());
        System.out.printf("Deleted Classifier with Classifier ID: %s", classifierId.get());

        // The .subscribe() creation and assignment is not a blocking call. For the purpose of this example, we sleep
        // the thread so the program does not end before the send operation is complete. Using .block() instead of
        // .subscribe() will turn this into a synchronous call.
        try {
            TimeUnit.SECONDS.sleep(15);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
