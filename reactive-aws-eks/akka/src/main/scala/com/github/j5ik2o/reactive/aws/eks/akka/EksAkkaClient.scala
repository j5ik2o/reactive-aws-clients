// Auto-Generated
package com.github.j5ik2o.reactive.aws.eks.akka

import akka.NotUsed
import akka.stream.scaladsl.{ Flow, Source }
import com.github.j5ik2o.reactive.aws.eks.EksAsyncClient
import software.amazon.awssdk.services.eks.model._

object EksAkkaClient {

  def apply(asyncClient: EksAsyncClient): EksAkkaClient = new EksAkkaClient {
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

  def listUpdatesSource(
      listUpdatesRequest: ListUpdatesRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ListUpdatesResponse, NotUsed] =
    Source.single(listUpdatesRequest).via(listUpdatesFlow(parallelism))

  def listUpdatesFlow(parallelism: Int = DefaultParallelism): Flow[ListUpdatesRequest, ListUpdatesResponse, NotUsed] =
    Flow[ListUpdatesRequest].mapAsync(parallelism) { listUpdatesRequest =>
      underlying.listUpdates(listUpdatesRequest)
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

}
