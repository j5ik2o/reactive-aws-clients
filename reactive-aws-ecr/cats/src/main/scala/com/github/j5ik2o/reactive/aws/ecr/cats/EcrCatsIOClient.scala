// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.cats

import cats.effect.{ ContextShift, IO }
import com.github.j5ik2o.reactive.aws.ecr.{ EcrAsyncClient, EcrClient }
import software.amazon.awssdk.services.ecr.model._
import software.amazon.awssdk.services.ecr.paginators._

import scala.concurrent.{ ExecutionContext, Future }

object EcrCatsIOClient {

  def apply(asyncClient: EcrAsyncClient)(implicit ec: ExecutionContext): EcrCatsIOClient =
    new EcrCatsIOClient {
      override val executionContext: ExecutionContext = ec
      override val underlying: EcrAsyncClient         = asyncClient
    }

}

trait EcrCatsIOClient extends EcrClient[IO] {

  val underlying: EcrAsyncClient

  def executionContext: ExecutionContext
  implicit def cs: ContextShift[IO] = IO.contextShift(executionContext)

  override def batchCheckLayerAvailability(
      batchCheckLayerAvailabilityRequest: BatchCheckLayerAvailabilityRequest
  ): IO[BatchCheckLayerAvailabilityResponse] =
    IO.fromFuture {
      IO(underlying.batchCheckLayerAvailability(batchCheckLayerAvailabilityRequest))
    }

  override def batchDeleteImage(batchDeleteImageRequest: BatchDeleteImageRequest): IO[BatchDeleteImageResponse] =
    IO.fromFuture {
      IO(underlying.batchDeleteImage(batchDeleteImageRequest))
    }

  override def batchGetImage(batchGetImageRequest: BatchGetImageRequest): IO[BatchGetImageResponse] =
    IO.fromFuture {
      IO(underlying.batchGetImage(batchGetImageRequest))
    }

  override def completeLayerUpload(
      completeLayerUploadRequest: CompleteLayerUploadRequest
  ): IO[CompleteLayerUploadResponse] =
    IO.fromFuture {
      IO(underlying.completeLayerUpload(completeLayerUploadRequest))
    }

  override def createRepository(createRepositoryRequest: CreateRepositoryRequest): IO[CreateRepositoryResponse] =
    IO.fromFuture {
      IO(underlying.createRepository(createRepositoryRequest))
    }

  override def deleteLifecyclePolicy(
      deleteLifecyclePolicyRequest: DeleteLifecyclePolicyRequest
  ): IO[DeleteLifecyclePolicyResponse] =
    IO.fromFuture {
      IO(underlying.deleteLifecyclePolicy(deleteLifecyclePolicyRequest))
    }

  override def deleteRepository(deleteRepositoryRequest: DeleteRepositoryRequest): IO[DeleteRepositoryResponse] =
    IO.fromFuture {
      IO(underlying.deleteRepository(deleteRepositoryRequest))
    }

  override def deleteRepositoryPolicy(
      deleteRepositoryPolicyRequest: DeleteRepositoryPolicyRequest
  ): IO[DeleteRepositoryPolicyResponse] =
    IO.fromFuture {
      IO(underlying.deleteRepositoryPolicy(deleteRepositoryPolicyRequest))
    }

  override def describeImageScanFindings(
      describeImageScanFindingsRequest: DescribeImageScanFindingsRequest
  ): IO[DescribeImageScanFindingsResponse] =
    IO.fromFuture {
      IO(underlying.describeImageScanFindings(describeImageScanFindingsRequest))
    }

  def describeImageScanFindingsPaginator(
      describeImageScanFindingsRequest: DescribeImageScanFindingsRequest
  ): DescribeImageScanFindingsPublisher =
    underlying.describeImageScanFindingsPaginator(describeImageScanFindingsRequest)

  override def describeImages(describeImagesRequest: DescribeImagesRequest): IO[DescribeImagesResponse] =
    IO.fromFuture {
      IO(underlying.describeImages(describeImagesRequest))
    }

  def describeImagesPaginator(describeImagesRequest: DescribeImagesRequest): DescribeImagesPublisher =
    underlying.describeImagesPaginator(describeImagesRequest)

  override def describeRepositories(
      describeRepositoriesRequest: DescribeRepositoriesRequest
  ): IO[DescribeRepositoriesResponse] =
    IO.fromFuture {
      IO(underlying.describeRepositories(describeRepositoriesRequest))
    }

  override def describeRepositories(): IO[DescribeRepositoriesResponse] =
    IO.fromFuture {
      IO(underlying.describeRepositories())
    }

  def describeRepositoriesPaginator(): DescribeRepositoriesPublisher =
    underlying.describeRepositoriesPaginator()

  def describeRepositoriesPaginator(
      describeRepositoriesRequest: DescribeRepositoriesRequest
  ): DescribeRepositoriesPublisher =
    underlying.describeRepositoriesPaginator(describeRepositoriesRequest)

  override def getAuthorizationToken(
      getAuthorizationTokenRequest: GetAuthorizationTokenRequest
  ): IO[GetAuthorizationTokenResponse] =
    IO.fromFuture {
      IO(underlying.getAuthorizationToken(getAuthorizationTokenRequest))
    }

  override def getAuthorizationToken(): IO[GetAuthorizationTokenResponse] =
    IO.fromFuture {
      IO(underlying.getAuthorizationToken())
    }

  override def getDownloadUrlForLayer(
      getDownloadUrlForLayerRequest: GetDownloadUrlForLayerRequest
  ): IO[GetDownloadUrlForLayerResponse] =
    IO.fromFuture {
      IO(underlying.getDownloadUrlForLayer(getDownloadUrlForLayerRequest))
    }

  override def getLifecyclePolicy(
      getLifecyclePolicyRequest: GetLifecyclePolicyRequest
  ): IO[GetLifecyclePolicyResponse] =
    IO.fromFuture {
      IO(underlying.getLifecyclePolicy(getLifecyclePolicyRequest))
    }

  override def getLifecyclePolicyPreview(
      getLifecyclePolicyPreviewRequest: GetLifecyclePolicyPreviewRequest
  ): IO[GetLifecyclePolicyPreviewResponse] =
    IO.fromFuture {
      IO(underlying.getLifecyclePolicyPreview(getLifecyclePolicyPreviewRequest))
    }

  def getLifecyclePolicyPreviewPaginator(
      getLifecyclePolicyPreviewRequest: GetLifecyclePolicyPreviewRequest
  ): GetLifecyclePolicyPreviewPublisher =
    underlying.getLifecyclePolicyPreviewPaginator(getLifecyclePolicyPreviewRequest)

  override def getRepositoryPolicy(
      getRepositoryPolicyRequest: GetRepositoryPolicyRequest
  ): IO[GetRepositoryPolicyResponse] =
    IO.fromFuture {
      IO(underlying.getRepositoryPolicy(getRepositoryPolicyRequest))
    }

  override def initiateLayerUpload(
      initiateLayerUploadRequest: InitiateLayerUploadRequest
  ): IO[InitiateLayerUploadResponse] =
    IO.fromFuture {
      IO(underlying.initiateLayerUpload(initiateLayerUploadRequest))
    }

  override def listImages(listImagesRequest: ListImagesRequest): IO[ListImagesResponse] =
    IO.fromFuture {
      IO(underlying.listImages(listImagesRequest))
    }

  def listImagesPaginator(listImagesRequest: ListImagesRequest): ListImagesPublisher =
    underlying.listImagesPaginator(listImagesRequest)

  override def listTagsForResource(
      listTagsForResourceRequest: ListTagsForResourceRequest
  ): IO[ListTagsForResourceResponse] =
    IO.fromFuture {
      IO(underlying.listTagsForResource(listTagsForResourceRequest))
    }

  override def putImage(putImageRequest: PutImageRequest): IO[PutImageResponse] =
    IO.fromFuture {
      IO(underlying.putImage(putImageRequest))
    }

  override def putImageScanningConfiguration(
      putImageScanningConfigurationRequest: PutImageScanningConfigurationRequest
  ): IO[PutImageScanningConfigurationResponse] =
    IO.fromFuture {
      IO(underlying.putImageScanningConfiguration(putImageScanningConfigurationRequest))
    }

  override def putImageTagMutability(
      putImageTagMutabilityRequest: PutImageTagMutabilityRequest
  ): IO[PutImageTagMutabilityResponse] =
    IO.fromFuture {
      IO(underlying.putImageTagMutability(putImageTagMutabilityRequest))
    }

  override def putLifecyclePolicy(
      putLifecyclePolicyRequest: PutLifecyclePolicyRequest
  ): IO[PutLifecyclePolicyResponse] =
    IO.fromFuture {
      IO(underlying.putLifecyclePolicy(putLifecyclePolicyRequest))
    }

  override def setRepositoryPolicy(
      setRepositoryPolicyRequest: SetRepositoryPolicyRequest
  ): IO[SetRepositoryPolicyResponse] =
    IO.fromFuture {
      IO(underlying.setRepositoryPolicy(setRepositoryPolicyRequest))
    }

  override def startImageScan(startImageScanRequest: StartImageScanRequest): IO[StartImageScanResponse] =
    IO.fromFuture {
      IO(underlying.startImageScan(startImageScanRequest))
    }

  override def startLifecyclePolicyPreview(
      startLifecyclePolicyPreviewRequest: StartLifecyclePolicyPreviewRequest
  ): IO[StartLifecyclePolicyPreviewResponse] =
    IO.fromFuture {
      IO(underlying.startLifecyclePolicyPreview(startLifecyclePolicyPreviewRequest))
    }

  override def tagResource(tagResourceRequest: TagResourceRequest): IO[TagResourceResponse] =
    IO.fromFuture {
      IO(underlying.tagResource(tagResourceRequest))
    }

  override def untagResource(untagResourceRequest: UntagResourceRequest): IO[UntagResourceResponse] =
    IO.fromFuture {
      IO(underlying.untagResource(untagResourceRequest))
    }

  override def uploadLayerPart(uploadLayerPartRequest: UploadLayerPartRequest): IO[UploadLayerPartResponse] =
    IO.fromFuture {
      IO(underlying.uploadLayerPart(uploadLayerPartRequest))
    }

}
