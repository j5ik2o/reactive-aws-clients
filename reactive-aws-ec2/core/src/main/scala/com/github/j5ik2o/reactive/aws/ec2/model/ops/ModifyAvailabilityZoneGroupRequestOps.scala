// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyAvailabilityZoneGroupRequestBuilderOps(val self: ModifyAvailabilityZoneGroupRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupNameAsScala(value: Option[String]): ModifyAvailabilityZoneGroupRequest.Builder = {
    value.fold(self) { v => self.groupName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def optInStatusAsScala(
      value: Option[ModifyAvailabilityZoneOptInStatus]
  ): ModifyAvailabilityZoneGroupRequest.Builder = {
    value.fold(self) { v => self.optInStatus(v) }
  }

}

final class ModifyAvailabilityZoneGroupRequestOps(val self: ModifyAvailabilityZoneGroupRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupNameAsScala: Option[String] = Option(self.groupName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def optInStatusAsScala: Option[ModifyAvailabilityZoneOptInStatus] = Option(self.optInStatus)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifyAvailabilityZoneGroupRequestOps {

  implicit def toModifyAvailabilityZoneGroupRequestBuilderOps(
      v: ModifyAvailabilityZoneGroupRequest.Builder
  ): ModifyAvailabilityZoneGroupRequestBuilderOps = new ModifyAvailabilityZoneGroupRequestBuilderOps(v)

  implicit def toModifyAvailabilityZoneGroupRequestOps(
      v: ModifyAvailabilityZoneGroupRequest
  ): ModifyAvailabilityZoneGroupRequestOps = new ModifyAvailabilityZoneGroupRequestOps(v)

}
