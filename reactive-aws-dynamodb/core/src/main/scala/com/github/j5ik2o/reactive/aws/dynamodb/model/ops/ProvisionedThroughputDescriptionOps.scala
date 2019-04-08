// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class ProvisionedThroughputDescriptionBuilderOps(val self: ProvisionedThroughputDescription.Builder)
    extends AnyVal {

  final def lastIncreaseDateTimeAsScala(value: Option[java.time.Instant]): ProvisionedThroughputDescription.Builder = {
    value.fold(self) { v =>
      self.lastIncreaseDateTime(v)
    }
  }

  final def lastDecreaseDateTimeAsScala(value: Option[java.time.Instant]): ProvisionedThroughputDescription.Builder = {
    value.fold(self) { v =>
      self.lastDecreaseDateTime(v)
    }
  }

  final def numberOfDecreasesTodayAsScala(value: Option[Long]): ProvisionedThroughputDescription.Builder = {
    value.fold(self) { v =>
      self.numberOfDecreasesToday(v)
    }
  }

  final def readCapacityUnitsAsScala(value: Option[Long]): ProvisionedThroughputDescription.Builder = {
    value.fold(self) { v =>
      self.readCapacityUnits(v)
    }
  }

  final def writeCapacityUnitsAsScala(value: Option[Long]): ProvisionedThroughputDescription.Builder = {
    value.fold(self) { v =>
      self.writeCapacityUnits(v)
    }
  }

}

final class ProvisionedThroughputDescriptionOps(val self: ProvisionedThroughputDescription) extends AnyVal {

  final def lastIncreaseDateTimeAsScala: Option[java.time.Instant] = Option(self.lastIncreaseDateTime)

  final def lastDecreaseDateTimeAsScala: Option[java.time.Instant] = Option(self.lastDecreaseDateTime)

  final def numberOfDecreasesTodayAsScala: Option[Long] = Option(self.numberOfDecreasesToday)

  final def readCapacityUnitsAsScala: Option[Long] = Option(self.readCapacityUnits)

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
