package com.github.j5ik2o.reactive.aws.s3.model

import com.github.j5ik2o.reactive.aws.model.AbstractResponse

final case class GetBucketInventoryConfigurationResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    inventoryConfiguration: Option[InventoryConfiguration] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = GetBucketInventoryConfigurationResponse
  override def withStatusCode(value: Option[Int]): GetBucketInventoryConfigurationResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): GetBucketInventoryConfigurationResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): GetBucketInventoryConfigurationResponse =
    copy(httpHeaders = value)
  def withInventoryConfiguration(value: Option[InventoryConfiguration]): GetBucketInventoryConfigurationResponse =
    copy(inventoryConfiguration = value)
}
