---
page_type: sample
languages:
  - java
products:
  - azure
  - azure-cognitive-services
  - azure-document-intelligence
urlFragment: documentintelligence-java-samples
---

# Azure Document Intelligence client library samples for Java

Azure Document Intelligence samples are a set of self-contained Java programs that demonstrate interacting with Azure Document Intelligence service/ Document Intelligence
using the client library. Each sample focuses on a specific scenario and can be executed independently.

## Key concepts
Key concepts are explained in detail [here][SDK_README_KEY_CONCEPTS].

## Getting started
Getting started explained in detail [here][SDK_README_GETTING_STARTED].

## Examples
The following sections provide code samples covering common scenario operations with the Azure Document Intelligence client library.

All of these samples need the endpoint to your Document Intelligence resource ([instructions on how to get endpoint][get-endpoint-instructions]), and your Document Intelligence API key ([instructions on how to get key][get-key-instructions]).

| **File Name**                                                                                                                                    | **Description**                                                                                                                  |
|--------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------|
| [Authentication][authentication_sample]                                                                                                          | Authenticate the client                                                                                                          |
| [AnalyzeLayout][analyze_layout] and [AnalyzeLayoutAsync][analyze_layout_async]                                                                   | Analyze document layout, such as tables, lines, words, and selection marks like radio buttons and check boxes from a file stream |
| [AnalyzeLayoutFromUrl][analyze_layout_from_url] and [AnalyzeLayoutFromUrlAsync][analyze_layout_from_url_async]                                   | Analyze document layout such as tables, lines, words, and selection marks like radio buttons and check boxes from a URL          |
| [AnalyzeIdentityDocuments][analyze_id_documents] and [AnalyzeIdentityDocumentsAsync][analyze_id_documents_async]                                 | Analyze data from an identity document like a passport or a US drivers license using a prebuilt model                            |
| [AnalyzeIdentityDocumentsFromUrl][analyze_id_documents_from_url] and [AnalyzeIdentityDocumentsFromUrlAsync][analyze_id_documents_from_url_async] | Analyze data from a URL of a passport or a US drivers license using a prebuilt model                                             |
| [AnalyzeInvoices][analyze_invoices] and [AnalyzeInvoiceAsync][analyze_invoices_async]                                                            | Analyze invoices from an input stream                                                                                            |
| [AnalyzeInvoicesFromUrl][analyze_invoices_from_url] and [AnalyzeInvoicesFromUrlAsync][analyze_invoices_from_url_async]                           | Analyze invoices from a URL                                                                                                      |
| [AnalyzeReceipts][analyze_receipts] and [AnalyzeReceiptsAsync][analyze_receipts_async]                                                           | Analyze data from a file of a US sales receipt using a prebuilt model                                                            |
| [AnalyzeReceiptsFromUrl][analyze_receipts_from_url] and [AnalyzeReceiptsFromUrlAsync][analyze_receipts_from_url_async]                           | Analyze data from a URL of a US sales receipt using a prebuilt model                                                             |
| [AnalyzeTaxW2][analyze_w2] and [AnalyzeTaxW2Async][analyze_w2_async]                                                                             | Analyze data from a file of a US W2 Tax document using a prebuilt model                                                          |
| [AnalyzeCustomDocumentFromUrl][analyze_custom_documents] and [AnalyzeCustomDocumentAsync][analyze_custom_documents_async]                        | Analyze forms with your custom model                                                                                             |
| [BuildDocumentModel][build_model] and [BuildDocumentModelAsync][build_model_async]                                                               | Build a custom document analysis model                                                                                           |
| [ManageCustomModels][manage_custom_models] and [ManageCustomModelsAsync][manage_custom_models_async]                                             | Manage the custom models in your account                                                                                         |
| [CopyDocumentModel][copy_model] and [CopyDocumentModelAsync][copy_model_async]                                                                   | Copy custom model from one Document Intelligence resource to another                                                             |
| [ComposeDocumentModel][compose_model] and [ComposeDocumentModelAsync][compose_model_async]                                                       | Creates a composed model from a collection of existing built models with labels                                                  |
| [GetOperation][get_operation] and [GetOperationAsync][get_operation_async]                                                                       | Get/list all document model associated with the Document Intelligence resource                                                   |
| [BuildDocumentClassifier][build_classifier] and [BuildDocumentClassifierAsync][build_classifier_async]                                           | Build custom classifier models that combine layout and language features                                                         |

## Troubleshooting
Troubleshooting steps can be found [here][SDK_README_TROUBLESHOOTING].

## Next steps
Check out the [API reference documentation][java_fr_ref_docs] to learn more about
what you can do with the Azure Document Intelligence client library.

## Contributing
If you would like to become an active contributor to this project please refer to our [Contribution
Guidelines][SDK_README_CONTRIBUTING] for more information.

<!-- LINKS -->
[SDK_README_CONTRIBUTING]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/documentintelligence/azure-ai-documentintelligence/README.md#contributing
[SDK_README_GETTING_STARTED]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/documentintelligence/azure-ai-documentintelligence/README.md#getting-started
[SDK_README_TROUBLESHOOTING]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/documentintelligence/azure-ai-documentintelligence/README.md#troubleshooting
[SDK_README_KEY_CONCEPTS]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/documentintelligence/azure-ai-documentintelligence/README.md#key-concepts
[SDK_README_DEPENDENCY]: ../../README.md#adding-the-package-to-your-product
[SDK_README_NEXT_STEPS]: ../../README.md#next-steps
[java_fr_ref_docs]: https://aka.ms/azsdk-java-documentintelligence-ref-doc
[get-endpoint-instructions]: https://github.com/Azure/azure-sdk-for-java/tree/main/sdk/documentintelligence/azure-ai-documentintelligence#create-a-form-recognizer-resource
[get-key-instructions]: https://github.com/Azure/azure-sdk-for-java/tree/main/sdk/documentintelligence/azure-ai-documentintelligence#create-a-form-recognizer-client-using-azurekeycredential

[authentication_sample]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/documentintelligence/azure-ai-documentintelligence/src/samples/java/com/azure/ai/documentintelligence/Authentication.java
[build_model]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/documentintelligence/azure-ai-documentintelligence/src/samples/java/com/azure/ai/documentintelligence/administration/BuildDocumentModel.java
[build_model_async]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/documentintelligence/azure-ai-documentintelligence/src/samples/java/com/azure/ai/documentintelligence/administration/BuildDocumentModelAsync.java
[compose_model]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/documentintelligence/azure-ai-documentintelligence/src/samples/java/com/azure/ai/documentintelligence/administration/ComposeDocumentModel.java
[compose_model_async]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/documentintelligence/azure-ai-documentintelligence/src/samples/java/com/azure/ai/documentintelligence/administration/ComposeDocumentModelAsync.java
[copy_model]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/documentintelligence/azure-ai-documentintelligence/src/samples/java/com/azure/ai/documentintelligence/administration/CopyDocumentModel.java
[copy_model_async]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/documentintelligence/azure-ai-documentintelligence/src/samples/java/com/azure/ai/documentintelligence/administration/CopyDocumentModelAsync.java
[manage_custom_models]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/documentintelligence/azure-ai-documentintelligence/src/samples/java/com/azure/ai/documentintelligence/administration/ManageCustomModels.java
[manage_custom_models_async]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/documentintelligence/azure-ai-documentintelligence/src/samples/java/com/azure/ai/documentintelligence/administration/ManageCustomModelsAsync.java
[analyze_layout]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/documentintelligence/azure-ai-documentintelligence/src/samples/java/com/azure/ai/documentintelligence/AnalyzeLayout.java
[analyze_layout_async]:https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/documentintelligence/azure-ai-documentintelligence/src/samples/java/com/azure/ai/documentintelligence/AnalyzeLayoutAsync.java
[analyze_layout_from_url]:https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/documentintelligence/azure-ai-documentintelligence/src/samples/java/com/azure/ai/documentintelligence/AnalyzeLayoutFromUrl.java
[analyze_layout_from_url_async]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/documentintelligence/azure-ai-documentintelligence/src/samples/java/com/azure/ai/documentintelligence/AnalyzeLayoutFromUrlAsync.java
[analyze_custom_documents]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/documentintelligence/azure-ai-documentintelligence/src/samples/java/com/azure/ai/documentintelligence/AnalyzeCustomDocumentFromUrl.java
[analyze_custom_documents_async]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/documentintelligence/azure-ai-documentintelligence/src/samples/java/com/azure/ai/documentintelligence/AnalyzeCustomDocumentAsync.java
[analyze_id_documents]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/documentintelligence/azure-ai-documentintelligence/src/samples/java/com/azure/ai/documentintelligence/AnalyzeIdentityDocuments.java
[analyze_id_documents_async]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/documentintelligence/azure-ai-documentintelligence/src/samples/java/com/azure/ai/documentintelligence/AnalyzeIdentityDocumentsAsync.java
[analyze_id_documents_from_url]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/documentintelligence/azure-ai-documentintelligence/src/samples/java/com/azure/ai/documentintelligence/AnalyzeIdentityDocumentsFromUrl.java
[analyze_id_documents_from_url_async]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/documentintelligence/azure-ai-documentintelligence/src/samples/java/com/azure/ai/documentintelligence/AnalyzeIdentityDocumentsFromUrlAsync.java
[analyze_invoices]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/documentintelligence/azure-ai-documentintelligence/src/samples/java/com/azure/ai/documentintelligence/AnalyzeInvoices.java
[analyze_invoices_async]:  https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/documentintelligence/azure-ai-documentintelligence/src/samples/java/com/azure/ai/documentintelligence/AnalyzeInvoicesAsync.java
[analyze_invoices_from_url]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/documentintelligence/azure-ai-documentintelligence/src/samples/java/com/azure/ai/documentintelligence/AnalyzeInvoicesFromUrl.java
[analyze_invoices_from_url_async]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/documentintelligence/azure-ai-documentintelligence/src/samples/java/com/azure/ai/documentintelligence/AnalyzeInvoicesFromUrlAsync.java
[analyze_receipts]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/documentintelligence/azure-ai-documentintelligence/src/samples/java/com/azure/ai/documentintelligence/AnalyzeReceipts.java
[analyze_receipts_async]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/documentintelligence/azure-ai-documentintelligence/src/samples/java/com/azure/ai/documentintelligence/AnalyzeReceiptsAsync.java
[analyze_receipts_from_url]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/documentintelligence/azure-ai-documentintelligence/src/samples/java/com/azure/ai/documentintelligence/AnalyzeReceiptsFromUrl.java
[analyze_receipts_from_url_async]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/documentintelligence/azure-ai-documentintelligence/src/samples/java/com/azure/ai/documentintelligence/AnalyzeReceiptsFromUrlAsync.java
[analyze_w2]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/documentintelligence/azure-ai-documentintelligence/src/samples/java/com/azure/ai/documentintelligence/AnalyzeTaxW2.java
[analyze_w2_async]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/documentintelligence/azure-ai-documentintelligence/src/samples/java/com/azure/ai/documentintelligence/AnalyzeTaxW2Async.java
[get_operation]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/documentintelligence/azure-ai-documentintelligence/src/samples/java/com/azure/ai/documentintelligence/administration/GetOperationSummary.java
[get_operation_async]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/documentintelligence/azure-ai-documentintelligence/src/samples/java/com/azure/ai/documentintelligence/administration/GetOperationSummaryAsync.java
[build_classifier]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/documentintelligence/azure-ai-documentintelligence/src/samples/java/com/azure/ai/documentintelligence/administration/BuildDocumentClassifier.java
[build_classifier_async]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/documentintelligence/azure-ai-documentintelligence/src/samples/java/com/azure/ai/documentintelligence/administration/BuildDocumentClassifierAsync.java

![Impressions](https://azure-sdk-impressions.azurewebsites.net/api/impressions/azure-sdk-for-java%2Fsdk%2Fdocumentintelligence%2Fazure-ai-documentintelligence%2FREADME.png)
