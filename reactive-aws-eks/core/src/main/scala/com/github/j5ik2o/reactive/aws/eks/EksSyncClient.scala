// Auto-Generated
package com.github.j5ik2o.reactive.aws.eks

import com.github.j5ik2o.reactive.aws.utils.ToEitherSupport
import software.amazon.awssdk.services.eks.model._
import software.amazon.awssdk.services.eks.paginators._
import software.amazon.awssdk.services.eks.{ EksClient => JavaEksSyncClient }

object EksSyncClient extends ToEitherSupport {

  def apply(javaClient: JavaEksSyncClient): EksSyncClient =
    new EksSyncClient {
      override val underlying: JavaEksSyncClient = javaClient
    }
}

/**
  * @see https://sdk.amazonaws.com/java/api/latest/software/amazon/awssdk/services/eks/EksClient.html */
trait EksSyncClient extends EksClient[Either[Throwable, ?]] {
  val underlying: JavaEksSyncClient

  import EksSyncClient._

  override def createCluster(createClusterRequest: CreateClusterRequest): Either[Throwable, CreateClusterResponse] =
    underlying.createCluster(createClusterRequest).toEither

  override def createFargateProfile(
      createFargateProfileRequest: CreateFargateProfileRequest
  ): Either[Throwable, CreateFargateProfileResponse] =
    underlying.createFargateProfile(createFargateProfileRequest).toEither

  override def createNodegroup(
      createNodegroupRequest: CreateNodegroupRequest
  ): Either[Throwable, CreateNodegroupResponse] =
    underlying.createNodegroup(createNodegroupRequest).toEither

  override def deleteCluster(deleteClusterRequest: DeleteClusterRequest): Either[Throwable, DeleteClusterResponse] =
    underlying.deleteCluster(deleteClusterRequest).toEither

  override def deleteFargateProfile(
      deleteFargateProfileRequest: DeleteFargateProfileRequest
  ): Either[Throwable, DeleteFargateProfileResponse] =
    underlying.deleteFargateProfile(deleteFargateProfileRequest).toEither

  override def deleteNodegroup(
      deleteNodegroupRequest: DeleteNodegroupRequest
  ): Either[Throwable, DeleteNodegroupResponse] =
    underlying.deleteNodegroup(deleteNodegroupRequest).toEither

  override def describeCluster(
      describeClusterRequest: DescribeClusterRequest
  ): Either[Throwable, DescribeClusterResponse] =
    underlying.describeCluster(describeClusterRequest).toEither

  override def describeFargateProfile(
      describeFargateProfileRequest: DescribeFargateProfileRequest
  ): Either[Throwable, DescribeFargateProfileResponse] =
    underlying.describeFargateProfile(describeFargateProfileRequest).toEither

  override def describeNodegroup(
      describeNodegroupRequest: DescribeNodegroupRequest
  ): Either[Throwable, DescribeNodegroupResponse] =
    underlying.describeNodegroup(describeNodegroupRequest).toEither

  override def describeUpdate(describeUpdateRequest: DescribeUpdateRequest): Either[Throwable, DescribeUpdateResponse] =
    underlying.describeUpdate(describeUpdateRequest).toEither

  override def listClusters(): Either[Throwable, ListClustersResponse] =
    underlying.listClusters().toEither

  override def listClusters(listClustersRequest: ListClustersRequest): Either[Throwable, ListClustersResponse] =
    underlying.listClusters(listClustersRequest).toEither

  def listClustersPaginator(): ListClustersIterable =
    underlying.listClustersPaginator()

  def listClustersPaginator(listClustersRequest: ListClustersRequest): ListClustersIterable =
    underlying.listClustersPaginator(listClustersRequest)

  override def listFargateProfiles(
      listFargateProfilesRequest: ListFargateProfilesRequest
  ): Either[Throwable, ListFargateProfilesResponse] =
    underlying.listFargateProfiles(listFargateProfilesRequest).toEither

  def listFargateProfilesPaginator(
      listFargateProfilesRequest: ListFargateProfilesRequest
  ): ListFargateProfilesIterable =
    underlying.listFargateProfilesPaginator(listFargateProfilesRequest)

  override def listNodegroups(listNodegroupsRequest: ListNodegroupsRequest): Either[Throwable, ListNodegroupsResponse] =
    underlying.listNodegroups(listNodegroupsRequest).toEither

  def listNodegroupsPaginator(listNodegroupsRequest: ListNodegroupsRequest): ListNodegroupsIterable =
    underlying.listNodegroupsPaginator(listNodegroupsRequest)

  override def listTagsForResource(
      listTagsForResourceRequest: ListTagsForResourceRequest
  ): Either[Throwable, ListTagsForResourceResponse] =
    underlying.listTagsForResource(listTagsForResourceRequest).toEither

  override def listUpdates(listUpdatesRequest: ListUpdatesRequest): Either[Throwable, ListUpdatesResponse] =
    underlying.listUpdates(listUpdatesRequest).toEither

  def listUpdatesPaginator(listUpdatesRequest: ListUpdatesRequest): ListUpdatesIterable =
    underlying.listUpdatesPaginator(listUpdatesRequest)

  override def tagResource(tagResourceRequest: TagResourceRequest): Either[Throwable, TagResourceResponse] =
    underlying.tagResource(tagResourceRequest).toEither

  override def untagResource(untagResourceRequest: UntagResourceRequest): Either[Throwable, UntagResourceResponse] =
    underlying.untagResource(untagResourceRequest).toEither

  override def updateClusterConfig(
      updateClusterConfigRequest: UpdateClusterConfigRequest
  ): Either[Throwable, UpdateClusterConfigResponse] =
    underlying.updateClusterConfig(updateClusterConfigRequest).toEither

  override def updateClusterVersion(
      updateClusterVersionRequest: UpdateClusterVersionRequest
  ): Either[Throwable, UpdateClusterVersionResponse] =
    underlying.updateClusterVersion(updateClusterVersionRequest).toEither

  override def updateNodegroupConfig(
      updateNodegroupConfigRequest: UpdateNodegroupConfigRequest
  ): Either[Throwable, UpdateNodegroupConfigResponse] =
    underlying.updateNodegroupConfig(updateNodegroupConfigRequest).toEither

  override def updateNodegroupVersion(
      updateNodegroupVersionRequest: UpdateNodegroupVersionRequest
  ): Either[Throwable, UpdateNodegroupVersionResponse] =
    underlying.updateNodegroupVersion(updateNodegroupVersionRequest).toEither

}
