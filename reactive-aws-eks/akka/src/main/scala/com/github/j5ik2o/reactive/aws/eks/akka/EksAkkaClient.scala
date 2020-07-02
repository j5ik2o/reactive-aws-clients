// Auto-Generated
package com.github.j5ik2o.reactive.aws.eks.akka

import akka.NotUsed
import akka.stream.scaladsl.{ Flow, Source }
import com.github.j5ik2o.reactive.aws.eks.EksAsyncClient
import software.amazon.awssdk.services.eks.model._
import software.amazon.awssdk.services.eks.paginators._

object EksAkkaClient {

  def apply(asyncClient: EksAsyncClient): EksAkkaClient =
    new EksAkkaClient {
      override val underlying: EksAsyncClient = asyncClient
    }

  val DefaultParallelism: Int = 1

}

trait EksAkkaClient {

  import EksAkkaClient._

  val underlying: EksAsyncClient

  def createClusterSource(
      createClusterRequest: CreateClusterRequest,
      parallelism: Int = DefaultParallelism
  ): Source[CreateClusterResponse, NotUsed] =
    Source.single(createClusterRequest).via(createClusterFlow(parallelism))

  def createClusterFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateClusterRequest, CreateClusterResponse, NotUsed] =
    Flow[CreateClusterRequest].mapAsync(parallelism) { createClusterRequest =>
      underlying.createCluster(createClusterRequest)
    }

  def createFargateProfileSource(
      createFargateProfileRequest: CreateFargateProfileRequest,
      parallelism: Int = DefaultParallelism
  ): Source[CreateFargateProfileResponse, NotUsed] =
    Source.single(createFargateProfileRequest).via(createFargateProfileFlow(parallelism))

  def createFargateProfileFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateFargateProfileRequest, CreateFargateProfileResponse, NotUsed] =
    Flow[CreateFargateProfileRequest].mapAsync(parallelism) { createFargateProfileRequest =>
      underlying.createFargateProfile(createFargateProfileRequest)
    }

  def createNodegroupSource(
      createNodegroupRequest: CreateNodegroupRequest,
      parallelism: Int = DefaultParallelism
  ): Source[CreateNodegroupResponse, NotUsed] =
    Source.single(createNodegroupRequest).via(createNodegroupFlow(parallelism))

  def createNodegroupFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateNodegroupRequest, CreateNodegroupResponse, NotUsed] =
    Flow[CreateNodegroupRequest].mapAsync(parallelism) { createNodegroupRequest =>
      underlying.createNodegroup(createNodegroupRequest)
    }

  def deleteClusterSource(
      deleteClusterRequest: DeleteClusterRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DeleteClusterResponse, NotUsed] =
    Source.single(deleteClusterRequest).via(deleteClusterFlow(parallelism))

  def deleteClusterFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteClusterRequest, DeleteClusterResponse, NotUsed] =
    Flow[DeleteClusterRequest].mapAsync(parallelism) { deleteClusterRequest =>
      underlying.deleteCluster(deleteClusterRequest)
    }

  def deleteFargateProfileSource(
      deleteFargateProfileRequest: DeleteFargateProfileRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DeleteFargateProfileResponse, NotUsed] =
    Source.single(deleteFargateProfileRequest).via(deleteFargateProfileFlow(parallelism))

  def deleteFargateProfileFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteFargateProfileRequest, DeleteFargateProfileResponse, NotUsed] =
    Flow[DeleteFargateProfileRequest].mapAsync(parallelism) { deleteFargateProfileRequest =>
      underlying.deleteFargateProfile(deleteFargateProfileRequest)
    }

  def deleteNodegroupSource(
      deleteNodegroupRequest: DeleteNodegroupRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DeleteNodegroupResponse, NotUsed] =
    Source.single(deleteNodegroupRequest).via(deleteNodegroupFlow(parallelism))

  def deleteNodegroupFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteNodegroupRequest, DeleteNodegroupResponse, NotUsed] =
    Flow[DeleteNodegroupRequest].mapAsync(parallelism) { deleteNodegroupRequest =>
      underlying.deleteNodegroup(deleteNodegroupRequest)
    }

  def describeClusterSource(
      describeClusterRequest: DescribeClusterRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeClusterResponse, NotUsed] =
    Source.single(describeClusterRequest).via(describeClusterFlow(parallelism))

  def describeClusterFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeClusterRequest, DescribeClusterResponse, NotUsed] =
    Flow[DescribeClusterRequest].mapAsync(parallelism) { describeClusterRequest =>
      underlying.describeCluster(describeClusterRequest)
    }

  def describeFargateProfileSource(
      describeFargateProfileRequest: DescribeFargateProfileRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeFargateProfileResponse, NotUsed] =
    Source.single(describeFargateProfileRequest).via(describeFargateProfileFlow(parallelism))

  def describeFargateProfileFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeFargateProfileRequest, DescribeFargateProfileResponse, NotUsed] =
    Flow[DescribeFargateProfileRequest].mapAsync(parallelism) { describeFargateProfileRequest =>
      underlying.describeFargateProfile(describeFargateProfileRequest)
    }

  def describeNodegroupSource(
      describeNodegroupRequest: DescribeNodegroupRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeNodegroupResponse, NotUsed] =
    Source.single(describeNodegroupRequest).via(describeNodegroupFlow(parallelism))

  def describeNodegroupFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeNodegroupRequest, DescribeNodegroupResponse, NotUsed] =
    Flow[DescribeNodegroupRequest].mapAsync(parallelism) { describeNodegroupRequest =>
      underlying.describeNodegroup(describeNodegroupRequest)
    }

  def describeUpdateSource(
      describeUpdateRequest: DescribeUpdateRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeUpdateResponse, NotUsed] =
    Source.single(describeUpdateRequest).via(describeUpdateFlow(parallelism))

  def describeUpdateFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeUpdateRequest, DescribeUpdateResponse, NotUsed] =
    Flow[DescribeUpdateRequest].mapAsync(parallelism) { describeUpdateRequest =>
      underlying.describeUpdate(describeUpdateRequest)
    }

  def listClustersSource(
      listClustersRequest: ListClustersRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ListClustersResponse, NotUsed] =
    Source.single(listClustersRequest).via(listClustersFlow(parallelism))

  def listClustersFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ListClustersRequest, ListClustersResponse, NotUsed] =
    Flow[ListClustersRequest].mapAsync(parallelism) { listClustersRequest =>
      underlying.listClusters(listClustersRequest)
    }

  def listClustersSource(): Source[ListClustersResponse, NotUsed] =
    Source.fromFuture(underlying.listClusters())

  def listClustersPaginatorSource: Source[ListClustersResponse, NotUsed] =
    Source.fromPublisher(underlying.listClustersPaginator())

  def listClustersPaginatorFlow: Flow[ListClustersRequest, ListClustersResponse, NotUsed] =
    Flow[ListClustersRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.listClustersPaginator(request))
    }

  def listFargateProfilesSource(
      listFargateProfilesRequest: ListFargateProfilesRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ListFargateProfilesResponse, NotUsed] =
    Source.single(listFargateProfilesRequest).via(listFargateProfilesFlow(parallelism))

  def listFargateProfilesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ListFargateProfilesRequest, ListFargateProfilesResponse, NotUsed] =
    Flow[ListFargateProfilesRequest].mapAsync(parallelism) { listFargateProfilesRequest =>
      underlying.listFargateProfiles(listFargateProfilesRequest)
    }

  def listFargateProfilesPaginatorFlow: Flow[ListFargateProfilesRequest, ListFargateProfilesResponse, NotUsed] =
    Flow[ListFargateProfilesRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.listFargateProfilesPaginator(request))
    }

  def listNodegroupsSource(
      listNodegroupsRequest: ListNodegroupsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ListNodegroupsResponse, NotUsed] =
    Source.single(listNodegroupsRequest).via(listNodegroupsFlow(parallelism))

  def listNodegroupsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ListNodegroupsRequest, ListNodegroupsResponse, NotUsed] =
    Flow[ListNodegroupsRequest].mapAsync(parallelism) { listNodegroupsRequest =>
      underlying.listNodegroups(listNodegroupsRequest)
    }

  def listNodegroupsPaginatorFlow: Flow[ListNodegroupsRequest, ListNodegroupsResponse, NotUsed] =
    Flow[ListNodegroupsRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.listNodegroupsPaginator(request))
    }

  def listTagsForResourceSource(
      listTagsForResourceRequest: ListTagsForResourceRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ListTagsForResourceResponse, NotUsed] =
    Source.single(listTagsForResourceRequest).via(listTagsForResourceFlow(parallelism))

  def listTagsForResourceFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ListTagsForResourceRequest, ListTagsForResourceResponse, NotUsed] =
    Flow[ListTagsForResourceRequest].mapAsync(parallelism) { listTagsForResourceRequest =>
      underlying.listTagsForResource(listTagsForResourceRequest)
    }

  def listUpdatesSource(
      listUpdatesRequest: ListUpdatesRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ListUpdatesResponse, NotUsed] =
    Source.single(listUpdatesRequest).via(listUpdatesFlow(parallelism))

  def listUpdatesFlow(parallelism: Int = DefaultParallelism): Flow[ListUpdatesRequest, ListUpdatesResponse, NotUsed] =
    Flow[ListUpdatesRequest].mapAsync(parallelism) { listUpdatesRequest =>
      underlying.listUpdates(listUpdatesRequest)
    }

  def listUpdatesPaginatorFlow: Flow[ListUpdatesRequest, ListUpdatesResponse, NotUsed] =
    Flow[ListUpdatesRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.listUpdatesPaginator(request))
    }

  def tagResourceSource(
      tagResourceRequest: TagResourceRequest,
      parallelism: Int = DefaultParallelism
  ): Source[TagResourceResponse, NotUsed] =
    Source.single(tagResourceRequest).via(tagResourceFlow(parallelism))

  def tagResourceFlow(parallelism: Int = DefaultParallelism): Flow[TagResourceRequest, TagResourceResponse, NotUsed] =
    Flow[TagResourceRequest].mapAsync(parallelism) { tagResourceRequest =>
      underlying.tagResource(tagResourceRequest)
    }

  def untagResourceSource(
      untagResourceRequest: UntagResourceRequest,
      parallelism: Int = DefaultParallelism
  ): Source[UntagResourceResponse, NotUsed] =
    Source.single(untagResourceRequest).via(untagResourceFlow(parallelism))

  def untagResourceFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[UntagResourceRequest, UntagResourceResponse, NotUsed] =
    Flow[UntagResourceRequest].mapAsync(parallelism) { untagResourceRequest =>
      underlying.untagResource(untagResourceRequest)
    }

  def updateClusterConfigSource(
      updateClusterConfigRequest: UpdateClusterConfigRequest,
      parallelism: Int = DefaultParallelism
  ): Source[UpdateClusterConfigResponse, NotUsed] =
    Source.single(updateClusterConfigRequest).via(updateClusterConfigFlow(parallelism))

  def updateClusterConfigFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[UpdateClusterConfigRequest, UpdateClusterConfigResponse, NotUsed] =
    Flow[UpdateClusterConfigRequest].mapAsync(parallelism) { updateClusterConfigRequest =>
      underlying.updateClusterConfig(updateClusterConfigRequest)
    }

  def updateClusterVersionSource(
      updateClusterVersionRequest: UpdateClusterVersionRequest,
      parallelism: Int = DefaultParallelism
  ): Source[UpdateClusterVersionResponse, NotUsed] =
    Source.single(updateClusterVersionRequest).via(updateClusterVersionFlow(parallelism))

  def updateClusterVersionFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[UpdateClusterVersionRequest, UpdateClusterVersionResponse, NotUsed] =
    Flow[UpdateClusterVersionRequest].mapAsync(parallelism) { updateClusterVersionRequest =>
      underlying.updateClusterVersion(updateClusterVersionRequest)
    }

  def updateNodegroupConfigSource(
      updateNodegroupConfigRequest: UpdateNodegroupConfigRequest,
      parallelism: Int = DefaultParallelism
  ): Source[UpdateNodegroupConfigResponse, NotUsed] =
    Source.single(updateNodegroupConfigRequest).via(updateNodegroupConfigFlow(parallelism))

  def updateNodegroupConfigFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[UpdateNodegroupConfigRequest, UpdateNodegroupConfigResponse, NotUsed] =
    Flow[UpdateNodegroupConfigRequest].mapAsync(parallelism) { updateNodegroupConfigRequest =>
      underlying.updateNodegroupConfig(updateNodegroupConfigRequest)
    }

  def updateNodegroupVersionSource(
      updateNodegroupVersionRequest: UpdateNodegroupVersionRequest,
      parallelism: Int = DefaultParallelism
  ): Source[UpdateNodegroupVersionResponse, NotUsed] =
    Source.single(updateNodegroupVersionRequest).via(updateNodegroupVersionFlow(parallelism))

  def updateNodegroupVersionFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[UpdateNodegroupVersionRequest, UpdateNodegroupVersionResponse, NotUsed] =
    Flow[UpdateNodegroupVersionRequest].mapAsync(parallelism) { updateNodegroupVersionRequest =>
      underlying.updateNodegroupVersion(updateNodegroupVersionRequest)
    }

}
