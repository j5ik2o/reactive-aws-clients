// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyAvailabilityZoneGroupResponseBuilderOps(val self: ModifyAvailabilityZoneGroupResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def returnValueAsScala(value: Option[Boolean]): ModifyAvailabilityZoneGroupResponse.Builder = {
    value.fold(self) { v => self.returnValue(v) }
  }

}

final class ModifyAvailabilityZoneGroupResponseOps(val self: ModifyAvailabilityZoneGroupResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def returnValueAsScala: Option[Boolean] = Option(self.returnValue)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifyAvailabilityZoneGroupResponseOps {

  implicit def toModifyAvailabilityZoneGroupResponseBuilderOps(
      v: ModifyAvailabilityZoneGroupResponse.Builder
  ): ModifyAvailabilityZoneGroupResponseBuilderOps = new ModifyAvailabilityZoneGroupResponseBuilderOps(v)

  implicit def toModifyAvailabilityZoneGroupResponseOps(
      v: ModifyAvailabilityZoneGroupResponse
  ): ModifyAvailabilityZoneGroupResponseOps = new ModifyAvailabilityZoneGroupResponseOps(v)

}
