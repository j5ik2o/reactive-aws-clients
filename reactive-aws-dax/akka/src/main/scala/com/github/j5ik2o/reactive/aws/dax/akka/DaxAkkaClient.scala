// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.akka

import akka.NotUsed
import akka.stream.scaladsl.{ Flow, Source }
import com.github.j5ik2o.reactive.aws.dax.DaxAsyncClient
import software.amazon.awssdk.services.dax.model._

import scala.concurrent.Future

object DaxAkkaClient {

  def apply(underlying: DaxAsyncClient): DaxAkkaClient = new DaxAkkaClientImpl(underlying)

  val DefaultParallelism: Int = 1

}

trait DaxAkkaClient {

  import DaxAkkaClient._

  val underlying: DaxAsyncClient

  def createClusterSource(createClusterRequest: CreateClusterRequest,
                          parallelism: Int = DefaultParallelism): Source[CreateClusterResponse, NotUsed] =
    Source.single(createClusterRequest).via(createClusterFlow(parallelism))

  def createClusterFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateClusterRequest, CreateClusterResponse, NotUsed] =
    Flow[CreateClusterRequest].mapAsync(parallelism) { createClusterRequest =>
      underlying.createCluster(createClusterRequest)
    }

  def createParameterGroupSource(createParameterGroupRequest: CreateParameterGroupRequest,
                                 parallelism: Int = DefaultParallelism): Source[CreateParameterGroupResponse, NotUsed] =
    Source.single(createParameterGroupRequest).via(createParameterGroupFlow(parallelism))

  def createParameterGroupFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateParameterGroupRequest, CreateParameterGroupResponse, NotUsed] =
    Flow[CreateParameterGroupRequest].mapAsync(parallelism) { createParameterGroupRequest =>
      underlying.createParameterGroup(createParameterGroupRequest)
    }

  def createSubnetGroupSource(createSubnetGroupRequest: CreateSubnetGroupRequest,
                              parallelism: Int = DefaultParallelism): Source[CreateSubnetGroupResponse, NotUsed] =
    Source.single(createSubnetGroupRequest).via(createSubnetGroupFlow(parallelism))

  def createSubnetGroupFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateSubnetGroupRequest, CreateSubnetGroupResponse, NotUsed] =
    Flow[CreateSubnetGroupRequest].mapAsync(parallelism) { createSubnetGroupRequest =>
      underlying.createSubnetGroup(createSubnetGroupRequest)
    }

  def decreaseReplicationFactorSource(
      decreaseReplicationFactorRequest: DecreaseReplicationFactorRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DecreaseReplicationFactorResponse, NotUsed] =
    Source.single(decreaseReplicationFactorRequest).via(decreaseReplicationFactorFlow(parallelism))

  def decreaseReplicationFactorFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DecreaseReplicationFactorRequest, DecreaseReplicationFactorResponse, NotUsed] =
    Flow[DecreaseReplicationFactorRequest].mapAsync(parallelism) { decreaseReplicationFactorRequest =>
      underlying.decreaseReplicationFactor(decreaseReplicationFactorRequest)
    }

  def deleteClusterSource(deleteClusterRequest: DeleteClusterRequest,
                          parallelism: Int = DefaultParallelism): Source[DeleteClusterResponse, NotUsed] =
    Source.single(deleteClusterRequest).via(deleteClusterFlow(parallelism))

  def deleteClusterFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteClusterRequest, DeleteClusterResponse, NotUsed] =
    Flow[DeleteClusterRequest].mapAsync(parallelism) { deleteClusterRequest =>
      underlying.deleteCluster(deleteClusterRequest)
    }

  def deleteParameterGroupSource(deleteParameterGroupRequest: DeleteParameterGroupRequest,
                                 parallelism: Int = DefaultParallelism): Source[DeleteParameterGroupResponse, NotUsed] =
    Source.single(deleteParameterGroupRequest).via(deleteParameterGroupFlow(parallelism))

  def deleteParameterGroupFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteParameterGroupRequest, DeleteParameterGroupResponse, NotUsed] =
    Flow[DeleteParameterGroupRequest].mapAsync(parallelism) { deleteParameterGroupRequest =>
      underlying.deleteParameterGroup(deleteParameterGroupRequest)
    }

  def deleteSubnetGroupSource(deleteSubnetGroupRequest: DeleteSubnetGroupRequest,
                              parallelism: Int = DefaultParallelism): Source[DeleteSubnetGroupResponse, NotUsed] =
    Source.single(deleteSubnetGroupRequest).via(deleteSubnetGroupFlow(parallelism))

  def deleteSubnetGroupFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteSubnetGroupRequest, DeleteSubnetGroupResponse, NotUsed] =
    Flow[DeleteSubnetGroupRequest].mapAsync(parallelism) { deleteSubnetGroupRequest =>
      underlying.deleteSubnetGroup(deleteSubnetGroupRequest)
    }

  def describeClustersSource(describeClustersRequest: DescribeClustersRequest,
                             parallelism: Int = DefaultParallelism): Source[DescribeClustersResponse, NotUsed] =
    Source.single(describeClustersRequest).via(describeClustersFlow(parallelism))

  def describeClustersFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeClustersRequest, DescribeClustersResponse, NotUsed] =
    Flow[DescribeClustersRequest].mapAsync(parallelism) { describeClustersRequest =>
      underlying.describeClusters(describeClustersRequest)
    }

  def describeClustersSource(): Source[DescribeClustersResponse, NotUsed] =
    Source.fromFuture(underlying.describeClusters())

  def describeDefaultParametersSource(
      describeDefaultParametersRequest: DescribeDefaultParametersRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeDefaultParametersResponse, NotUsed] =
    Source.single(describeDefaultParametersRequest).via(describeDefaultParametersFlow(parallelism))

  def describeDefaultParametersFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeDefaultParametersRequest, DescribeDefaultParametersResponse, NotUsed] =
    Flow[DescribeDefaultParametersRequest].mapAsync(parallelism) { describeDefaultParametersRequest =>
      underlying.describeDefaultParameters(describeDefaultParametersRequest)
    }

  def describeDefaultParametersSource(): Source[DescribeDefaultParametersResponse, NotUsed] =
    Source.fromFuture(underlying.describeDefaultParameters())

  def describeEventsSource(describeEventsRequest: DescribeEventsRequest,
                           parallelism: Int = DefaultParallelism): Source[DescribeEventsResponse, NotUsed] =
    Source.single(describeEventsRequest).via(describeEventsFlow(parallelism))

  def describeEventsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeEventsRequest, DescribeEventsResponse, NotUsed] =
    Flow[DescribeEventsRequest].mapAsync(parallelism) { describeEventsRequest =>
      underlying.describeEvents(describeEventsRequest)
    }

  def describeEventsSource(): Source[DescribeEventsResponse, NotUsed] =
    Source.fromFuture(underlying.describeEvents())

  def describeParameterGroupsSource(
      describeParameterGroupsRequest: DescribeParameterGroupsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeParameterGroupsResponse, NotUsed] =
    Source.single(describeParameterGroupsRequest).via(describeParameterGroupsFlow(parallelism))

  def describeParameterGroupsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeParameterGroupsRequest, DescribeParameterGroupsResponse, NotUsed] =
    Flow[DescribeParameterGroupsRequest].mapAsync(parallelism) { describeParameterGroupsRequest =>
      underlying.describeParameterGroups(describeParameterGroupsRequest)
    }

  def describeParameterGroupsSource(): Source[DescribeParameterGroupsResponse, NotUsed] =
    Source.fromFuture(underlying.describeParameterGroups())

  def describeParametersSource(describeParametersRequest: DescribeParametersRequest,
                               parallelism: Int = DefaultParallelism): Source[DescribeParametersResponse, NotUsed] =
    Source.single(describeParametersRequest).via(describeParametersFlow(parallelism))

  def describeParametersFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeParametersRequest, DescribeParametersResponse, NotUsed] =
    Flow[DescribeParametersRequest].mapAsync(parallelism) { describeParametersRequest =>
      underlying.describeParameters(describeParametersRequest)
    }

  def describeSubnetGroupsSource(describeSubnetGroupsRequest: DescribeSubnetGroupsRequest,
                                 parallelism: Int = DefaultParallelism): Source[DescribeSubnetGroupsResponse, NotUsed] =
    Source.single(describeSubnetGroupsRequest).via(describeSubnetGroupsFlow(parallelism))

  def describeSubnetGroupsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeSubnetGroupsRequest, DescribeSubnetGroupsResponse, NotUsed] =
    Flow[DescribeSubnetGroupsRequest].mapAsync(parallelism) { describeSubnetGroupsRequest =>
      underlying.describeSubnetGroups(describeSubnetGroupsRequest)
    }

  def describeSubnetGroupsSource(): Source[DescribeSubnetGroupsResponse, NotUsed] =
    Source.fromFuture(underlying.describeSubnetGroups())

  def increaseReplicationFactorSource(
      increaseReplicationFactorRequest: IncreaseReplicationFactorRequest,
      parallelism: Int = DefaultParallelism
  ): Source[IncreaseReplicationFactorResponse, NotUsed] =
    Source.single(increaseReplicationFactorRequest).via(increaseReplicationFactorFlow(parallelism))

  def increaseReplicationFactorFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[IncreaseReplicationFactorRequest, IncreaseReplicationFactorResponse, NotUsed] =
    Flow[IncreaseReplicationFactorRequest].mapAsync(parallelism) { increaseReplicationFactorRequest =>
      underlying.increaseReplicationFactor(increaseReplicationFactorRequest)
    }

  def listTagsSource(listTagsRequest: ListTagsRequest,
                     parallelism: Int = DefaultParallelism): Source[ListTagsResponse, NotUsed] =
    Source.single(listTagsRequest).via(listTagsFlow(parallelism))

  def listTagsFlow(parallelism: Int = DefaultParallelism): Flow[ListTagsRequest, ListTagsResponse, NotUsed] =
    Flow[ListTagsRequest].mapAsync(parallelism) { listTagsRequest =>
      underlying.listTags(listTagsRequest)
    }

  def rebootNodeSource(rebootNodeRequest: RebootNodeRequest,
                       parallelism: Int = DefaultParallelism): Source[RebootNodeResponse, NotUsed] =
    Source.single(rebootNodeRequest).via(rebootNodeFlow(parallelism))

  def rebootNodeFlow(parallelism: Int = DefaultParallelism): Flow[RebootNodeRequest, RebootNodeResponse, NotUsed] =
    Flow[RebootNodeRequest].mapAsync(parallelism) { rebootNodeRequest =>
      underlying.rebootNode(rebootNodeRequest)
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

  def updateClusterSource(updateClusterRequest: UpdateClusterRequest,
                          parallelism: Int = DefaultParallelism): Source[UpdateClusterResponse, NotUsed] =
    Source.single(updateClusterRequest).via(updateClusterFlow(parallelism))

  def updateClusterFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[UpdateClusterRequest, UpdateClusterResponse, NotUsed] =
    Flow[UpdateClusterRequest].mapAsync(parallelism) { updateClusterRequest =>
      underlying.updateCluster(updateClusterRequest)
    }

  def updateParameterGroupSource(updateParameterGroupRequest: UpdateParameterGroupRequest,
                                 parallelism: Int = DefaultParallelism): Source[UpdateParameterGroupResponse, NotUsed] =
    Source.single(updateParameterGroupRequest).via(updateParameterGroupFlow(parallelism))

  def updateParameterGroupFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[UpdateParameterGroupRequest, UpdateParameterGroupResponse, NotUsed] =
    Flow[UpdateParameterGroupRequest].mapAsync(parallelism) { updateParameterGroupRequest =>
      underlying.updateParameterGroup(updateParameterGroupRequest)
    }

  def updateSubnetGroupSource(updateSubnetGroupRequest: UpdateSubnetGroupRequest,
                              parallelism: Int = DefaultParallelism): Source[UpdateSubnetGroupResponse, NotUsed] =
    Source.single(updateSubnetGroupRequest).via(updateSubnetGroupFlow(parallelism))

  def updateSubnetGroupFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[UpdateSubnetGroupRequest, UpdateSubnetGroupResponse, NotUsed] =
    Flow[UpdateSubnetGroupRequest].mapAsync(parallelism) { updateSubnetGroupRequest =>
      underlying.updateSubnetGroup(updateSubnetGroupRequest)
    }

}
