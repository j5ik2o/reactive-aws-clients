// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.monix

import software.amazon.awssdk.services.kms.model._
import com.github.j5ik2o.reactive.aws.kms.{ KmsAsyncClient, KmsClient }
import monix.eval.Task
import monix.reactive.Observable

object KmsMonixClient {

  def apply(asyncClient: KmsAsyncClient): KmsMonixClient = new KmsMonixClient {
    override val underlying: KmsAsyncClient = asyncClient
  }

}

trait KmsMonixClient extends KmsClient[Task] {

  val underlying: KmsAsyncClient

  override def cancelKeyDeletion(cancelKeyDeletionRequest: CancelKeyDeletionRequest): Task[CancelKeyDeletionResponse] =
    Task.deferFuture {
      underlying.cancelKeyDeletion(cancelKeyDeletionRequest)
    }

  override def connectCustomKeyStore(
      connectCustomKeyStoreRequest: ConnectCustomKeyStoreRequest
  ): Task[ConnectCustomKeyStoreResponse] =
    Task.deferFuture {
      underlying.connectCustomKeyStore(connectCustomKeyStoreRequest)
    }

  override def createAlias(createAliasRequest: CreateAliasRequest): Task[CreateAliasResponse] =
    Task.deferFuture {
      underlying.createAlias(createAliasRequest)
    }

  override def createCustomKeyStore(
      createCustomKeyStoreRequest: CreateCustomKeyStoreRequest
  ): Task[CreateCustomKeyStoreResponse] =
    Task.deferFuture {
      underlying.createCustomKeyStore(createCustomKeyStoreRequest)
    }

  override def createGrant(createGrantRequest: CreateGrantRequest): Task[CreateGrantResponse] =
    Task.deferFuture {
      underlying.createGrant(createGrantRequest)
    }

  override def createKey(createKeyRequest: CreateKeyRequest): Task[CreateKeyResponse] =
    Task.deferFuture {
      underlying.createKey(createKeyRequest)
    }

  override def createKey(): Task[CreateKeyResponse] =
    Task.deferFuture {
      underlying.createKey()
    }

  override def decrypt(decryptRequest: DecryptRequest): Task[DecryptResponse] =
    Task.deferFuture {
      underlying.decrypt(decryptRequest)
    }

  override def deleteAlias(deleteAliasRequest: DeleteAliasRequest): Task[DeleteAliasResponse] =
    Task.deferFuture {
      underlying.deleteAlias(deleteAliasRequest)
    }

  override def deleteCustomKeyStore(
      deleteCustomKeyStoreRequest: DeleteCustomKeyStoreRequest
  ): Task[DeleteCustomKeyStoreResponse] =
    Task.deferFuture {
      underlying.deleteCustomKeyStore(deleteCustomKeyStoreRequest)
    }

  override def deleteImportedKeyMaterial(
      deleteImportedKeyMaterialRequest: DeleteImportedKeyMaterialRequest
  ): Task[DeleteImportedKeyMaterialResponse] =
    Task.deferFuture {
      underlying.deleteImportedKeyMaterial(deleteImportedKeyMaterialRequest)
    }

  override def describeCustomKeyStores(
      describeCustomKeyStoresRequest: DescribeCustomKeyStoresRequest
  ): Task[DescribeCustomKeyStoresResponse] =
    Task.deferFuture {
      underlying.describeCustomKeyStores(describeCustomKeyStoresRequest)
    }

  override def describeCustomKeyStores(): Task[DescribeCustomKeyStoresResponse] =
    Task.deferFuture {
      underlying.describeCustomKeyStores()
    }

  override def describeKey(describeKeyRequest: DescribeKeyRequest): Task[DescribeKeyResponse] =
    Task.deferFuture {
      underlying.describeKey(describeKeyRequest)
    }

  override def disableKey(disableKeyRequest: DisableKeyRequest): Task[DisableKeyResponse] =
    Task.deferFuture {
      underlying.disableKey(disableKeyRequest)
    }

  override def disableKeyRotation(
      disableKeyRotationRequest: DisableKeyRotationRequest
  ): Task[DisableKeyRotationResponse] =
    Task.deferFuture {
      underlying.disableKeyRotation(disableKeyRotationRequest)
    }

  override def disconnectCustomKeyStore(
      disconnectCustomKeyStoreRequest: DisconnectCustomKeyStoreRequest
  ): Task[DisconnectCustomKeyStoreResponse] =
    Task.deferFuture {
      underlying.disconnectCustomKeyStore(disconnectCustomKeyStoreRequest)
    }

  override def enableKey(enableKeyRequest: EnableKeyRequest): Task[EnableKeyResponse] =
    Task.deferFuture {
      underlying.enableKey(enableKeyRequest)
    }

  override def enableKeyRotation(enableKeyRotationRequest: EnableKeyRotationRequest): Task[EnableKeyRotationResponse] =
    Task.deferFuture {
      underlying.enableKeyRotation(enableKeyRotationRequest)
    }

  override def encrypt(encryptRequest: EncryptRequest): Task[EncryptResponse] =
    Task.deferFuture {
      underlying.encrypt(encryptRequest)
    }

  override def generateDataKey(generateDataKeyRequest: GenerateDataKeyRequest): Task[GenerateDataKeyResponse] =
    Task.deferFuture {
      underlying.generateDataKey(generateDataKeyRequest)
    }

  override def generateDataKeyWithoutPlaintext(
      generateDataKeyWithoutPlaintextRequest: GenerateDataKeyWithoutPlaintextRequest
  ): Task[GenerateDataKeyWithoutPlaintextResponse] =
    Task.deferFuture {
      underlying.generateDataKeyWithoutPlaintext(generateDataKeyWithoutPlaintextRequest)
    }

  override def generateRandom(generateRandomRequest: GenerateRandomRequest): Task[GenerateRandomResponse] =
    Task.deferFuture {
      underlying.generateRandom(generateRandomRequest)
    }

  override def generateRandom(): Task[GenerateRandomResponse] =
    Task.deferFuture {
      underlying.generateRandom()
    }

  override def getKeyPolicy(getKeyPolicyRequest: GetKeyPolicyRequest): Task[GetKeyPolicyResponse] =
    Task.deferFuture {
      underlying.getKeyPolicy(getKeyPolicyRequest)
    }

  override def getKeyRotationStatus(
      getKeyRotationStatusRequest: GetKeyRotationStatusRequest
  ): Task[GetKeyRotationStatusResponse] =
    Task.deferFuture {
      underlying.getKeyRotationStatus(getKeyRotationStatusRequest)
    }

  override def getParametersForImport(
      getParametersForImportRequest: GetParametersForImportRequest
  ): Task[GetParametersForImportResponse] =
    Task.deferFuture {
      underlying.getParametersForImport(getParametersForImportRequest)
    }

  override def importKeyMaterial(importKeyMaterialRequest: ImportKeyMaterialRequest): Task[ImportKeyMaterialResponse] =
    Task.deferFuture {
      underlying.importKeyMaterial(importKeyMaterialRequest)
    }

  override def listAliases(listAliasesRequest: ListAliasesRequest): Task[ListAliasesResponse] =
    Task.deferFuture {
      underlying.listAliases(listAliasesRequest)
    }

  override def listAliases(): Task[ListAliasesResponse] =
    Task.deferFuture {
      underlying.listAliases()
    }

  def listAliasesPaginator(): Observable[ListAliasesResponse] =
    Observable.fromReactivePublisher(underlying.listAliasesPaginator())

  def listAliasesPaginator(listAliasesRequest: ListAliasesRequest): Observable[ListAliasesResponse] =
    Observable.fromReactivePublisher(underlying.listAliasesPaginator(listAliasesRequest))

  override def listGrants(listGrantsRequest: ListGrantsRequest): Task[ListGrantsResponse] =
    Task.deferFuture {
      underlying.listGrants(listGrantsRequest)
    }

  def listGrantsPaginator(listGrantsRequest: ListGrantsRequest): Observable[ListGrantsResponse] =
    Observable.fromReactivePublisher(underlying.listGrantsPaginator(listGrantsRequest))

  override def listKeyPolicies(listKeyPoliciesRequest: ListKeyPoliciesRequest): Task[ListKeyPoliciesResponse] =
    Task.deferFuture {
      underlying.listKeyPolicies(listKeyPoliciesRequest)
    }

  def listKeyPoliciesPaginator(listKeyPoliciesRequest: ListKeyPoliciesRequest): Observable[ListKeyPoliciesResponse] =
    Observable.fromReactivePublisher(underlying.listKeyPoliciesPaginator(listKeyPoliciesRequest))

  override def listKeys(listKeysRequest: ListKeysRequest): Task[ListKeysResponse] =
    Task.deferFuture {
      underlying.listKeys(listKeysRequest)
    }

  override def listKeys(): Task[ListKeysResponse] =
    Task.deferFuture {
      underlying.listKeys()
    }

  def listKeysPaginator(): Observable[ListKeysResponse] =
    Observable.fromReactivePublisher(underlying.listKeysPaginator())

  def listKeysPaginator(listKeysRequest: ListKeysRequest): Observable[ListKeysResponse] =
    Observable.fromReactivePublisher(underlying.listKeysPaginator(listKeysRequest))

  override def listResourceTags(listResourceTagsRequest: ListResourceTagsRequest): Task[ListResourceTagsResponse] =
    Task.deferFuture {
      underlying.listResourceTags(listResourceTagsRequest)
    }

  override def listRetirableGrants(
      listRetirableGrantsRequest: ListRetirableGrantsRequest
  ): Task[ListRetirableGrantsResponse] =
    Task.deferFuture {
      underlying.listRetirableGrants(listRetirableGrantsRequest)
    }

  override def putKeyPolicy(putKeyPolicyRequest: PutKeyPolicyRequest): Task[PutKeyPolicyResponse] =
    Task.deferFuture {
      underlying.putKeyPolicy(putKeyPolicyRequest)
    }

  override def reEncrypt(reEncryptRequest: ReEncryptRequest): Task[ReEncryptResponse] =
    Task.deferFuture {
      underlying.reEncrypt(reEncryptRequest)
    }

  override def retireGrant(retireGrantRequest: RetireGrantRequest): Task[RetireGrantResponse] =
    Task.deferFuture {
      underlying.retireGrant(retireGrantRequest)
    }

  override def retireGrant(): Task[RetireGrantResponse] =
    Task.deferFuture {
      underlying.retireGrant()
    }

  override def revokeGrant(revokeGrantRequest: RevokeGrantRequest): Task[RevokeGrantResponse] =
    Task.deferFuture {
      underlying.revokeGrant(revokeGrantRequest)
    }

  override def scheduleKeyDeletion(
      scheduleKeyDeletionRequest: ScheduleKeyDeletionRequest
  ): Task[ScheduleKeyDeletionResponse] =
    Task.deferFuture {
      underlying.scheduleKeyDeletion(scheduleKeyDeletionRequest)
    }

  override def tagResource(tagResourceRequest: TagResourceRequest): Task[TagResourceResponse] =
    Task.deferFuture {
      underlying.tagResource(tagResourceRequest)
    }

  override def untagResource(untagResourceRequest: UntagResourceRequest): Task[UntagResourceResponse] =
    Task.deferFuture {
      underlying.untagResource(untagResourceRequest)
    }

  override def updateAlias(updateAliasRequest: UpdateAliasRequest): Task[UpdateAliasResponse] =
    Task.deferFuture {
      underlying.updateAlias(updateAliasRequest)
    }

  override def updateCustomKeyStore(
      updateCustomKeyStoreRequest: UpdateCustomKeyStoreRequest
  ): Task[UpdateCustomKeyStoreResponse] =
    Task.deferFuture {
      underlying.updateCustomKeyStore(updateCustomKeyStoreRequest)
    }

  override def updateKeyDescription(
      updateKeyDescriptionRequest: UpdateKeyDescriptionRequest
  ): Task[UpdateKeyDescriptionResponse] =
    Task.deferFuture {
      underlying.updateKeyDescription(updateKeyDescriptionRequest)
    }

}
