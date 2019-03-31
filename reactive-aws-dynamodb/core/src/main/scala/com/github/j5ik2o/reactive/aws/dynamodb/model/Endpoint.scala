package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class Endpoint(
    address: Option[String] = None,
    cachePeriodInMinutes: Option[Long] = None
) {
  def withAddress(value: Option[String]): Endpoint =
    copy(address = value)
  def withCachePeriodInMinutes(value: Option[Long]): Endpoint =
    copy(cachePeriodInMinutes = value)
}
