// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class ProvisionedThroughputDescriptionBuilderOps(val self: ProvisionedThroughputDescription.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastIncreaseDateTimeAsScala(value: Option[java.time.Instant]): ProvisionedThroughputDescription.Builder = {
    value.fold(self) { v => self.lastIncreaseDateTime(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastDecreaseDateTimeAsScala(value: Option[java.time.Instant]): ProvisionedThroughputDescription.Builder = {
    value.fold(self) { v => self.lastDecreaseDateTime(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def numberOfDecreasesTodayAsScala(value: Option[Long]): ProvisionedThroughputDescription.Builder = {
    value.fold(self) { v => self.numberOfDecreasesToday(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def readCapacityUnitsAsScala(value: Option[Long]): ProvisionedThroughputDescription.Builder = {
    value.fold(self) { v => self.readCapacityUnits(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def writeCapacityUnitsAsScala(value: Option[Long]): ProvisionedThroughputDescription.Builder = {
    value.fold(self) { v => self.writeCapacityUnits(v) }
  }

}

final class ProvisionedThroughputDescriptionOps(val self: ProvisionedThroughputDescription) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastIncreaseDateTimeAsScala: Option[java.time.Instant] = Option(self.lastIncreaseDateTime)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastDecreaseDateTimeAsScala: Option[java.time.Instant] = Option(self.lastDecreaseDateTime)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def numberOfDecreasesTodayAsScala: Option[Long] = Option(self.numberOfDecreasesToday)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def readCapacityUnitsAsScala: Option[Long] = Option(self.readCapacityUnits)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def writeCapacityUnitsAsScala: Option[Long] = Option(self.writeCapacityUnits)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToProvisionedThroughputDescriptionOps {

  implicit def toProvisionedThroughputDescriptionBuilderOps(
      v: ProvisionedThroughputDescription.Builder
  ): ProvisionedThroughputDescriptionBuilderOps = new ProvisionedThroughputDescriptionBuilderOps(v)

  implicit def toProvisionedThroughputDescriptionOps(
      v: ProvisionedThroughputDescription
  ): ProvisionedThroughputDescriptionOps = new ProvisionedThroughputDescriptionOps(v)

}
