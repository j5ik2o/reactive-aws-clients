// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.cats

import cats.effect.IO
import com.github.j5ik2o.reactive.aws.kms.{ KmsAsyncClient, KmsClient }
import software.amazon.awssdk.services.kms.model._
import software.amazon.awssdk.services.kms.paginators._

import scala.concurrent.{ ExecutionContext, Future }

object KmsCatsIOClient {

  def apply(asyncClient: KmsAsyncClient): KmsCatsIOClient = new KmsCatsIOClient {
    override val underlying: KmsAsyncClient = asyncClient
  }

}

trait KmsCatsIOClient extends KmsClient[IO] {

  val underlying: KmsAsyncClient

  override def cancelKeyDeletion(cancelKeyDeletionRequest: CancelKeyDeletionRequest): IO[CancelKeyDeletionResponse] =
    IO.fromFuture {
      IO(underlying.cancelKeyDeletion(cancelKeyDeletionRequest))
    }

  override def connectCustomKeyStore(
      connectCustomKeyStoreRequest: ConnectCustomKeyStoreRequest
  ): IO[ConnectCustomKeyStoreResponse] =
    IO.fromFuture {
      IO(underlying.connectCustomKeyStore(connectCustomKeyStoreRequest))
    }

  override def createAlias(createAliasRequest: CreateAliasRequest): IO[CreateAliasResponse] =
    IO.fromFuture {
      IO(underlying.createAlias(createAliasRequest))
    }

  override def createCustomKeyStore(
      createCustomKeyStoreRequest: CreateCustomKeyStoreRequest
  ): IO[CreateCustomKeyStoreResponse] =
    IO.fromFuture {
      IO(underlying.createCustomKeyStore(createCustomKeyStoreRequest))
    }

  override def createGrant(createGrantRequest: CreateGrantRequest): IO[CreateGrantResponse] =
    IO.fromFuture {
      IO(underlying.createGrant(createGrantRequest))
    }

  override def createKey(createKeyRequest: CreateKeyRequest): IO[CreateKeyResponse] =
    IO.fromFuture {
      IO(underlying.createKey(createKeyRequest))
    }

  override def createKey(): IO[CreateKeyResponse] =
    IO.fromFuture {
      IO(underlying.createKey())
    }

  override def decrypt(decryptRequest: DecryptRequest): IO[DecryptResponse] =
    IO.fromFuture {
      IO(underlying.decrypt(decryptRequest))
    }

  override def deleteAlias(deleteAliasRequest: DeleteAliasRequest): IO[DeleteAliasResponse] =
    IO.fromFuture {
      IO(underlying.deleteAlias(deleteAliasRequest))
    }

  override def deleteCustomKeyStore(
      deleteCustomKeyStoreRequest: DeleteCustomKeyStoreRequest
  ): IO[DeleteCustomKeyStoreResponse] =
    IO.fromFuture {
      IO(underlying.deleteCustomKeyStore(deleteCustomKeyStoreRequest))
    }

  override def deleteImportedKeyMaterial(
      deleteImportedKeyMaterialRequest: DeleteImportedKeyMaterialRequest
  ): IO[DeleteImportedKeyMaterialResponse] =
    IO.fromFuture {
      IO(underlying.deleteImportedKeyMaterial(deleteImportedKeyMaterialRequest))
    }

  override def describeCustomKeyStores(
      describeCustomKeyStoresRequest: DescribeCustomKeyStoresRequest
  ): IO[DescribeCustomKeyStoresResponse] =
    IO.fromFuture {
      IO(underlying.describeCustomKeyStores(describeCustomKeyStoresRequest))
    }

  override def describeCustomKeyStores(): IO[DescribeCustomKeyStoresResponse] =
    IO.fromFuture {
      IO(underlying.describeCustomKeyStores())
    }

  override def describeKey(describeKeyRequest: DescribeKeyRequest): IO[DescribeKeyResponse] =
    IO.fromFuture {
      IO(underlying.describeKey(describeKeyRequest))
    }

  override def disableKey(disableKeyRequest: DisableKeyRequest): IO[DisableKeyResponse] =
    IO.fromFuture {
      IO(underlying.disableKey(disableKeyRequest))
    }

  override def disableKeyRotation(
      disableKeyRotationRequest: DisableKeyRotationRequest
  ): IO[DisableKeyRotationResponse] =
    IO.fromFuture {
      IO(underlying.disableKeyRotation(disableKeyRotationRequest))
    }

  override def disconnectCustomKeyStore(
      disconnectCustomKeyStoreRequest: DisconnectCustomKeyStoreRequest
  ): IO[DisconnectCustomKeyStoreResponse] =
    IO.fromFuture {
      IO(underlying.disconnectCustomKeyStore(disconnectCustomKeyStoreRequest))
    }

  override def enableKey(enableKeyRequest: EnableKeyRequest): IO[EnableKeyResponse] =
    IO.fromFuture {
      IO(underlying.enableKey(enableKeyRequest))
    }

  override def enableKeyRotation(enableKeyRotationRequest: EnableKeyRotationRequest): IO[EnableKeyRotationResponse] =
    IO.fromFuture {
      IO(underlying.enableKeyRotation(enableKeyRotationRequest))
    }

  override def encrypt(encryptRequest: EncryptRequest): IO[EncryptResponse] =
    IO.fromFuture {
      IO(underlying.encrypt(encryptRequest))
    }

  override def generateDataKey(generateDataKeyRequest: GenerateDataKeyRequest): IO[GenerateDataKeyResponse] =
    IO.fromFuture {
      IO(underlying.generateDataKey(generateDataKeyRequest))
    }

  override def generateDataKeyWithoutPlaintext(
      generateDataKeyWithoutPlaintextRequest: GenerateDataKeyWithoutPlaintextRequest
  ): IO[GenerateDataKeyWithoutPlaintextResponse] =
    IO.fromFuture {
      IO(underlying.generateDataKeyWithoutPlaintext(generateDataKeyWithoutPlaintextRequest))
    }

  override def generateRandom(generateRandomRequest: GenerateRandomRequest): IO[GenerateRandomResponse] =
    IO.fromFuture {
      IO(underlying.generateRandom(generateRandomRequest))
    }

  override def generateRandom(): IO[GenerateRandomResponse] =
    IO.fromFuture {
      IO(underlying.generateRandom())
    }

  override def getKeyPolicy(getKeyPolicyRequest: GetKeyPolicyRequest): IO[GetKeyPolicyResponse] =
    IO.fromFuture {
      IO(underlying.getKeyPolicy(getKeyPolicyRequest))
    }

  override def getKeyRotationStatus(
      getKeyRotationStatusRequest: GetKeyRotationStatusRequest
  ): IO[GetKeyRotationStatusResponse] =
    IO.fromFuture {
      IO(underlying.getKeyRotationStatus(getKeyRotationStatusRequest))
    }

  override def getParametersForImport(
      getParametersForImportRequest: GetParametersForImportRequest
  ): IO[GetParametersForImportResponse] =
    IO.fromFuture {
      IO(underlying.getParametersForImport(getParametersForImportRequest))
    }

  override def importKeyMaterial(importKeyMaterialRequest: ImportKeyMaterialRequest): IO[ImportKeyMaterialResponse] =
    IO.fromFuture {
      IO(underlying.importKeyMaterial(importKeyMaterialRequest))
    }

  override def listAliases(listAliasesRequest: ListAliasesRequest): IO[ListAliasesResponse] =
    IO.fromFuture {
      IO(underlying.listAliases(listAliasesRequest))
    }

  override def listAliases(): IO[ListAliasesResponse] =
    IO.fromFuture {
      IO(underlying.listAliases())
    }

  def listAliasesPaginator(): ListAliasesPublisher =
    underlying.listAliasesPaginator()

  def listAliasesPaginator(listAliasesRequest: ListAliasesRequest): ListAliasesPublisher =
    underlying.listAliasesPaginator(listAliasesRequest)

  override def listGrants(listGrantsRequest: ListGrantsRequest): IO[ListGrantsResponse] =
    IO.fromFuture {
      IO(underlying.listGrants(listGrantsRequest))
    }

  def listGrantsPaginator(listGrantsRequest: ListGrantsRequest): ListGrantsPublisher =
    underlying.listGrantsPaginator(listGrantsRequest)

  override def listKeyPolicies(listKeyPoliciesRequest: ListKeyPoliciesRequest): IO[ListKeyPoliciesResponse] =
    IO.fromFuture {
      IO(underlying.listKeyPolicies(listKeyPoliciesRequest))
    }

  def listKeyPoliciesPaginator(listKeyPoliciesRequest: ListKeyPoliciesRequest): ListKeyPoliciesPublisher =
    underlying.listKeyPoliciesPaginator(listKeyPoliciesRequest)

  override def listKeys(listKeysRequest: ListKeysRequest): IO[ListKeysResponse] =
    IO.fromFuture {
      IO(underlying.listKeys(listKeysRequest))
    }

  override def listKeys(): IO[ListKeysResponse] =
    IO.fromFuture {
      IO(underlying.listKeys())
    }

  def listKeysPaginator(): ListKeysPublisher =
    underlying.listKeysPaginator()

  def listKeysPaginator(listKeysRequest: ListKeysRequest): ListKeysPublisher =
    underlying.listKeysPaginator(listKeysRequest)

  override def listResourceTags(listResourceTagsRequest: ListResourceTagsRequest): IO[ListResourceTagsResponse] =
    IO.fromFuture {
      IO(underlying.listResourceTags(listResourceTagsRequest))
    }

  override def listRetirableGrants(
      listRetirableGrantsRequest: ListRetirableGrantsRequest
  ): IO[ListRetirableGrantsResponse] =
    IO.fromFuture {
      IO(underlying.listRetirableGrants(listRetirableGrantsRequest))
    }

  override def putKeyPolicy(putKeyPolicyRequest: PutKeyPolicyRequest): IO[PutKeyPolicyResponse] =
    IO.fromFuture {
      IO(underlying.putKeyPolicy(putKeyPolicyRequest))
    }

  override def reEncrypt(reEncryptRequest: ReEncryptRequest): IO[ReEncryptResponse] =
    IO.fromFuture {
      IO(underlying.reEncrypt(reEncryptRequest))
    }

  override def retireGrant(retireGrantRequest: RetireGrantRequest): IO[RetireGrantResponse] =
    IO.fromFuture {
      IO(underlying.retireGrant(retireGrantRequest))
    }

  override def retireGrant(): IO[RetireGrantResponse] =
    IO.fromFuture {
      IO(underlying.retireGrant())
    }

  override def revokeGrant(revokeGrantRequest: RevokeGrantRequest): IO[RevokeGrantResponse] =
    IO.fromFuture {
      IO(underlying.revokeGrant(revokeGrantRequest))
    }

  override def scheduleKeyDeletion(
      scheduleKeyDeletionRequest: ScheduleKeyDeletionRequest
  ): IO[ScheduleKeyDeletionResponse] =
    IO.fromFuture {
      IO(underlying.scheduleKeyDeletion(scheduleKeyDeletionRequest))
    }

  override def tagResource(tagResourceRequest: TagResourceRequest): IO[TagResourceResponse] =
    IO.fromFuture {
      IO(underlying.tagResource(tagResourceRequest))
    }

  override def untagResource(untagResourceRequest: UntagResourceRequest): IO[UntagResourceResponse] =
    IO.fromFuture {
      IO(underlying.untagResource(untagResourceRequest))
    }

  override def updateAlias(updateAliasRequest: UpdateAliasRequest): IO[UpdateAliasResponse] =
    IO.fromFuture {
      IO(underlying.updateAlias(updateAliasRequest))
    }

  override def updateCustomKeyStore(
      updateCustomKeyStoreRequest: UpdateCustomKeyStoreRequest
  ): IO[UpdateCustomKeyStoreResponse] =
    IO.fromFuture {
      IO(underlying.updateCustomKeyStore(updateCustomKeyStoreRequest))
    }

  override def updateKeyDescription(
      updateKeyDescriptionRequest: UpdateKeyDescriptionRequest
  ): IO[UpdateKeyDescriptionResponse] =
    IO.fromFuture {
      IO(underlying.updateKeyDescription(updateKeyDescriptionRequest))
    }

}
