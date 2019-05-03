// Auto-Generated
package com.github.j5ik2o.reactive.aws.eks.monix

import software.amazon.awssdk.services.eks.model._
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

  override def listUpdates(listUpdatesRequest: ListUpdatesRequest): Task[ListUpdatesResponse] =
    Task.deferFuture {
      underlying.listUpdates(listUpdatesRequest)
    }

  override def updateClusterVersion(
      updateClusterVersionRequest: UpdateClusterVersionRequest
  ): Task[UpdateClusterVersionResponse] =
    Task.deferFuture {
      underlying.updateClusterVersion(updateClusterVersionRequest)
    }

}
