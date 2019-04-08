// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr

import com.github.j5ik2o.reactive.aws.utils.ToEitherSupport
import software.amazon.awssdk.services.ecr.model._
import software.amazon.awssdk.services.ecr.paginators._
import software.amazon.awssdk.services.ecr.{ EcrClient => JavaEcrSyncClient }

object EcrSyncClient extends ToEitherSupport {

  def apply(javaClient: JavaEcrSyncClient): EcrSyncClient =
    new EcrSyncClient {
      override val underlying: JavaEcrSyncClient = javaClient
    }
}

trait EcrSyncClient extends EcrClient[Either[Throwable, ?]] {
  val underlying: JavaEcrSyncClient

  import EcrSyncClient._

  override def batchCheckLayerAvailability(
      batchCheckLayerAvailabilityRequest: BatchCheckLayerAvailabilityRequest
  ): Either[Throwable, BatchCheckLayerAvailabilityResponse] =
    underlying.batchCheckLayerAvailability(batchCheckLayerAvailabilityRequest).toEither

  override def batchDeleteImage(
      batchDeleteImageRequest: BatchDeleteImageRequest
  ): Either[Throwable, BatchDeleteImageResponse] =
    underlying.batchDeleteImage(batchDeleteImageRequest).toEither

  override def batchGetImage(batchGetImageRequest: BatchGetImageRequest): Either[Throwable, BatchGetImageResponse] =
    underlying.batchGetImage(batchGetImageRequest).toEither

  override def completeLayerUpload(
      completeLayerUploadRequest: CompleteLayerUploadRequest
  ): Either[Throwable, CompleteLayerUploadResponse] =
    underlying.completeLayerUpload(completeLayerUploadRequest).toEither

  override def createRepository(
      createRepositoryRequest: CreateRepositoryRequest
  ): Either[Throwable, CreateRepositoryResponse] =
    underlying.createRepository(createRepositoryRequest).toEither

  override def deleteLifecyclePolicy(
      deleteLifecyclePolicyRequest: DeleteLifecyclePolicyRequest
  ): Either[Throwable, DeleteLifecyclePolicyResponse] =
    underlying.deleteLifecyclePolicy(deleteLifecyclePolicyRequest).toEither

  override def deleteRepository(
      deleteRepositoryRequest: DeleteRepositoryRequest
  ): Either[Throwable, DeleteRepositoryResponse] =
    underlying.deleteRepository(deleteRepositoryRequest).toEither

  override def deleteRepositoryPolicy(
      deleteRepositoryPolicyRequest: DeleteRepositoryPolicyRequest
  ): Either[Throwable, DeleteRepositoryPolicyResponse] =
    underlying.deleteRepositoryPolicy(deleteRepositoryPolicyRequest).toEither

  override def describeImages(describeImagesRequest: DescribeImagesRequest): Either[Throwable, DescribeImagesResponse] =
    underlying.describeImages(describeImagesRequest).toEither

  def describeImagesPaginator(describeImagesRequest: DescribeImagesRequest): DescribeImagesIterable =
    underlying.describeImagesPaginator(describeImagesRequest)

  override def describeRepositories(): Either[Throwable, DescribeRepositoriesResponse] =
    underlying.describeRepositories().toEither

  override def describeRepositories(
      describeRepositoriesRequest: DescribeRepositoriesRequest
  ): Either[Throwable, DescribeRepositoriesResponse] =
    underlying.describeRepositories(describeRepositoriesRequest).toEither

  def describeRepositoriesPaginator(): DescribeRepositoriesIterable =
    underlying.describeRepositoriesPaginator()

  def describeRepositoriesPaginator(
      describeRepositoriesRequest: DescribeRepositoriesRequest
  ): DescribeRepositoriesIterable =
    underlying.describeRepositoriesPaginator(describeRepositoriesRequest)

  override def getAuthorizationToken(): Either[Throwable, GetAuthorizationTokenResponse] =
    underlying.getAuthorizationToken().toEither

  override def getAuthorizationToken(
      getAuthorizationTokenRequest: GetAuthorizationTokenRequest
  ): Either[Throwable, GetAuthorizationTokenResponse] =
    underlying.getAuthorizationToken(getAuthorizationTokenRequest).toEither

  override def getDownloadUrlForLayer(
      getDownloadUrlForLayerRequest: GetDownloadUrlForLayerRequest
  ): Either[Throwable, GetDownloadUrlForLayerResponse] =
    underlying.getDownloadUrlForLayer(getDownloadUrlForLayerRequest).toEither

  override def getLifecyclePolicy(
      getLifecyclePolicyRequest: GetLifecyclePolicyRequest
  ): Either[Throwable, GetLifecyclePolicyResponse] =
    underlying.getLifecyclePolicy(getLifecyclePolicyRequest).toEither

  override def getLifecyclePolicyPreview(
      getLifecyclePolicyPreviewRequest: GetLifecyclePolicyPreviewRequest
  ): Either[Throwable, GetLifecyclePolicyPreviewResponse] =
    underlying.getLifecyclePolicyPreview(getLifecyclePolicyPreviewRequest).toEither

  override def getRepositoryPolicy(
      getRepositoryPolicyRequest: GetRepositoryPolicyRequest
  ): Either[Throwable, GetRepositoryPolicyResponse] =
    underlying.getRepositoryPolicy(getRepositoryPolicyRequest).toEither

  override def initiateLayerUpload(
      initiateLayerUploadRequest: InitiateLayerUploadRequest
  ): Either[Throwable, InitiateLayerUploadResponse] =
    underlying.initiateLayerUpload(initiateLayerUploadRequest).toEither

  override def listImages(listImagesRequest: ListImagesRequest): Either[Throwable, ListImagesResponse] =
    underlying.listImages(listImagesRequest).toEither

  def listImagesPaginator(listImagesRequest: ListImagesRequest): ListImagesIterable =
    underlying.listImagesPaginator(listImagesRequest)

  override def listTagsForResource(
      listTagsForResourceRequest: ListTagsForResourceRequest
  ): Either[Throwable, ListTagsForResourceResponse] =
    underlying.listTagsForResource(listTagsForResourceRequest).toEither

  override def putImage(putImageRequest: PutImageRequest): Either[Throwable, PutImageResponse] =
    underlying.putImage(putImageRequest).toEither

  override def putLifecyclePolicy(
      putLifecyclePolicyRequest: PutLifecyclePolicyRequest
  ): Either[Throwable, PutLifecyclePolicyResponse] =
    underlying.putLifecyclePolicy(putLifecyclePolicyRequest).toEither

  override def setRepositoryPolicy(
      setRepositoryPolicyRequest: SetRepositoryPolicyRequest
  ): Either[Throwable, SetRepositoryPolicyResponse] =
    underlying.setRepositoryPolicy(setRepositoryPolicyRequest).toEither

  override def startLifecyclePolicyPreview(
      startLifecyclePolicyPreviewRequest: StartLifecyclePolicyPreviewRequest
  ): Either[Throwable, StartLifecyclePolicyPreviewResponse] =
    underlying.startLifecyclePolicyPreview(startLifecyclePolicyPreviewRequest).toEither

  override def tagResource(tagResourceRequest: TagResourceRequest): Either[Throwable, TagResourceResponse] =
    underlying.tagResource(tagResourceRequest).toEither

  override def untagResource(untagResourceRequest: UntagResourceRequest): Either[Throwable, UntagResourceResponse] =
    underlying.untagResource(untagResourceRequest).toEither

  override def uploadLayerPart(
      uploadLayerPartRequest: UploadLayerPartRequest
  ): Either[Throwable, UploadLayerPartResponse] =
    underlying.uploadLayerPart(uploadLayerPartRequest).toEither

}
