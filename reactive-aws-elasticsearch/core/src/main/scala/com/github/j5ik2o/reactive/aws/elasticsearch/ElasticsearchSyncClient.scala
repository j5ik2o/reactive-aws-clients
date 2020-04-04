// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch

import com.github.j5ik2o.reactive.aws.utils.ToEitherSupport
import software.amazon.awssdk.services.elasticsearch.model._
import software.amazon.awssdk.services.elasticsearch.paginators._
import software.amazon.awssdk.services.elasticsearch.{ ElasticsearchClient => JavaElasticsearchSyncClient }

object ElasticsearchSyncClient extends ToEitherSupport {

  def apply(javaClient: JavaElasticsearchSyncClient): ElasticsearchSyncClient =
    new ElasticsearchSyncClient {
      override val underlying: JavaElasticsearchSyncClient = javaClient
    }
}

/**
  * @see https://sdk.amazonaws.com/java/api/latest/software/amazon/awssdk/services/elasticsearch/ElasticsearchClient.html
  */
trait ElasticsearchSyncClient extends ElasticsearchClient[Either[Throwable, ?]] {
  val underlying: JavaElasticsearchSyncClient

  import ElasticsearchSyncClient._

  override def addTags(addTagsRequest: AddTagsRequest): Either[Throwable, AddTagsResponse] =
    underlying.addTags(addTagsRequest).toEither

  override def associatePackage(
      associatePackageRequest: AssociatePackageRequest
  ): Either[Throwable, AssociatePackageResponse] =
    underlying.associatePackage(associatePackageRequest).toEither

  override def cancelElasticsearchServiceSoftwareUpdate(
      cancelElasticsearchServiceSoftwareUpdateRequest: CancelElasticsearchServiceSoftwareUpdateRequest
  ): Either[Throwable, CancelElasticsearchServiceSoftwareUpdateResponse] =
    underlying.cancelElasticsearchServiceSoftwareUpdate(cancelElasticsearchServiceSoftwareUpdateRequest).toEither

  override def createElasticsearchDomain(
      createElasticsearchDomainRequest: CreateElasticsearchDomainRequest
  ): Either[Throwable, CreateElasticsearchDomainResponse] =
    underlying.createElasticsearchDomain(createElasticsearchDomainRequest).toEither

  override def createPackage(createPackageRequest: CreatePackageRequest): Either[Throwable, CreatePackageResponse] =
    underlying.createPackage(createPackageRequest).toEither

  override def deleteElasticsearchDomain(
      deleteElasticsearchDomainRequest: DeleteElasticsearchDomainRequest
  ): Either[Throwable, DeleteElasticsearchDomainResponse] =
    underlying.deleteElasticsearchDomain(deleteElasticsearchDomainRequest).toEither

  override def deleteElasticsearchServiceRole(): Either[Throwable, DeleteElasticsearchServiceRoleResponse] =
    underlying.deleteElasticsearchServiceRole().toEither

  override def deleteElasticsearchServiceRole(
      deleteElasticsearchServiceRoleRequest: DeleteElasticsearchServiceRoleRequest
  ): Either[Throwable, DeleteElasticsearchServiceRoleResponse] =
    underlying.deleteElasticsearchServiceRole(deleteElasticsearchServiceRoleRequest).toEither

  override def deletePackage(deletePackageRequest: DeletePackageRequest): Either[Throwable, DeletePackageResponse] =
    underlying.deletePackage(deletePackageRequest).toEither

  override def describeElasticsearchDomain(
      describeElasticsearchDomainRequest: DescribeElasticsearchDomainRequest
  ): Either[Throwable, DescribeElasticsearchDomainResponse] =
    underlying.describeElasticsearchDomain(describeElasticsearchDomainRequest).toEither

  override def describeElasticsearchDomainConfig(
      describeElasticsearchDomainConfigRequest: DescribeElasticsearchDomainConfigRequest
  ): Either[Throwable, DescribeElasticsearchDomainConfigResponse] =
    underlying.describeElasticsearchDomainConfig(describeElasticsearchDomainConfigRequest).toEither

  override def describeElasticsearchDomains(
      describeElasticsearchDomainsRequest: DescribeElasticsearchDomainsRequest
  ): Either[Throwable, DescribeElasticsearchDomainsResponse] =
    underlying.describeElasticsearchDomains(describeElasticsearchDomainsRequest).toEither

  override def describeElasticsearchInstanceTypeLimits(
      describeElasticsearchInstanceTypeLimitsRequest: DescribeElasticsearchInstanceTypeLimitsRequest
  ): Either[Throwable, DescribeElasticsearchInstanceTypeLimitsResponse] =
    underlying.describeElasticsearchInstanceTypeLimits(describeElasticsearchInstanceTypeLimitsRequest).toEither

  override def describePackages(
      describePackagesRequest: DescribePackagesRequest
  ): Either[Throwable, DescribePackagesResponse] =
    underlying.describePackages(describePackagesRequest).toEither

  def describePackagesPaginator(describePackagesRequest: DescribePackagesRequest): DescribePackagesIterable =
    underlying.describePackagesPaginator(describePackagesRequest)

  override def describeReservedElasticsearchInstanceOfferings()
      : Either[Throwable, DescribeReservedElasticsearchInstanceOfferingsResponse] =
    underlying.describeReservedElasticsearchInstanceOfferings().toEither

  override def describeReservedElasticsearchInstanceOfferings(
      describeReservedElasticsearchInstanceOfferingsRequest: DescribeReservedElasticsearchInstanceOfferingsRequest
  ): Either[Throwable, DescribeReservedElasticsearchInstanceOfferingsResponse] =
    underlying
      .describeReservedElasticsearchInstanceOfferings(describeReservedElasticsearchInstanceOfferingsRequest).toEither

  def describeReservedElasticsearchInstanceOfferingsPaginator()
      : DescribeReservedElasticsearchInstanceOfferingsIterable =
    underlying.describeReservedElasticsearchInstanceOfferingsPaginator()

  def describeReservedElasticsearchInstanceOfferingsPaginator(
      describeReservedElasticsearchInstanceOfferingsRequest: DescribeReservedElasticsearchInstanceOfferingsRequest
  ): DescribeReservedElasticsearchInstanceOfferingsIterable =
    underlying.describeReservedElasticsearchInstanceOfferingsPaginator(
      describeReservedElasticsearchInstanceOfferingsRequest
    )

  override def describeReservedElasticsearchInstances()
      : Either[Throwable, DescribeReservedElasticsearchInstancesResponse] =
    underlying.describeReservedElasticsearchInstances().toEither

  override def describeReservedElasticsearchInstances(
      describeReservedElasticsearchInstancesRequest: DescribeReservedElasticsearchInstancesRequest
  ): Either[Throwable, DescribeReservedElasticsearchInstancesResponse] =
    underlying.describeReservedElasticsearchInstances(describeReservedElasticsearchInstancesRequest).toEither

  def describeReservedElasticsearchInstancesPaginator(): DescribeReservedElasticsearchInstancesIterable =
    underlying.describeReservedElasticsearchInstancesPaginator()

  def describeReservedElasticsearchInstancesPaginator(
      describeReservedElasticsearchInstancesRequest: DescribeReservedElasticsearchInstancesRequest
  ): DescribeReservedElasticsearchInstancesIterable =
    underlying.describeReservedElasticsearchInstancesPaginator(describeReservedElasticsearchInstancesRequest)

  override def dissociatePackage(
      dissociatePackageRequest: DissociatePackageRequest
  ): Either[Throwable, DissociatePackageResponse] =
    underlying.dissociatePackage(dissociatePackageRequest).toEither

  override def getCompatibleElasticsearchVersions(): Either[Throwable, GetCompatibleElasticsearchVersionsResponse] =
    underlying.getCompatibleElasticsearchVersions().toEither

  override def getCompatibleElasticsearchVersions(
      getCompatibleElasticsearchVersionsRequest: GetCompatibleElasticsearchVersionsRequest
  ): Either[Throwable, GetCompatibleElasticsearchVersionsResponse] =
    underlying.getCompatibleElasticsearchVersions(getCompatibleElasticsearchVersionsRequest).toEither

  override def getUpgradeHistory(
      getUpgradeHistoryRequest: GetUpgradeHistoryRequest
  ): Either[Throwable, GetUpgradeHistoryResponse] =
    underlying.getUpgradeHistory(getUpgradeHistoryRequest).toEither

  def getUpgradeHistoryPaginator(getUpgradeHistoryRequest: GetUpgradeHistoryRequest): GetUpgradeHistoryIterable =
    underlying.getUpgradeHistoryPaginator(getUpgradeHistoryRequest)

  override def getUpgradeStatus(
      getUpgradeStatusRequest: GetUpgradeStatusRequest
  ): Either[Throwable, GetUpgradeStatusResponse] =
    underlying.getUpgradeStatus(getUpgradeStatusRequest).toEither

  override def listDomainNames(): Either[Throwable, ListDomainNamesResponse] =
    underlying.listDomainNames().toEither

  override def listDomainNames(
      listDomainNamesRequest: ListDomainNamesRequest
  ): Either[Throwable, ListDomainNamesResponse] =
    underlying.listDomainNames(listDomainNamesRequest).toEither

  override def listDomainsForPackage(
      listDomainsForPackageRequest: ListDomainsForPackageRequest
  ): Either[Throwable, ListDomainsForPackageResponse] =
    underlying.listDomainsForPackage(listDomainsForPackageRequest).toEither

  def listDomainsForPackagePaginator(
      listDomainsForPackageRequest: ListDomainsForPackageRequest
  ): ListDomainsForPackageIterable =
    underlying.listDomainsForPackagePaginator(listDomainsForPackageRequest)

  override def listElasticsearchInstanceTypes(
      listElasticsearchInstanceTypesRequest: ListElasticsearchInstanceTypesRequest
  ): Either[Throwable, ListElasticsearchInstanceTypesResponse] =
    underlying.listElasticsearchInstanceTypes(listElasticsearchInstanceTypesRequest).toEither

  def listElasticsearchInstanceTypesPaginator(
      listElasticsearchInstanceTypesRequest: ListElasticsearchInstanceTypesRequest
  ): ListElasticsearchInstanceTypesIterable =
    underlying.listElasticsearchInstanceTypesPaginator(listElasticsearchInstanceTypesRequest)

  override def listElasticsearchVersions(): Either[Throwable, ListElasticsearchVersionsResponse] =
    underlying.listElasticsearchVersions().toEither

  override def listElasticsearchVersions(
      listElasticsearchVersionsRequest: ListElasticsearchVersionsRequest
  ): Either[Throwable, ListElasticsearchVersionsResponse] =
    underlying.listElasticsearchVersions(listElasticsearchVersionsRequest).toEither

  def listElasticsearchVersionsPaginator(): ListElasticsearchVersionsIterable =
    underlying.listElasticsearchVersionsPaginator()

  def listElasticsearchVersionsPaginator(
      listElasticsearchVersionsRequest: ListElasticsearchVersionsRequest
  ): ListElasticsearchVersionsIterable =
    underlying.listElasticsearchVersionsPaginator(listElasticsearchVersionsRequest)

  override def listPackagesForDomain(
      listPackagesForDomainRequest: ListPackagesForDomainRequest
  ): Either[Throwable, ListPackagesForDomainResponse] =
    underlying.listPackagesForDomain(listPackagesForDomainRequest).toEither

  def listPackagesForDomainPaginator(
      listPackagesForDomainRequest: ListPackagesForDomainRequest
  ): ListPackagesForDomainIterable =
    underlying.listPackagesForDomainPaginator(listPackagesForDomainRequest)

  override def listTags(listTagsRequest: ListTagsRequest): Either[Throwable, ListTagsResponse] =
    underlying.listTags(listTagsRequest).toEither

  override def purchaseReservedElasticsearchInstanceOffering(
      purchaseReservedElasticsearchInstanceOfferingRequest: PurchaseReservedElasticsearchInstanceOfferingRequest
  ): Either[Throwable, PurchaseReservedElasticsearchInstanceOfferingResponse] =
    underlying
      .purchaseReservedElasticsearchInstanceOffering(purchaseReservedElasticsearchInstanceOfferingRequest).toEither

  override def removeTags(removeTagsRequest: RemoveTagsRequest): Either[Throwable, RemoveTagsResponse] =
    underlying.removeTags(removeTagsRequest).toEither

  override def startElasticsearchServiceSoftwareUpdate(
      startElasticsearchServiceSoftwareUpdateRequest: StartElasticsearchServiceSoftwareUpdateRequest
  ): Either[Throwable, StartElasticsearchServiceSoftwareUpdateResponse] =
    underlying.startElasticsearchServiceSoftwareUpdate(startElasticsearchServiceSoftwareUpdateRequest).toEither

  override def updateElasticsearchDomainConfig(
      updateElasticsearchDomainConfigRequest: UpdateElasticsearchDomainConfigRequest
  ): Either[Throwable, UpdateElasticsearchDomainConfigResponse] =
    underlying.updateElasticsearchDomainConfig(updateElasticsearchDomainConfigRequest).toEither

  override def upgradeElasticsearchDomain(
      upgradeElasticsearchDomainRequest: UpgradeElasticsearchDomainRequest
  ): Either[Throwable, UpgradeElasticsearchDomainResponse] =
    underlying.upgradeElasticsearchDomain(upgradeElasticsearchDomainRequest).toEither

}
