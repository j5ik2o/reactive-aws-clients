// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch

import software.amazon.awssdk.services.elasticsearch.model._

trait ElasticsearchClient[M[_]] {

  def acceptInboundCrossClusterSearchConnection(
      acceptInboundCrossClusterSearchConnectionRequest: AcceptInboundCrossClusterSearchConnectionRequest
  ): M[AcceptInboundCrossClusterSearchConnectionResponse]

  def addTags(addTagsRequest: AddTagsRequest): M[AddTagsResponse]

  def associatePackage(associatePackageRequest: AssociatePackageRequest): M[AssociatePackageResponse]

  def cancelElasticsearchServiceSoftwareUpdate(
      cancelElasticsearchServiceSoftwareUpdateRequest: CancelElasticsearchServiceSoftwareUpdateRequest
  ): M[CancelElasticsearchServiceSoftwareUpdateResponse]

  def createElasticsearchDomain(
      createElasticsearchDomainRequest: CreateElasticsearchDomainRequest
  ): M[CreateElasticsearchDomainResponse]

  def createOutboundCrossClusterSearchConnection(
      createOutboundCrossClusterSearchConnectionRequest: CreateOutboundCrossClusterSearchConnectionRequest
  ): M[CreateOutboundCrossClusterSearchConnectionResponse]

  def createPackage(createPackageRequest: CreatePackageRequest): M[CreatePackageResponse]

  def deleteElasticsearchDomain(
      deleteElasticsearchDomainRequest: DeleteElasticsearchDomainRequest
  ): M[DeleteElasticsearchDomainResponse]

  def deleteElasticsearchServiceRole(
      deleteElasticsearchServiceRoleRequest: DeleteElasticsearchServiceRoleRequest
  ): M[DeleteElasticsearchServiceRoleResponse]

  def deleteElasticsearchServiceRole(): M[DeleteElasticsearchServiceRoleResponse]

  def deleteInboundCrossClusterSearchConnection(
      deleteInboundCrossClusterSearchConnectionRequest: DeleteInboundCrossClusterSearchConnectionRequest
  ): M[DeleteInboundCrossClusterSearchConnectionResponse]

  def deleteOutboundCrossClusterSearchConnection(
      deleteOutboundCrossClusterSearchConnectionRequest: DeleteOutboundCrossClusterSearchConnectionRequest
  ): M[DeleteOutboundCrossClusterSearchConnectionResponse]

  def deletePackage(deletePackageRequest: DeletePackageRequest): M[DeletePackageResponse]

  def describeElasticsearchDomain(
      describeElasticsearchDomainRequest: DescribeElasticsearchDomainRequest
  ): M[DescribeElasticsearchDomainResponse]

  def describeElasticsearchDomainConfig(
      describeElasticsearchDomainConfigRequest: DescribeElasticsearchDomainConfigRequest
  ): M[DescribeElasticsearchDomainConfigResponse]

  def describeElasticsearchDomains(
      describeElasticsearchDomainsRequest: DescribeElasticsearchDomainsRequest
  ): M[DescribeElasticsearchDomainsResponse]

  def describeElasticsearchInstanceTypeLimits(
      describeElasticsearchInstanceTypeLimitsRequest: DescribeElasticsearchInstanceTypeLimitsRequest
  ): M[DescribeElasticsearchInstanceTypeLimitsResponse]

  def describeInboundCrossClusterSearchConnections(
      describeInboundCrossClusterSearchConnectionsRequest: DescribeInboundCrossClusterSearchConnectionsRequest
  ): M[DescribeInboundCrossClusterSearchConnectionsResponse]

  def describeOutboundCrossClusterSearchConnections(
      describeOutboundCrossClusterSearchConnectionsRequest: DescribeOutboundCrossClusterSearchConnectionsRequest
  ): M[DescribeOutboundCrossClusterSearchConnectionsResponse]

  def describePackages(describePackagesRequest: DescribePackagesRequest): M[DescribePackagesResponse]

  def describeReservedElasticsearchInstanceOfferings(
      describeReservedElasticsearchInstanceOfferingsRequest: DescribeReservedElasticsearchInstanceOfferingsRequest
  ): M[DescribeReservedElasticsearchInstanceOfferingsResponse]

  def describeReservedElasticsearchInstanceOfferings(): M[DescribeReservedElasticsearchInstanceOfferingsResponse]

  def describeReservedElasticsearchInstances(
      describeReservedElasticsearchInstancesRequest: DescribeReservedElasticsearchInstancesRequest
  ): M[DescribeReservedElasticsearchInstancesResponse]

  def describeReservedElasticsearchInstances(): M[DescribeReservedElasticsearchInstancesResponse]

  def dissociatePackage(dissociatePackageRequest: DissociatePackageRequest): M[DissociatePackageResponse]

  def getCompatibleElasticsearchVersions(
      getCompatibleElasticsearchVersionsRequest: GetCompatibleElasticsearchVersionsRequest
  ): M[GetCompatibleElasticsearchVersionsResponse]

  def getCompatibleElasticsearchVersions(): M[GetCompatibleElasticsearchVersionsResponse]

  def getUpgradeHistory(getUpgradeHistoryRequest: GetUpgradeHistoryRequest): M[GetUpgradeHistoryResponse]

  def getUpgradeStatus(getUpgradeStatusRequest: GetUpgradeStatusRequest): M[GetUpgradeStatusResponse]

  def listDomainNames(listDomainNamesRequest: ListDomainNamesRequest): M[ListDomainNamesResponse]

  def listDomainNames(): M[ListDomainNamesResponse]

  def listDomainsForPackage(
      listDomainsForPackageRequest: ListDomainsForPackageRequest
  ): M[ListDomainsForPackageResponse]

  def listElasticsearchInstanceTypes(
      listElasticsearchInstanceTypesRequest: ListElasticsearchInstanceTypesRequest
  ): M[ListElasticsearchInstanceTypesResponse]

  def listElasticsearchVersions(
      listElasticsearchVersionsRequest: ListElasticsearchVersionsRequest
  ): M[ListElasticsearchVersionsResponse]

  def listElasticsearchVersions(): M[ListElasticsearchVersionsResponse]

  def listPackagesForDomain(
      listPackagesForDomainRequest: ListPackagesForDomainRequest
  ): M[ListPackagesForDomainResponse]

  def listTags(listTagsRequest: ListTagsRequest): M[ListTagsResponse]

  def purchaseReservedElasticsearchInstanceOffering(
      purchaseReservedElasticsearchInstanceOfferingRequest: PurchaseReservedElasticsearchInstanceOfferingRequest
  ): M[PurchaseReservedElasticsearchInstanceOfferingResponse]

  def rejectInboundCrossClusterSearchConnection(
      rejectInboundCrossClusterSearchConnectionRequest: RejectInboundCrossClusterSearchConnectionRequest
  ): M[RejectInboundCrossClusterSearchConnectionResponse]

  def removeTags(removeTagsRequest: RemoveTagsRequest): M[RemoveTagsResponse]

  def startElasticsearchServiceSoftwareUpdate(
      startElasticsearchServiceSoftwareUpdateRequest: StartElasticsearchServiceSoftwareUpdateRequest
  ): M[StartElasticsearchServiceSoftwareUpdateResponse]

  def updateElasticsearchDomainConfig(
      updateElasticsearchDomainConfigRequest: UpdateElasticsearchDomainConfigRequest
  ): M[UpdateElasticsearchDomainConfigResponse]

  def upgradeElasticsearchDomain(
      upgradeElasticsearchDomainRequest: UpgradeElasticsearchDomainRequest
  ): M[UpgradeElasticsearchDomainResponse]

}
