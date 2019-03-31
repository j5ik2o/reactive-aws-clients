package com.github.j5ik2o.reactive.aws.s3.model

final case class InventoryEncryption(
    sses3: Option[SSES3] = None,
    ssekms: Option[SSEKMS] = None
) {
  def withSses3(value: Option[SSES3]): InventoryEncryption =
    copy(sses3 = value)
  def withSsekms(value: Option[SSEKMS]): InventoryEncryption =
    copy(ssekms = value)
}
