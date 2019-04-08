// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ScheduledInstancesEbsBuilderOps(val self: ScheduledInstancesEbs.Builder) extends AnyVal {

  final def deleteOnTerminationAsScala(value: Option[Boolean]): ScheduledInstancesEbs.Builder = {
    value.fold(self) { v =>
      self.deleteOnTermination(v)
    }
  }

  final def encryptedAsScala(value: Option[Boolean]): ScheduledInstancesEbs.Builder = {
    value.fold(self) { v =>
      self.encrypted(v)
    }
  }

  final def iopsAsScala(value: Option[Int]): ScheduledInstancesEbs.Builder = {
    value.fold(self) { v =>
      self.iops(v)
    }
  }

  final def snapshotIdAsScala(value: Option[String]): ScheduledInstancesEbs.Builder = {
    value.fold(self) { v =>
      self.snapshotId(v)
    }
  }

  final def volumeSizeAsScala(value: Option[Int]): ScheduledInstancesEbs.Builder = {
    value.fold(self) { v =>
      self.volumeSize(v)
    }
  }

  final def volumeTypeAsScala(value: Option[String]): ScheduledInstancesEbs.Builder = {
    value.fold(self) { v =>
      self.volumeType(v)
    }
  }

}

final class ScheduledInstancesEbsOps(val self: ScheduledInstancesEbs) extends AnyVal {

  final def deleteOnTerminationAsScala: Option[Boolean] = Option(self.deleteOnTermination)

  final def encryptedAsScala: Option[Boolean] = Option(self.encrypted)

  final def iopsAsScala: Option[Int] = Option(self.iops)

  final def snapshotIdAsScala: Option[String] = Option(self.snapshotId)

  final def volumeSizeAsScala: Option[Int] = Option(self.volumeSize)

  final def volumeTypeAsScala: Option[String] = Option(self.volumeType)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToScheduledInstancesEbsOps {

  implicit def toScheduledInstancesEbsBuilderOps(v: ScheduledInstancesEbs.Builder): ScheduledInstancesEbsBuilderOps =
    new ScheduledInstancesEbsBuilderOps(v)

  implicit def toScheduledInstancesEbsOps(v: ScheduledInstancesEbs): ScheduledInstancesEbsOps =
    new ScheduledInstancesEbsOps(v)

}
