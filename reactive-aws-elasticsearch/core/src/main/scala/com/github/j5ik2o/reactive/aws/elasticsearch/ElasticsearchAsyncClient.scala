// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch

import software.amazon.awssdk.services.elasticsearch.model._
import software.amazon.awssdk.services.elasticsearch.paginators._
import software.amazon.awssdk.services.elasticsearch.{ ElasticsearchAsyncClient => JavaElasticsearchAsyncClient }

import scala.compat.java8.FutureConverters._
import scala.concurrent.Future

object ElasticsearchAsyncClient {

  def apply(javaClient: JavaElasticsearchAsyncClient): ElasticsearchAsyncClient =
    new ElasticsearchAsyncClient {
      override val underlying: JavaElasticsearchAsyncClient = javaClient
    }

}

/**
  * @see https://sdk.amazonaws.com/java/api/latest/software/amazon/awssdk/services/elasticsearch/ElasticsearchAsyncClient.html */
trait ElasticsearchAsyncClient extends ElasticsearchClient[Future] {
  val underlying: JavaElasticsearchAsyncClient

  override def addTags(addTagsRequest: AddTagsRequest): Future[AddTagsResponse] =
    underlying.addTags(addTagsRequest).toScala

  override def associatePackage(associatePackageRequest: AssociatePackageRequest): Future[AssociatePackageResponse] =
    underlying.associatePackage(associatePackageRequest).toScala

  override def cancelElasticsearchServiceSoftwareUpdate(
      cancelElasticsearchServiceSoftwareUpdateRequest: CancelElasticsearchServiceSoftwareUpdateRequest
  ): Future[CancelElasticsearchServiceSoftwareUpdateResponse] =
    underlying.cancelElasticsearchServiceSoftwareUpdate(cancelElasticsearchServiceSoftwareUpdateRequest).toScala

  override def createElasticsearchDomain(
      createElasticsearchDomainRequest: CreateElasticsearchDomainRequest
  ): Future[CreateElasticsearchDomainResponse] =
    underlying.createElasticsearchDomain(createElasticsearchDomainRequest).toScala

  override def createPackage(createPackageRequest: CreatePackageRequest): Future[CreatePackageResponse] =
    underlying.createPackage(createPackageRequest).toScala

  override def deleteElasticsearchDomain(
      deleteElasticsearchDomainRequest: DeleteElasticsearchDomainRequest
  ): Future[DeleteElasticsearchDomainResponse] =
    underlying.deleteElasticsearchDomain(deleteElasticsearchDomainRequest).toScala

  override def deleteElasticsearchServiceRole(
      deleteElasticsearchServiceRoleRequest: DeleteElasticsearchServiceRoleRequest
  ): Future[DeleteElasticsearchServiceRoleResponse] =
    underlying.deleteElasticsearchServiceRole(deleteElasticsearchServiceRoleRequest).toScala

  override def deleteElasticsearchServiceRole(): Future[DeleteElasticsearchServiceRoleResponse] =
    underlying.deleteElasticsearchServiceRole().toScala

  override def deletePackage(deletePackageRequest: DeletePackageRequest): Future[DeletePackageResponse] =
    underlying.deletePackage(deletePackageRequest).toScala

  override def describeElasticsearchDomain(
      describeElasticsearchDomainRequest: DescribeElasticsearchDomainRequest
  ): Future[DescribeElasticsearchDomainResponse] =
    underlying.describeElasticsearchDomain(describeElasticsearchDomainRequest).toScala

  override def describeElasticsearchDomainConfig(
      describeElasticsearchDomainConfigRequest: DescribeElasticsearchDomainConfigRequest
  ): Future[DescribeElasticsearchDomainConfigResponse] =
    underlying.describeElasticsearchDomainConfig(describeElasticsearchDomainConfigRequest).toScala

  override def describeElasticsearchDomains(
      describeElasticsearchDomainsRequest: DescribeElasticsearchDomainsRequest
  ): Future[DescribeElasticsearchDomainsResponse] =
    underlying.describeElasticsearchDomains(describeElasticsearchDomainsRequest).toScala

  override def describeElasticsearchInstanceTypeLimits(
      describeElasticsearchInstanceTypeLimitsRequest: DescribeElasticsearchInstanceTypeLimitsRequest
  ): Future[DescribeElasticsearchInstanceTypeLimitsResponse] =
    underlying.describeElasticsearchInstanceTypeLimits(describeElasticsearchInstanceTypeLimitsRequest).toScala

  override def describePackages(describePackagesRequest: DescribePackagesRequest): Future[DescribePackagesResponse] =
    underlying.describePackages(describePackagesRequest).toScala

  def describePackagesPaginator(describePackagesRequest: DescribePackagesRequest): DescribePackagesPublisher =
    underlying.describePackagesPaginator(describePackagesRequest)

  override def describeReservedElasticsearchInstanceOfferings(
      describeReservedElasticsearchInstanceOfferingsRequest: DescribeReservedElasticsearchInstanceOfferingsRequest
  ): Future[DescribeReservedElasticsearchInstanceOfferingsResponse] =
    underlying
      .describeReservedElasticsearchInstanceOfferings(describeReservedElasticsearchInstanceOfferingsRequest).toScala

  override def describeReservedElasticsearchInstanceOfferings()
      : Future[DescribeReservedElasticsearchInstanceOfferingsResponse] =
    underlying.describeReservedElasticsearchInstanceOfferings().toScala

  def describeReservedElasticsearchInstanceOfferingsPaginator()
      : DescribeReservedElasticsearchInstanceOfferingsPublisher =
    underlying.describeReservedElasticsearchInstanceOfferingsPaginator()

  def describeReservedElasticsearchInstanceOfferingsPaginator(
      describeReservedElasticsearchInstanceOfferingsRequest: DescribeReservedElasticsearchInstanceOfferingsRequest
  ): DescribeReservedElasticsearchInstanceOfferingsPublisher =
    underlying.describeReservedElasticsearchInstanceOfferingsPaginator(
      describeReservedElasticsearchInstanceOfferingsRequest
    )

  override def describeReservedElasticsearchInstances(
      describeReservedElasticsearchInstancesRequest: DescribeReservedElasticsearchInstancesRequest
  ): Future[DescribeReservedElasticsearchInstancesResponse] =
    underlying.describeReservedElasticsearchInstances(describeReservedElasticsearchInstancesRequest).toScala

  override def describeReservedElasticsearchInstances(): Future[DescribeReservedElasticsearchInstancesResponse] =
    underlying.describeReservedElasticsearchInstances().toScala

  def describeReservedElasticsearchInstancesPaginator(): DescribeReservedElasticsearchInstancesPublisher =
    underlying.describeReservedElasticsearchInstancesPaginator()

  def describeReservedElasticsearchInstancesPaginator(
      describeReservedElasticsearchInstancesRequest: DescribeReservedElasticsearchInstancesRequest
  ): DescribeReservedElasticsearchInstancesPublisher =
    underlying.describeReservedElasticsearchInstancesPaginator(describeReservedElasticsearchInstancesRequest)

  override def dissociatePackage(
      dissociatePackageRequest: DissociatePackageRequest
  ): Future[DissociatePackageResponse] =
    underlying.dissociatePackage(dissociatePackageRequest).toScala

  override def getCompatibleElasticsearchVersions(
      getCompatibleElasticsearchVersionsRequest: GetCompatibleElasticsearchVersionsRequest
  ): Future[GetCompatibleElasticsearchVersionsResponse] =
    underlying.getCompatibleElasticsearchVersions(getCompatibleElasticsearchVersionsRequest).toScala

  override def getCompatibleElasticsearchVersions(): Future[GetCompatibleElasticsearchVersionsResponse] =
    underlying.getCompatibleElasticsearchVersions().toScala

  override def getUpgradeHistory(
      getUpgradeHistoryRequest: GetUpgradeHistoryRequest
  ): Future[GetUpgradeHistoryResponse] =
    underlying.getUpgradeHistory(getUpgradeHistoryRequest).toScala

  def getUpgradeHistoryPaginator(getUpgradeHistoryRequest: GetUpgradeHistoryRequest): GetUpgradeHistoryPublisher =
    underlying.getUpgradeHistoryPaginator(getUpgradeHistoryRequest)

  override def getUpgradeStatus(getUpgradeStatusRequest: GetUpgradeStatusRequest): Future[GetUpgradeStatusResponse] =
    underlying.getUpgradeStatus(getUpgradeStatusRequest).toScala

  override def listDomainNames(listDomainNamesRequest: ListDomainNamesRequest): Future[ListDomainNamesResponse] =
    underlying.listDomainNames(listDomainNamesRequest).toScala

  override def listDomainNames(): Future[ListDomainNamesResponse] =
    underlying.listDomainNames().toScala

  override def listDomainsForPackage(
      listDomainsForPackageRequest: ListDomainsForPackageRequest
  ): Future[ListDomainsForPackageResponse] =
    underlying.listDomainsForPackage(listDomainsForPackageRequest).toScala

  def listDomainsForPackagePaginator(
      listDomainsForPackageRequest: ListDomainsForPackageRequest
  ): ListDomainsForPackagePublisher =
    underlying.listDomainsForPackagePaginator(listDomainsForPackageRequest)

  override def listElasticsearchInstanceTypes(
      listElasticsearchInstanceTypesRequest: ListElasticsearchInstanceTypesRequest
  ): Future[ListElasticsearchInstanceTypesResponse] =
    underlying.listElasticsearchInstanceTypes(listElasticsearchInstanceTypesRequest).toScala

  def listElasticsearchInstanceTypesPaginator(
      listElasticsearchInstanceTypesRequest: ListElasticsearchInstanceTypesRequest
  ): ListElasticsearchInstanceTypesPublisher =
    underlying.listElasticsearchInstanceTypesPaginator(listElasticsearchInstanceTypesRequest)

  override def listElasticsearchVersions(
      listElasticsearchVersionsRequest: ListElasticsearchVersionsRequest
  ): Future[ListElasticsearchVersionsResponse] =
    underlying.listElasticsearchVersions(listElasticsearchVersionsRequest).toScala

  override def listElasticsearchVersions(): Future[ListElasticsearchVersionsResponse] =
    underlying.listElasticsearchVersions().toScala

  def listElasticsearchVersionsPaginator(): ListElasticsearchVersionsPublisher =
    underlying.listElasticsearchVersionsPaginator()

  def listElasticsearchVersionsPaginator(
      listElasticsearchVersionsRequest: ListElasticsearchVersionsRequest
  ): ListElasticsearchVersionsPublisher =
    underlying.listElasticsearchVersionsPaginator(listElasticsearchVersionsRequest)

  override def listPackagesForDomain(
      listPackagesForDomainRequest: ListPackagesForDomainRequest
  ): Future[ListPackagesForDomainResponse] =
    underlying.listPackagesForDomain(listPackagesForDomainRequest).toScala

  def listPackagesForDomainPaginator(
      listPackagesForDomainRequest: ListPackagesForDomainRequest
  ): ListPackagesForDomainPublisher =
    underlying.listPackagesForDomainPaginator(listPackagesForDomainRequest)

  override def listTags(listTagsRequest: ListTagsRequest): Future[ListTagsResponse] =
    underlying.listTags(listTagsRequest).toScala

  override def purchaseReservedElasticsearchInstanceOffering(
      purchaseReservedElasticsearchInstanceOfferingRequest: PurchaseReservedElasticsearchInstanceOfferingRequest
  ): Future[PurchaseReservedElasticsearchInstanceOfferingResponse] =
    underlying
      .purchaseReservedElasticsearchInstanceOffering(purchaseReservedElasticsearchInstanceOfferingRequest).toScala

  override def removeTags(removeTagsRequest: RemoveTagsRequest): Future[RemoveTagsResponse] =
    underlying.removeTags(removeTagsRequest).toScala

  override def startElasticsearchServiceSoftwareUpdate(
      startElasticsearchServiceSoftwareUpdateRequest: StartElasticsearchServiceSoftwareUpdateRequest
  ): Future[StartElasticsearchServiceSoftwareUpdateResponse] =
    underlying.startElasticsearchServiceSoftwareUpdate(startElasticsearchServiceSoftwareUpdateRequest).toScala

  override def updateElasticsearchDomainConfig(
      updateElasticsearchDomainConfigRequest: UpdateElasticsearchDomainConfigRequest
  ): Future[UpdateElasticsearchDomainConfigResponse] =
    underlying.updateElasticsearchDomainConfig(updateElasticsearchDomainConfigRequest).toScala

  override def upgradeElasticsearchDomain(
      upgradeElasticsearchDomainRequest: UpgradeElasticsearchDomainRequest
  ): Future[UpgradeElasticsearchDomainResponse] =
    underlying.upgradeElasticsearchDomain(upgradeElasticsearchDomainRequest).toScala

}
