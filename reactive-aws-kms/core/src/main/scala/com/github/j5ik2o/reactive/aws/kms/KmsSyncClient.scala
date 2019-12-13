// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms

import com.github.j5ik2o.reactive.aws.utils.ToEitherSupport
import software.amazon.awssdk.services.kms.model._
import software.amazon.awssdk.services.kms.paginators._
import software.amazon.awssdk.services.kms.{ KmsClient => JavaKmsSyncClient }

object KmsSyncClient extends ToEitherSupport {

  def apply(javaClient: JavaKmsSyncClient): KmsSyncClient =
    new KmsSyncClient {
      override val underlying: JavaKmsSyncClient = javaClient
    }
}

/**
  * @see https://sdk.amazonaws.com/java/api/latest/software/amazon/awssdk/services/kms/KmsClient.html
  */
trait KmsSyncClient extends KmsClient[Either[Throwable, ?]] {
  val underlying: JavaKmsSyncClient

  import KmsSyncClient._

  override def cancelKeyDeletion(
      cancelKeyDeletionRequest: CancelKeyDeletionRequest
  ): Either[Throwable, CancelKeyDeletionResponse] =
    underlying.cancelKeyDeletion(cancelKeyDeletionRequest).toEither

  override def connectCustomKeyStore(
      connectCustomKeyStoreRequest: ConnectCustomKeyStoreRequest
  ): Either[Throwable, ConnectCustomKeyStoreResponse] =
    underlying.connectCustomKeyStore(connectCustomKeyStoreRequest).toEither

  override def createAlias(createAliasRequest: CreateAliasRequest): Either[Throwable, CreateAliasResponse] =
    underlying.createAlias(createAliasRequest).toEither

  override def createCustomKeyStore(
      createCustomKeyStoreRequest: CreateCustomKeyStoreRequest
  ): Either[Throwable, CreateCustomKeyStoreResponse] =
    underlying.createCustomKeyStore(createCustomKeyStoreRequest).toEither

  override def createGrant(createGrantRequest: CreateGrantRequest): Either[Throwable, CreateGrantResponse] =
    underlying.createGrant(createGrantRequest).toEither

  override def createKey(): Either[Throwable, CreateKeyResponse] =
    underlying.createKey().toEither

  override def createKey(createKeyRequest: CreateKeyRequest): Either[Throwable, CreateKeyResponse] =
    underlying.createKey(createKeyRequest).toEither

  override def decrypt(decryptRequest: DecryptRequest): Either[Throwable, DecryptResponse] =
    underlying.decrypt(decryptRequest).toEither

  override def deleteAlias(deleteAliasRequest: DeleteAliasRequest): Either[Throwable, DeleteAliasResponse] =
    underlying.deleteAlias(deleteAliasRequest).toEither

  override def deleteCustomKeyStore(
      deleteCustomKeyStoreRequest: DeleteCustomKeyStoreRequest
  ): Either[Throwable, DeleteCustomKeyStoreResponse] =
    underlying.deleteCustomKeyStore(deleteCustomKeyStoreRequest).toEither

  override def deleteImportedKeyMaterial(
      deleteImportedKeyMaterialRequest: DeleteImportedKeyMaterialRequest
  ): Either[Throwable, DeleteImportedKeyMaterialResponse] =
    underlying.deleteImportedKeyMaterial(deleteImportedKeyMaterialRequest).toEither

  override def describeCustomKeyStores(): Either[Throwable, DescribeCustomKeyStoresResponse] =
    underlying.describeCustomKeyStores().toEither

  override def describeCustomKeyStores(
      describeCustomKeyStoresRequest: DescribeCustomKeyStoresRequest
  ): Either[Throwable, DescribeCustomKeyStoresResponse] =
    underlying.describeCustomKeyStores(describeCustomKeyStoresRequest).toEither

  override def describeKey(describeKeyRequest: DescribeKeyRequest): Either[Throwable, DescribeKeyResponse] =
    underlying.describeKey(describeKeyRequest).toEither

  override def disableKey(disableKeyRequest: DisableKeyRequest): Either[Throwable, DisableKeyResponse] =
    underlying.disableKey(disableKeyRequest).toEither

  override def disableKeyRotation(
      disableKeyRotationRequest: DisableKeyRotationRequest
  ): Either[Throwable, DisableKeyRotationResponse] =
    underlying.disableKeyRotation(disableKeyRotationRequest).toEither

  override def disconnectCustomKeyStore(
      disconnectCustomKeyStoreRequest: DisconnectCustomKeyStoreRequest
  ): Either[Throwable, DisconnectCustomKeyStoreResponse] =
    underlying.disconnectCustomKeyStore(disconnectCustomKeyStoreRequest).toEither

  override def enableKey(enableKeyRequest: EnableKeyRequest): Either[Throwable, EnableKeyResponse] =
    underlying.enableKey(enableKeyRequest).toEither

  override def enableKeyRotation(
      enableKeyRotationRequest: EnableKeyRotationRequest
  ): Either[Throwable, EnableKeyRotationResponse] =
    underlying.enableKeyRotation(enableKeyRotationRequest).toEither

  override def encrypt(encryptRequest: EncryptRequest): Either[Throwable, EncryptResponse] =
    underlying.encrypt(encryptRequest).toEither

  override def generateDataKey(
      generateDataKeyRequest: GenerateDataKeyRequest
  ): Either[Throwable, GenerateDataKeyResponse] =
    underlying.generateDataKey(generateDataKeyRequest).toEither

  override def generateDataKeyPair(
      generateDataKeyPairRequest: GenerateDataKeyPairRequest
  ): Either[Throwable, GenerateDataKeyPairResponse] =
    underlying.generateDataKeyPair(generateDataKeyPairRequest).toEither

  override def generateDataKeyPairWithoutPlaintext(
      generateDataKeyPairWithoutPlaintextRequest: GenerateDataKeyPairWithoutPlaintextRequest
  ): Either[Throwable, GenerateDataKeyPairWithoutPlaintextResponse] =
    underlying.generateDataKeyPairWithoutPlaintext(generateDataKeyPairWithoutPlaintextRequest).toEither

  override def generateDataKeyWithoutPlaintext(
      generateDataKeyWithoutPlaintextRequest: GenerateDataKeyWithoutPlaintextRequest
  ): Either[Throwable, GenerateDataKeyWithoutPlaintextResponse] =
    underlying.generateDataKeyWithoutPlaintext(generateDataKeyWithoutPlaintextRequest).toEither

  override def generateRandom(): Either[Throwable, GenerateRandomResponse] =
    underlying.generateRandom().toEither

  override def generateRandom(generateRandomRequest: GenerateRandomRequest): Either[Throwable, GenerateRandomResponse] =
    underlying.generateRandom(generateRandomRequest).toEither

  override def getKeyPolicy(getKeyPolicyRequest: GetKeyPolicyRequest): Either[Throwable, GetKeyPolicyResponse] =
    underlying.getKeyPolicy(getKeyPolicyRequest).toEither

  override def getKeyRotationStatus(
      getKeyRotationStatusRequest: GetKeyRotationStatusRequest
  ): Either[Throwable, GetKeyRotationStatusResponse] =
    underlying.getKeyRotationStatus(getKeyRotationStatusRequest).toEither

  override def getParametersForImport(
      getParametersForImportRequest: GetParametersForImportRequest
  ): Either[Throwable, GetParametersForImportResponse] =
    underlying.getParametersForImport(getParametersForImportRequest).toEither

  override def getPublicKey(getPublicKeyRequest: GetPublicKeyRequest): Either[Throwable, GetPublicKeyResponse] =
    underlying.getPublicKey(getPublicKeyRequest).toEither

  override def importKeyMaterial(
      importKeyMaterialRequest: ImportKeyMaterialRequest
  ): Either[Throwable, ImportKeyMaterialResponse] =
    underlying.importKeyMaterial(importKeyMaterialRequest).toEither

  override def listAliases(): Either[Throwable, ListAliasesResponse] =
    underlying.listAliases().toEither

  override def listAliases(listAliasesRequest: ListAliasesRequest): Either[Throwable, ListAliasesResponse] =
    underlying.listAliases(listAliasesRequest).toEither

  def listAliasesPaginator(): ListAliasesIterable =
    underlying.listAliasesPaginator()

  def listAliasesPaginator(listAliasesRequest: ListAliasesRequest): ListAliasesIterable =
    underlying.listAliasesPaginator(listAliasesRequest)

  override def listGrants(listGrantsRequest: ListGrantsRequest): Either[Throwable, ListGrantsResponse] =
    underlying.listGrants(listGrantsRequest).toEither

  def listGrantsPaginator(listGrantsRequest: ListGrantsRequest): ListGrantsIterable =
    underlying.listGrantsPaginator(listGrantsRequest)

  override def listKeyPolicies(
      listKeyPoliciesRequest: ListKeyPoliciesRequest
  ): Either[Throwable, ListKeyPoliciesResponse] =
    underlying.listKeyPolicies(listKeyPoliciesRequest).toEither

  def listKeyPoliciesPaginator(listKeyPoliciesRequest: ListKeyPoliciesRequest): ListKeyPoliciesIterable =
    underlying.listKeyPoliciesPaginator(listKeyPoliciesRequest)

  override def listKeys(): Either[Throwable, ListKeysResponse] =
    underlying.listKeys().toEither

  override def listKeys(listKeysRequest: ListKeysRequest): Either[Throwable, ListKeysResponse] =
    underlying.listKeys(listKeysRequest).toEither

  def listKeysPaginator(): ListKeysIterable =
    underlying.listKeysPaginator()

  def listKeysPaginator(listKeysRequest: ListKeysRequest): ListKeysIterable =
    underlying.listKeysPaginator(listKeysRequest)

  override def listResourceTags(
      listResourceTagsRequest: ListResourceTagsRequest
  ): Either[Throwable, ListResourceTagsResponse] =
    underlying.listResourceTags(listResourceTagsRequest).toEither

  override def listRetirableGrants(
      listRetirableGrantsRequest: ListRetirableGrantsRequest
  ): Either[Throwable, ListRetirableGrantsResponse] =
    underlying.listRetirableGrants(listRetirableGrantsRequest).toEither

  override def putKeyPolicy(putKeyPolicyRequest: PutKeyPolicyRequest): Either[Throwable, PutKeyPolicyResponse] =
    underlying.putKeyPolicy(putKeyPolicyRequest).toEither

  override def reEncrypt(reEncryptRequest: ReEncryptRequest): Either[Throwable, ReEncryptResponse] =
    underlying.reEncrypt(reEncryptRequest).toEither

  override def retireGrant(): Either[Throwable, RetireGrantResponse] =
    underlying.retireGrant().toEither

  override def retireGrant(retireGrantRequest: RetireGrantRequest): Either[Throwable, RetireGrantResponse] =
    underlying.retireGrant(retireGrantRequest).toEither

  override def revokeGrant(revokeGrantRequest: RevokeGrantRequest): Either[Throwable, RevokeGrantResponse] =
    underlying.revokeGrant(revokeGrantRequest).toEither

  override def scheduleKeyDeletion(
      scheduleKeyDeletionRequest: ScheduleKeyDeletionRequest
  ): Either[Throwable, ScheduleKeyDeletionResponse] =
    underlying.scheduleKeyDeletion(scheduleKeyDeletionRequest).toEither

  override def sign(signRequest: SignRequest): Either[Throwable, SignResponse] =
    underlying.sign(signRequest).toEither

  override def tagResource(tagResourceRequest: TagResourceRequest): Either[Throwable, TagResourceResponse] =
    underlying.tagResource(tagResourceRequest).toEither

  override def untagResource(untagResourceRequest: UntagResourceRequest): Either[Throwable, UntagResourceResponse] =
    underlying.untagResource(untagResourceRequest).toEither

  override def updateAlias(updateAliasRequest: UpdateAliasRequest): Either[Throwable, UpdateAliasResponse] =
    underlying.updateAlias(updateAliasRequest).toEither

  override def updateCustomKeyStore(
      updateCustomKeyStoreRequest: UpdateCustomKeyStoreRequest
  ): Either[Throwable, UpdateCustomKeyStoreResponse] =
    underlying.updateCustomKeyStore(updateCustomKeyStoreRequest).toEither

  override def updateKeyDescription(
      updateKeyDescriptionRequest: UpdateKeyDescriptionRequest
  ): Either[Throwable, UpdateKeyDescriptionResponse] =
    underlying.updateKeyDescription(updateKeyDescriptionRequest).toEither

  override def verify(verifyRequest: VerifyRequest): Either[Throwable, VerifyResponse] =
    underlying.verify(verifyRequest).toEither

}
