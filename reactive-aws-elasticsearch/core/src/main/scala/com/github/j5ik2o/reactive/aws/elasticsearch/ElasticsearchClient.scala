// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch

import software.amazon.awssdk.services.elasticsearch.model._

trait ElasticsearchClient[M[_]] {

  def addTags(addTagsRequest: AddTagsRequest): M[AddTagsResponse]

  def cancelElasticsearchServiceSoftwareUpdate(
      cancelElasticsearchServiceSoftwareUpdateRequest: CancelElasticsearchServiceSoftwareUpdateRequest
  ): M[CancelElasticsearchServiceSoftwareUpdateResponse]

  def createElasticsearchDomain(
      createElasticsearchDomainRequest: CreateElasticsearchDomainRequest
  ): M[CreateElasticsearchDomainResponse]

  def deleteElasticsearchDomain(
      deleteElasticsearchDomainRequest: DeleteElasticsearchDomainRequest
  ): M[DeleteElasticsearchDomainResponse]

  def deleteElasticsearchServiceRole(
      deleteElasticsearchServiceRoleRequest: DeleteElasticsearchServiceRoleRequest
  ): M[DeleteElasticsearchServiceRoleResponse]

  def deleteElasticsearchServiceRole(): M[DeleteElasticsearchServiceRoleResponse]

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

  def describeReservedElasticsearchInstanceOfferings(
      describeReservedElasticsearchInstanceOfferingsRequest: DescribeReservedElasticsearchInstanceOfferingsRequest
  ): M[DescribeReservedElasticsearchInstanceOfferingsResponse]

  def describeReservedElasticsearchInstanceOfferings(): M[DescribeReservedElasticsearchInstanceOfferingsResponse]

  def describeReservedElasticsearchInstances(
      describeReservedElasticsearchInstancesRequest: DescribeReservedElasticsearchInstancesRequest
  ): M[DescribeReservedElasticsearchInstancesResponse]

  def describeReservedElasticsearchInstances(): M[DescribeReservedElasticsearchInstancesResponse]

  def getCompatibleElasticsearchVersions(
      getCompatibleElasticsearchVersionsRequest: GetCompatibleElasticsearchVersionsRequest
  ): M[GetCompatibleElasticsearchVersionsResponse]

  def getCompatibleElasticsearchVersions(): M[GetCompatibleElasticsearchVersionsResponse]

  def getUpgradeHistory(getUpgradeHistoryRequest: GetUpgradeHistoryRequest): M[GetUpgradeHistoryResponse]

  def getUpgradeStatus(getUpgradeStatusRequest: GetUpgradeStatusRequest): M[GetUpgradeStatusResponse]

  def listDomainNames(listDomainNamesRequest: ListDomainNamesRequest): M[ListDomainNamesResponse]

  def listDomainNames(): M[ListDomainNamesResponse]

  def listElasticsearchInstanceTypes(
      listElasticsearchInstanceTypesRequest: ListElasticsearchInstanceTypesRequest
  ): M[ListElasticsearchInstanceTypesResponse]

  def listElasticsearchVersions(
      listElasticsearchVersionsRequest: ListElasticsearchVersionsRequest
  ): M[ListElasticsearchVersionsResponse]

  def listElasticsearchVersions(): M[ListElasticsearchVersionsResponse]

  def listTags(listTagsRequest: ListTagsRequest): M[ListTagsResponse]

  def purchaseReservedElasticsearchInstanceOffering(
      purchaseReservedElasticsearchInstanceOfferingRequest: PurchaseReservedElasticsearchInstanceOfferingRequest
  ): M[PurchaseReservedElasticsearchInstanceOfferingResponse]

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
