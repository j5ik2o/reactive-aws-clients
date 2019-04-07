// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax

import software.amazon.awssdk.services.dax.model._

trait DaxClient[M[_]] {

  def createCluster(createClusterRequest: CreateClusterRequest): M[CreateClusterResponse]

  def createParameterGroup(createParameterGroupRequest: CreateParameterGroupRequest): M[CreateParameterGroupResponse]

  def createSubnetGroup(createSubnetGroupRequest: CreateSubnetGroupRequest): M[CreateSubnetGroupResponse]

  def decreaseReplicationFactor(
      decreaseReplicationFactorRequest: DecreaseReplicationFactorRequest
  ): M[DecreaseReplicationFactorResponse]

  def deleteCluster(deleteClusterRequest: DeleteClusterRequest): M[DeleteClusterResponse]

  def deleteParameterGroup(deleteParameterGroupRequest: DeleteParameterGroupRequest): M[DeleteParameterGroupResponse]

  def deleteSubnetGroup(deleteSubnetGroupRequest: DeleteSubnetGroupRequest): M[DeleteSubnetGroupResponse]

  def describeClusters(describeClustersRequest: DescribeClustersRequest): M[DescribeClustersResponse]

  def describeClusters(): M[DescribeClustersResponse]

  def describeDefaultParameters(
      describeDefaultParametersRequest: DescribeDefaultParametersRequest
  ): M[DescribeDefaultParametersResponse]

  def describeDefaultParameters(): M[DescribeDefaultParametersResponse]

  def describeEvents(describeEventsRequest: DescribeEventsRequest): M[DescribeEventsResponse]

  def describeEvents(): M[DescribeEventsResponse]

  def describeParameterGroups(
      describeParameterGroupsRequest: DescribeParameterGroupsRequest
  ): M[DescribeParameterGroupsResponse]

  def describeParameterGroups(): M[DescribeParameterGroupsResponse]

  def describeParameters(describeParametersRequest: DescribeParametersRequest): M[DescribeParametersResponse]

  def describeSubnetGroups(describeSubnetGroupsRequest: DescribeSubnetGroupsRequest): M[DescribeSubnetGroupsResponse]

  def describeSubnetGroups(): M[DescribeSubnetGroupsResponse]

  def increaseReplicationFactor(
      increaseReplicationFactorRequest: IncreaseReplicationFactorRequest
  ): M[IncreaseReplicationFactorResponse]

  def listTags(listTagsRequest: ListTagsRequest): M[ListTagsResponse]

  def rebootNode(rebootNodeRequest: RebootNodeRequest): M[RebootNodeResponse]

  def tagResource(tagResourceRequest: TagResourceRequest): M[TagResourceResponse]

  def untagResource(untagResourceRequest: UntagResourceRequest): M[UntagResourceResponse]

  def updateCluster(updateClusterRequest: UpdateClusterRequest): M[UpdateClusterResponse]

  def updateParameterGroup(updateParameterGroupRequest: UpdateParameterGroupRequest): M[UpdateParameterGroupResponse]

  def updateSubnetGroup(updateSubnetGroupRequest: UpdateSubnetGroupRequest): M[UpdateSubnetGroupResponse]

}
