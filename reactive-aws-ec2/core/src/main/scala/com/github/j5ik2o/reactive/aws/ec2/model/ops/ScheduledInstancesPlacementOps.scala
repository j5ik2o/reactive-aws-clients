// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ScheduledInstancesPlacementBuilderOps(val self: ScheduledInstancesPlacement.Builder) extends AnyVal {

  final def availabilityZoneAsScala(value: Option[String]): ScheduledInstancesPlacement.Builder = {
    value.fold(self) { v =>
      self.availabilityZone(v)
    }
  }

  final def groupNameAsScala(value: Option[String]): ScheduledInstancesPlacement.Builder = {
    value.fold(self) { v =>
      self.groupName(v)
    }
  }

}

final class ScheduledInstancesPlacementOps(val self: ScheduledInstancesPlacement) extends AnyVal {

  final def availabilityZoneAsScala: Option[String] = Option(self.availabilityZone)

  final def groupNameAsScala: Option[String] = Option(self.groupName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToScheduledInstancesPlacementOps {

  implicit def toScheduledInstancesPlacementBuilderOps(
      v: ScheduledInstancesPlacement.Builder
  ): ScheduledInstancesPlacementBuilderOps = new ScheduledInstancesPlacementBuilderOps(v)

  implicit def toScheduledInstancesPlacementOps(v: ScheduledInstancesPlacement): ScheduledInstancesPlacementOps =
    new ScheduledInstancesPlacementOps(v)

}
