// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.cats

import cats.effect.{ ContextShift, IO }
import com.github.j5ik2o.reactive.aws.elasticsearch.{ ElasticsearchAsyncClient, ElasticsearchClient }
import software.amazon.awssdk.services.elasticsearch.model._
import software.amazon.awssdk.services.elasticsearch.paginators._

import scala.concurrent.{ ExecutionContext, Future }

object ElasticsearchCatsIOClient {

  def apply(asyncClient: ElasticsearchAsyncClient)(implicit ec: ExecutionContext): ElasticsearchCatsIOClient =
    new ElasticsearchCatsIOClient {
      override val executionContext: ExecutionContext   = ec
      override val underlying: ElasticsearchAsyncClient = asyncClient
    }

}

trait ElasticsearchCatsIOClient extends ElasticsearchClient[IO] {

  val underlying: ElasticsearchAsyncClient

  def executionContext: ExecutionContext
  implicit def cs: ContextShift[IO] = IO.contextShift(executionContext)

  override def addTags(addTagsRequest: AddTagsRequest): IO[AddTagsResponse] =
    IO.fromFuture {
      IO(underlying.addTags(addTagsRequest))
    }

  override def cancelElasticsearchServiceSoftwareUpdate(
      cancelElasticsearchServiceSoftwareUpdateRequest: CancelElasticsearchServiceSoftwareUpdateRequest
  ): IO[CancelElasticsearchServiceSoftwareUpdateResponse] =
    IO.fromFuture {
      IO(underlying.cancelElasticsearchServiceSoftwareUpdate(cancelElasticsearchServiceSoftwareUpdateRequest))
    }

  override def createElasticsearchDomain(
      createElasticsearchDomainRequest: CreateElasticsearchDomainRequest
  ): IO[CreateElasticsearchDomainResponse] =
    IO.fromFuture {
      IO(underlying.createElasticsearchDomain(createElasticsearchDomainRequest))
    }

  override def deleteElasticsearchDomain(
      deleteElasticsearchDomainRequest: DeleteElasticsearchDomainRequest
  ): IO[DeleteElasticsearchDomainResponse] =
    IO.fromFuture {
      IO(underlying.deleteElasticsearchDomain(deleteElasticsearchDomainRequest))
    }

  override def deleteElasticsearchServiceRole(
      deleteElasticsearchServiceRoleRequest: DeleteElasticsearchServiceRoleRequest
  ): IO[DeleteElasticsearchServiceRoleResponse] =
    IO.fromFuture {
      IO(underlying.deleteElasticsearchServiceRole(deleteElasticsearchServiceRoleRequest))
    }

  override def deleteElasticsearchServiceRole(): IO[DeleteElasticsearchServiceRoleResponse] =
    IO.fromFuture {
      IO(underlying.deleteElasticsearchServiceRole())
    }

  override def describeElasticsearchDomain(
      describeElasticsearchDomainRequest: DescribeElasticsearchDomainRequest
  ): IO[DescribeElasticsearchDomainResponse] =
    IO.fromFuture {
      IO(underlying.describeElasticsearchDomain(describeElasticsearchDomainRequest))
    }

  override def describeElasticsearchDomainConfig(
      describeElasticsearchDomainConfigRequest: DescribeElasticsearchDomainConfigRequest
  ): IO[DescribeElasticsearchDomainConfigResponse] =
    IO.fromFuture {
      IO(underlying.describeElasticsearchDomainConfig(describeElasticsearchDomainConfigRequest))
    }

  override def describeElasticsearchDomains(
      describeElasticsearchDomainsRequest: DescribeElasticsearchDomainsRequest
  ): IO[DescribeElasticsearchDomainsResponse] =
    IO.fromFuture {
      IO(underlying.describeElasticsearchDomains(describeElasticsearchDomainsRequest))
    }

  override def describeElasticsearchInstanceTypeLimits(
      describeElasticsearchInstanceTypeLimitsRequest: DescribeElasticsearchInstanceTypeLimitsRequest
  ): IO[DescribeElasticsearchInstanceTypeLimitsResponse] =
    IO.fromFuture {
      IO(underlying.describeElasticsearchInstanceTypeLimits(describeElasticsearchInstanceTypeLimitsRequest))
    }

  override def describeReservedElasticsearchInstanceOfferings(
      describeReservedElasticsearchInstanceOfferingsRequest: DescribeReservedElasticsearchInstanceOfferingsRequest
  ): IO[DescribeReservedElasticsearchInstanceOfferingsResponse] =
    IO.fromFuture {
      IO(
        underlying.describeReservedElasticsearchInstanceOfferings(describeReservedElasticsearchInstanceOfferingsRequest)
      )
    }

  override def describeReservedElasticsearchInstanceOfferings()
      : IO[DescribeReservedElasticsearchInstanceOfferingsResponse] =
    IO.fromFuture {
      IO(underlying.describeReservedElasticsearchInstanceOfferings())
    }

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
  ): IO[DescribeReservedElasticsearchInstancesResponse] =
    IO.fromFuture {
      IO(underlying.describeReservedElasticsearchInstances(describeReservedElasticsearchInstancesRequest))
    }

  override def describeReservedElasticsearchInstances(): IO[DescribeReservedElasticsearchInstancesResponse] =
    IO.fromFuture {
      IO(underlying.describeReservedElasticsearchInstances())
    }

  def describeReservedElasticsearchInstancesPaginator(): DescribeReservedElasticsearchInstancesPublisher =
    underlying.describeReservedElasticsearchInstancesPaginator()

  def describeReservedElasticsearchInstancesPaginator(
      describeReservedElasticsearchInstancesRequest: DescribeReservedElasticsearchInstancesRequest
  ): DescribeReservedElasticsearchInstancesPublisher =
    underlying.describeReservedElasticsearchInstancesPaginator(describeReservedElasticsearchInstancesRequest)

  override def getCompatibleElasticsearchVersions(
      getCompatibleElasticsearchVersionsRequest: GetCompatibleElasticsearchVersionsRequest
  ): IO[GetCompatibleElasticsearchVersionsResponse] =
    IO.fromFuture {
      IO(underlying.getCompatibleElasticsearchVersions(getCompatibleElasticsearchVersionsRequest))
    }

  override def getCompatibleElasticsearchVersions(): IO[GetCompatibleElasticsearchVersionsResponse] =
    IO.fromFuture {
      IO(underlying.getCompatibleElasticsearchVersions())
    }

  override def getUpgradeHistory(getUpgradeHistoryRequest: GetUpgradeHistoryRequest): IO[GetUpgradeHistoryResponse] =
    IO.fromFuture {
      IO(underlying.getUpgradeHistory(getUpgradeHistoryRequest))
    }

  def getUpgradeHistoryPaginator(getUpgradeHistoryRequest: GetUpgradeHistoryRequest): GetUpgradeHistoryPublisher =
    underlying.getUpgradeHistoryPaginator(getUpgradeHistoryRequest)

  override def getUpgradeStatus(getUpgradeStatusRequest: GetUpgradeStatusRequest): IO[GetUpgradeStatusResponse] =
    IO.fromFuture {
      IO(underlying.getUpgradeStatus(getUpgradeStatusRequest))
    }

  override def listDomainNames(listDomainNamesRequest: ListDomainNamesRequest): IO[ListDomainNamesResponse] =
    IO.fromFuture {
      IO(underlying.listDomainNames(listDomainNamesRequest))
    }

  override def listDomainNames(): IO[ListDomainNamesResponse] =
    IO.fromFuture {
      IO(underlying.listDomainNames())
    }

  override def listElasticsearchInstanceTypes(
      listElasticsearchInstanceTypesRequest: ListElasticsearchInstanceTypesRequest
  ): IO[ListElasticsearchInstanceTypesResponse] =
    IO.fromFuture {
      IO(underlying.listElasticsearchInstanceTypes(listElasticsearchInstanceTypesRequest))
    }

  def listElasticsearchInstanceTypesPaginator(
      listElasticsearchInstanceTypesRequest: ListElasticsearchInstanceTypesRequest
  ): ListElasticsearchInstanceTypesPublisher =
    underlying.listElasticsearchInstanceTypesPaginator(listElasticsearchInstanceTypesRequest)

  override def listElasticsearchVersions(
      listElasticsearchVersionsRequest: ListElasticsearchVersionsRequest
  ): IO[ListElasticsearchVersionsResponse] =
    IO.fromFuture {
      IO(underlying.listElasticsearchVersions(listElasticsearchVersionsRequest))
    }

  override def listElasticsearchVersions(): IO[ListElasticsearchVersionsResponse] =
    IO.fromFuture {
      IO(underlying.listElasticsearchVersions())
    }

  def listElasticsearchVersionsPaginator(): ListElasticsearchVersionsPublisher =
    underlying.listElasticsearchVersionsPaginator()

  def listElasticsearchVersionsPaginator(
      listElasticsearchVersionsRequest: ListElasticsearchVersionsRequest
  ): ListElasticsearchVersionsPublisher =
    underlying.listElasticsearchVersionsPaginator(listElasticsearchVersionsRequest)

  override def listTags(listTagsRequest: ListTagsRequest): IO[ListTagsResponse] =
    IO.fromFuture {
      IO(underlying.listTags(listTagsRequest))
    }

  override def purchaseReservedElasticsearchInstanceOffering(
      purchaseReservedElasticsearchInstanceOfferingRequest: PurchaseReservedElasticsearchInstanceOfferingRequest
  ): IO[PurchaseReservedElasticsearchInstanceOfferingResponse] =
    IO.fromFuture {
      IO(underlying.purchaseReservedElasticsearchInstanceOffering(purchaseReservedElasticsearchInstanceOfferingRequest))
    }

  override def removeTags(removeTagsRequest: RemoveTagsRequest): IO[RemoveTagsResponse] =
    IO.fromFuture {
      IO(underlying.removeTags(removeTagsRequest))
    }

  override def startElasticsearchServiceSoftwareUpdate(
      startElasticsearchServiceSoftwareUpdateRequest: StartElasticsearchServiceSoftwareUpdateRequest
  ): IO[StartElasticsearchServiceSoftwareUpdateResponse] =
    IO.fromFuture {
      IO(underlying.startElasticsearchServiceSoftwareUpdate(startElasticsearchServiceSoftwareUpdateRequest))
    }

  override def updateElasticsearchDomainConfig(
      updateElasticsearchDomainConfigRequest: UpdateElasticsearchDomainConfigRequest
  ): IO[UpdateElasticsearchDomainConfigResponse] =
    IO.fromFuture {
      IO(underlying.updateElasticsearchDomainConfig(updateElasticsearchDomainConfigRequest))
    }

  override def upgradeElasticsearchDomain(
      upgradeElasticsearchDomainRequest: UpgradeElasticsearchDomainRequest
  ): IO[UpgradeElasticsearchDomainResponse] =
    IO.fromFuture {
      IO(underlying.upgradeElasticsearchDomain(upgradeElasticsearchDomainRequest))
    }

}
