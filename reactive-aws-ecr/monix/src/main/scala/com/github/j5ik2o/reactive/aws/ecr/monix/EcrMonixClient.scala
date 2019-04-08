// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.monix

import software.amazon.awssdk.services.ecr.model._
import com.github.j5ik2o.reactive.aws.ecr.{ EcrAsyncClient, EcrClient }
import monix.eval.Task
import monix.reactive.Observable

object EcrMonixClient {

  def apply(asyncClient: EcrAsyncClient): EcrMonixClient = new EcrMonixClient {
    override val underlying: EcrAsyncClient = asyncClient
  }

}

trait EcrMonixClient extends EcrClient[Task] {

  val underlying: EcrAsyncClient

  override def batchCheckLayerAvailability(
      batchCheckLayerAvailabilityRequest: BatchCheckLayerAvailabilityRequest
  ): Task[BatchCheckLayerAvailabilityResponse] =
    Task.deferFuture {
      underlying.batchCheckLayerAvailability(batchCheckLayerAvailabilityRequest)
    }

  override def batchDeleteImage(batchDeleteImageRequest: BatchDeleteImageRequest): Task[BatchDeleteImageResponse] =
    Task.deferFuture {
      underlying.batchDeleteImage(batchDeleteImageRequest)
    }

  override def batchGetImage(batchGetImageRequest: BatchGetImageRequest): Task[BatchGetImageResponse] =
    Task.deferFuture {
      underlying.batchGetImage(batchGetImageRequest)
    }

  override def completeLayerUpload(
      completeLayerUploadRequest: CompleteLayerUploadRequest
  ): Task[CompleteLayerUploadResponse] =
    Task.deferFuture {
      underlying.completeLayerUpload(completeLayerUploadRequest)
    }

  override def createRepository(createRepositoryRequest: CreateRepositoryRequest): Task[CreateRepositoryResponse] =
    Task.deferFuture {
      underlying.createRepository(createRepositoryRequest)
    }

  override def deleteLifecyclePolicy(
      deleteLifecyclePolicyRequest: DeleteLifecyclePolicyRequest
  ): Task[DeleteLifecyclePolicyResponse] =
    Task.deferFuture {
      underlying.deleteLifecyclePolicy(deleteLifecyclePolicyRequest)
    }

  override def deleteRepository(deleteRepositoryRequest: DeleteRepositoryRequest): Task[DeleteRepositoryResponse] =
    Task.deferFuture {
      underlying.deleteRepository(deleteRepositoryRequest)
    }

  override def deleteRepositoryPolicy(
      deleteRepositoryPolicyRequest: DeleteRepositoryPolicyRequest
  ): Task[DeleteRepositoryPolicyResponse] =
    Task.deferFuture {
      underlying.deleteRepositoryPolicy(deleteRepositoryPolicyRequest)
    }

  override def describeImages(describeImagesRequest: DescribeImagesRequest): Task[DescribeImagesResponse] =
    Task.deferFuture {
      underlying.describeImages(describeImagesRequest)
    }

  def describeImagesPaginator(describeImagesRequest: DescribeImagesRequest): Observable[DescribeImagesResponse] =
    Observable.fromReactivePublisher(underlying.describeImagesPaginator(describeImagesRequest))

  override def describeRepositories(
      describeRepositoriesRequest: DescribeRepositoriesRequest
  ): Task[DescribeRepositoriesResponse] =
    Task.deferFuture {
      underlying.describeRepositories(describeRepositoriesRequest)
    }

  override def describeRepositories(): Task[DescribeRepositoriesResponse] =
    Task.deferFuture {
      underlying.describeRepositories()
    }

  def describeRepositoriesPaginator(): Observable[DescribeRepositoriesResponse] =
    Observable.fromReactivePublisher(underlying.describeRepositoriesPaginator())

  def describeRepositoriesPaginator(
      describeRepositoriesRequest: DescribeRepositoriesRequest
  ): Observable[DescribeRepositoriesResponse] =
    Observable.fromReactivePublisher(underlying.describeRepositoriesPaginator(describeRepositoriesRequest))

  override def getAuthorizationToken(
      getAuthorizationTokenRequest: GetAuthorizationTokenRequest
  ): Task[GetAuthorizationTokenResponse] =
    Task.deferFuture {
      underlying.getAuthorizationToken(getAuthorizationTokenRequest)
    }

  override def getAuthorizationToken(): Task[GetAuthorizationTokenResponse] =
    Task.deferFuture {
      underlying.getAuthorizationToken()
    }

  override def getDownloadUrlForLayer(
      getDownloadUrlForLayerRequest: GetDownloadUrlForLayerRequest
  ): Task[GetDownloadUrlForLayerResponse] =
    Task.deferFuture {
      underlying.getDownloadUrlForLayer(getDownloadUrlForLayerRequest)
    }

  override def getLifecyclePolicy(
      getLifecyclePolicyRequest: GetLifecyclePolicyRequest
  ): Task[GetLifecyclePolicyResponse] =
    Task.deferFuture {
      underlying.getLifecyclePolicy(getLifecyclePolicyRequest)
    }

  override def getLifecyclePolicyPreview(
      getLifecyclePolicyPreviewRequest: GetLifecyclePolicyPreviewRequest
  ): Task[GetLifecyclePolicyPreviewResponse] =
    Task.deferFuture {
      underlying.getLifecyclePolicyPreview(getLifecyclePolicyPreviewRequest)
    }

  override def getRepositoryPolicy(
      getRepositoryPolicyRequest: GetRepositoryPolicyRequest
  ): Task[GetRepositoryPolicyResponse] =
    Task.deferFuture {
      underlying.getRepositoryPolicy(getRepositoryPolicyRequest)
    }

  override def initiateLayerUpload(
      initiateLayerUploadRequest: InitiateLayerUploadRequest
  ): Task[InitiateLayerUploadResponse] =
    Task.deferFuture {
      underlying.initiateLayerUpload(initiateLayerUploadRequest)
    }

  override def listImages(listImagesRequest: ListImagesRequest): Task[ListImagesResponse] =
    Task.deferFuture {
      underlying.listImages(listImagesRequest)
    }

  def listImagesPaginator(listImagesRequest: ListImagesRequest): Observable[ListImagesResponse] =
    Observable.fromReactivePublisher(underlying.listImagesPaginator(listImagesRequest))

  override def listTagsForResource(
      listTagsForResourceRequest: ListTagsForResourceRequest
  ): Task[ListTagsForResourceResponse] =
    Task.deferFuture {
      underlying.listTagsForResource(listTagsForResourceRequest)
    }

  override def putImage(putImageRequest: PutImageRequest): Task[PutImageResponse] =
    Task.deferFuture {
      underlying.putImage(putImageRequest)
    }

  override def putLifecyclePolicy(
      putLifecyclePolicyRequest: PutLifecyclePolicyRequest
  ): Task[PutLifecyclePolicyResponse] =
    Task.deferFuture {
      underlying.putLifecyclePolicy(putLifecyclePolicyRequest)
    }

  override def setRepositoryPolicy(
      setRepositoryPolicyRequest: SetRepositoryPolicyRequest
  ): Task[SetRepositoryPolicyResponse] =
    Task.deferFuture {
      underlying.setRepositoryPolicy(setRepositoryPolicyRequest)
    }

  override def startLifecyclePolicyPreview(
      startLifecyclePolicyPreviewRequest: StartLifecyclePolicyPreviewRequest
  ): Task[StartLifecyclePolicyPreviewResponse] =
    Task.deferFuture {
      underlying.startLifecyclePolicyPreview(startLifecyclePolicyPreviewRequest)
    }

  override def tagResource(tagResourceRequest: TagResourceRequest): Task[TagResourceResponse] =
    Task.deferFuture {
      underlying.tagResource(tagResourceRequest)
    }

  override def untagResource(untagResourceRequest: UntagResourceRequest): Task[UntagResourceResponse] =
    Task.deferFuture {
      underlying.untagResource(untagResourceRequest)
    }

  override def uploadLayerPart(uploadLayerPartRequest: UploadLayerPartRequest): Task[UploadLayerPartResponse] =
    Task.deferFuture {
      underlying.uploadLayerPart(uploadLayerPartRequest)
    }

}
