// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr

import software.amazon.awssdk.services.ecr.model._
import software.amazon.awssdk.services.ecr.paginators._
import software.amazon.awssdk.services.ecr.{ EcrAsyncClient => JavaEcrAsyncClient }

import scala.compat.java8.FutureConverters._
import scala.concurrent.Future

object EcrAsyncClient {

  def apply(javaClient: JavaEcrAsyncClient): EcrAsyncClient =
    new EcrAsyncClient {
      override val underlying: JavaEcrAsyncClient = javaClient
    }

}

trait EcrAsyncClient extends EcrClient[Future] {
  val underlying: JavaEcrAsyncClient

  override def batchCheckLayerAvailability(
      batchCheckLayerAvailabilityRequest: BatchCheckLayerAvailabilityRequest
  ): Future[BatchCheckLayerAvailabilityResponse] =
    underlying.batchCheckLayerAvailability(batchCheckLayerAvailabilityRequest).toScala

  override def batchDeleteImage(batchDeleteImageRequest: BatchDeleteImageRequest): Future[BatchDeleteImageResponse] =
    underlying.batchDeleteImage(batchDeleteImageRequest).toScala

  override def batchGetImage(batchGetImageRequest: BatchGetImageRequest): Future[BatchGetImageResponse] =
    underlying.batchGetImage(batchGetImageRequest).toScala

  override def completeLayerUpload(
      completeLayerUploadRequest: CompleteLayerUploadRequest
  ): Future[CompleteLayerUploadResponse] =
    underlying.completeLayerUpload(completeLayerUploadRequest).toScala

  override def createRepository(createRepositoryRequest: CreateRepositoryRequest): Future[CreateRepositoryResponse] =
    underlying.createRepository(createRepositoryRequest).toScala

  override def deleteLifecyclePolicy(
      deleteLifecyclePolicyRequest: DeleteLifecyclePolicyRequest
  ): Future[DeleteLifecyclePolicyResponse] =
    underlying.deleteLifecyclePolicy(deleteLifecyclePolicyRequest).toScala

  override def deleteRepository(deleteRepositoryRequest: DeleteRepositoryRequest): Future[DeleteRepositoryResponse] =
    underlying.deleteRepository(deleteRepositoryRequest).toScala

  override def deleteRepositoryPolicy(
      deleteRepositoryPolicyRequest: DeleteRepositoryPolicyRequest
  ): Future[DeleteRepositoryPolicyResponse] =
    underlying.deleteRepositoryPolicy(deleteRepositoryPolicyRequest).toScala

  override def describeImageScanFindings(
      describeImageScanFindingsRequest: DescribeImageScanFindingsRequest
  ): Future[DescribeImageScanFindingsResponse] =
    underlying.describeImageScanFindings(describeImageScanFindingsRequest).toScala

  def describeImageScanFindingsPaginator(
      describeImageScanFindingsRequest: DescribeImageScanFindingsRequest
  ): DescribeImageScanFindingsPublisher =
    underlying.describeImageScanFindingsPaginator(describeImageScanFindingsRequest)

  override def describeImages(describeImagesRequest: DescribeImagesRequest): Future[DescribeImagesResponse] =
    underlying.describeImages(describeImagesRequest).toScala

  def describeImagesPaginator(describeImagesRequest: DescribeImagesRequest): DescribeImagesPublisher =
    underlying.describeImagesPaginator(describeImagesRequest)

  override def describeRepositories(
      describeRepositoriesRequest: DescribeRepositoriesRequest
  ): Future[DescribeRepositoriesResponse] =
    underlying.describeRepositories(describeRepositoriesRequest).toScala

  override def describeRepositories(): Future[DescribeRepositoriesResponse] =
    underlying.describeRepositories().toScala

  def describeRepositoriesPaginator(): DescribeRepositoriesPublisher =
    underlying.describeRepositoriesPaginator()

  def describeRepositoriesPaginator(
      describeRepositoriesRequest: DescribeRepositoriesRequest
  ): DescribeRepositoriesPublisher =
    underlying.describeRepositoriesPaginator(describeRepositoriesRequest)

  override def getAuthorizationToken(
      getAuthorizationTokenRequest: GetAuthorizationTokenRequest
  ): Future[GetAuthorizationTokenResponse] =
    underlying.getAuthorizationToken(getAuthorizationTokenRequest).toScala

  override def getAuthorizationToken(): Future[GetAuthorizationTokenResponse] =
    underlying.getAuthorizationToken().toScala

  override def getDownloadUrlForLayer(
      getDownloadUrlForLayerRequest: GetDownloadUrlForLayerRequest
  ): Future[GetDownloadUrlForLayerResponse] =
    underlying.getDownloadUrlForLayer(getDownloadUrlForLayerRequest).toScala

  override def getLifecyclePolicy(
      getLifecyclePolicyRequest: GetLifecyclePolicyRequest
  ): Future[GetLifecyclePolicyResponse] =
    underlying.getLifecyclePolicy(getLifecyclePolicyRequest).toScala

  override def getLifecyclePolicyPreview(
      getLifecyclePolicyPreviewRequest: GetLifecyclePolicyPreviewRequest
  ): Future[GetLifecyclePolicyPreviewResponse] =
    underlying.getLifecyclePolicyPreview(getLifecyclePolicyPreviewRequest).toScala

  def getLifecyclePolicyPreviewPaginator(
      getLifecyclePolicyPreviewRequest: GetLifecyclePolicyPreviewRequest
  ): GetLifecyclePolicyPreviewPublisher =
    underlying.getLifecyclePolicyPreviewPaginator(getLifecyclePolicyPreviewRequest)

  override def getRepositoryPolicy(
      getRepositoryPolicyRequest: GetRepositoryPolicyRequest
  ): Future[GetRepositoryPolicyResponse] =
    underlying.getRepositoryPolicy(getRepositoryPolicyRequest).toScala

  override def initiateLayerUpload(
      initiateLayerUploadRequest: InitiateLayerUploadRequest
  ): Future[InitiateLayerUploadResponse] =
    underlying.initiateLayerUpload(initiateLayerUploadRequest).toScala

  override def listImages(listImagesRequest: ListImagesRequest): Future[ListImagesResponse] =
    underlying.listImages(listImagesRequest).toScala

  def listImagesPaginator(listImagesRequest: ListImagesRequest): ListImagesPublisher =
    underlying.listImagesPaginator(listImagesRequest)

  override def listTagsForResource(
      listTagsForResourceRequest: ListTagsForResourceRequest
  ): Future[ListTagsForResourceResponse] =
    underlying.listTagsForResource(listTagsForResourceRequest).toScala

  override def putImage(putImageRequest: PutImageRequest): Future[PutImageResponse] =
    underlying.putImage(putImageRequest).toScala

  override def putImageScanningConfiguration(
      putImageScanningConfigurationRequest: PutImageScanningConfigurationRequest
  ): Future[PutImageScanningConfigurationResponse] =
    underlying.putImageScanningConfiguration(putImageScanningConfigurationRequest).toScala

  override def putImageTagMutability(
      putImageTagMutabilityRequest: PutImageTagMutabilityRequest
  ): Future[PutImageTagMutabilityResponse] =
    underlying.putImageTagMutability(putImageTagMutabilityRequest).toScala

  override def putLifecyclePolicy(
      putLifecyclePolicyRequest: PutLifecyclePolicyRequest
  ): Future[PutLifecyclePolicyResponse] =
    underlying.putLifecyclePolicy(putLifecyclePolicyRequest).toScala

  override def setRepositoryPolicy(
      setRepositoryPolicyRequest: SetRepositoryPolicyRequest
  ): Future[SetRepositoryPolicyResponse] =
    underlying.setRepositoryPolicy(setRepositoryPolicyRequest).toScala

  override def startImageScan(startImageScanRequest: StartImageScanRequest): Future[StartImageScanResponse] =
    underlying.startImageScan(startImageScanRequest).toScala

  override def startLifecyclePolicyPreview(
      startLifecyclePolicyPreviewRequest: StartLifecyclePolicyPreviewRequest
  ): Future[StartLifecyclePolicyPreviewResponse] =
    underlying.startLifecyclePolicyPreview(startLifecyclePolicyPreviewRequest).toScala

  override def tagResource(tagResourceRequest: TagResourceRequest): Future[TagResourceResponse] =
    underlying.tagResource(tagResourceRequest).toScala

  override def untagResource(untagResourceRequest: UntagResourceRequest): Future[UntagResourceResponse] =
    underlying.untagResource(untagResourceRequest).toScala

  override def uploadLayerPart(uploadLayerPartRequest: UploadLayerPartRequest): Future[UploadLayerPartResponse] =
    underlying.uploadLayerPart(uploadLayerPartRequest).toScala

}
