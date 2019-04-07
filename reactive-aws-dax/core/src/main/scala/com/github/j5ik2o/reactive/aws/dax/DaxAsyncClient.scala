// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax

import software.amazon.awssdk.services.dax.model._
import software.amazon.awssdk.services.dax.{ DaxAsyncClient => JavaDaxAsyncClient }

import scala.compat.java8.FutureConverters._
import scala.concurrent.Future

object DaxAsyncClient {

  def apply(underlying: JavaDaxAsyncClient): DaxAsyncClient =
    new DaxAsyncClientImpl(underlying)

}

trait DaxAsyncClient extends DaxClient[Future] {
  val underlying: JavaDaxAsyncClient

  override def createCluster(createClusterRequest: CreateClusterRequest): Future[CreateClusterResponse] =
    underlying.createCluster(createClusterRequest).toScala

  override def createParameterGroup(
      createParameterGroupRequest: CreateParameterGroupRequest
  ): Future[CreateParameterGroupResponse] =
    underlying.createParameterGroup(createParameterGroupRequest).toScala

  override def createSubnetGroup(
      createSubnetGroupRequest: CreateSubnetGroupRequest
  ): Future[CreateSubnetGroupResponse] =
    underlying.createSubnetGroup(createSubnetGroupRequest).toScala

  override def decreaseReplicationFactor(
      decreaseReplicationFactorRequest: DecreaseReplicationFactorRequest
  ): Future[DecreaseReplicationFactorResponse] =
    underlying.decreaseReplicationFactor(decreaseReplicationFactorRequest).toScala

  override def deleteCluster(deleteClusterRequest: DeleteClusterRequest): Future[DeleteClusterResponse] =
    underlying.deleteCluster(deleteClusterRequest).toScala

  override def deleteParameterGroup(
      deleteParameterGroupRequest: DeleteParameterGroupRequest
  ): Future[DeleteParameterGroupResponse] =
    underlying.deleteParameterGroup(deleteParameterGroupRequest).toScala

  override def deleteSubnetGroup(
      deleteSubnetGroupRequest: DeleteSubnetGroupRequest
  ): Future[DeleteSubnetGroupResponse] =
    underlying.deleteSubnetGroup(deleteSubnetGroupRequest).toScala

  override def describeClusters(describeClustersRequest: DescribeClustersRequest): Future[DescribeClustersResponse] =
    underlying.describeClusters(describeClustersRequest).toScala

  override def describeClusters(): Future[DescribeClustersResponse] =
    underlying.describeClusters().toScala

  override def describeDefaultParameters(
      describeDefaultParametersRequest: DescribeDefaultParametersRequest
  ): Future[DescribeDefaultParametersResponse] =
    underlying.describeDefaultParameters(describeDefaultParametersRequest).toScala

  override def describeDefaultParameters(): Future[DescribeDefaultParametersResponse] =
    underlying.describeDefaultParameters().toScala

  override def describeEvents(describeEventsRequest: DescribeEventsRequest): Future[DescribeEventsResponse] =
    underlying.describeEvents(describeEventsRequest).toScala

  override def describeEvents(): Future[DescribeEventsResponse] =
    underlying.describeEvents().toScala

  override def describeParameterGroups(
      describeParameterGroupsRequest: DescribeParameterGroupsRequest
  ): Future[DescribeParameterGroupsResponse] =
    underlying.describeParameterGroups(describeParameterGroupsRequest).toScala

  override def describeParameterGroups(): Future[DescribeParameterGroupsResponse] =
    underlying.describeParameterGroups().toScala

  override def describeParameters(
      describeParametersRequest: DescribeParametersRequest
  ): Future[DescribeParametersResponse] =
    underlying.describeParameters(describeParametersRequest).toScala

  override def describeSubnetGroups(
      describeSubnetGroupsRequest: DescribeSubnetGroupsRequest
  ): Future[DescribeSubnetGroupsResponse] =
    underlying.describeSubnetGroups(describeSubnetGroupsRequest).toScala

  override def describeSubnetGroups(): Future[DescribeSubnetGroupsResponse] =
    underlying.describeSubnetGroups().toScala

  override def increaseReplicationFactor(
      increaseReplicationFactorRequest: IncreaseReplicationFactorRequest
  ): Future[IncreaseReplicationFactorResponse] =
    underlying.increaseReplicationFactor(increaseReplicationFactorRequest).toScala

  override def listTags(listTagsRequest: ListTagsRequest): Future[ListTagsResponse] =
    underlying.listTags(listTagsRequest).toScala

  override def rebootNode(rebootNodeRequest: RebootNodeRequest): Future[RebootNodeResponse] =
    underlying.rebootNode(rebootNodeRequest).toScala

  override def tagResource(tagResourceRequest: TagResourceRequest): Future[TagResourceResponse] =
    underlying.tagResource(tagResourceRequest).toScala

  override def untagResource(untagResourceRequest: UntagResourceRequest): Future[UntagResourceResponse] =
    underlying.untagResource(untagResourceRequest).toScala

  override def updateCluster(updateClusterRequest: UpdateClusterRequest): Future[UpdateClusterResponse] =
    underlying.updateCluster(updateClusterRequest).toScala

  override def updateParameterGroup(
      updateParameterGroupRequest: UpdateParameterGroupRequest
  ): Future[UpdateParameterGroupResponse] =
    underlying.updateParameterGroup(updateParameterGroupRequest).toScala

  override def updateSubnetGroup(
      updateSubnetGroupRequest: UpdateSubnetGroupRequest
  ): Future[UpdateSubnetGroupResponse] =
    underlying.updateSubnetGroup(updateSubnetGroupRequest).toScala

}
