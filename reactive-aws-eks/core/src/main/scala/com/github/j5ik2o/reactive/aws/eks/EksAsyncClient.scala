// Auto-Generated
package com.github.j5ik2o.reactive.aws.eks

import software.amazon.awssdk.services.eks.model._
import software.amazon.awssdk.services.eks.paginators._
import software.amazon.awssdk.services.eks.{ EksAsyncClient => JavaEksAsyncClient }

import scala.compat.java8.FutureConverters._
import scala.concurrent.Future

object EksAsyncClient {

  def apply(javaClient: JavaEksAsyncClient): EksAsyncClient =
    new EksAsyncClient {
      override val underlying: JavaEksAsyncClient = javaClient
    }

}

/**
  * @see https://sdk.amazonaws.com/java/api/latest/software/amazon/awssdk/services/eks/EksAsyncClient.html
  */
trait EksAsyncClient extends EksClient[Future] {
  val underlying: JavaEksAsyncClient

  override def createCluster(createClusterRequest: CreateClusterRequest): Future[CreateClusterResponse] =
    underlying.createCluster(createClusterRequest).toScala

  override def deleteCluster(deleteClusterRequest: DeleteClusterRequest): Future[DeleteClusterResponse] =
    underlying.deleteCluster(deleteClusterRequest).toScala

  override def describeCluster(describeClusterRequest: DescribeClusterRequest): Future[DescribeClusterResponse] =
    underlying.describeCluster(describeClusterRequest).toScala

  override def describeUpdate(describeUpdateRequest: DescribeUpdateRequest): Future[DescribeUpdateResponse] =
    underlying.describeUpdate(describeUpdateRequest).toScala

  override def listClusters(listClustersRequest: ListClustersRequest): Future[ListClustersResponse] =
    underlying.listClusters(listClustersRequest).toScala

  override def listClusters(): Future[ListClustersResponse] =
    underlying.listClusters().toScala

  def listClustersPaginator(): ListClustersPublisher =
    underlying.listClustersPaginator()

  def listClustersPaginator(listClustersRequest: ListClustersRequest): ListClustersPublisher =
    underlying.listClustersPaginator(listClustersRequest)

  override def listTagsForResource(
      listTagsForResourceRequest: ListTagsForResourceRequest
  ): Future[ListTagsForResourceResponse] =
    underlying.listTagsForResource(listTagsForResourceRequest).toScala

  override def listUpdates(listUpdatesRequest: ListUpdatesRequest): Future[ListUpdatesResponse] =
    underlying.listUpdates(listUpdatesRequest).toScala

  def listUpdatesPaginator(listUpdatesRequest: ListUpdatesRequest): ListUpdatesPublisher =
    underlying.listUpdatesPaginator(listUpdatesRequest)

  override def tagResource(tagResourceRequest: TagResourceRequest): Future[TagResourceResponse] =
    underlying.tagResource(tagResourceRequest).toScala

  override def untagResource(untagResourceRequest: UntagResourceRequest): Future[UntagResourceResponse] =
    underlying.untagResource(untagResourceRequest).toScala

  override def updateClusterConfig(
      updateClusterConfigRequest: UpdateClusterConfigRequest
  ): Future[UpdateClusterConfigResponse] =
    underlying.updateClusterConfig(updateClusterConfigRequest).toScala

  override def updateClusterVersion(
      updateClusterVersionRequest: UpdateClusterVersionRequest
  ): Future[UpdateClusterVersionResponse] =
    underlying.updateClusterVersion(updateClusterVersionRequest).toScala

}
