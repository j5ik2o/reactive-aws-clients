package com.github.j5ik2o.reactive.aws.s3.model

import com.github.j5ik2o.reactive.aws.model.AbstractResponse

final case class ListBucketInventoryConfigurationsResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    continuationToken: Option[String] = None,
    inventoryConfigurationList: Option[Seq[InventoryConfiguration]] = None,
    isTruncated: Option[Boolean] = None,
    nextContinuationToken: Option[String] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = ListBucketInventoryConfigurationsResponse
  override def withStatusCode(value: Option[Int]): ListBucketInventoryConfigurationsResponse = copy(statusCode = value)
  override def withStatusText(value: Option[String]): ListBucketInventoryConfigurationsResponse =
    copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): ListBucketInventoryConfigurationsResponse =
    copy(httpHeaders = value)
  def withContinuationToken(value: Option[String]): ListBucketInventoryConfigurationsResponse =
    copy(continuationToken = value)
  def withInventoryConfigurationList(
      value: Option[Seq[InventoryConfiguration]]
  ): ListBucketInventoryConfigurationsResponse =
    copy(inventoryConfigurationList = value)
  def withIsTruncated(value: Option[Boolean]): ListBucketInventoryConfigurationsResponse =
    copy(isTruncated = value)
  def withNextContinuationToken(value: Option[String]): ListBucketInventoryConfigurationsResponse =
    copy(nextContinuationToken = value)
}
