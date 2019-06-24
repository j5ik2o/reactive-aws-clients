// Auto-Generated
package com.github.j5ik2o.reactive.aws.eks.cats

import cats.effect.{ ContextShift, IO }
import com.github.j5ik2o.reactive.aws.eks.{ EksAsyncClient, EksClient }
import software.amazon.awssdk.services.eks.model._

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

  override def deleteCluster(deleteClusterRequest: DeleteClusterRequest): IO[DeleteClusterResponse] =
    IO.fromFuture {
      IO(underlying.deleteCluster(deleteClusterRequest))
    }

  override def describeCluster(describeClusterRequest: DescribeClusterRequest): IO[DescribeClusterResponse] =
    IO.fromFuture {
      IO(underlying.describeCluster(describeClusterRequest))
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

  override def listUpdates(listUpdatesRequest: ListUpdatesRequest): IO[ListUpdatesResponse] =
    IO.fromFuture {
      IO(underlying.listUpdates(listUpdatesRequest))
    }

  override def updateClusterVersion(
      updateClusterVersionRequest: UpdateClusterVersionRequest
  ): IO[UpdateClusterVersionResponse] =
    IO.fromFuture {
      IO(underlying.updateClusterVersion(updateClusterVersionRequest))
    }

}
