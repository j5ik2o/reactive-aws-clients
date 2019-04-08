// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class SlotStartTimeRangeRequestBuilderOps(val self: SlotStartTimeRangeRequest.Builder) extends AnyVal {

  final def earliestTimeAsScala(value: Option[java.time.Instant]): SlotStartTimeRangeRequest.Builder = {
    value.fold(self) { v =>
      self.earliestTime(v)
    }
  }

  final def latestTimeAsScala(value: Option[java.time.Instant]): SlotStartTimeRangeRequest.Builder = {
    value.fold(self) { v =>
      self.latestTime(v)
    }
  }

}

final class SlotStartTimeRangeRequestOps(val self: SlotStartTimeRangeRequest) extends AnyVal {

  final def earliestTimeAsScala: Option[java.time.Instant] = Option(self.earliestTime)

  final def latestTimeAsScala: Option[java.time.Instant] = Option(self.latestTime)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSlotStartTimeRangeRequestOps {

  implicit def toSlotStartTimeRangeRequestBuilderOps(
      v: SlotStartTimeRangeRequest.Builder
  ): SlotStartTimeRangeRequestBuilderOps = new SlotStartTimeRangeRequestBuilderOps(v)

  implicit def toSlotStartTimeRangeRequestOps(v: SlotStartTimeRangeRequest): SlotStartTimeRangeRequestOps =
    new SlotStartTimeRangeRequestOps(v)

}
