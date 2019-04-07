// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.cats

import cats.effect.IO
import com.github.j5ik2o.reactive.aws.dax.{ DaxAsyncClient, DaxClient }
import software.amazon.awssdk.services.dax.model._

object DaxCatsIOClient {

  def apply(asyncClient: DaxAsyncClient): DaxCatsIOClient = new DaxCatsIOClient {
    override val underlying: DaxAsyncClient = asyncClient
  }

}

trait DaxCatsIOClient extends DaxClient[IO] {

  val underlying: DaxAsyncClient

  override def createCluster(createClusterRequest: CreateClusterRequest): IO[CreateClusterResponse] =
    IO.fromFuture {
      IO(underlying.createCluster(createClusterRequest))
    }

  override def createParameterGroup(
      createParameterGroupRequest: CreateParameterGroupRequest
  ): IO[CreateParameterGroupResponse] =
    IO.fromFuture {
      IO(underlying.createParameterGroup(createParameterGroupRequest))
    }

  override def createSubnetGroup(createSubnetGroupRequest: CreateSubnetGroupRequest): IO[CreateSubnetGroupResponse] =
    IO.fromFuture {
      IO(underlying.createSubnetGroup(createSubnetGroupRequest))
    }

  override def decreaseReplicationFactor(
      decreaseReplicationFactorRequest: DecreaseReplicationFactorRequest
  ): IO[DecreaseReplicationFactorResponse] =
    IO.fromFuture {
      IO(underlying.decreaseReplicationFactor(decreaseReplicationFactorRequest))
    }

  override def deleteCluster(deleteClusterRequest: DeleteClusterRequest): IO[DeleteClusterResponse] =
    IO.fromFuture {
      IO(underlying.deleteCluster(deleteClusterRequest))
    }

  override def deleteParameterGroup(
      deleteParameterGroupRequest: DeleteParameterGroupRequest
  ): IO[DeleteParameterGroupResponse] =
    IO.fromFuture {
      IO(underlying.deleteParameterGroup(deleteParameterGroupRequest))
    }

  override def deleteSubnetGroup(deleteSubnetGroupRequest: DeleteSubnetGroupRequest): IO[DeleteSubnetGroupResponse] =
    IO.fromFuture {
      IO(underlying.deleteSubnetGroup(deleteSubnetGroupRequest))
    }

  override def describeClusters(describeClustersRequest: DescribeClustersRequest): IO[DescribeClustersResponse] =
    IO.fromFuture {
      IO(underlying.describeClusters(describeClustersRequest))
    }

  override def describeClusters(): IO[DescribeClustersResponse] =
    IO.fromFuture {
      IO(underlying.describeClusters())
    }

  override def describeDefaultParameters(
      describeDefaultParametersRequest: DescribeDefaultParametersRequest
  ): IO[DescribeDefaultParametersResponse] =
    IO.fromFuture {
      IO(underlying.describeDefaultParameters(describeDefaultParametersRequest))
    }

  override def describeDefaultParameters(): IO[DescribeDefaultParametersResponse] =
    IO.fromFuture {
      IO(underlying.describeDefaultParameters())
    }

  override def describeEvents(describeEventsRequest: DescribeEventsRequest): IO[DescribeEventsResponse] =
    IO.fromFuture {
      IO(underlying.describeEvents(describeEventsRequest))
    }

  override def describeEvents(): IO[DescribeEventsResponse] =
    IO.fromFuture {
      IO(underlying.describeEvents())
    }

  override def describeParameterGroups(
      describeParameterGroupsRequest: DescribeParameterGroupsRequest
  ): IO[DescribeParameterGroupsResponse] =
    IO.fromFuture {
      IO(underlying.describeParameterGroups(describeParameterGroupsRequest))
    }

  override def describeParameterGroups(): IO[DescribeParameterGroupsResponse] =
    IO.fromFuture {
      IO(underlying.describeParameterGroups())
    }

  override def describeParameters(
      describeParametersRequest: DescribeParametersRequest
  ): IO[DescribeParametersResponse] =
    IO.fromFuture {
      IO(underlying.describeParameters(describeParametersRequest))
    }

  override def describeSubnetGroups(
      describeSubnetGroupsRequest: DescribeSubnetGroupsRequest
  ): IO[DescribeSubnetGroupsResponse] =
    IO.fromFuture {
      IO(underlying.describeSubnetGroups(describeSubnetGroupsRequest))
    }

  override def describeSubnetGroups(): IO[DescribeSubnetGroupsResponse] =
    IO.fromFuture {
      IO(underlying.describeSubnetGroups())
    }

  override def increaseReplicationFactor(
      increaseReplicationFactorRequest: IncreaseReplicationFactorRequest
  ): IO[IncreaseReplicationFactorResponse] =
    IO.fromFuture {
      IO(underlying.increaseReplicationFactor(increaseReplicationFactorRequest))
    }

  override def listTags(listTagsRequest: ListTagsRequest): IO[ListTagsResponse] =
    IO.fromFuture {
      IO(underlying.listTags(listTagsRequest))
    }

  override def rebootNode(rebootNodeRequest: RebootNodeRequest): IO[RebootNodeResponse] =
    IO.fromFuture {
      IO(underlying.rebootNode(rebootNodeRequest))
    }

  override def tagResource(tagResourceRequest: TagResourceRequest): IO[TagResourceResponse] =
    IO.fromFuture {
      IO(underlying.tagResource(tagResourceRequest))
    }

  override def untagResource(untagResourceRequest: UntagResourceRequest): IO[UntagResourceResponse] =
    IO.fromFuture {
      IO(underlying.untagResource(untagResourceRequest))
    }

  override def updateCluster(updateClusterRequest: UpdateClusterRequest): IO[UpdateClusterResponse] =
    IO.fromFuture {
      IO(underlying.updateCluster(updateClusterRequest))
    }

  override def updateParameterGroup(
      updateParameterGroupRequest: UpdateParameterGroupRequest
  ): IO[UpdateParameterGroupResponse] =
    IO.fromFuture {
      IO(underlying.updateParameterGroup(updateParameterGroupRequest))
    }

  override def updateSubnetGroup(updateSubnetGroupRequest: UpdateSubnetGroupRequest): IO[UpdateSubnetGroupResponse] =
    IO.fromFuture {
      IO(underlying.updateSubnetGroup(updateSubnetGroupRequest))
    }

}
