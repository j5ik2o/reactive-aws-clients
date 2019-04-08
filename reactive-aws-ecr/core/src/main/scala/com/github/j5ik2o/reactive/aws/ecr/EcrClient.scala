// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr

import software.amazon.awssdk.services.ecr.model._

trait EcrClient[M[_]] {

  def batchCheckLayerAvailability(
      batchCheckLayerAvailabilityRequest: BatchCheckLayerAvailabilityRequest
  ): M[BatchCheckLayerAvailabilityResponse]

  def batchDeleteImage(batchDeleteImageRequest: BatchDeleteImageRequest): M[BatchDeleteImageResponse]

  def batchGetImage(batchGetImageRequest: BatchGetImageRequest): M[BatchGetImageResponse]

  def completeLayerUpload(completeLayerUploadRequest: CompleteLayerUploadRequest): M[CompleteLayerUploadResponse]

  def createRepository(createRepositoryRequest: CreateRepositoryRequest): M[CreateRepositoryResponse]

  def deleteLifecyclePolicy(
      deleteLifecyclePolicyRequest: DeleteLifecyclePolicyRequest
  ): M[DeleteLifecyclePolicyResponse]

  def deleteRepository(deleteRepositoryRequest: DeleteRepositoryRequest): M[DeleteRepositoryResponse]

  def deleteRepositoryPolicy(
      deleteRepositoryPolicyRequest: DeleteRepositoryPolicyRequest
  ): M[DeleteRepositoryPolicyResponse]

  def describeImages(describeImagesRequest: DescribeImagesRequest): M[DescribeImagesResponse]

  def describeRepositories(describeRepositoriesRequest: DescribeRepositoriesRequest): M[DescribeRepositoriesResponse]

  def describeRepositories(): M[DescribeRepositoriesResponse]

  def getAuthorizationToken(
      getAuthorizationTokenRequest: GetAuthorizationTokenRequest
  ): M[GetAuthorizationTokenResponse]

  def getAuthorizationToken(): M[GetAuthorizationTokenResponse]

  def getDownloadUrlForLayer(
      getDownloadUrlForLayerRequest: GetDownloadUrlForLayerRequest
  ): M[GetDownloadUrlForLayerResponse]

  def getLifecyclePolicy(getLifecyclePolicyRequest: GetLifecyclePolicyRequest): M[GetLifecyclePolicyResponse]

  def getLifecyclePolicyPreview(
      getLifecyclePolicyPreviewRequest: GetLifecyclePolicyPreviewRequest
  ): M[GetLifecyclePolicyPreviewResponse]

  def getRepositoryPolicy(getRepositoryPolicyRequest: GetRepositoryPolicyRequest): M[GetRepositoryPolicyResponse]

  def initiateLayerUpload(initiateLayerUploadRequest: InitiateLayerUploadRequest): M[InitiateLayerUploadResponse]

  def listImages(listImagesRequest: ListImagesRequest): M[ListImagesResponse]

  def listTagsForResource(listTagsForResourceRequest: ListTagsForResourceRequest): M[ListTagsForResourceResponse]

  def putImage(putImageRequest: PutImageRequest): M[PutImageResponse]

  def putLifecyclePolicy(putLifecyclePolicyRequest: PutLifecyclePolicyRequest): M[PutLifecyclePolicyResponse]

  def setRepositoryPolicy(setRepositoryPolicyRequest: SetRepositoryPolicyRequest): M[SetRepositoryPolicyResponse]

  def startLifecyclePolicyPreview(
      startLifecyclePolicyPreviewRequest: StartLifecyclePolicyPreviewRequest
  ): M[StartLifecyclePolicyPreviewResponse]

  def tagResource(tagResourceRequest: TagResourceRequest): M[TagResourceResponse]

  def untagResource(untagResourceRequest: UntagResourceRequest): M[UntagResourceResponse]

  def uploadLayerPart(uploadLayerPartRequest: UploadLayerPartRequest): M[UploadLayerPartResponse]

}
