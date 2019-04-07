// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax

import com.github.j5ik2o.reactive.aws.utils.ToEitherSupport
import software.amazon.awssdk.services.dax.model._
import software.amazon.awssdk.services.dax.{ DaxClient => JavaDaxSyncClient }

object DaxSyncClient extends ToEitherSupport {

  def apply(underlying: JavaDaxSyncClient): DaxSyncClient = new DaxSyncClientImpl(underlying)

}

trait DaxSyncClient extends DaxClient[Either[Throwable, ?]] {
  val underlying: JavaDaxSyncClient

  import DaxSyncClient._

  override def createCluster(createClusterRequest: CreateClusterRequest): Either[Throwable, CreateClusterResponse] =
    underlying.createCluster(createClusterRequest).toEither

  override def createParameterGroup(
      createParameterGroupRequest: CreateParameterGroupRequest
  ): Either[Throwable, CreateParameterGroupResponse] =
    underlying.createParameterGroup(createParameterGroupRequest).toEither

  override def createSubnetGroup(
      createSubnetGroupRequest: CreateSubnetGroupRequest
  ): Either[Throwable, CreateSubnetGroupResponse] =
    underlying.createSubnetGroup(createSubnetGroupRequest).toEither

  override def decreaseReplicationFactor(
      decreaseReplicationFactorRequest: DecreaseReplicationFactorRequest
  ): Either[Throwable, DecreaseReplicationFactorResponse] =
    underlying.decreaseReplicationFactor(decreaseReplicationFactorRequest).toEither

  override def deleteCluster(deleteClusterRequest: DeleteClusterRequest): Either[Throwable, DeleteClusterResponse] =
    underlying.deleteCluster(deleteClusterRequest).toEither

  override def deleteParameterGroup(
      deleteParameterGroupRequest: DeleteParameterGroupRequest
  ): Either[Throwable, DeleteParameterGroupResponse] =
    underlying.deleteParameterGroup(deleteParameterGroupRequest).toEither

  override def deleteSubnetGroup(
      deleteSubnetGroupRequest: DeleteSubnetGroupRequest
  ): Either[Throwable, DeleteSubnetGroupResponse] =
    underlying.deleteSubnetGroup(deleteSubnetGroupRequest).toEither

  override def describeClusters(): Either[Throwable, DescribeClustersResponse] =
    underlying.describeClusters().toEither

  override def describeClusters(
      describeClustersRequest: DescribeClustersRequest
  ): Either[Throwable, DescribeClustersResponse] =
    underlying.describeClusters(describeClustersRequest).toEither

  override def describeDefaultParameters(): Either[Throwable, DescribeDefaultParametersResponse] =
    underlying.describeDefaultParameters().toEither

  override def describeDefaultParameters(
      describeDefaultParametersRequest: DescribeDefaultParametersRequest
  ): Either[Throwable, DescribeDefaultParametersResponse] =
    underlying.describeDefaultParameters(describeDefaultParametersRequest).toEither

  override def describeEvents(): Either[Throwable, DescribeEventsResponse] =
    underlying.describeEvents().toEither

  override def describeEvents(describeEventsRequest: DescribeEventsRequest): Either[Throwable, DescribeEventsResponse] =
    underlying.describeEvents(describeEventsRequest).toEither

  override def describeParameterGroups(): Either[Throwable, DescribeParameterGroupsResponse] =
    underlying.describeParameterGroups().toEither

  override def describeParameterGroups(
      describeParameterGroupsRequest: DescribeParameterGroupsRequest
  ): Either[Throwable, DescribeParameterGroupsResponse] =
    underlying.describeParameterGroups(describeParameterGroupsRequest).toEither

  override def describeParameters(
      describeParametersRequest: DescribeParametersRequest
  ): Either[Throwable, DescribeParametersResponse] =
    underlying.describeParameters(describeParametersRequest).toEither

  override def describeSubnetGroups(): Either[Throwable, DescribeSubnetGroupsResponse] =
    underlying.describeSubnetGroups().toEither

  override def describeSubnetGroups(
      describeSubnetGroupsRequest: DescribeSubnetGroupsRequest
  ): Either[Throwable, DescribeSubnetGroupsResponse] =
    underlying.describeSubnetGroups(describeSubnetGroupsRequest).toEither

  override def increaseReplicationFactor(
      increaseReplicationFactorRequest: IncreaseReplicationFactorRequest
  ): Either[Throwable, IncreaseReplicationFactorResponse] =
    underlying.increaseReplicationFactor(increaseReplicationFactorRequest).toEither

  override def listTags(listTagsRequest: ListTagsRequest): Either[Throwable, ListTagsResponse] =
    underlying.listTags(listTagsRequest).toEither

  override def rebootNode(rebootNodeRequest: RebootNodeRequest): Either[Throwable, RebootNodeResponse] =
    underlying.rebootNode(rebootNodeRequest).toEither

  override def tagResource(tagResourceRequest: TagResourceRequest): Either[Throwable, TagResourceResponse] =
    underlying.tagResource(tagResourceRequest).toEither

  override def untagResource(untagResourceRequest: UntagResourceRequest): Either[Throwable, UntagResourceResponse] =
    underlying.untagResource(untagResourceRequest).toEither

  override def updateCluster(updateClusterRequest: UpdateClusterRequest): Either[Throwable, UpdateClusterResponse] =
    underlying.updateCluster(updateClusterRequest).toEither

  override def updateParameterGroup(
      updateParameterGroupRequest: UpdateParameterGroupRequest
  ): Either[Throwable, UpdateParameterGroupResponse] =
    underlying.updateParameterGroup(updateParameterGroupRequest).toEither

  override def updateSubnetGroup(
      updateSubnetGroupRequest: UpdateSubnetGroupRequest
  ): Either[Throwable, UpdateSubnetGroupResponse] =
    underlying.updateSubnetGroup(updateSubnetGroupRequest).toEither

}
