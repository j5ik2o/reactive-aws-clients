// Auto-Generated
package com.github.j5ik2o.reactive.aws.eks.monix

import software.amazon.awssdk.services.eks.model._
import software.amazon.awssdk.services.eks.paginators._
import com.github.j5ik2o.reactive.aws.eks.{ EksAsyncClient, EksClient }
import monix.eval.Task
import monix.reactive.Observable

object EksMonixClient {

  def apply(asyncClient: EksAsyncClient): EksMonixClient = new EksMonixClient {
    override val underlying: EksAsyncClient = asyncClient
  }

}

trait EksMonixClient extends EksClient[Task] {

  val underlying: EksAsyncClient

  override def createCluster(createClusterRequest: CreateClusterRequest): Task[CreateClusterResponse] =
    Task.deferFuture {
      underlying.createCluster(createClusterRequest)
    }

  override def deleteCluster(deleteClusterRequest: DeleteClusterRequest): Task[DeleteClusterResponse] =
    Task.deferFuture {
      underlying.deleteCluster(deleteClusterRequest)
    }

  override def describeCluster(describeClusterRequest: DescribeClusterRequest): Task[DescribeClusterResponse] =
    Task.deferFuture {
      underlying.describeCluster(describeClusterRequest)
    }

  override def describeUpdate(describeUpdateRequest: DescribeUpdateRequest): Task[DescribeUpdateResponse] =
    Task.deferFuture {
      underlying.describeUpdate(describeUpdateRequest)
    }

  override def listClusters(listClustersRequest: ListClustersRequest): Task[ListClustersResponse] =
    Task.deferFuture {
      underlying.listClusters(listClustersRequest)
    }

  override def listClusters(): Task[ListClustersResponse] =
    Task.deferFuture {
      underlying.listClusters()
    }

  def listClustersPaginator(): Observable[ListClustersResponse] =
    Observable.fromReactivePublisher(underlying.listClustersPaginator())

  def listClustersPaginator(listClustersRequest: ListClustersRequest): Observable[ListClustersResponse] =
    Observable.fromReactivePublisher(underlying.listClustersPaginator(listClustersRequest))

  override def listTagsForResource(
      listTagsForResourceRequest: ListTagsForResourceRequest
  ): Task[ListTagsForResourceResponse] =
    Task.deferFuture {
      underlying.listTagsForResource(listTagsForResourceRequest)
    }

  override def listUpdates(listUpdatesRequest: ListUpdatesRequest): Task[ListUpdatesResponse] =
    Task.deferFuture {
      underlying.listUpdates(listUpdatesRequest)
    }

  def listUpdatesPaginator(listUpdatesRequest: ListUpdatesRequest): Observable[ListUpdatesResponse] =
    Observable.fromReactivePublisher(underlying.listUpdatesPaginator(listUpdatesRequest))

  override def tagResource(tagResourceRequest: TagResourceRequest): Task[TagResourceResponse] =
    Task.deferFuture {
      underlying.tagResource(tagResourceRequest)
    }

  override def untagResource(untagResourceRequest: UntagResourceRequest): Task[UntagResourceResponse] =
    Task.deferFuture {
      underlying.untagResource(untagResourceRequest)
    }

  override def updateClusterConfig(
      updateClusterConfigRequest: UpdateClusterConfigRequest
  ): Task[UpdateClusterConfigResponse] =
    Task.deferFuture {
      underlying.updateClusterConfig(updateClusterConfigRequest)
    }

  override def updateClusterVersion(
      updateClusterVersionRequest: UpdateClusterVersionRequest
  ): Task[UpdateClusterVersionResponse] =
    Task.deferFuture {
      underlying.updateClusterVersion(updateClusterVersionRequest)
    }

}
