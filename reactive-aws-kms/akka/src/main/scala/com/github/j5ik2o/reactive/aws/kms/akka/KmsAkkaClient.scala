// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.akka

import akka.NotUsed
import akka.stream.scaladsl.{ Flow, Source }
import com.github.j5ik2o.reactive.aws.kms.KmsAsyncClient
import software.amazon.awssdk.services.kms.model._

object KmsAkkaClient {

  def apply(asyncClient: KmsAsyncClient): KmsAkkaClient =
    new KmsAkkaClient {
      override val underlying: KmsAsyncClient = asyncClient
    }

  val DefaultParallelism: Int = 1

}

trait KmsAkkaClient {

  import KmsAkkaClient._

  val underlying: KmsAsyncClient

  def cancelKeyDeletionSource(
      cancelKeyDeletionRequest: CancelKeyDeletionRequest,
      parallelism: Int = DefaultParallelism
  ): Source[CancelKeyDeletionResponse, NotUsed] =
    Source.single(cancelKeyDeletionRequest).via(cancelKeyDeletionFlow(parallelism))

  def cancelKeyDeletionFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CancelKeyDeletionRequest, CancelKeyDeletionResponse, NotUsed] =
    Flow[CancelKeyDeletionRequest].mapAsync(parallelism) { cancelKeyDeletionRequest =>
      underlying.cancelKeyDeletion(cancelKeyDeletionRequest)
    }

  def connectCustomKeyStoreSource(
      connectCustomKeyStoreRequest: ConnectCustomKeyStoreRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ConnectCustomKeyStoreResponse, NotUsed] =
    Source.single(connectCustomKeyStoreRequest).via(connectCustomKeyStoreFlow(parallelism))

  def connectCustomKeyStoreFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ConnectCustomKeyStoreRequest, ConnectCustomKeyStoreResponse, NotUsed] =
    Flow[ConnectCustomKeyStoreRequest].mapAsync(parallelism) { connectCustomKeyStoreRequest =>
      underlying.connectCustomKeyStore(connectCustomKeyStoreRequest)
    }

  def createAliasSource(
      createAliasRequest: CreateAliasRequest,
      parallelism: Int = DefaultParallelism
  ): Source[CreateAliasResponse, NotUsed] =
    Source.single(createAliasRequest).via(createAliasFlow(parallelism))

  def createAliasFlow(parallelism: Int = DefaultParallelism): Flow[CreateAliasRequest, CreateAliasResponse, NotUsed] =
    Flow[CreateAliasRequest].mapAsync(parallelism) { createAliasRequest =>
      underlying.createAlias(createAliasRequest)
    }

  def createCustomKeyStoreSource(
      createCustomKeyStoreRequest: CreateCustomKeyStoreRequest,
      parallelism: Int = DefaultParallelism
  ): Source[CreateCustomKeyStoreResponse, NotUsed] =
    Source.single(createCustomKeyStoreRequest).via(createCustomKeyStoreFlow(parallelism))

  def createCustomKeyStoreFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateCustomKeyStoreRequest, CreateCustomKeyStoreResponse, NotUsed] =
    Flow[CreateCustomKeyStoreRequest].mapAsync(parallelism) { createCustomKeyStoreRequest =>
      underlying.createCustomKeyStore(createCustomKeyStoreRequest)
    }

  def createGrantSource(
      createGrantRequest: CreateGrantRequest,
      parallelism: Int = DefaultParallelism
  ): Source[CreateGrantResponse, NotUsed] =
    Source.single(createGrantRequest).via(createGrantFlow(parallelism))

  def createGrantFlow(parallelism: Int = DefaultParallelism): Flow[CreateGrantRequest, CreateGrantResponse, NotUsed] =
    Flow[CreateGrantRequest].mapAsync(parallelism) { createGrantRequest =>
      underlying.createGrant(createGrantRequest)
    }

  def createKeySource(
      createKeyRequest: CreateKeyRequest,
      parallelism: Int = DefaultParallelism
  ): Source[CreateKeyResponse, NotUsed] =
    Source.single(createKeyRequest).via(createKeyFlow(parallelism))

  def createKeyFlow(parallelism: Int = DefaultParallelism): Flow[CreateKeyRequest, CreateKeyResponse, NotUsed] =
    Flow[CreateKeyRequest].mapAsync(parallelism) { createKeyRequest =>
      underlying.createKey(createKeyRequest)
    }

  def createKeySource(): Source[CreateKeyResponse, NotUsed] =
    Source.fromFuture(underlying.createKey())

  def decryptSource(
      decryptRequest: DecryptRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DecryptResponse, NotUsed] =
    Source.single(decryptRequest).via(decryptFlow(parallelism))

  def decryptFlow(parallelism: Int = DefaultParallelism): Flow[DecryptRequest, DecryptResponse, NotUsed] =
    Flow[DecryptRequest].mapAsync(parallelism) { decryptRequest =>
      underlying.decrypt(decryptRequest)
    }

  def deleteAliasSource(
      deleteAliasRequest: DeleteAliasRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DeleteAliasResponse, NotUsed] =
    Source.single(deleteAliasRequest).via(deleteAliasFlow(parallelism))

  def deleteAliasFlow(parallelism: Int = DefaultParallelism): Flow[DeleteAliasRequest, DeleteAliasResponse, NotUsed] =
    Flow[DeleteAliasRequest].mapAsync(parallelism) { deleteAliasRequest =>
      underlying.deleteAlias(deleteAliasRequest)
    }

  def deleteCustomKeyStoreSource(
      deleteCustomKeyStoreRequest: DeleteCustomKeyStoreRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DeleteCustomKeyStoreResponse, NotUsed] =
    Source.single(deleteCustomKeyStoreRequest).via(deleteCustomKeyStoreFlow(parallelism))

  def deleteCustomKeyStoreFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteCustomKeyStoreRequest, DeleteCustomKeyStoreResponse, NotUsed] =
    Flow[DeleteCustomKeyStoreRequest].mapAsync(parallelism) { deleteCustomKeyStoreRequest =>
      underlying.deleteCustomKeyStore(deleteCustomKeyStoreRequest)
    }

  def deleteImportedKeyMaterialSource(
      deleteImportedKeyMaterialRequest: DeleteImportedKeyMaterialRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DeleteImportedKeyMaterialResponse, NotUsed] =
    Source.single(deleteImportedKeyMaterialRequest).via(deleteImportedKeyMaterialFlow(parallelism))

  def deleteImportedKeyMaterialFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteImportedKeyMaterialRequest, DeleteImportedKeyMaterialResponse, NotUsed] =
    Flow[DeleteImportedKeyMaterialRequest].mapAsync(parallelism) { deleteImportedKeyMaterialRequest =>
      underlying.deleteImportedKeyMaterial(deleteImportedKeyMaterialRequest)
    }

  def describeCustomKeyStoresSource(
      describeCustomKeyStoresRequest: DescribeCustomKeyStoresRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeCustomKeyStoresResponse, NotUsed] =
    Source.single(describeCustomKeyStoresRequest).via(describeCustomKeyStoresFlow(parallelism))

  def describeCustomKeyStoresFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeCustomKeyStoresRequest, DescribeCustomKeyStoresResponse, NotUsed] =
    Flow[DescribeCustomKeyStoresRequest].mapAsync(parallelism) { describeCustomKeyStoresRequest =>
      underlying.describeCustomKeyStores(describeCustomKeyStoresRequest)
    }

  def describeCustomKeyStoresSource(): Source[DescribeCustomKeyStoresResponse, NotUsed] =
    Source.fromFuture(underlying.describeCustomKeyStores())

  def describeKeySource(
      describeKeyRequest: DescribeKeyRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeKeyResponse, NotUsed] =
    Source.single(describeKeyRequest).via(describeKeyFlow(parallelism))

  def describeKeyFlow(parallelism: Int = DefaultParallelism): Flow[DescribeKeyRequest, DescribeKeyResponse, NotUsed] =
    Flow[DescribeKeyRequest].mapAsync(parallelism) { describeKeyRequest =>
      underlying.describeKey(describeKeyRequest)
    }

  def disableKeySource(
      disableKeyRequest: DisableKeyRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DisableKeyResponse, NotUsed] =
    Source.single(disableKeyRequest).via(disableKeyFlow(parallelism))

  def disableKeyFlow(parallelism: Int = DefaultParallelism): Flow[DisableKeyRequest, DisableKeyResponse, NotUsed] =
    Flow[DisableKeyRequest].mapAsync(parallelism) { disableKeyRequest =>
      underlying.disableKey(disableKeyRequest)
    }

  def disableKeyRotationSource(
      disableKeyRotationRequest: DisableKeyRotationRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DisableKeyRotationResponse, NotUsed] =
    Source.single(disableKeyRotationRequest).via(disableKeyRotationFlow(parallelism))

  def disableKeyRotationFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DisableKeyRotationRequest, DisableKeyRotationResponse, NotUsed] =
    Flow[DisableKeyRotationRequest].mapAsync(parallelism) { disableKeyRotationRequest =>
      underlying.disableKeyRotation(disableKeyRotationRequest)
    }

  def disconnectCustomKeyStoreSource(
      disconnectCustomKeyStoreRequest: DisconnectCustomKeyStoreRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DisconnectCustomKeyStoreResponse, NotUsed] =
    Source.single(disconnectCustomKeyStoreRequest).via(disconnectCustomKeyStoreFlow(parallelism))

  def disconnectCustomKeyStoreFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DisconnectCustomKeyStoreRequest, DisconnectCustomKeyStoreResponse, NotUsed] =
    Flow[DisconnectCustomKeyStoreRequest].mapAsync(parallelism) { disconnectCustomKeyStoreRequest =>
      underlying.disconnectCustomKeyStore(disconnectCustomKeyStoreRequest)
    }

  def enableKeySource(
      enableKeyRequest: EnableKeyRequest,
      parallelism: Int = DefaultParallelism
  ): Source[EnableKeyResponse, NotUsed] =
    Source.single(enableKeyRequest).via(enableKeyFlow(parallelism))

  def enableKeyFlow(parallelism: Int = DefaultParallelism): Flow[EnableKeyRequest, EnableKeyResponse, NotUsed] =
    Flow[EnableKeyRequest].mapAsync(parallelism) { enableKeyRequest =>
      underlying.enableKey(enableKeyRequest)
    }

  def enableKeyRotationSource(
      enableKeyRotationRequest: EnableKeyRotationRequest,
      parallelism: Int = DefaultParallelism
  ): Source[EnableKeyRotationResponse, NotUsed] =
    Source.single(enableKeyRotationRequest).via(enableKeyRotationFlow(parallelism))

  def enableKeyRotationFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[EnableKeyRotationRequest, EnableKeyRotationResponse, NotUsed] =
    Flow[EnableKeyRotationRequest].mapAsync(parallelism) { enableKeyRotationRequest =>
      underlying.enableKeyRotation(enableKeyRotationRequest)
    }

  def encryptSource(
      encryptRequest: EncryptRequest,
      parallelism: Int = DefaultParallelism
  ): Source[EncryptResponse, NotUsed] =
    Source.single(encryptRequest).via(encryptFlow(parallelism))

  def encryptFlow(parallelism: Int = DefaultParallelism): Flow[EncryptRequest, EncryptResponse, NotUsed] =
    Flow[EncryptRequest].mapAsync(parallelism) { encryptRequest =>
      underlying.encrypt(encryptRequest)
    }

  def generateDataKeySource(
      generateDataKeyRequest: GenerateDataKeyRequest,
      parallelism: Int = DefaultParallelism
  ): Source[GenerateDataKeyResponse, NotUsed] =
    Source.single(generateDataKeyRequest).via(generateDataKeyFlow(parallelism))

  def generateDataKeyFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GenerateDataKeyRequest, GenerateDataKeyResponse, NotUsed] =
    Flow[GenerateDataKeyRequest].mapAsync(parallelism) { generateDataKeyRequest =>
      underlying.generateDataKey(generateDataKeyRequest)
    }

  def generateDataKeyPairSource(
      generateDataKeyPairRequest: GenerateDataKeyPairRequest,
      parallelism: Int = DefaultParallelism
  ): Source[GenerateDataKeyPairResponse, NotUsed] =
    Source.single(generateDataKeyPairRequest).via(generateDataKeyPairFlow(parallelism))

  def generateDataKeyPairFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GenerateDataKeyPairRequest, GenerateDataKeyPairResponse, NotUsed] =
    Flow[GenerateDataKeyPairRequest].mapAsync(parallelism) { generateDataKeyPairRequest =>
      underlying.generateDataKeyPair(generateDataKeyPairRequest)
    }

  def generateDataKeyPairWithoutPlaintextSource(
      generateDataKeyPairWithoutPlaintextRequest: GenerateDataKeyPairWithoutPlaintextRequest,
      parallelism: Int = DefaultParallelism
  ): Source[GenerateDataKeyPairWithoutPlaintextResponse, NotUsed] =
    Source.single(generateDataKeyPairWithoutPlaintextRequest).via(generateDataKeyPairWithoutPlaintextFlow(parallelism))

  def generateDataKeyPairWithoutPlaintextFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GenerateDataKeyPairWithoutPlaintextRequest, GenerateDataKeyPairWithoutPlaintextResponse, NotUsed] =
    Flow[GenerateDataKeyPairWithoutPlaintextRequest].mapAsync(parallelism) {
      generateDataKeyPairWithoutPlaintextRequest =>
        underlying.generateDataKeyPairWithoutPlaintext(generateDataKeyPairWithoutPlaintextRequest)
    }

  def generateDataKeyWithoutPlaintextSource(
      generateDataKeyWithoutPlaintextRequest: GenerateDataKeyWithoutPlaintextRequest,
      parallelism: Int = DefaultParallelism
  ): Source[GenerateDataKeyWithoutPlaintextResponse, NotUsed] =
    Source.single(generateDataKeyWithoutPlaintextRequest).via(generateDataKeyWithoutPlaintextFlow(parallelism))

  def generateDataKeyWithoutPlaintextFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GenerateDataKeyWithoutPlaintextRequest, GenerateDataKeyWithoutPlaintextResponse, NotUsed] =
    Flow[GenerateDataKeyWithoutPlaintextRequest].mapAsync(parallelism) { generateDataKeyWithoutPlaintextRequest =>
      underlying.generateDataKeyWithoutPlaintext(generateDataKeyWithoutPlaintextRequest)
    }

  def generateRandomSource(
      generateRandomRequest: GenerateRandomRequest,
      parallelism: Int = DefaultParallelism
  ): Source[GenerateRandomResponse, NotUsed] =
    Source.single(generateRandomRequest).via(generateRandomFlow(parallelism))

  def generateRandomFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GenerateRandomRequest, GenerateRandomResponse, NotUsed] =
    Flow[GenerateRandomRequest].mapAsync(parallelism) { generateRandomRequest =>
      underlying.generateRandom(generateRandomRequest)
    }

  def generateRandomSource(): Source[GenerateRandomResponse, NotUsed] =
    Source.fromFuture(underlying.generateRandom())

  def getKeyPolicySource(
      getKeyPolicyRequest: GetKeyPolicyRequest,
      parallelism: Int = DefaultParallelism
  ): Source[GetKeyPolicyResponse, NotUsed] =
    Source.single(getKeyPolicyRequest).via(getKeyPolicyFlow(parallelism))

  def getKeyPolicyFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetKeyPolicyRequest, GetKeyPolicyResponse, NotUsed] =
    Flow[GetKeyPolicyRequest].mapAsync(parallelism) { getKeyPolicyRequest =>
      underlying.getKeyPolicy(getKeyPolicyRequest)
    }

  def getKeyRotationStatusSource(
      getKeyRotationStatusRequest: GetKeyRotationStatusRequest,
      parallelism: Int = DefaultParallelism
  ): Source[GetKeyRotationStatusResponse, NotUsed] =
    Source.single(getKeyRotationStatusRequest).via(getKeyRotationStatusFlow(parallelism))

  def getKeyRotationStatusFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetKeyRotationStatusRequest, GetKeyRotationStatusResponse, NotUsed] =
    Flow[GetKeyRotationStatusRequest].mapAsync(parallelism) { getKeyRotationStatusRequest =>
      underlying.getKeyRotationStatus(getKeyRotationStatusRequest)
    }

  def getParametersForImportSource(
      getParametersForImportRequest: GetParametersForImportRequest,
      parallelism: Int = DefaultParallelism
  ): Source[GetParametersForImportResponse, NotUsed] =
    Source.single(getParametersForImportRequest).via(getParametersForImportFlow(parallelism))

  def getParametersForImportFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetParametersForImportRequest, GetParametersForImportResponse, NotUsed] =
    Flow[GetParametersForImportRequest].mapAsync(parallelism) { getParametersForImportRequest =>
      underlying.getParametersForImport(getParametersForImportRequest)
    }

  def getPublicKeySource(
      getPublicKeyRequest: GetPublicKeyRequest,
      parallelism: Int = DefaultParallelism
  ): Source[GetPublicKeyResponse, NotUsed] =
    Source.single(getPublicKeyRequest).via(getPublicKeyFlow(parallelism))

  def getPublicKeyFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetPublicKeyRequest, GetPublicKeyResponse, NotUsed] =
    Flow[GetPublicKeyRequest].mapAsync(parallelism) { getPublicKeyRequest =>
      underlying.getPublicKey(getPublicKeyRequest)
    }

  def importKeyMaterialSource(
      importKeyMaterialRequest: ImportKeyMaterialRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ImportKeyMaterialResponse, NotUsed] =
    Source.single(importKeyMaterialRequest).via(importKeyMaterialFlow(parallelism))

  def importKeyMaterialFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ImportKeyMaterialRequest, ImportKeyMaterialResponse, NotUsed] =
    Flow[ImportKeyMaterialRequest].mapAsync(parallelism) { importKeyMaterialRequest =>
      underlying.importKeyMaterial(importKeyMaterialRequest)
    }

  def listAliasesSource(
      listAliasesRequest: ListAliasesRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ListAliasesResponse, NotUsed] =
    Source.single(listAliasesRequest).via(listAliasesFlow(parallelism))

  def listAliasesFlow(parallelism: Int = DefaultParallelism): Flow[ListAliasesRequest, ListAliasesResponse, NotUsed] =
    Flow[ListAliasesRequest].mapAsync(parallelism) { listAliasesRequest =>
      underlying.listAliases(listAliasesRequest)
    }

  def listAliasesSource(): Source[ListAliasesResponse, NotUsed] =
    Source.fromFuture(underlying.listAliases())

  def listAliasesPaginatorSource: Source[ListAliasesResponse, NotUsed] =
    Source.fromPublisher(underlying.listAliasesPaginator())

  def listAliasesPaginatorFlow: Flow[ListAliasesRequest, ListAliasesResponse, NotUsed] =
    Flow[ListAliasesRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.listAliasesPaginator(request))
    }

  def listGrantsSource(
      listGrantsRequest: ListGrantsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ListGrantsResponse, NotUsed] =
    Source.single(listGrantsRequest).via(listGrantsFlow(parallelism))

  def listGrantsFlow(parallelism: Int = DefaultParallelism): Flow[ListGrantsRequest, ListGrantsResponse, NotUsed] =
    Flow[ListGrantsRequest].mapAsync(parallelism) { listGrantsRequest =>
      underlying.listGrants(listGrantsRequest)
    }

  def listGrantsPaginatorFlow: Flow[ListGrantsRequest, ListGrantsResponse, NotUsed] =
    Flow[ListGrantsRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.listGrantsPaginator(request))
    }

  def listKeyPoliciesSource(
      listKeyPoliciesRequest: ListKeyPoliciesRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ListKeyPoliciesResponse, NotUsed] =
    Source.single(listKeyPoliciesRequest).via(listKeyPoliciesFlow(parallelism))

  def listKeyPoliciesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ListKeyPoliciesRequest, ListKeyPoliciesResponse, NotUsed] =
    Flow[ListKeyPoliciesRequest].mapAsync(parallelism) { listKeyPoliciesRequest =>
      underlying.listKeyPolicies(listKeyPoliciesRequest)
    }

  def listKeyPoliciesPaginatorFlow: Flow[ListKeyPoliciesRequest, ListKeyPoliciesResponse, NotUsed] =
    Flow[ListKeyPoliciesRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.listKeyPoliciesPaginator(request))
    }

  def listKeysSource(
      listKeysRequest: ListKeysRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ListKeysResponse, NotUsed] =
    Source.single(listKeysRequest).via(listKeysFlow(parallelism))

  def listKeysFlow(parallelism: Int = DefaultParallelism): Flow[ListKeysRequest, ListKeysResponse, NotUsed] =
    Flow[ListKeysRequest].mapAsync(parallelism) { listKeysRequest =>
      underlying.listKeys(listKeysRequest)
    }

  def listKeysSource(): Source[ListKeysResponse, NotUsed] =
    Source.fromFuture(underlying.listKeys())

  def listKeysPaginatorSource: Source[ListKeysResponse, NotUsed] =
    Source.fromPublisher(underlying.listKeysPaginator())

  def listKeysPaginatorFlow: Flow[ListKeysRequest, ListKeysResponse, NotUsed] =
    Flow[ListKeysRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.listKeysPaginator(request))
    }

  def listResourceTagsSource(
      listResourceTagsRequest: ListResourceTagsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ListResourceTagsResponse, NotUsed] =
    Source.single(listResourceTagsRequest).via(listResourceTagsFlow(parallelism))

  def listResourceTagsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ListResourceTagsRequest, ListResourceTagsResponse, NotUsed] =
    Flow[ListResourceTagsRequest].mapAsync(parallelism) { listResourceTagsRequest =>
      underlying.listResourceTags(listResourceTagsRequest)
    }

  def listRetirableGrantsSource(
      listRetirableGrantsRequest: ListRetirableGrantsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ListRetirableGrantsResponse, NotUsed] =
    Source.single(listRetirableGrantsRequest).via(listRetirableGrantsFlow(parallelism))

  def listRetirableGrantsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ListRetirableGrantsRequest, ListRetirableGrantsResponse, NotUsed] =
    Flow[ListRetirableGrantsRequest].mapAsync(parallelism) { listRetirableGrantsRequest =>
      underlying.listRetirableGrants(listRetirableGrantsRequest)
    }

  def putKeyPolicySource(
      putKeyPolicyRequest: PutKeyPolicyRequest,
      parallelism: Int = DefaultParallelism
  ): Source[PutKeyPolicyResponse, NotUsed] =
    Source.single(putKeyPolicyRequest).via(putKeyPolicyFlow(parallelism))

  def putKeyPolicyFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[PutKeyPolicyRequest, PutKeyPolicyResponse, NotUsed] =
    Flow[PutKeyPolicyRequest].mapAsync(parallelism) { putKeyPolicyRequest =>
      underlying.putKeyPolicy(putKeyPolicyRequest)
    }

  def reEncryptSource(
      reEncryptRequest: ReEncryptRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ReEncryptResponse, NotUsed] =
    Source.single(reEncryptRequest).via(reEncryptFlow(parallelism))

  def reEncryptFlow(parallelism: Int = DefaultParallelism): Flow[ReEncryptRequest, ReEncryptResponse, NotUsed] =
    Flow[ReEncryptRequest].mapAsync(parallelism) { reEncryptRequest =>
      underlying.reEncrypt(reEncryptRequest)
    }

  def retireGrantSource(
      retireGrantRequest: RetireGrantRequest,
      parallelism: Int = DefaultParallelism
  ): Source[RetireGrantResponse, NotUsed] =
    Source.single(retireGrantRequest).via(retireGrantFlow(parallelism))

  def retireGrantFlow(parallelism: Int = DefaultParallelism): Flow[RetireGrantRequest, RetireGrantResponse, NotUsed] =
    Flow[RetireGrantRequest].mapAsync(parallelism) { retireGrantRequest =>
      underlying.retireGrant(retireGrantRequest)
    }

  def retireGrantSource(): Source[RetireGrantResponse, NotUsed] =
    Source.fromFuture(underlying.retireGrant())

  def revokeGrantSource(
      revokeGrantRequest: RevokeGrantRequest,
      parallelism: Int = DefaultParallelism
  ): Source[RevokeGrantResponse, NotUsed] =
    Source.single(revokeGrantRequest).via(revokeGrantFlow(parallelism))

  def revokeGrantFlow(parallelism: Int = DefaultParallelism): Flow[RevokeGrantRequest, RevokeGrantResponse, NotUsed] =
    Flow[RevokeGrantRequest].mapAsync(parallelism) { revokeGrantRequest =>
      underlying.revokeGrant(revokeGrantRequest)
    }

  def scheduleKeyDeletionSource(
      scheduleKeyDeletionRequest: ScheduleKeyDeletionRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ScheduleKeyDeletionResponse, NotUsed] =
    Source.single(scheduleKeyDeletionRequest).via(scheduleKeyDeletionFlow(parallelism))

  def scheduleKeyDeletionFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ScheduleKeyDeletionRequest, ScheduleKeyDeletionResponse, NotUsed] =
    Flow[ScheduleKeyDeletionRequest].mapAsync(parallelism) { scheduleKeyDeletionRequest =>
      underlying.scheduleKeyDeletion(scheduleKeyDeletionRequest)
    }

  def signSource(signRequest: SignRequest, parallelism: Int = DefaultParallelism): Source[SignResponse, NotUsed] =
    Source.single(signRequest).via(signFlow(parallelism))

  def signFlow(parallelism: Int = DefaultParallelism): Flow[SignRequest, SignResponse, NotUsed] =
    Flow[SignRequest].mapAsync(parallelism) { signRequest =>
      underlying.sign(signRequest)
    }

  def tagResourceSource(
      tagResourceRequest: TagResourceRequest,
      parallelism: Int = DefaultParallelism
  ): Source[TagResourceResponse, NotUsed] =
    Source.single(tagResourceRequest).via(tagResourceFlow(parallelism))

  def tagResourceFlow(parallelism: Int = DefaultParallelism): Flow[TagResourceRequest, TagResourceResponse, NotUsed] =
    Flow[TagResourceRequest].mapAsync(parallelism) { tagResourceRequest =>
      underlying.tagResource(tagResourceRequest)
    }

  def untagResourceSource(
      untagResourceRequest: UntagResourceRequest,
      parallelism: Int = DefaultParallelism
  ): Source[UntagResourceResponse, NotUsed] =
    Source.single(untagResourceRequest).via(untagResourceFlow(parallelism))

  def untagResourceFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[UntagResourceRequest, UntagResourceResponse, NotUsed] =
    Flow[UntagResourceRequest].mapAsync(parallelism) { untagResourceRequest =>
      underlying.untagResource(untagResourceRequest)
    }

  def updateAliasSource(
      updateAliasRequest: UpdateAliasRequest,
      parallelism: Int = DefaultParallelism
  ): Source[UpdateAliasResponse, NotUsed] =
    Source.single(updateAliasRequest).via(updateAliasFlow(parallelism))

  def updateAliasFlow(parallelism: Int = DefaultParallelism): Flow[UpdateAliasRequest, UpdateAliasResponse, NotUsed] =
    Flow[UpdateAliasRequest].mapAsync(parallelism) { updateAliasRequest =>
      underlying.updateAlias(updateAliasRequest)
    }

  def updateCustomKeyStoreSource(
      updateCustomKeyStoreRequest: UpdateCustomKeyStoreRequest,
      parallelism: Int = DefaultParallelism
  ): Source[UpdateCustomKeyStoreResponse, NotUsed] =
    Source.single(updateCustomKeyStoreRequest).via(updateCustomKeyStoreFlow(parallelism))

  def updateCustomKeyStoreFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[UpdateCustomKeyStoreRequest, UpdateCustomKeyStoreResponse, NotUsed] =
    Flow[UpdateCustomKeyStoreRequest].mapAsync(parallelism) { updateCustomKeyStoreRequest =>
      underlying.updateCustomKeyStore(updateCustomKeyStoreRequest)
    }

  def updateKeyDescriptionSource(
      updateKeyDescriptionRequest: UpdateKeyDescriptionRequest,
      parallelism: Int = DefaultParallelism
  ): Source[UpdateKeyDescriptionResponse, NotUsed] =
    Source.single(updateKeyDescriptionRequest).via(updateKeyDescriptionFlow(parallelism))

  def updateKeyDescriptionFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[UpdateKeyDescriptionRequest, UpdateKeyDescriptionResponse, NotUsed] =
    Flow[UpdateKeyDescriptionRequest].mapAsync(parallelism) { updateKeyDescriptionRequest =>
      underlying.updateKeyDescription(updateKeyDescriptionRequest)
    }

  def verifySource(
      verifyRequest: VerifyRequest,
      parallelism: Int = DefaultParallelism
  ): Source[VerifyResponse, NotUsed] =
    Source.single(verifyRequest).via(verifyFlow(parallelism))

  def verifyFlow(parallelism: Int = DefaultParallelism): Flow[VerifyRequest, VerifyResponse, NotUsed] =
    Flow[VerifyRequest].mapAsync(parallelism) { verifyRequest =>
      underlying.verify(verifyRequest)
    }

}
