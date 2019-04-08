// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyInstanceEventStartTimeRequestBuilderOps(val self: ModifyInstanceEventStartTimeRequest.Builder)
    extends AnyVal {

  final def instanceIdAsScala(value: Option[String]): ModifyInstanceEventStartTimeRequest.Builder = {
    value.fold(self) { v =>
      self.instanceId(v)
    }
  }

  final def instanceEventIdAsScala(value: Option[String]): ModifyInstanceEventStartTimeRequest.Builder = {
    value.fold(self) { v =>
      self.instanceEventId(v)
    }
  }

  final def notBeforeAsScala(value: Option[java.time.Instant]): ModifyInstanceEventStartTimeRequest.Builder = {
    value.fold(self) { v =>
      self.notBefore(v)
    }
  }

}

final class ModifyInstanceEventStartTimeRequestOps(val self: ModifyInstanceEventStartTimeRequest) extends AnyVal {

  final def instanceIdAsScala: Option[String] = Option(self.instanceId)

  final def instanceEventIdAsScala: Option[String] = Option(self.instanceEventId)

  final def notBeforeAsScala: Option[java.time.Instant] = Option(self.notBefore)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifyInstanceEventStartTimeRequestOps {

  implicit def toModifyInstanceEventStartTimeRequestBuilderOps(
      v: ModifyInstanceEventStartTimeRequest.Builder
  ): ModifyInstanceEventStartTimeRequestBuilderOps = new ModifyInstanceEventStartTimeRequestBuilderOps(v)

  implicit def toModifyInstanceEventStartTimeRequestOps(
      v: ModifyInstanceEventStartTimeRequest
  ): ModifyInstanceEventStartTimeRequestOps = new ModifyInstanceEventStartTimeRequestOps(v)

}
