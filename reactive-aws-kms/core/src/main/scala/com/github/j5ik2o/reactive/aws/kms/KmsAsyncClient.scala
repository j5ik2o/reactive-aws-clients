// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms

import software.amazon.awssdk.services.kms.model._
import software.amazon.awssdk.services.kms.paginators._
import software.amazon.awssdk.services.kms.{ KmsAsyncClient => JavaKmsAsyncClient }

import scala.compat.java8.FutureConverters._
import scala.concurrent.Future

object KmsAsyncClient {

  def apply(javaClient: JavaKmsAsyncClient): KmsAsyncClient =
    new KmsAsyncClient {
      override val underlying: JavaKmsAsyncClient = javaClient
    }

}

/**
  * @see https://sdk.amazonaws.com/java/api/latest/software/amazon/awssdk/services/kms/KmsAsyncClient.html
  */
trait KmsAsyncClient extends KmsClient[Future] {
  val underlying: JavaKmsAsyncClient

  override def cancelKeyDeletion(
      cancelKeyDeletionRequest: CancelKeyDeletionRequest
  ): Future[CancelKeyDeletionResponse] =
    underlying.cancelKeyDeletion(cancelKeyDeletionRequest).toScala

  override def connectCustomKeyStore(
      connectCustomKeyStoreRequest: ConnectCustomKeyStoreRequest
  ): Future[ConnectCustomKeyStoreResponse] =
    underlying.connectCustomKeyStore(connectCustomKeyStoreRequest).toScala

  override def createAlias(createAliasRequest: CreateAliasRequest): Future[CreateAliasResponse] =
    underlying.createAlias(createAliasRequest).toScala

  override def createCustomKeyStore(
      createCustomKeyStoreRequest: CreateCustomKeyStoreRequest
  ): Future[CreateCustomKeyStoreResponse] =
    underlying.createCustomKeyStore(createCustomKeyStoreRequest).toScala

  override def createGrant(createGrantRequest: CreateGrantRequest): Future[CreateGrantResponse] =
    underlying.createGrant(createGrantRequest).toScala

  override def createKey(createKeyRequest: CreateKeyRequest): Future[CreateKeyResponse] =
    underlying.createKey(createKeyRequest).toScala

  override def createKey(): Future[CreateKeyResponse] =
    underlying.createKey().toScala

  override def decrypt(decryptRequest: DecryptRequest): Future[DecryptResponse] =
    underlying.decrypt(decryptRequest).toScala

  override def deleteAlias(deleteAliasRequest: DeleteAliasRequest): Future[DeleteAliasResponse] =
    underlying.deleteAlias(deleteAliasRequest).toScala

  override def deleteCustomKeyStore(
      deleteCustomKeyStoreRequest: DeleteCustomKeyStoreRequest
  ): Future[DeleteCustomKeyStoreResponse] =
    underlying.deleteCustomKeyStore(deleteCustomKeyStoreRequest).toScala

  override def deleteImportedKeyMaterial(
      deleteImportedKeyMaterialRequest: DeleteImportedKeyMaterialRequest
  ): Future[DeleteImportedKeyMaterialResponse] =
    underlying.deleteImportedKeyMaterial(deleteImportedKeyMaterialRequest).toScala

  override def describeCustomKeyStores(
      describeCustomKeyStoresRequest: DescribeCustomKeyStoresRequest
  ): Future[DescribeCustomKeyStoresResponse] =
    underlying.describeCustomKeyStores(describeCustomKeyStoresRequest).toScala

  override def describeCustomKeyStores(): Future[DescribeCustomKeyStoresResponse] =
    underlying.describeCustomKeyStores().toScala

  override def describeKey(describeKeyRequest: DescribeKeyRequest): Future[DescribeKeyResponse] =
    underlying.describeKey(describeKeyRequest).toScala

  override def disableKey(disableKeyRequest: DisableKeyRequest): Future[DisableKeyResponse] =
    underlying.disableKey(disableKeyRequest).toScala

  override def disableKeyRotation(
      disableKeyRotationRequest: DisableKeyRotationRequest
  ): Future[DisableKeyRotationResponse] =
    underlying.disableKeyRotation(disableKeyRotationRequest).toScala

  override def disconnectCustomKeyStore(
      disconnectCustomKeyStoreRequest: DisconnectCustomKeyStoreRequest
  ): Future[DisconnectCustomKeyStoreResponse] =
    underlying.disconnectCustomKeyStore(disconnectCustomKeyStoreRequest).toScala

  override def enableKey(enableKeyRequest: EnableKeyRequest): Future[EnableKeyResponse] =
    underlying.enableKey(enableKeyRequest).toScala

  override def enableKeyRotation(
      enableKeyRotationRequest: EnableKeyRotationRequest
  ): Future[EnableKeyRotationResponse] =
    underlying.enableKeyRotation(enableKeyRotationRequest).toScala

  override def encrypt(encryptRequest: EncryptRequest): Future[EncryptResponse] =
    underlying.encrypt(encryptRequest).toScala

  override def generateDataKey(generateDataKeyRequest: GenerateDataKeyRequest): Future[GenerateDataKeyResponse] =
    underlying.generateDataKey(generateDataKeyRequest).toScala

  override def generateDataKeyWithoutPlaintext(
      generateDataKeyWithoutPlaintextRequest: GenerateDataKeyWithoutPlaintextRequest
  ): Future[GenerateDataKeyWithoutPlaintextResponse] =
    underlying.generateDataKeyWithoutPlaintext(generateDataKeyWithoutPlaintextRequest).toScala

  override def generateRandom(generateRandomRequest: GenerateRandomRequest): Future[GenerateRandomResponse] =
    underlying.generateRandom(generateRandomRequest).toScala

  override def generateRandom(): Future[GenerateRandomResponse] =
    underlying.generateRandom().toScala

  override def getKeyPolicy(getKeyPolicyRequest: GetKeyPolicyRequest): Future[GetKeyPolicyResponse] =
    underlying.getKeyPolicy(getKeyPolicyRequest).toScala

  override def getKeyRotationStatus(
      getKeyRotationStatusRequest: GetKeyRotationStatusRequest
  ): Future[GetKeyRotationStatusResponse] =
    underlying.getKeyRotationStatus(getKeyRotationStatusRequest).toScala

  override def getParametersForImport(
      getParametersForImportRequest: GetParametersForImportRequest
  ): Future[GetParametersForImportResponse] =
    underlying.getParametersForImport(getParametersForImportRequest).toScala

  override def importKeyMaterial(
      importKeyMaterialRequest: ImportKeyMaterialRequest
  ): Future[ImportKeyMaterialResponse] =
    underlying.importKeyMaterial(importKeyMaterialRequest).toScala

  override def listAliases(listAliasesRequest: ListAliasesRequest): Future[ListAliasesResponse] =
    underlying.listAliases(listAliasesRequest).toScala

  override def listAliases(): Future[ListAliasesResponse] =
    underlying.listAliases().toScala

  def listAliasesPaginator(): ListAliasesPublisher =
    underlying.listAliasesPaginator()

  def listAliasesPaginator(listAliasesRequest: ListAliasesRequest): ListAliasesPublisher =
    underlying.listAliasesPaginator(listAliasesRequest)

  override def listGrants(listGrantsRequest: ListGrantsRequest): Future[ListGrantsResponse] =
    underlying.listGrants(listGrantsRequest).toScala

  def listGrantsPaginator(listGrantsRequest: ListGrantsRequest): ListGrantsPublisher =
    underlying.listGrantsPaginator(listGrantsRequest)

  override def listKeyPolicies(listKeyPoliciesRequest: ListKeyPoliciesRequest): Future[ListKeyPoliciesResponse] =
    underlying.listKeyPolicies(listKeyPoliciesRequest).toScala

  def listKeyPoliciesPaginator(listKeyPoliciesRequest: ListKeyPoliciesRequest): ListKeyPoliciesPublisher =
    underlying.listKeyPoliciesPaginator(listKeyPoliciesRequest)

  override def listKeys(listKeysRequest: ListKeysRequest): Future[ListKeysResponse] =
    underlying.listKeys(listKeysRequest).toScala

  override def listKeys(): Future[ListKeysResponse] =
    underlying.listKeys().toScala

  def listKeysPaginator(): ListKeysPublisher =
    underlying.listKeysPaginator()

  def listKeysPaginator(listKeysRequest: ListKeysRequest): ListKeysPublisher =
    underlying.listKeysPaginator(listKeysRequest)

  override def listResourceTags(listResourceTagsRequest: ListResourceTagsRequest): Future[ListResourceTagsResponse] =
    underlying.listResourceTags(listResourceTagsRequest).toScala

  override def listRetirableGrants(
      listRetirableGrantsRequest: ListRetirableGrantsRequest
  ): Future[ListRetirableGrantsResponse] =
    underlying.listRetirableGrants(listRetirableGrantsRequest).toScala

  override def putKeyPolicy(putKeyPolicyRequest: PutKeyPolicyRequest): Future[PutKeyPolicyResponse] =
    underlying.putKeyPolicy(putKeyPolicyRequest).toScala

  override def reEncrypt(reEncryptRequest: ReEncryptRequest): Future[ReEncryptResponse] =
    underlying.reEncrypt(reEncryptRequest).toScala

  override def retireGrant(retireGrantRequest: RetireGrantRequest): Future[RetireGrantResponse] =
    underlying.retireGrant(retireGrantRequest).toScala

  override def retireGrant(): Future[RetireGrantResponse] =
    underlying.retireGrant().toScala

  override def revokeGrant(revokeGrantRequest: RevokeGrantRequest): Future[RevokeGrantResponse] =
    underlying.revokeGrant(revokeGrantRequest).toScala

  override def scheduleKeyDeletion(
      scheduleKeyDeletionRequest: ScheduleKeyDeletionRequest
  ): Future[ScheduleKeyDeletionResponse] =
    underlying.scheduleKeyDeletion(scheduleKeyDeletionRequest).toScala

  override def tagResource(tagResourceRequest: TagResourceRequest): Future[TagResourceResponse] =
    underlying.tagResource(tagResourceRequest).toScala

  override def untagResource(untagResourceRequest: UntagResourceRequest): Future[UntagResourceResponse] =
    underlying.untagResource(untagResourceRequest).toScala

  override def updateAlias(updateAliasRequest: UpdateAliasRequest): Future[UpdateAliasResponse] =
    underlying.updateAlias(updateAliasRequest).toScala

  override def updateCustomKeyStore(
      updateCustomKeyStoreRequest: UpdateCustomKeyStoreRequest
  ): Future[UpdateCustomKeyStoreResponse] =
    underlying.updateCustomKeyStore(updateCustomKeyStoreRequest).toScala

  override def updateKeyDescription(
      updateKeyDescriptionRequest: UpdateKeyDescriptionRequest
  ): Future[UpdateKeyDescriptionResponse] =
    underlying.updateKeyDescription(updateKeyDescriptionRequest).toScala

}
