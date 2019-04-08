// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class SlotDateTimeRangeRequestBuilderOps(val self: SlotDateTimeRangeRequest.Builder) extends AnyVal {

  final def earliestTimeAsScala(value: Option[java.time.Instant]): SlotDateTimeRangeRequest.Builder = {
    value.fold(self) { v =>
      self.earliestTime(v)
    }
  }

  final def latestTimeAsScala(value: Option[java.time.Instant]): SlotDateTimeRangeRequest.Builder = {
    value.fold(self) { v =>
      self.latestTime(v)
    }
  }

}

final class SlotDateTimeRangeRequestOps(val self: SlotDateTimeRangeRequest) extends AnyVal {

  final def earliestTimeAsScala: Option[java.time.Instant] = Option(self.earliestTime)

  final def latestTimeAsScala: Option[java.time.Instant] = Option(self.latestTime)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSlotDateTimeRangeRequestOps {

  implicit def toSlotDateTimeRangeRequestBuilderOps(
      v: SlotDateTimeRangeRequest.Builder
  ): SlotDateTimeRangeRequestBuilderOps = new SlotDateTimeRangeRequestBuilderOps(v)

  implicit def toSlotDateTimeRangeRequestOps(v: SlotDateTimeRangeRequest): SlotDateTimeRangeRequestOps =
    new SlotDateTimeRangeRequestOps(v)

}
