// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.akka

import akka.NotUsed
import akka.stream.scaladsl.{ Flow, Source }
import com.github.j5ik2o.reactive.aws.elasticsearch.ElasticsearchAsyncClient
import software.amazon.awssdk.services.elasticsearch.model._

object ElasticsearchAkkaClient {

  def apply(asyncClient: ElasticsearchAsyncClient): ElasticsearchAkkaClient = new ElasticsearchAkkaClient {
    override val underlying: ElasticsearchAsyncClient = asyncClient
  }

  val DefaultParallelism: Int = 1

}

trait ElasticsearchAkkaClient {

  import ElasticsearchAkkaClient._

  val underlying: ElasticsearchAsyncClient

  def addTagsSource(
      addTagsRequest: AddTagsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[AddTagsResponse, NotUsed] =
    Source.single(addTagsRequest).via(addTagsFlow(parallelism))

  def addTagsFlow(parallelism: Int = DefaultParallelism): Flow[AddTagsRequest, AddTagsResponse, NotUsed] =
    Flow[AddTagsRequest].mapAsync(parallelism) { addTagsRequest =>
      underlying.addTags(addTagsRequest)
    }

  def associatePackageSource(
      associatePackageRequest: AssociatePackageRequest,
      parallelism: Int = DefaultParallelism
  ): Source[AssociatePackageResponse, NotUsed] =
    Source.single(associatePackageRequest).via(associatePackageFlow(parallelism))

  def associatePackageFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[AssociatePackageRequest, AssociatePackageResponse, NotUsed] =
    Flow[AssociatePackageRequest].mapAsync(parallelism) { associatePackageRequest =>
      underlying.associatePackage(associatePackageRequest)
    }

  def cancelElasticsearchServiceSoftwareUpdateSource(
      cancelElasticsearchServiceSoftwareUpdateRequest: CancelElasticsearchServiceSoftwareUpdateRequest,
      parallelism: Int = DefaultParallelism
  ): Source[CancelElasticsearchServiceSoftwareUpdateResponse, NotUsed] =
    Source
      .single(cancelElasticsearchServiceSoftwareUpdateRequest).via(
        cancelElasticsearchServiceSoftwareUpdateFlow(parallelism)
      )

  def cancelElasticsearchServiceSoftwareUpdateFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CancelElasticsearchServiceSoftwareUpdateRequest, CancelElasticsearchServiceSoftwareUpdateResponse, NotUsed] =
    Flow[CancelElasticsearchServiceSoftwareUpdateRequest].mapAsync(parallelism) {
      cancelElasticsearchServiceSoftwareUpdateRequest =>
        underlying.cancelElasticsearchServiceSoftwareUpdate(cancelElasticsearchServiceSoftwareUpdateRequest)
    }

  def createElasticsearchDomainSource(
      createElasticsearchDomainRequest: CreateElasticsearchDomainRequest,
      parallelism: Int = DefaultParallelism
  ): Source[CreateElasticsearchDomainResponse, NotUsed] =
    Source.single(createElasticsearchDomainRequest).via(createElasticsearchDomainFlow(parallelism))

  def createElasticsearchDomainFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateElasticsearchDomainRequest, CreateElasticsearchDomainResponse, NotUsed] =
    Flow[CreateElasticsearchDomainRequest].mapAsync(parallelism) { createElasticsearchDomainRequest =>
      underlying.createElasticsearchDomain(createElasticsearchDomainRequest)
    }

  def createPackageSource(
      createPackageRequest: CreatePackageRequest,
      parallelism: Int = DefaultParallelism
  ): Source[CreatePackageResponse, NotUsed] =
    Source.single(createPackageRequest).via(createPackageFlow(parallelism))

  def createPackageFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreatePackageRequest, CreatePackageResponse, NotUsed] =
    Flow[CreatePackageRequest].mapAsync(parallelism) { createPackageRequest =>
      underlying.createPackage(createPackageRequest)
    }

  def deleteElasticsearchDomainSource(
      deleteElasticsearchDomainRequest: DeleteElasticsearchDomainRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DeleteElasticsearchDomainResponse, NotUsed] =
    Source.single(deleteElasticsearchDomainRequest).via(deleteElasticsearchDomainFlow(parallelism))

  def deleteElasticsearchDomainFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteElasticsearchDomainRequest, DeleteElasticsearchDomainResponse, NotUsed] =
    Flow[DeleteElasticsearchDomainRequest].mapAsync(parallelism) { deleteElasticsearchDomainRequest =>
      underlying.deleteElasticsearchDomain(deleteElasticsearchDomainRequest)
    }

  def deleteElasticsearchServiceRoleSource(
      deleteElasticsearchServiceRoleRequest: DeleteElasticsearchServiceRoleRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DeleteElasticsearchServiceRoleResponse, NotUsed] =
    Source.single(deleteElasticsearchServiceRoleRequest).via(deleteElasticsearchServiceRoleFlow(parallelism))

  def deleteElasticsearchServiceRoleFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteElasticsearchServiceRoleRequest, DeleteElasticsearchServiceRoleResponse, NotUsed] =
    Flow[DeleteElasticsearchServiceRoleRequest].mapAsync(parallelism) { deleteElasticsearchServiceRoleRequest =>
      underlying.deleteElasticsearchServiceRole(deleteElasticsearchServiceRoleRequest)
    }

  def deleteElasticsearchServiceRoleSource(): Source[DeleteElasticsearchServiceRoleResponse, NotUsed] =
    Source.fromFuture(underlying.deleteElasticsearchServiceRole())

  def deletePackageSource(
      deletePackageRequest: DeletePackageRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DeletePackageResponse, NotUsed] =
    Source.single(deletePackageRequest).via(deletePackageFlow(parallelism))

  def deletePackageFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeletePackageRequest, DeletePackageResponse, NotUsed] =
    Flow[DeletePackageRequest].mapAsync(parallelism) { deletePackageRequest =>
      underlying.deletePackage(deletePackageRequest)
    }

  def describeElasticsearchDomainSource(
      describeElasticsearchDomainRequest: DescribeElasticsearchDomainRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeElasticsearchDomainResponse, NotUsed] =
    Source.single(describeElasticsearchDomainRequest).via(describeElasticsearchDomainFlow(parallelism))

  def describeElasticsearchDomainFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeElasticsearchDomainRequest, DescribeElasticsearchDomainResponse, NotUsed] =
    Flow[DescribeElasticsearchDomainRequest].mapAsync(parallelism) { describeElasticsearchDomainRequest =>
      underlying.describeElasticsearchDomain(describeElasticsearchDomainRequest)
    }

  def describeElasticsearchDomainConfigSource(
      describeElasticsearchDomainConfigRequest: DescribeElasticsearchDomainConfigRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeElasticsearchDomainConfigResponse, NotUsed] =
    Source.single(describeElasticsearchDomainConfigRequest).via(describeElasticsearchDomainConfigFlow(parallelism))

  def describeElasticsearchDomainConfigFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeElasticsearchDomainConfigRequest, DescribeElasticsearchDomainConfigResponse, NotUsed] =
    Flow[DescribeElasticsearchDomainConfigRequest].mapAsync(parallelism) { describeElasticsearchDomainConfigRequest =>
      underlying.describeElasticsearchDomainConfig(describeElasticsearchDomainConfigRequest)
    }

  def describeElasticsearchDomainsSource(
      describeElasticsearchDomainsRequest: DescribeElasticsearchDomainsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeElasticsearchDomainsResponse, NotUsed] =
    Source.single(describeElasticsearchDomainsRequest).via(describeElasticsearchDomainsFlow(parallelism))

  def describeElasticsearchDomainsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeElasticsearchDomainsRequest, DescribeElasticsearchDomainsResponse, NotUsed] =
    Flow[DescribeElasticsearchDomainsRequest].mapAsync(parallelism) { describeElasticsearchDomainsRequest =>
      underlying.describeElasticsearchDomains(describeElasticsearchDomainsRequest)
    }

  def describeElasticsearchInstanceTypeLimitsSource(
      describeElasticsearchInstanceTypeLimitsRequest: DescribeElasticsearchInstanceTypeLimitsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeElasticsearchInstanceTypeLimitsResponse, NotUsed] =
    Source
      .single(describeElasticsearchInstanceTypeLimitsRequest).via(
        describeElasticsearchInstanceTypeLimitsFlow(parallelism)
      )

  def describeElasticsearchInstanceTypeLimitsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeElasticsearchInstanceTypeLimitsRequest, DescribeElasticsearchInstanceTypeLimitsResponse, NotUsed] =
    Flow[DescribeElasticsearchInstanceTypeLimitsRequest].mapAsync(parallelism) {
      describeElasticsearchInstanceTypeLimitsRequest =>
        underlying.describeElasticsearchInstanceTypeLimits(describeElasticsearchInstanceTypeLimitsRequest)
    }

  def describePackagesSource(
      describePackagesRequest: DescribePackagesRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribePackagesResponse, NotUsed] =
    Source.single(describePackagesRequest).via(describePackagesFlow(parallelism))

  def describePackagesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribePackagesRequest, DescribePackagesResponse, NotUsed] =
    Flow[DescribePackagesRequest].mapAsync(parallelism) { describePackagesRequest =>
      underlying.describePackages(describePackagesRequest)
    }

  def describePackagesPaginatorFlow: Flow[DescribePackagesRequest, DescribePackagesResponse, NotUsed] =
    Flow[DescribePackagesRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.describePackagesPaginator(request))
    }

  def describeReservedElasticsearchInstanceOfferingsSource(
      describeReservedElasticsearchInstanceOfferingsRequest: DescribeReservedElasticsearchInstanceOfferingsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeReservedElasticsearchInstanceOfferingsResponse, NotUsed] =
    Source
      .single(describeReservedElasticsearchInstanceOfferingsRequest).via(
        describeReservedElasticsearchInstanceOfferingsFlow(parallelism)
      )

  def describeReservedElasticsearchInstanceOfferingsFlow(parallelism: Int = DefaultParallelism): Flow[
    DescribeReservedElasticsearchInstanceOfferingsRequest,
    DescribeReservedElasticsearchInstanceOfferingsResponse,
    NotUsed
  ] =
    Flow[DescribeReservedElasticsearchInstanceOfferingsRequest].mapAsync(parallelism) {
      describeReservedElasticsearchInstanceOfferingsRequest =>
        underlying.describeReservedElasticsearchInstanceOfferings(describeReservedElasticsearchInstanceOfferingsRequest)
    }

  def describeReservedElasticsearchInstanceOfferingsSource()
      : Source[DescribeReservedElasticsearchInstanceOfferingsResponse, NotUsed] =
    Source.fromFuture(underlying.describeReservedElasticsearchInstanceOfferings())

  def describeReservedElasticsearchInstanceOfferingsPaginatorSource
      : Source[DescribeReservedElasticsearchInstanceOfferingsResponse, NotUsed] =
    Source.fromPublisher(underlying.describeReservedElasticsearchInstanceOfferingsPaginator())

  def describeReservedElasticsearchInstanceOfferingsPaginatorFlow: Flow[
    DescribeReservedElasticsearchInstanceOfferingsRequest,
    DescribeReservedElasticsearchInstanceOfferingsResponse,
    NotUsed
  ] = Flow[DescribeReservedElasticsearchInstanceOfferingsRequest].flatMapConcat { request =>
    Source.fromPublisher(underlying.describeReservedElasticsearchInstanceOfferingsPaginator(request))
  }

  def describeReservedElasticsearchInstancesSource(
      describeReservedElasticsearchInstancesRequest: DescribeReservedElasticsearchInstancesRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeReservedElasticsearchInstancesResponse, NotUsed] =
    Source
      .single(describeReservedElasticsearchInstancesRequest).via(
        describeReservedElasticsearchInstancesFlow(parallelism)
      )

  def describeReservedElasticsearchInstancesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeReservedElasticsearchInstancesRequest, DescribeReservedElasticsearchInstancesResponse, NotUsed] =
    Flow[DescribeReservedElasticsearchInstancesRequest].mapAsync(parallelism) {
      describeReservedElasticsearchInstancesRequest =>
        underlying.describeReservedElasticsearchInstances(describeReservedElasticsearchInstancesRequest)
    }

  def describeReservedElasticsearchInstancesSource(): Source[DescribeReservedElasticsearchInstancesResponse, NotUsed] =
    Source.fromFuture(underlying.describeReservedElasticsearchInstances())

  def describeReservedElasticsearchInstancesPaginatorSource
      : Source[DescribeReservedElasticsearchInstancesResponse, NotUsed] =
    Source.fromPublisher(underlying.describeReservedElasticsearchInstancesPaginator())

  def describeReservedElasticsearchInstancesPaginatorFlow
      : Flow[DescribeReservedElasticsearchInstancesRequest, DescribeReservedElasticsearchInstancesResponse, NotUsed] =
    Flow[DescribeReservedElasticsearchInstancesRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.describeReservedElasticsearchInstancesPaginator(request))
    }

  def dissociatePackageSource(
      dissociatePackageRequest: DissociatePackageRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DissociatePackageResponse, NotUsed] =
    Source.single(dissociatePackageRequest).via(dissociatePackageFlow(parallelism))

  def dissociatePackageFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DissociatePackageRequest, DissociatePackageResponse, NotUsed] =
    Flow[DissociatePackageRequest].mapAsync(parallelism) { dissociatePackageRequest =>
      underlying.dissociatePackage(dissociatePackageRequest)
    }

  def getCompatibleElasticsearchVersionsSource(
      getCompatibleElasticsearchVersionsRequest: GetCompatibleElasticsearchVersionsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[GetCompatibleElasticsearchVersionsResponse, NotUsed] =
    Source.single(getCompatibleElasticsearchVersionsRequest).via(getCompatibleElasticsearchVersionsFlow(parallelism))

  def getCompatibleElasticsearchVersionsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetCompatibleElasticsearchVersionsRequest, GetCompatibleElasticsearchVersionsResponse, NotUsed] =
    Flow[GetCompatibleElasticsearchVersionsRequest].mapAsync(parallelism) { getCompatibleElasticsearchVersionsRequest =>
      underlying.getCompatibleElasticsearchVersions(getCompatibleElasticsearchVersionsRequest)
    }

  def getCompatibleElasticsearchVersionsSource(): Source[GetCompatibleElasticsearchVersionsResponse, NotUsed] =
    Source.fromFuture(underlying.getCompatibleElasticsearchVersions())

  def getUpgradeHistorySource(
      getUpgradeHistoryRequest: GetUpgradeHistoryRequest,
      parallelism: Int = DefaultParallelism
  ): Source[GetUpgradeHistoryResponse, NotUsed] =
    Source.single(getUpgradeHistoryRequest).via(getUpgradeHistoryFlow(parallelism))

  def getUpgradeHistoryFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetUpgradeHistoryRequest, GetUpgradeHistoryResponse, NotUsed] =
    Flow[GetUpgradeHistoryRequest].mapAsync(parallelism) { getUpgradeHistoryRequest =>
      underlying.getUpgradeHistory(getUpgradeHistoryRequest)
    }

  def getUpgradeHistoryPaginatorFlow: Flow[GetUpgradeHistoryRequest, GetUpgradeHistoryResponse, NotUsed] =
    Flow[GetUpgradeHistoryRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.getUpgradeHistoryPaginator(request))
    }

  def getUpgradeStatusSource(
      getUpgradeStatusRequest: GetUpgradeStatusRequest,
      parallelism: Int = DefaultParallelism
  ): Source[GetUpgradeStatusResponse, NotUsed] =
    Source.single(getUpgradeStatusRequest).via(getUpgradeStatusFlow(parallelism))

  def getUpgradeStatusFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetUpgradeStatusRequest, GetUpgradeStatusResponse, NotUsed] =
    Flow[GetUpgradeStatusRequest].mapAsync(parallelism) { getUpgradeStatusRequest =>
      underlying.getUpgradeStatus(getUpgradeStatusRequest)
    }

  def listDomainNamesSource(
      listDomainNamesRequest: ListDomainNamesRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ListDomainNamesResponse, NotUsed] =
    Source.single(listDomainNamesRequest).via(listDomainNamesFlow(parallelism))

  def listDomainNamesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ListDomainNamesRequest, ListDomainNamesResponse, NotUsed] =
    Flow[ListDomainNamesRequest].mapAsync(parallelism) { listDomainNamesRequest =>
      underlying.listDomainNames(listDomainNamesRequest)
    }

  def listDomainNamesSource(): Source[ListDomainNamesResponse, NotUsed] =
    Source.fromFuture(underlying.listDomainNames())

  def listDomainsForPackageSource(
      listDomainsForPackageRequest: ListDomainsForPackageRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ListDomainsForPackageResponse, NotUsed] =
    Source.single(listDomainsForPackageRequest).via(listDomainsForPackageFlow(parallelism))

  def listDomainsForPackageFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ListDomainsForPackageRequest, ListDomainsForPackageResponse, NotUsed] =
    Flow[ListDomainsForPackageRequest].mapAsync(parallelism) { listDomainsForPackageRequest =>
      underlying.listDomainsForPackage(listDomainsForPackageRequest)
    }

  def listDomainsForPackagePaginatorFlow: Flow[ListDomainsForPackageRequest, ListDomainsForPackageResponse, NotUsed] =
    Flow[ListDomainsForPackageRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.listDomainsForPackagePaginator(request))
    }

  def listElasticsearchInstanceTypesSource(
      listElasticsearchInstanceTypesRequest: ListElasticsearchInstanceTypesRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ListElasticsearchInstanceTypesResponse, NotUsed] =
    Source.single(listElasticsearchInstanceTypesRequest).via(listElasticsearchInstanceTypesFlow(parallelism))

  def listElasticsearchInstanceTypesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ListElasticsearchInstanceTypesRequest, ListElasticsearchInstanceTypesResponse, NotUsed] =
    Flow[ListElasticsearchInstanceTypesRequest].mapAsync(parallelism) { listElasticsearchInstanceTypesRequest =>
      underlying.listElasticsearchInstanceTypes(listElasticsearchInstanceTypesRequest)
    }

  def listElasticsearchInstanceTypesPaginatorFlow
      : Flow[ListElasticsearchInstanceTypesRequest, ListElasticsearchInstanceTypesResponse, NotUsed] =
    Flow[ListElasticsearchInstanceTypesRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.listElasticsearchInstanceTypesPaginator(request))
    }

  def listElasticsearchVersionsSource(
      listElasticsearchVersionsRequest: ListElasticsearchVersionsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ListElasticsearchVersionsResponse, NotUsed] =
    Source.single(listElasticsearchVersionsRequest).via(listElasticsearchVersionsFlow(parallelism))

  def listElasticsearchVersionsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ListElasticsearchVersionsRequest, ListElasticsearchVersionsResponse, NotUsed] =
    Flow[ListElasticsearchVersionsRequest].mapAsync(parallelism) { listElasticsearchVersionsRequest =>
      underlying.listElasticsearchVersions(listElasticsearchVersionsRequest)
    }

  def listElasticsearchVersionsSource(): Source[ListElasticsearchVersionsResponse, NotUsed] =
    Source.fromFuture(underlying.listElasticsearchVersions())

  def listElasticsearchVersionsPaginatorSource: Source[ListElasticsearchVersionsResponse, NotUsed] =
    Source.fromPublisher(underlying.listElasticsearchVersionsPaginator())

  def listElasticsearchVersionsPaginatorFlow
      : Flow[ListElasticsearchVersionsRequest, ListElasticsearchVersionsResponse, NotUsed] =
    Flow[ListElasticsearchVersionsRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.listElasticsearchVersionsPaginator(request))
    }

  def listPackagesForDomainSource(
      listPackagesForDomainRequest: ListPackagesForDomainRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ListPackagesForDomainResponse, NotUsed] =
    Source.single(listPackagesForDomainRequest).via(listPackagesForDomainFlow(parallelism))

  def listPackagesForDomainFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ListPackagesForDomainRequest, ListPackagesForDomainResponse, NotUsed] =
    Flow[ListPackagesForDomainRequest].mapAsync(parallelism) { listPackagesForDomainRequest =>
      underlying.listPackagesForDomain(listPackagesForDomainRequest)
    }

  def listPackagesForDomainPaginatorFlow: Flow[ListPackagesForDomainRequest, ListPackagesForDomainResponse, NotUsed] =
    Flow[ListPackagesForDomainRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.listPackagesForDomainPaginator(request))
    }

  def listTagsSource(
      listTagsRequest: ListTagsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ListTagsResponse, NotUsed] =
    Source.single(listTagsRequest).via(listTagsFlow(parallelism))

  def listTagsFlow(parallelism: Int = DefaultParallelism): Flow[ListTagsRequest, ListTagsResponse, NotUsed] =
    Flow[ListTagsRequest].mapAsync(parallelism) { listTagsRequest =>
      underlying.listTags(listTagsRequest)
    }

  def purchaseReservedElasticsearchInstanceOfferingSource(
      purchaseReservedElasticsearchInstanceOfferingRequest: PurchaseReservedElasticsearchInstanceOfferingRequest,
      parallelism: Int = DefaultParallelism
  ): Source[PurchaseReservedElasticsearchInstanceOfferingResponse, NotUsed] =
    Source
      .single(purchaseReservedElasticsearchInstanceOfferingRequest).via(
        purchaseReservedElasticsearchInstanceOfferingFlow(parallelism)
      )

  def purchaseReservedElasticsearchInstanceOfferingFlow(parallelism: Int = DefaultParallelism): Flow[
    PurchaseReservedElasticsearchInstanceOfferingRequest,
    PurchaseReservedElasticsearchInstanceOfferingResponse,
    NotUsed
  ] =
    Flow[PurchaseReservedElasticsearchInstanceOfferingRequest].mapAsync(parallelism) {
      purchaseReservedElasticsearchInstanceOfferingRequest =>
        underlying.purchaseReservedElasticsearchInstanceOffering(purchaseReservedElasticsearchInstanceOfferingRequest)
    }

  def removeTagsSource(
      removeTagsRequest: RemoveTagsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[RemoveTagsResponse, NotUsed] =
    Source.single(removeTagsRequest).via(removeTagsFlow(parallelism))

  def removeTagsFlow(parallelism: Int = DefaultParallelism): Flow[RemoveTagsRequest, RemoveTagsResponse, NotUsed] =
    Flow[RemoveTagsRequest].mapAsync(parallelism) { removeTagsRequest =>
      underlying.removeTags(removeTagsRequest)
    }

  def startElasticsearchServiceSoftwareUpdateSource(
      startElasticsearchServiceSoftwareUpdateRequest: StartElasticsearchServiceSoftwareUpdateRequest,
      parallelism: Int = DefaultParallelism
  ): Source[StartElasticsearchServiceSoftwareUpdateResponse, NotUsed] =
    Source
      .single(startElasticsearchServiceSoftwareUpdateRequest).via(
        startElasticsearchServiceSoftwareUpdateFlow(parallelism)
      )

  def startElasticsearchServiceSoftwareUpdateFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[StartElasticsearchServiceSoftwareUpdateRequest, StartElasticsearchServiceSoftwareUpdateResponse, NotUsed] =
    Flow[StartElasticsearchServiceSoftwareUpdateRequest].mapAsync(parallelism) {
      startElasticsearchServiceSoftwareUpdateRequest =>
        underlying.startElasticsearchServiceSoftwareUpdate(startElasticsearchServiceSoftwareUpdateRequest)
    }

  def updateElasticsearchDomainConfigSource(
      updateElasticsearchDomainConfigRequest: UpdateElasticsearchDomainConfigRequest,
      parallelism: Int = DefaultParallelism
  ): Source[UpdateElasticsearchDomainConfigResponse, NotUsed] =
    Source.single(updateElasticsearchDomainConfigRequest).via(updateElasticsearchDomainConfigFlow(parallelism))

  def updateElasticsearchDomainConfigFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[UpdateElasticsearchDomainConfigRequest, UpdateElasticsearchDomainConfigResponse, NotUsed] =
    Flow[UpdateElasticsearchDomainConfigRequest].mapAsync(parallelism) { updateElasticsearchDomainConfigRequest =>
      underlying.updateElasticsearchDomainConfig(updateElasticsearchDomainConfigRequest)
    }

  def upgradeElasticsearchDomainSource(
      upgradeElasticsearchDomainRequest: UpgradeElasticsearchDomainRequest,
      parallelism: Int = DefaultParallelism
  ): Source[UpgradeElasticsearchDomainResponse, NotUsed] =
    Source.single(upgradeElasticsearchDomainRequest).via(upgradeElasticsearchDomainFlow(parallelism))

  def upgradeElasticsearchDomainFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[UpgradeElasticsearchDomainRequest, UpgradeElasticsearchDomainResponse, NotUsed] =
    Flow[UpgradeElasticsearchDomainRequest].mapAsync(parallelism) { upgradeElasticsearchDomainRequest =>
      underlying.upgradeElasticsearchDomain(upgradeElasticsearchDomainRequest)
    }

}
