package com.github.j5ik2o.reactive.aws.s3.model

final case class InventoryConfiguration(
    destination: Option[InventoryDestination] = None,
    isEnabled: Option[Boolean] = None,
    filter: Option[InventoryFilter] = None,
    id: Option[String] = None,
    includedObjectVersions: Option[InventoryIncludedObjectVersions] = None,
    optionalFields: Option[Seq[InventoryOptionalField]] = None,
    schedule: Option[InventorySchedule] = None
) {
  def withDestination(value: Option[InventoryDestination]): InventoryConfiguration =
    copy(destination = value)
  def withIsEnabled(value: Option[Boolean]): InventoryConfiguration =
    copy(isEnabled = value)
  def withFilter(value: Option[InventoryFilter]): InventoryConfiguration =
    copy(filter = value)
  def withId(value: Option[String]): InventoryConfiguration =
    copy(id = value)
  def withIncludedObjectVersions(value: Option[InventoryIncludedObjectVersions]): InventoryConfiguration =
    copy(includedObjectVersions = value)
  def withOptionalFields(value: Option[Seq[InventoryOptionalField]]): InventoryConfiguration =
    copy(optionalFields = value)
  def withSchedule(value: Option[InventorySchedule]): InventoryConfiguration =
    copy(schedule = value)
}
