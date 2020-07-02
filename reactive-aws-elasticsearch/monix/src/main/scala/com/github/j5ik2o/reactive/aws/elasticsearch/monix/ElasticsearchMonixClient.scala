// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.monix

import software.amazon.awssdk.services.elasticsearch.model._
import com.github.j5ik2o.reactive.aws.elasticsearch.{ ElasticsearchAsyncClient, ElasticsearchClient }
import monix.eval.Task
import monix.reactive.Observable

object ElasticsearchMonixClient {

  def apply(asyncClient: ElasticsearchAsyncClient): ElasticsearchMonixClient =
    new ElasticsearchMonixClient {
      override val underlying: ElasticsearchAsyncClient = asyncClient
    }

}

trait ElasticsearchMonixClient extends ElasticsearchClient[Task] {

  val underlying: ElasticsearchAsyncClient

  override def addTags(addTagsRequest: AddTagsRequest): Task[AddTagsResponse] =
    Task.deferFuture {
      underlying.addTags(addTagsRequest)
    }

  override def associatePackage(associatePackageRequest: AssociatePackageRequest): Task[AssociatePackageResponse] =
    Task.deferFuture {
      underlying.associatePackage(associatePackageRequest)
    }

  override def cancelElasticsearchServiceSoftwareUpdate(
      cancelElasticsearchServiceSoftwareUpdateRequest: CancelElasticsearchServiceSoftwareUpdateRequest
  ): Task[CancelElasticsearchServiceSoftwareUpdateResponse] =
    Task.deferFuture {
      underlying.cancelElasticsearchServiceSoftwareUpdate(cancelElasticsearchServiceSoftwareUpdateRequest)
    }

  override def createElasticsearchDomain(
      createElasticsearchDomainRequest: CreateElasticsearchDomainRequest
  ): Task[CreateElasticsearchDomainResponse] =
    Task.deferFuture {
      underlying.createElasticsearchDomain(createElasticsearchDomainRequest)
    }

  override def createPackage(createPackageRequest: CreatePackageRequest): Task[CreatePackageResponse] =
    Task.deferFuture {
      underlying.createPackage(createPackageRequest)
    }

  override def deleteElasticsearchDomain(
      deleteElasticsearchDomainRequest: DeleteElasticsearchDomainRequest
  ): Task[DeleteElasticsearchDomainResponse] =
    Task.deferFuture {
      underlying.deleteElasticsearchDomain(deleteElasticsearchDomainRequest)
    }

  override def deleteElasticsearchServiceRole(
      deleteElasticsearchServiceRoleRequest: DeleteElasticsearchServiceRoleRequest
  ): Task[DeleteElasticsearchServiceRoleResponse] =
    Task.deferFuture {
      underlying.deleteElasticsearchServiceRole(deleteElasticsearchServiceRoleRequest)
    }

  override def deleteElasticsearchServiceRole(): Task[DeleteElasticsearchServiceRoleResponse] =
    Task.deferFuture {
      underlying.deleteElasticsearchServiceRole()
    }

  override def deletePackage(deletePackageRequest: DeletePackageRequest): Task[DeletePackageResponse] =
    Task.deferFuture {
      underlying.deletePackage(deletePackageRequest)
    }

  override def describeElasticsearchDomain(
      describeElasticsearchDomainRequest: DescribeElasticsearchDomainRequest
  ): Task[DescribeElasticsearchDomainResponse] =
    Task.deferFuture {
      underlying.describeElasticsearchDomain(describeElasticsearchDomainRequest)
    }

  override def describeElasticsearchDomainConfig(
      describeElasticsearchDomainConfigRequest: DescribeElasticsearchDomainConfigRequest
  ): Task[DescribeElasticsearchDomainConfigResponse] =
    Task.deferFuture {
      underlying.describeElasticsearchDomainConfig(describeElasticsearchDomainConfigRequest)
    }

  override def describeElasticsearchDomains(
      describeElasticsearchDomainsRequest: DescribeElasticsearchDomainsRequest
  ): Task[DescribeElasticsearchDomainsResponse] =
    Task.deferFuture {
      underlying.describeElasticsearchDomains(describeElasticsearchDomainsRequest)
    }

  override def describeElasticsearchInstanceTypeLimits(
      describeElasticsearchInstanceTypeLimitsRequest: DescribeElasticsearchInstanceTypeLimitsRequest
  ): Task[DescribeElasticsearchInstanceTypeLimitsResponse] =
    Task.deferFuture {
      underlying.describeElasticsearchInstanceTypeLimits(describeElasticsearchInstanceTypeLimitsRequest)
    }

  override def describePackages(describePackagesRequest: DescribePackagesRequest): Task[DescribePackagesResponse] =
    Task.deferFuture {
      underlying.describePackages(describePackagesRequest)
    }

  def describePackagesPaginator(
      describePackagesRequest: DescribePackagesRequest
  ): Observable[DescribePackagesResponse] =
    Observable.fromReactivePublisher(underlying.describePackagesPaginator(describePackagesRequest))

  override def describeReservedElasticsearchInstanceOfferings(
      describeReservedElasticsearchInstanceOfferingsRequest: DescribeReservedElasticsearchInstanceOfferingsRequest
  ): Task[DescribeReservedElasticsearchInstanceOfferingsResponse] =
    Task.deferFuture {
      underlying.describeReservedElasticsearchInstanceOfferings(describeReservedElasticsearchInstanceOfferingsRequest)
    }

  override def describeReservedElasticsearchInstanceOfferings()
      : Task[DescribeReservedElasticsearchInstanceOfferingsResponse] =
    Task.deferFuture {
      underlying.describeReservedElasticsearchInstanceOfferings()
    }

  def describeReservedElasticsearchInstanceOfferingsPaginator()
      : Observable[DescribeReservedElasticsearchInstanceOfferingsResponse] =
    Observable.fromReactivePublisher(underlying.describeReservedElasticsearchInstanceOfferingsPaginator())

  def describeReservedElasticsearchInstanceOfferingsPaginator(
      describeReservedElasticsearchInstanceOfferingsRequest: DescribeReservedElasticsearchInstanceOfferingsRequest
  ): Observable[DescribeReservedElasticsearchInstanceOfferingsResponse] =
    Observable.fromReactivePublisher(
      underlying.describeReservedElasticsearchInstanceOfferingsPaginator(
        describeReservedElasticsearchInstanceOfferingsRequest
      )
    )

  override def describeReservedElasticsearchInstances(
      describeReservedElasticsearchInstancesRequest: DescribeReservedElasticsearchInstancesRequest
  ): Task[DescribeReservedElasticsearchInstancesResponse] =
    Task.deferFuture {
      underlying.describeReservedElasticsearchInstances(describeReservedElasticsearchInstancesRequest)
    }

  override def describeReservedElasticsearchInstances(): Task[DescribeReservedElasticsearchInstancesResponse] =
    Task.deferFuture {
      underlying.describeReservedElasticsearchInstances()
    }

  def describeReservedElasticsearchInstancesPaginator(): Observable[DescribeReservedElasticsearchInstancesResponse] =
    Observable.fromReactivePublisher(underlying.describeReservedElasticsearchInstancesPaginator())

  def describeReservedElasticsearchInstancesPaginator(
      describeReservedElasticsearchInstancesRequest: DescribeReservedElasticsearchInstancesRequest
  ): Observable[DescribeReservedElasticsearchInstancesResponse] =
    Observable.fromReactivePublisher(
      underlying.describeReservedElasticsearchInstancesPaginator(describeReservedElasticsearchInstancesRequest)
    )

  override def dissociatePackage(dissociatePackageRequest: DissociatePackageRequest): Task[DissociatePackageResponse] =
    Task.deferFuture {
      underlying.dissociatePackage(dissociatePackageRequest)
    }

  override def getCompatibleElasticsearchVersions(
      getCompatibleElasticsearchVersionsRequest: GetCompatibleElasticsearchVersionsRequest
  ): Task[GetCompatibleElasticsearchVersionsResponse] =
    Task.deferFuture {
      underlying.getCompatibleElasticsearchVersions(getCompatibleElasticsearchVersionsRequest)
    }

  override def getCompatibleElasticsearchVersions(): Task[GetCompatibleElasticsearchVersionsResponse] =
    Task.deferFuture {
      underlying.getCompatibleElasticsearchVersions()
    }

  override def getUpgradeHistory(getUpgradeHistoryRequest: GetUpgradeHistoryRequest): Task[GetUpgradeHistoryResponse] =
    Task.deferFuture {
      underlying.getUpgradeHistory(getUpgradeHistoryRequest)
    }

  def getUpgradeHistoryPaginator(
      getUpgradeHistoryRequest: GetUpgradeHistoryRequest
  ): Observable[GetUpgradeHistoryResponse] =
    Observable.fromReactivePublisher(underlying.getUpgradeHistoryPaginator(getUpgradeHistoryRequest))

  override def getUpgradeStatus(getUpgradeStatusRequest: GetUpgradeStatusRequest): Task[GetUpgradeStatusResponse] =
    Task.deferFuture {
      underlying.getUpgradeStatus(getUpgradeStatusRequest)
    }

  override def listDomainNames(listDomainNamesRequest: ListDomainNamesRequest): Task[ListDomainNamesResponse] =
    Task.deferFuture {
      underlying.listDomainNames(listDomainNamesRequest)
    }

  override def listDomainNames(): Task[ListDomainNamesResponse] =
    Task.deferFuture {
      underlying.listDomainNames()
    }

  override def listDomainsForPackage(
      listDomainsForPackageRequest: ListDomainsForPackageRequest
  ): Task[ListDomainsForPackageResponse] =
    Task.deferFuture {
      underlying.listDomainsForPackage(listDomainsForPackageRequest)
    }

  def listDomainsForPackagePaginator(
      listDomainsForPackageRequest: ListDomainsForPackageRequest
  ): Observable[ListDomainsForPackageResponse] =
    Observable.fromReactivePublisher(underlying.listDomainsForPackagePaginator(listDomainsForPackageRequest))

  override def listElasticsearchInstanceTypes(
      listElasticsearchInstanceTypesRequest: ListElasticsearchInstanceTypesRequest
  ): Task[ListElasticsearchInstanceTypesResponse] =
    Task.deferFuture {
      underlying.listElasticsearchInstanceTypes(listElasticsearchInstanceTypesRequest)
    }

  def listElasticsearchInstanceTypesPaginator(
      listElasticsearchInstanceTypesRequest: ListElasticsearchInstanceTypesRequest
  ): Observable[ListElasticsearchInstanceTypesResponse] =
    Observable.fromReactivePublisher(
      underlying.listElasticsearchInstanceTypesPaginator(listElasticsearchInstanceTypesRequest)
    )

  override def listElasticsearchVersions(
      listElasticsearchVersionsRequest: ListElasticsearchVersionsRequest
  ): Task[ListElasticsearchVersionsResponse] =
    Task.deferFuture {
      underlying.listElasticsearchVersions(listElasticsearchVersionsRequest)
    }

  override def listElasticsearchVersions(): Task[ListElasticsearchVersionsResponse] =
    Task.deferFuture {
      underlying.listElasticsearchVersions()
    }

  def listElasticsearchVersionsPaginator(): Observable[ListElasticsearchVersionsResponse] =
    Observable.fromReactivePublisher(underlying.listElasticsearchVersionsPaginator())

  def listElasticsearchVersionsPaginator(
      listElasticsearchVersionsRequest: ListElasticsearchVersionsRequest
  ): Observable[ListElasticsearchVersionsResponse] =
    Observable.fromReactivePublisher(underlying.listElasticsearchVersionsPaginator(listElasticsearchVersionsRequest))

  override def listPackagesForDomain(
      listPackagesForDomainRequest: ListPackagesForDomainRequest
  ): Task[ListPackagesForDomainResponse] =
    Task.deferFuture {
      underlying.listPackagesForDomain(listPackagesForDomainRequest)
    }

  def listPackagesForDomainPaginator(
      listPackagesForDomainRequest: ListPackagesForDomainRequest
  ): Observable[ListPackagesForDomainResponse] =
    Observable.fromReactivePublisher(underlying.listPackagesForDomainPaginator(listPackagesForDomainRequest))

  override def listTags(listTagsRequest: ListTagsRequest): Task[ListTagsResponse] =
    Task.deferFuture {
      underlying.listTags(listTagsRequest)
    }

  override def purchaseReservedElasticsearchInstanceOffering(
      purchaseReservedElasticsearchInstanceOfferingRequest: PurchaseReservedElasticsearchInstanceOfferingRequest
  ): Task[PurchaseReservedElasticsearchInstanceOfferingResponse] =
    Task.deferFuture {
      underlying.purchaseReservedElasticsearchInstanceOffering(purchaseReservedElasticsearchInstanceOfferingRequest)
    }

  override def removeTags(removeTagsRequest: RemoveTagsRequest): Task[RemoveTagsResponse] =
    Task.deferFuture {
      underlying.removeTags(removeTagsRequest)
    }

  override def startElasticsearchServiceSoftwareUpdate(
      startElasticsearchServiceSoftwareUpdateRequest: StartElasticsearchServiceSoftwareUpdateRequest
  ): Task[StartElasticsearchServiceSoftwareUpdateResponse] =
    Task.deferFuture {
      underlying.startElasticsearchServiceSoftwareUpdate(startElasticsearchServiceSoftwareUpdateRequest)
    }

  override def updateElasticsearchDomainConfig(
      updateElasticsearchDomainConfigRequest: UpdateElasticsearchDomainConfigRequest
  ): Task[UpdateElasticsearchDomainConfigResponse] =
    Task.deferFuture {
      underlying.updateElasticsearchDomainConfig(updateElasticsearchDomainConfigRequest)
    }

  override def upgradeElasticsearchDomain(
      upgradeElasticsearchDomainRequest: UpgradeElasticsearchDomainRequest
  ): Task[UpgradeElasticsearchDomainResponse] =
    Task.deferFuture {
      underlying.upgradeElasticsearchDomain(upgradeElasticsearchDomainRequest)
    }

}
