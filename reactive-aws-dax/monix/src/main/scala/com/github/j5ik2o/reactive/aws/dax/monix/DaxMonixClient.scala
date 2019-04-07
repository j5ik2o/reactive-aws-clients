// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.monix

import software.amazon.awssdk.services.dax.model._
import com.github.j5ik2o.reactive.aws.dax.{ DaxAsyncClient, DaxClient }
import monix.eval.Task
import monix.reactive.Observable

object DaxMonixClient {

  def apply(underlying: DaxAsyncClient): DaxMonixClient = new DaxMonixClientImpl(underlying)

}

trait DaxMonixClient extends DaxClient[Task] {

  val underlying: DaxAsyncClient

  override def createCluster(createClusterRequest: CreateClusterRequest): Task[CreateClusterResponse] =
    Task.deferFuture {
      underlying.createCluster(createClusterRequest)
    }

  override def createParameterGroup(
      createParameterGroupRequest: CreateParameterGroupRequest
  ): Task[CreateParameterGroupResponse] =
    Task.deferFuture {
      underlying.createParameterGroup(createParameterGroupRequest)
    }

  override def createSubnetGroup(createSubnetGroupRequest: CreateSubnetGroupRequest): Task[CreateSubnetGroupResponse] =
    Task.deferFuture {
      underlying.createSubnetGroup(createSubnetGroupRequest)
    }

  override def decreaseReplicationFactor(
      decreaseReplicationFactorRequest: DecreaseReplicationFactorRequest
  ): Task[DecreaseReplicationFactorResponse] =
    Task.deferFuture {
      underlying.decreaseReplicationFactor(decreaseReplicationFactorRequest)
    }

  override def deleteCluster(deleteClusterRequest: DeleteClusterRequest): Task[DeleteClusterResponse] =
    Task.deferFuture {
      underlying.deleteCluster(deleteClusterRequest)
    }

  override def deleteParameterGroup(
      deleteParameterGroupRequest: DeleteParameterGroupRequest
  ): Task[DeleteParameterGroupResponse] =
    Task.deferFuture {
      underlying.deleteParameterGroup(deleteParameterGroupRequest)
    }

  override def deleteSubnetGroup(deleteSubnetGroupRequest: DeleteSubnetGroupRequest): Task[DeleteSubnetGroupResponse] =
    Task.deferFuture {
      underlying.deleteSubnetGroup(deleteSubnetGroupRequest)
    }

  override def describeClusters(describeClustersRequest: DescribeClustersRequest): Task[DescribeClustersResponse] =
    Task.deferFuture {
      underlying.describeClusters(describeClustersRequest)
    }

  override def describeClusters(): Task[DescribeClustersResponse] =
    Task.deferFuture {
      underlying.describeClusters()
    }

  override def describeDefaultParameters(
      describeDefaultParametersRequest: DescribeDefaultParametersRequest
  ): Task[DescribeDefaultParametersResponse] =
    Task.deferFuture {
      underlying.describeDefaultParameters(describeDefaultParametersRequest)
    }

  override def describeDefaultParameters(): Task[DescribeDefaultParametersResponse] =
    Task.deferFuture {
      underlying.describeDefaultParameters()
    }

  override def describeEvents(describeEventsRequest: DescribeEventsRequest): Task[DescribeEventsResponse] =
    Task.deferFuture {
      underlying.describeEvents(describeEventsRequest)
    }

  override def describeEvents(): Task[DescribeEventsResponse] =
    Task.deferFuture {
      underlying.describeEvents()
    }

  override def describeParameterGroups(
      describeParameterGroupsRequest: DescribeParameterGroupsRequest
  ): Task[DescribeParameterGroupsResponse] =
    Task.deferFuture {
      underlying.describeParameterGroups(describeParameterGroupsRequest)
    }

  override def describeParameterGroups(): Task[DescribeParameterGroupsResponse] =
    Task.deferFuture {
      underlying.describeParameterGroups()
    }

  override def describeParameters(
      describeParametersRequest: DescribeParametersRequest
  ): Task[DescribeParametersResponse] =
    Task.deferFuture {
      underlying.describeParameters(describeParametersRequest)
    }

  override def describeSubnetGroups(
      describeSubnetGroupsRequest: DescribeSubnetGroupsRequest
  ): Task[DescribeSubnetGroupsResponse] =
    Task.deferFuture {
      underlying.describeSubnetGroups(describeSubnetGroupsRequest)
    }

  override def describeSubnetGroups(): Task[DescribeSubnetGroupsResponse] =
    Task.deferFuture {
      underlying.describeSubnetGroups()
    }

  override def increaseReplicationFactor(
      increaseReplicationFactorRequest: IncreaseReplicationFactorRequest
  ): Task[IncreaseReplicationFactorResponse] =
    Task.deferFuture {
      underlying.increaseReplicationFactor(increaseReplicationFactorRequest)
    }

  override def listTags(listTagsRequest: ListTagsRequest): Task[ListTagsResponse] =
    Task.deferFuture {
      underlying.listTags(listTagsRequest)
    }

  override def rebootNode(rebootNodeRequest: RebootNodeRequest): Task[RebootNodeResponse] =
    Task.deferFuture {
      underlying.rebootNode(rebootNodeRequest)
    }

  override def tagResource(tagResourceRequest: TagResourceRequest): Task[TagResourceResponse] =
    Task.deferFuture {
      underlying.tagResource(tagResourceRequest)
    }

  override def untagResource(untagResourceRequest: UntagResourceRequest): Task[UntagResourceResponse] =
    Task.deferFuture {
      underlying.untagResource(untagResourceRequest)
    }

  override def updateCluster(updateClusterRequest: UpdateClusterRequest): Task[UpdateClusterResponse] =
    Task.deferFuture {
      underlying.updateCluster(updateClusterRequest)
    }

  override def updateParameterGroup(
      updateParameterGroupRequest: UpdateParameterGroupRequest
  ): Task[UpdateParameterGroupResponse] =
    Task.deferFuture {
      underlying.updateParameterGroup(updateParameterGroupRequest)
    }

  override def updateSubnetGroup(updateSubnetGroupRequest: UpdateSubnetGroupRequest): Task[UpdateSubnetGroupResponse] =
    Task.deferFuture {
      underlying.updateSubnetGroup(updateSubnetGroupRequest)
    }

}
