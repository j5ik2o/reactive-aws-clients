// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class ProvisionedThroughputDescriptionBuilderOps(val self: ProvisionedThroughputDescription.Builder)
    extends AnyVal {

  final def withLastIncreaseDateTimeAsScala(
      value: Option[java.time.Instant]
  ): ProvisionedThroughputDescription.Builder = {
    value.fold(self) { v =>
      self.lastIncreaseDateTime(v)
    }
  } // Instant

  final def withLastDecreaseDateTimeAsScala(
      value: Option[java.time.Instant]
  ): ProvisionedThroughputDescription.Builder = {
    value.fold(self) { v =>
      self.lastDecreaseDateTime(v)
    }
  } // Instant

  final def withNumberOfDecreasesTodayAsScala(value: Option[Long]): ProvisionedThroughputDescription.Builder = {
    value.fold(self) { v =>
      self.numberOfDecreasesToday(v)
    }
  } // Long

  final def withReadCapacityUnitsAsScala(value: Option[Long]): ProvisionedThroughputDescription.Builder = {
    value.fold(self) { v =>
      self.readCapacityUnits(v)
    }
  } // Long

  final def withWriteCapacityUnitsAsScala(value: Option[Long]): ProvisionedThroughputDescription.Builder = {
    value.fold(self) { v =>
      self.writeCapacityUnits(v)
    }
  } // Long

}

final class ProvisionedThroughputDescriptionOps(val self: ProvisionedThroughputDescription) extends AnyVal {

  final def lastIncreaseDateTimeAsScala: Option[java.time.Instant] = Option(self.lastIncreaseDateTime) // Instant

  final def lastDecreaseDateTimeAsScala: Option[java.time.Instant] = Option(self.lastDecreaseDateTime) // Instant

  final def numberOfDecreasesTodayAsScala: Option[Long] = Option(self.numberOfDecreasesToday) // Long

  final def readCapacityUnitsAsScala: Option[Long] = Option(self.readCapacityUnits) // Long

  final def writeCapacityUnitsAsScala: Option[Long] = Option(self.writeCapacityUnits) // Long

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
