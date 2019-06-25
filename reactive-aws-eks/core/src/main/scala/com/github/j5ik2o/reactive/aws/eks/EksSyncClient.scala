// Auto-Generated
package com.github.j5ik2o.reactive.aws.eks

import com.github.j5ik2o.reactive.aws.utils.ToEitherSupport
import software.amazon.awssdk.services.eks.model._
import software.amazon.awssdk.services.eks.{ EksClient => JavaEksSyncClient }

object EksSyncClient extends ToEitherSupport {

  def apply(javaClient: JavaEksSyncClient): EksSyncClient =
    new EksSyncClient {
      override val underlying: JavaEksSyncClient = javaClient
    }
}

/**
  * @see https://sdk.amazonaws.com/java/api/latest/software/amazon/awssdk/services/eks/EksClient.html
  */
trait EksSyncClient extends EksClient[Either[Throwable, ?]] {
  val underlying: JavaEksSyncClient

  import EksSyncClient._

  override def createCluster(createClusterRequest: CreateClusterRequest): Either[Throwable, CreateClusterResponse] =
    underlying.createCluster(createClusterRequest).toEither

  override def deleteCluster(deleteClusterRequest: DeleteClusterRequest): Either[Throwable, DeleteClusterResponse] =
    underlying.deleteCluster(deleteClusterRequest).toEither

  override def describeCluster(
      describeClusterRequest: DescribeClusterRequest
  ): Either[Throwable, DescribeClusterResponse] =
    underlying.describeCluster(describeClusterRequest).toEither

  override def describeUpdate(describeUpdateRequest: DescribeUpdateRequest): Either[Throwable, DescribeUpdateResponse] =
    underlying.describeUpdate(describeUpdateRequest).toEither

  override def listClusters(): Either[Throwable, ListClustersResponse] =
    underlying.listClusters().toEither

  override def listClusters(listClustersRequest: ListClustersRequest): Either[Throwable, ListClustersResponse] =
    underlying.listClusters(listClustersRequest).toEither

  override def listUpdates(listUpdatesRequest: ListUpdatesRequest): Either[Throwable, ListUpdatesResponse] =
    underlying.listUpdates(listUpdatesRequest).toEither

  override def updateClusterConfig(
      updateClusterConfigRequest: UpdateClusterConfigRequest
  ): Either[Throwable, UpdateClusterConfigResponse] =
    underlying.updateClusterConfig(updateClusterConfigRequest).toEither

  override def updateClusterVersion(
      updateClusterVersionRequest: UpdateClusterVersionRequest
  ): Either[Throwable, UpdateClusterVersionResponse] =
    underlying.updateClusterVersion(updateClusterVersionRequest).toEither

}
