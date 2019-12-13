// Auto-Generated
package com.github.j5ik2o.reactive.aws.eks

import software.amazon.awssdk.services.eks.model._

trait EksClient[M[_]] {

  def createCluster(createClusterRequest: CreateClusterRequest): M[CreateClusterResponse]

  def createFargateProfile(createFargateProfileRequest: CreateFargateProfileRequest): M[CreateFargateProfileResponse]

  def createNodegroup(createNodegroupRequest: CreateNodegroupRequest): M[CreateNodegroupResponse]

  def deleteCluster(deleteClusterRequest: DeleteClusterRequest): M[DeleteClusterResponse]

  def deleteFargateProfile(deleteFargateProfileRequest: DeleteFargateProfileRequest): M[DeleteFargateProfileResponse]

  def deleteNodegroup(deleteNodegroupRequest: DeleteNodegroupRequest): M[DeleteNodegroupResponse]

  def describeCluster(describeClusterRequest: DescribeClusterRequest): M[DescribeClusterResponse]

  def describeFargateProfile(
      describeFargateProfileRequest: DescribeFargateProfileRequest
  ): M[DescribeFargateProfileResponse]

  def describeNodegroup(describeNodegroupRequest: DescribeNodegroupRequest): M[DescribeNodegroupResponse]

  def describeUpdate(describeUpdateRequest: DescribeUpdateRequest): M[DescribeUpdateResponse]

  def listClusters(listClustersRequest: ListClustersRequest): M[ListClustersResponse]

  def listClusters(): M[ListClustersResponse]

  def listFargateProfiles(listFargateProfilesRequest: ListFargateProfilesRequest): M[ListFargateProfilesResponse]

  def listNodegroups(listNodegroupsRequest: ListNodegroupsRequest): M[ListNodegroupsResponse]

  def listTagsForResource(listTagsForResourceRequest: ListTagsForResourceRequest): M[ListTagsForResourceResponse]

  def listUpdates(listUpdatesRequest: ListUpdatesRequest): M[ListUpdatesResponse]

  def tagResource(tagResourceRequest: TagResourceRequest): M[TagResourceResponse]

  def untagResource(untagResourceRequest: UntagResourceRequest): M[UntagResourceResponse]

  def updateClusterConfig(updateClusterConfigRequest: UpdateClusterConfigRequest): M[UpdateClusterConfigResponse]

  def updateClusterVersion(updateClusterVersionRequest: UpdateClusterVersionRequest): M[UpdateClusterVersionResponse]

  def updateNodegroupConfig(
      updateNodegroupConfigRequest: UpdateNodegroupConfigRequest
  ): M[UpdateNodegroupConfigResponse]

  def updateNodegroupVersion(
      updateNodegroupVersionRequest: UpdateNodegroupVersionRequest
  ): M[UpdateNodegroupVersionResponse]

}
