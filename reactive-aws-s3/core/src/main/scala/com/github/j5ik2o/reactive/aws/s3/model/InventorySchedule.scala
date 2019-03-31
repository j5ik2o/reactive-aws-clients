package com.github.j5ik2o.reactive.aws.s3.model

final case class InventorySchedule(
    frequency: Option[InventoryFrequency] = None
) {
  def withFrequency(value: Option[InventoryFrequency]): InventorySchedule =
    copy(frequency = value)
}
