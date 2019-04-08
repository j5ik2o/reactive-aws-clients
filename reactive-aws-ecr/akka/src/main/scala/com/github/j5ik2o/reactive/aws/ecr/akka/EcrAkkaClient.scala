// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.akka

import akka.NotUsed
import akka.stream.scaladsl.{ Flow, Source }
import com.github.j5ik2o.reactive.aws.ecr.EcrAsyncClient
import software.amazon.awssdk.services.ecr.model._

object EcrAkkaClient {

  def apply(asyncClient: EcrAsyncClient): EcrAkkaClient = new EcrAkkaClient {
    override val underlying: EcrAsyncClient = asyncClient
  }

  val DefaultParallelism: Int = 1

}

trait EcrAkkaClient {

  import EcrAkkaClient._

  val underlying: EcrAsyncClient

  def batchCheckLayerAvailabilitySource(
      batchCheckLayerAvailabilityRequest: BatchCheckLayerAvailabilityRequest,
      parallelism: Int = DefaultParallelism
  ): Source[BatchCheckLayerAvailabilityResponse, NotUsed] =
    Source.single(batchCheckLayerAvailabilityRequest).via(batchCheckLayerAvailabilityFlow(parallelism))

  def batchCheckLayerAvailabilityFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[BatchCheckLayerAvailabilityRequest, BatchCheckLayerAvailabilityResponse, NotUsed] =
    Flow[BatchCheckLayerAvailabilityRequest].mapAsync(parallelism) { batchCheckLayerAvailabilityRequest =>
      underlying.batchCheckLayerAvailability(batchCheckLayerAvailabilityRequest)
    }

  def batchDeleteImageSource(batchDeleteImageRequest: BatchDeleteImageRequest,
                             parallelism: Int = DefaultParallelism): Source[BatchDeleteImageResponse, NotUsed] =
    Source.single(batchDeleteImageRequest).via(batchDeleteImageFlow(parallelism))

  def batchDeleteImageFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[BatchDeleteImageRequest, BatchDeleteImageResponse, NotUsed] =
    Flow[BatchDeleteImageRequest].mapAsync(parallelism) { batchDeleteImageRequest =>
      underlying.batchDeleteImage(batchDeleteImageRequest)
    }

  def batchGetImageSource(batchGetImageRequest: BatchGetImageRequest,
                          parallelism: Int = DefaultParallelism): Source[BatchGetImageResponse, NotUsed] =
    Source.single(batchGetImageRequest).via(batchGetImageFlow(parallelism))

  def batchGetImageFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[BatchGetImageRequest, BatchGetImageResponse, NotUsed] =
    Flow[BatchGetImageRequest].mapAsync(parallelism) { batchGetImageRequest =>
      underlying.batchGetImage(batchGetImageRequest)
    }

  def completeLayerUploadSource(completeLayerUploadRequest: CompleteLayerUploadRequest,
                                parallelism: Int = DefaultParallelism): Source[CompleteLayerUploadResponse, NotUsed] =
    Source.single(completeLayerUploadRequest).via(completeLayerUploadFlow(parallelism))

  def completeLayerUploadFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CompleteLayerUploadRequest, CompleteLayerUploadResponse, NotUsed] =
    Flow[CompleteLayerUploadRequest].mapAsync(parallelism) { completeLayerUploadRequest =>
      underlying.completeLayerUpload(completeLayerUploadRequest)
    }

  def createRepositorySource(createRepositoryRequest: CreateRepositoryRequest,
                             parallelism: Int = DefaultParallelism): Source[CreateRepositoryResponse, NotUsed] =
    Source.single(createRepositoryRequest).via(createRepositoryFlow(parallelism))

  def createRepositoryFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateRepositoryRequest, CreateRepositoryResponse, NotUsed] =
    Flow[CreateRepositoryRequest].mapAsync(parallelism) { createRepositoryRequest =>
      underlying.createRepository(createRepositoryRequest)
    }

  def deleteLifecyclePolicySource(
      deleteLifecyclePolicyRequest: DeleteLifecyclePolicyRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DeleteLifecyclePolicyResponse, NotUsed] =
    Source.single(deleteLifecyclePolicyRequest).via(deleteLifecyclePolicyFlow(parallelism))

  def deleteLifecyclePolicyFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteLifecyclePolicyRequest, DeleteLifecyclePolicyResponse, NotUsed] =
    Flow[DeleteLifecyclePolicyRequest].mapAsync(parallelism) { deleteLifecyclePolicyRequest =>
      underlying.deleteLifecyclePolicy(deleteLifecyclePolicyRequest)
    }

  def deleteRepositorySource(deleteRepositoryRequest: DeleteRepositoryRequest,
                             parallelism: Int = DefaultParallelism): Source[DeleteRepositoryResponse, NotUsed] =
    Source.single(deleteRepositoryRequest).via(deleteRepositoryFlow(parallelism))

  def deleteRepositoryFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteRepositoryRequest, DeleteRepositoryResponse, NotUsed] =
    Flow[DeleteRepositoryRequest].mapAsync(parallelism) { deleteRepositoryRequest =>
      underlying.deleteRepository(deleteRepositoryRequest)
    }

  def deleteRepositoryPolicySource(
      deleteRepositoryPolicyRequest: DeleteRepositoryPolicyRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DeleteRepositoryPolicyResponse, NotUsed] =
    Source.single(deleteRepositoryPolicyRequest).via(deleteRepositoryPolicyFlow(parallelism))

  def deleteRepositoryPolicyFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteRepositoryPolicyRequest, DeleteRepositoryPolicyResponse, NotUsed] =
    Flow[DeleteRepositoryPolicyRequest].mapAsync(parallelism) { deleteRepositoryPolicyRequest =>
      underlying.deleteRepositoryPolicy(deleteRepositoryPolicyRequest)
    }

  def describeImagesSource(describeImagesRequest: DescribeImagesRequest,
                           parallelism: Int = DefaultParallelism): Source[DescribeImagesResponse, NotUsed] =
    Source.single(describeImagesRequest).via(describeImagesFlow(parallelism))

  def describeImagesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeImagesRequest, DescribeImagesResponse, NotUsed] =
    Flow[DescribeImagesRequest].mapAsync(parallelism) { describeImagesRequest =>
      underlying.describeImages(describeImagesRequest)
    }

  def describeImagesPaginatorFlow: Flow[DescribeImagesRequest, DescribeImagesResponse, NotUsed] =
    Flow[DescribeImagesRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.describeImagesPaginator(request))
    }

  def describeRepositoriesSource(describeRepositoriesRequest: DescribeRepositoriesRequest,
                                 parallelism: Int = DefaultParallelism): Source[DescribeRepositoriesResponse, NotUsed] =
    Source.single(describeRepositoriesRequest).via(describeRepositoriesFlow(parallelism))

  def describeRepositoriesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeRepositoriesRequest, DescribeRepositoriesResponse, NotUsed] =
    Flow[DescribeRepositoriesRequest].mapAsync(parallelism) { describeRepositoriesRequest =>
      underlying.describeRepositories(describeRepositoriesRequest)
    }

  def describeRepositoriesSource(): Source[DescribeRepositoriesResponse, NotUsed] =
    Source.fromFuture(underlying.describeRepositories())

  def describeRepositoriesPaginatorSource: Source[DescribeRepositoriesResponse, NotUsed] =
    Source.fromPublisher(underlying.describeRepositoriesPaginator())

  def describeRepositoriesPaginatorFlow: Flow[DescribeRepositoriesRequest, DescribeRepositoriesResponse, NotUsed] =
    Flow[DescribeRepositoriesRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.describeRepositoriesPaginator(request))
    }

  def getAuthorizationTokenSource(
      getAuthorizationTokenRequest: GetAuthorizationTokenRequest,
      parallelism: Int = DefaultParallelism
  ): Source[GetAuthorizationTokenResponse, NotUsed] =
    Source.single(getAuthorizationTokenRequest).via(getAuthorizationTokenFlow(parallelism))

  def getAuthorizationTokenFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetAuthorizationTokenRequest, GetAuthorizationTokenResponse, NotUsed] =
    Flow[GetAuthorizationTokenRequest].mapAsync(parallelism) { getAuthorizationTokenRequest =>
      underlying.getAuthorizationToken(getAuthorizationTokenRequest)
    }

  def getAuthorizationTokenSource(): Source[GetAuthorizationTokenResponse, NotUsed] =
    Source.fromFuture(underlying.getAuthorizationToken())

  def getDownloadUrlForLayerSource(
      getDownloadUrlForLayerRequest: GetDownloadUrlForLayerRequest,
      parallelism: Int = DefaultParallelism
  ): Source[GetDownloadUrlForLayerResponse, NotUsed] =
    Source.single(getDownloadUrlForLayerRequest).via(getDownloadUrlForLayerFlow(parallelism))

  def getDownloadUrlForLayerFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetDownloadUrlForLayerRequest, GetDownloadUrlForLayerResponse, NotUsed] =
    Flow[GetDownloadUrlForLayerRequest].mapAsync(parallelism) { getDownloadUrlForLayerRequest =>
      underlying.getDownloadUrlForLayer(getDownloadUrlForLayerRequest)
    }

  def getLifecyclePolicySource(getLifecyclePolicyRequest: GetLifecyclePolicyRequest,
                               parallelism: Int = DefaultParallelism): Source[GetLifecyclePolicyResponse, NotUsed] =
    Source.single(getLifecyclePolicyRequest).via(getLifecyclePolicyFlow(parallelism))

  def getLifecyclePolicyFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetLifecyclePolicyRequest, GetLifecyclePolicyResponse, NotUsed] =
    Flow[GetLifecyclePolicyRequest].mapAsync(parallelism) { getLifecyclePolicyRequest =>
      underlying.getLifecyclePolicy(getLifecyclePolicyRequest)
    }

  def getLifecyclePolicyPreviewSource(
      getLifecyclePolicyPreviewRequest: GetLifecyclePolicyPreviewRequest,
      parallelism: Int = DefaultParallelism
  ): Source[GetLifecyclePolicyPreviewResponse, NotUsed] =
    Source.single(getLifecyclePolicyPreviewRequest).via(getLifecyclePolicyPreviewFlow(parallelism))

  def getLifecyclePolicyPreviewFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetLifecyclePolicyPreviewRequest, GetLifecyclePolicyPreviewResponse, NotUsed] =
    Flow[GetLifecyclePolicyPreviewRequest].mapAsync(parallelism) { getLifecyclePolicyPreviewRequest =>
      underlying.getLifecyclePolicyPreview(getLifecyclePolicyPreviewRequest)
    }

  def getRepositoryPolicySource(getRepositoryPolicyRequest: GetRepositoryPolicyRequest,
                                parallelism: Int = DefaultParallelism): Source[GetRepositoryPolicyResponse, NotUsed] =
    Source.single(getRepositoryPolicyRequest).via(getRepositoryPolicyFlow(parallelism))

  def getRepositoryPolicyFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetRepositoryPolicyRequest, GetRepositoryPolicyResponse, NotUsed] =
    Flow[GetRepositoryPolicyRequest].mapAsync(parallelism) { getRepositoryPolicyRequest =>
      underlying.getRepositoryPolicy(getRepositoryPolicyRequest)
    }

  def initiateLayerUploadSource(initiateLayerUploadRequest: InitiateLayerUploadRequest,
                                parallelism: Int = DefaultParallelism): Source[InitiateLayerUploadResponse, NotUsed] =
    Source.single(initiateLayerUploadRequest).via(initiateLayerUploadFlow(parallelism))

  def initiateLayerUploadFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[InitiateLayerUploadRequest, InitiateLayerUploadResponse, NotUsed] =
    Flow[InitiateLayerUploadRequest].mapAsync(parallelism) { initiateLayerUploadRequest =>
      underlying.initiateLayerUpload(initiateLayerUploadRequest)
    }

  def listImagesSource(listImagesRequest: ListImagesRequest,
                       parallelism: Int = DefaultParallelism): Source[ListImagesResponse, NotUsed] =
    Source.single(listImagesRequest).via(listImagesFlow(parallelism))

  def listImagesFlow(parallelism: Int = DefaultParallelism): Flow[ListImagesRequest, ListImagesResponse, NotUsed] =
    Flow[ListImagesRequest].mapAsync(parallelism) { listImagesRequest =>
      underlying.listImages(listImagesRequest)
    }

  def listImagesPaginatorFlow: Flow[ListImagesRequest, ListImagesResponse, NotUsed] =
    Flow[ListImagesRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.listImagesPaginator(request))
    }

  def listTagsForResourceSource(listTagsForResourceRequest: ListTagsForResourceRequest,
                                parallelism: Int = DefaultParallelism): Source[ListTagsForResourceResponse, NotUsed] =
    Source.single(listTagsForResourceRequest).via(listTagsForResourceFlow(parallelism))

  def listTagsForResourceFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ListTagsForResourceRequest, ListTagsForResourceResponse, NotUsed] =
    Flow[ListTagsForResourceRequest].mapAsync(parallelism) { listTagsForResourceRequest =>
      underlying.listTagsForResource(listTagsForResourceRequest)
    }

  def putImageSource(putImageRequest: PutImageRequest,
                     parallelism: Int = DefaultParallelism): Source[PutImageResponse, NotUsed] =
    Source.single(putImageRequest).via(putImageFlow(parallelism))

  def putImageFlow(parallelism: Int = DefaultParallelism): Flow[PutImageRequest, PutImageResponse, NotUsed] =
    Flow[PutImageRequest].mapAsync(parallelism) { putImageRequest =>
      underlying.putImage(putImageRequest)
    }

  def putLifecyclePolicySource(putLifecyclePolicyRequest: PutLifecyclePolicyRequest,
                               parallelism: Int = DefaultParallelism): Source[PutLifecyclePolicyResponse, NotUsed] =
    Source.single(putLifecyclePolicyRequest).via(putLifecyclePolicyFlow(parallelism))

  def putLifecyclePolicyFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[PutLifecyclePolicyRequest, PutLifecyclePolicyResponse, NotUsed] =
    Flow[PutLifecyclePolicyRequest].mapAsync(parallelism) { putLifecyclePolicyRequest =>
      underlying.putLifecyclePolicy(putLifecyclePolicyRequest)
    }

  def setRepositoryPolicySource(setRepositoryPolicyRequest: SetRepositoryPolicyRequest,
                                parallelism: Int = DefaultParallelism): Source[SetRepositoryPolicyResponse, NotUsed] =
    Source.single(setRepositoryPolicyRequest).via(setRepositoryPolicyFlow(parallelism))

  def setRepositoryPolicyFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[SetRepositoryPolicyRequest, SetRepositoryPolicyResponse, NotUsed] =
    Flow[SetRepositoryPolicyRequest].mapAsync(parallelism) { setRepositoryPolicyRequest =>
      underlying.setRepositoryPolicy(setRepositoryPolicyRequest)
    }

  def startLifecyclePolicyPreviewSource(
      startLifecyclePolicyPreviewRequest: StartLifecyclePolicyPreviewRequest,
      parallelism: Int = DefaultParallelism
  ): Source[StartLifecyclePolicyPreviewResponse, NotUsed] =
    Source.single(startLifecyclePolicyPreviewRequest).via(startLifecyclePolicyPreviewFlow(parallelism))

  def startLifecyclePolicyPreviewFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[StartLifecyclePolicyPreviewRequest, StartLifecyclePolicyPreviewResponse, NotUsed] =
    Flow[StartLifecyclePolicyPreviewRequest].mapAsync(parallelism) { startLifecyclePolicyPreviewRequest =>
      underlying.startLifecyclePolicyPreview(startLifecyclePolicyPreviewRequest)
    }

  def tagResourceSource(tagResourceRequest: TagResourceRequest,
                        parallelism: Int = DefaultParallelism): Source[TagResourceResponse, NotUsed] =
    Source.single(tagResourceRequest).via(tagResourceFlow(parallelism))

  def tagResourceFlow(parallelism: Int = DefaultParallelism): Flow[TagResourceRequest, TagResourceResponse, NotUsed] =
    Flow[TagResourceRequest].mapAsync(parallelism) { tagResourceRequest =>
      underlying.tagResource(tagResourceRequest)
    }

  def untagResourceSource(untagResourceRequest: UntagResourceRequest,
                          parallelism: Int = DefaultParallelism): Source[UntagResourceResponse, NotUsed] =
    Source.single(untagResourceRequest).via(untagResourceFlow(parallelism))

  def untagResourceFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[UntagResourceRequest, UntagResourceResponse, NotUsed] =
    Flow[UntagResourceRequest].mapAsync(parallelism) { untagResourceRequest =>
      underlying.untagResource(untagResourceRequest)
    }

  def uploadLayerPartSource(uploadLayerPartRequest: UploadLayerPartRequest,
                            parallelism: Int = DefaultParallelism): Source[UploadLayerPartResponse, NotUsed] =
    Source.single(uploadLayerPartRequest).via(uploadLayerPartFlow(parallelism))

  def uploadLayerPartFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[UploadLayerPartRequest, UploadLayerPartResponse, NotUsed] =
    Flow[UploadLayerPartRequest].mapAsync(parallelism) { uploadLayerPartRequest =>
      underlying.uploadLayerPart(uploadLayerPartRequest)
    }

}
