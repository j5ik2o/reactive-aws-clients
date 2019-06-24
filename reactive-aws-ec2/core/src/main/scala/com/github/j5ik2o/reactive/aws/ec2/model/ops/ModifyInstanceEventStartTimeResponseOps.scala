// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyInstanceEventStartTimeResponseBuilderOps(val self: ModifyInstanceEventStartTimeResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def eventAsScala(value: Option[InstanceStatusEvent]): ModifyInstanceEventStartTimeResponse.Builder = {
    value.fold(self) { v =>
      self.event(v)
    }
  }

}

final class ModifyInstanceEventStartTimeResponseOps(val self: ModifyInstanceEventStartTimeResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def eventAsScala: Option[InstanceStatusEvent] = Option(self.event)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifyInstanceEventStartTimeResponseOps {

  implicit def toModifyInstanceEventStartTimeResponseBuilderOps(
      v: ModifyInstanceEventStartTimeResponse.Builder
  ): ModifyInstanceEventStartTimeResponseBuilderOps = new ModifyInstanceEventStartTimeResponseBuilderOps(v)

  implicit def toModifyInstanceEventStartTimeResponseOps(
      v: ModifyInstanceEventStartTimeResponse
  ): ModifyInstanceEventStartTimeResponseOps = new ModifyInstanceEventStartTimeResponseOps(v)

}
