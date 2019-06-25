// Auto-Generated
package com.github.j5ik2o.reactive.aws.eks

import software.amazon.awssdk.services.eks.model._

trait EksClient[M[_]] {

  def createCluster(createClusterRequest: CreateClusterRequest): M[CreateClusterResponse]

  def deleteCluster(deleteClusterRequest: DeleteClusterRequest): M[DeleteClusterResponse]

  def describeCluster(describeClusterRequest: DescribeClusterRequest): M[DescribeClusterResponse]

  def describeUpdate(describeUpdateRequest: DescribeUpdateRequest): M[DescribeUpdateResponse]

  def listClusters(listClustersRequest: ListClustersRequest): M[ListClustersResponse]

  def listClusters(): M[ListClustersResponse]

  def listUpdates(listUpdatesRequest: ListUpdatesRequest): M[ListUpdatesResponse]

  def updateClusterConfig(updateClusterConfigRequest: UpdateClusterConfigRequest): M[UpdateClusterConfigResponse]

  def updateClusterVersion(updateClusterVersionRequest: UpdateClusterVersionRequest): M[UpdateClusterVersionResponse]

}
