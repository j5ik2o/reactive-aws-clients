package com.github.j5ik2o.reactive.aws.kms.model.ops

import com.github.j5ik2o.reactive.aws.utils.ToOptionSupport

trait ToAllOps
    extends ToOptionSupport
    with ToAliasListEntryOps
    with ToCancelKeyDeletionRequestOps
    with ToCancelKeyDeletionResponseOps
    with ToConnectCustomKeyStoreRequestOps
    with ToCreateAliasRequestOps
    with ToCreateCustomKeyStoreRequestOps
    with ToCreateCustomKeyStoreResponseOps
    with ToCreateGrantRequestOps
    with ToCreateGrantResponseOps
    with ToCreateKeyRequestOps
    with ToCreateKeyResponseOps
    with ToCustomKeyStoresListEntryOps
    with ToDecryptRequestOps
    with ToDecryptResponseOps
    with ToDeleteAliasRequestOps
    with ToDeleteCustomKeyStoreRequestOps
    with ToDeleteImportedKeyMaterialRequestOps
    with ToDescribeCustomKeyStoresRequestOps
    with ToDescribeCustomKeyStoresResponseOps
    with ToDescribeKeyRequestOps
    with ToDescribeKeyResponseOps
    with ToDisableKeyRequestOps
    with ToDisableKeyRotationRequestOps
    with ToDisconnectCustomKeyStoreRequestOps
    with ToEnableKeyRequestOps
    with ToEnableKeyRotationRequestOps
    with ToEncryptRequestOps
    with ToEncryptResponseOps
    with ToGenerateDataKeyRequestOps
    with ToGenerateDataKeyResponseOps
    with ToGenerateDataKeyWithoutPlaintextRequestOps
    with ToGenerateDataKeyWithoutPlaintextResponseOps
    with ToGenerateRandomRequestOps
    with ToGenerateRandomResponseOps
    with ToGetKeyPolicyRequestOps
    with ToGetKeyPolicyResponseOps
    with ToGetKeyRotationStatusRequestOps
    with ToGetKeyRotationStatusResponseOps
    with ToGetParametersForImportRequestOps
    with ToGetParametersForImportResponseOps
    with ToGrantConstraintsOps
    with ToGrantListEntryOps
    with ToImportKeyMaterialRequestOps
    with ToKeyListEntryOps
    with ToKeyMetadataOps
    with ToListAliasesRequestOps
    with ToListAliasesResponseOps
    with ToListGrantsRequestOps
    with ToListGrantsResponseOps
    with ToListKeyPoliciesRequestOps
    with ToListKeyPoliciesResponseOps
    with ToListKeysRequestOps
    with ToListKeysResponseOps
    with ToListResourceTagsRequestOps
    with ToListResourceTagsResponseOps
    with ToListRetirableGrantsRequestOps
    with ToListRetirableGrantsResponseOps
    with ToPutKeyPolicyRequestOps
    with ToReEncryptRequestOps
    with ToReEncryptResponseOps
    with ToRetireGrantRequestOps
    with ToRevokeGrantRequestOps
    with ToScheduleKeyDeletionRequestOps
    with ToScheduleKeyDeletionResponseOps
    with ToTagOps
    with ToTagResourceRequestOps
    with ToUntagResourceRequestOps
    with ToUpdateAliasRequestOps
    with ToUpdateCustomKeyStoreRequestOps
    with ToUpdateKeyDescriptionRequestOps
