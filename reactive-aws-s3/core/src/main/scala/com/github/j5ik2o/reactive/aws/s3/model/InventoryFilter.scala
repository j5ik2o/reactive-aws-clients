package com.github.j5ik2o.reactive.aws.s3.model

final case class InventoryFilter(
    prefix: Option[String] = None
) {
  def withPrefix(value: Option[String]): InventoryFilter =
    copy(prefix = value)
}
