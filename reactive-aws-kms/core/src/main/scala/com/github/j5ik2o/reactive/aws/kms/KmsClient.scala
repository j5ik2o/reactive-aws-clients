// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms

import software.amazon.awssdk.services.kms.model._

trait KmsClient[M[_]] {

  def cancelKeyDeletion(cancelKeyDeletionRequest: CancelKeyDeletionRequest): M[CancelKeyDeletionResponse]

  def connectCustomKeyStore(
      connectCustomKeyStoreRequest: ConnectCustomKeyStoreRequest
  ): M[ConnectCustomKeyStoreResponse]

  def createAlias(createAliasRequest: CreateAliasRequest): M[CreateAliasResponse]

  def createCustomKeyStore(createCustomKeyStoreRequest: CreateCustomKeyStoreRequest): M[CreateCustomKeyStoreResponse]

  def createGrant(createGrantRequest: CreateGrantRequest): M[CreateGrantResponse]

  def createKey(createKeyRequest: CreateKeyRequest): M[CreateKeyResponse]

  def createKey(): M[CreateKeyResponse]

  def decrypt(decryptRequest: DecryptRequest): M[DecryptResponse]

  def deleteAlias(deleteAliasRequest: DeleteAliasRequest): M[DeleteAliasResponse]

  def deleteCustomKeyStore(deleteCustomKeyStoreRequest: DeleteCustomKeyStoreRequest): M[DeleteCustomKeyStoreResponse]

  def deleteImportedKeyMaterial(
      deleteImportedKeyMaterialRequest: DeleteImportedKeyMaterialRequest
  ): M[DeleteImportedKeyMaterialResponse]

  def describeCustomKeyStores(
      describeCustomKeyStoresRequest: DescribeCustomKeyStoresRequest
  ): M[DescribeCustomKeyStoresResponse]

  def describeCustomKeyStores(): M[DescribeCustomKeyStoresResponse]

  def describeKey(describeKeyRequest: DescribeKeyRequest): M[DescribeKeyResponse]

  def disableKey(disableKeyRequest: DisableKeyRequest): M[DisableKeyResponse]

  def disableKeyRotation(disableKeyRotationRequest: DisableKeyRotationRequest): M[DisableKeyRotationResponse]

  def disconnectCustomKeyStore(
      disconnectCustomKeyStoreRequest: DisconnectCustomKeyStoreRequest
  ): M[DisconnectCustomKeyStoreResponse]

  def enableKey(enableKeyRequest: EnableKeyRequest): M[EnableKeyResponse]

  def enableKeyRotation(enableKeyRotationRequest: EnableKeyRotationRequest): M[EnableKeyRotationResponse]

  def encrypt(encryptRequest: EncryptRequest): M[EncryptResponse]

  def generateDataKey(generateDataKeyRequest: GenerateDataKeyRequest): M[GenerateDataKeyResponse]

  def generateDataKeyWithoutPlaintext(
      generateDataKeyWithoutPlaintextRequest: GenerateDataKeyWithoutPlaintextRequest
  ): M[GenerateDataKeyWithoutPlaintextResponse]

  def generateRandom(generateRandomRequest: GenerateRandomRequest): M[GenerateRandomResponse]

  def generateRandom(): M[GenerateRandomResponse]

  def getKeyPolicy(getKeyPolicyRequest: GetKeyPolicyRequest): M[GetKeyPolicyResponse]

  def getKeyRotationStatus(getKeyRotationStatusRequest: GetKeyRotationStatusRequest): M[GetKeyRotationStatusResponse]

  def getParametersForImport(
      getParametersForImportRequest: GetParametersForImportRequest
  ): M[GetParametersForImportResponse]

  def importKeyMaterial(importKeyMaterialRequest: ImportKeyMaterialRequest): M[ImportKeyMaterialResponse]

  def listAliases(listAliasesRequest: ListAliasesRequest): M[ListAliasesResponse]

  def listAliases(): M[ListAliasesResponse]

  def listGrants(listGrantsRequest: ListGrantsRequest): M[ListGrantsResponse]

  def listKeyPolicies(listKeyPoliciesRequest: ListKeyPoliciesRequest): M[ListKeyPoliciesResponse]

  def listKeys(listKeysRequest: ListKeysRequest): M[ListKeysResponse]

  def listKeys(): M[ListKeysResponse]

  def listResourceTags(listResourceTagsRequest: ListResourceTagsRequest): M[ListResourceTagsResponse]

  def listRetirableGrants(listRetirableGrantsRequest: ListRetirableGrantsRequest): M[ListRetirableGrantsResponse]

  def putKeyPolicy(putKeyPolicyRequest: PutKeyPolicyRequest): M[PutKeyPolicyResponse]

  def reEncrypt(reEncryptRequest: ReEncryptRequest): M[ReEncryptResponse]

  def retireGrant(retireGrantRequest: RetireGrantRequest): M[RetireGrantResponse]

  def retireGrant(): M[RetireGrantResponse]

  def revokeGrant(revokeGrantRequest: RevokeGrantRequest): M[RevokeGrantResponse]

  def scheduleKeyDeletion(scheduleKeyDeletionRequest: ScheduleKeyDeletionRequest): M[ScheduleKeyDeletionResponse]

  def tagResource(tagResourceRequest: TagResourceRequest): M[TagResourceResponse]

  def untagResource(untagResourceRequest: UntagResourceRequest): M[UntagResourceResponse]

  def updateAlias(updateAliasRequest: UpdateAliasRequest): M[UpdateAliasResponse]

  def updateCustomKeyStore(updateCustomKeyStoreRequest: UpdateCustomKeyStoreRequest): M[UpdateCustomKeyStoreResponse]

  def updateKeyDescription(updateKeyDescriptionRequest: UpdateKeyDescriptionRequest): M[UpdateKeyDescriptionResponse]

}
