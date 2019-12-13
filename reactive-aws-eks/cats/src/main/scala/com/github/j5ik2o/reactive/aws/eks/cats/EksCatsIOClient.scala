// Auto-Generated
package com.github.j5ik2o.reactive.aws.eks.cats

import cats.effect.{ ContextShift, IO }
import com.github.j5ik2o.reactive.aws.eks.{ EksAsyncClient, EksClient }
import software.amazon.awssdk.services.eks.model._
import software.amazon.awssdk.services.eks.paginators._

import scala.concurrent.{ ExecutionContext, Future }

object EksCatsIOClient {

  def apply(asyncClient: EksAsyncClient)(implicit ec: ExecutionContext): EksCatsIOClient = new EksCatsIOClient {
    override def executionContext: ExecutionContext = ec
    override val underlying: EksAsyncClient         = asyncClient
  }

}

trait EksCatsIOClient extends EksClient[IO] {

  val underlying: EksAsyncClient

  def executionContext: ExecutionContext
  implicit def cs: ContextShift[IO] = IO.contextShift(executionContext)

  override def createCluster(createClusterRequest: CreateClusterRequest): IO[CreateClusterResponse] =
    IO.fromFuture {
      IO(underlying.createCluster(createClusterRequest))
    }

  override def createFargateProfile(
      createFargateProfileRequest: CreateFargateProfileRequest
  ): IO[CreateFargateProfileResponse] =
    IO.fromFuture {
      IO(underlying.createFargateProfile(createFargateProfileRequest))
    }

  override def createNodegroup(createNodegroupRequest: CreateNodegroupRequest): IO[CreateNodegroupResponse] =
    IO.fromFuture {
      IO(underlying.createNodegroup(createNodegroupRequest))
    }

  override def deleteCluster(deleteClusterRequest: DeleteClusterRequest): IO[DeleteClusterResponse] =
    IO.fromFuture {
      IO(underlying.deleteCluster(deleteClusterRequest))
    }

  override def deleteFargateProfile(
      deleteFargateProfileRequest: DeleteFargateProfileRequest
  ): IO[DeleteFargateProfileResponse] =
    IO.fromFuture {
      IO(underlying.deleteFargateProfile(deleteFargateProfileRequest))
    }

  override def deleteNodegroup(deleteNodegroupRequest: DeleteNodegroupRequest): IO[DeleteNodegroupResponse] =
    IO.fromFuture {
      IO(underlying.deleteNodegroup(deleteNodegroupRequest))
    }

  override def describeCluster(describeClusterRequest: DescribeClusterRequest): IO[DescribeClusterResponse] =
    IO.fromFuture {
      IO(underlying.describeCluster(describeClusterRequest))
    }

  override def describeFargateProfile(
      describeFargateProfileRequest: DescribeFargateProfileRequest
  ): IO[DescribeFargateProfileResponse] =
    IO.fromFuture {
      IO(underlying.describeFargateProfile(describeFargateProfileRequest))
    }

  override def describeNodegroup(describeNodegroupRequest: DescribeNodegroupRequest): IO[DescribeNodegroupResponse] =
    IO.fromFuture {
      IO(underlying.describeNodegroup(describeNodegroupRequest))
    }

  override def describeUpdate(describeUpdateRequest: DescribeUpdateRequest): IO[DescribeUpdateResponse] =
    IO.fromFuture {
      IO(underlying.describeUpdate(describeUpdateRequest))
    }

  override def listClusters(listClustersRequest: ListClustersRequest): IO[ListClustersResponse] =
    IO.fromFuture {
      IO(underlying.listClusters(listClustersRequest))
    }

  override def listClusters(): IO[ListClustersResponse] =
    IO.fromFuture {
      IO(underlying.listClusters())
    }

  def listClustersPaginator(): ListClustersPublisher =
    underlying.listClustersPaginator()

  def listClustersPaginator(listClustersRequest: ListClustersRequest): ListClustersPublisher =
    underlying.listClustersPaginator(listClustersRequest)

  override def listFargateProfiles(
      listFargateProfilesRequest: ListFargateProfilesRequest
  ): IO[ListFargateProfilesResponse] =
    IO.fromFuture {
      IO(underlying.listFargateProfiles(listFargateProfilesRequest))
    }

  def listFargateProfilesPaginator(
      listFargateProfilesRequest: ListFargateProfilesRequest
  ): ListFargateProfilesPublisher =
    underlying.listFargateProfilesPaginator(listFargateProfilesRequest)

  override def listNodegroups(listNodegroupsRequest: ListNodegroupsRequest): IO[ListNodegroupsResponse] =
    IO.fromFuture {
      IO(underlying.listNodegroups(listNodegroupsRequest))
    }

  def listNodegroupsPaginator(listNodegroupsRequest: ListNodegroupsRequest): ListNodegroupsPublisher =
    underlying.listNodegroupsPaginator(listNodegroupsRequest)

  override def listTagsForResource(
      listTagsForResourceRequest: ListTagsForResourceRequest
  ): IO[ListTagsForResourceResponse] =
    IO.fromFuture {
      IO(underlying.listTagsForResource(listTagsForResourceRequest))
    }

  override def listUpdates(listUpdatesRequest: ListUpdatesRequest): IO[ListUpdatesResponse] =
    IO.fromFuture {
      IO(underlying.listUpdates(listUpdatesRequest))
    }

  def listUpdatesPaginator(listUpdatesRequest: ListUpdatesRequest): ListUpdatesPublisher =
    underlying.listUpdatesPaginator(listUpdatesRequest)

  override def tagResource(tagResourceRequest: TagResourceRequest): IO[TagResourceResponse] =
    IO.fromFuture {
      IO(underlying.tagResource(tagResourceRequest))
    }

  override def untagResource(untagResourceRequest: UntagResourceRequest): IO[UntagResourceResponse] =
    IO.fromFuture {
      IO(underlying.untagResource(untagResourceRequest))
    }

  override def updateClusterConfig(
      updateClusterConfigRequest: UpdateClusterConfigRequest
  ): IO[UpdateClusterConfigResponse] =
    IO.fromFuture {
      IO(underlying.updateClusterConfig(updateClusterConfigRequest))
    }

  override def updateClusterVersion(
      updateClusterVersionRequest: UpdateClusterVersionRequest
  ): IO[UpdateClusterVersionResponse] =
    IO.fromFuture {
      IO(underlying.updateClusterVersion(updateClusterVersionRequest))
    }

  override def updateNodegroupConfig(
      updateNodegroupConfigRequest: UpdateNodegroupConfigRequest
  ): IO[UpdateNodegroupConfigResponse] =
    IO.fromFuture {
      IO(underlying.updateNodegroupConfig(updateNodegroupConfigRequest))
    }

  override def updateNodegroupVersion(
      updateNodegroupVersionRequest: UpdateNodegroupVersionRequest
  ): IO[UpdateNodegroupVersionResponse] =
    IO.fromFuture {
      IO(underlying.updateNodegroupVersion(updateNodegroupVersionRequest))
    }

}
