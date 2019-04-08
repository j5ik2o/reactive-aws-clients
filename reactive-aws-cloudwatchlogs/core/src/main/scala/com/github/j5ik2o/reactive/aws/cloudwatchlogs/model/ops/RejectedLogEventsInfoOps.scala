// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class RejectedLogEventsInfoBuilderOps(val self: RejectedLogEventsInfo.Builder) extends AnyVal {

  final def tooNewLogEventStartIndexAsScala(value: Option[Int]): RejectedLogEventsInfo.Builder = {
    value.fold(self) { v =>
      self.tooNewLogEventStartIndex(v)
    }
  } // Int

  final def tooOldLogEventEndIndexAsScala(value: Option[Int]): RejectedLogEventsInfo.Builder = {
    value.fold(self) { v =>
      self.tooOldLogEventEndIndex(v)
    }
  } // Int

  final def expiredLogEventEndIndexAsScala(value: Option[Int]): RejectedLogEventsInfo.Builder = {
    value.fold(self) { v =>
      self.expiredLogEventEndIndex(v)
    }
  } // Int

}

final class RejectedLogEventsInfoOps(val self: RejectedLogEventsInfo) extends AnyVal {

  final def tooNewLogEventStartIndexAsScala: Option[Int] = Option(self.tooNewLogEventStartIndex) // Int

  final def tooOldLogEventEndIndexAsScala: Option[Int] = Option(self.tooOldLogEventEndIndex) // Int

  final def expiredLogEventEndIndexAsScala: Option[Int] = Option(self.expiredLogEventEndIndex) // Int

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRejectedLogEventsInfoOps {

  implicit def toRejectedLogEventsInfoBuilderOps(v: RejectedLogEventsInfo.Builder): RejectedLogEventsInfoBuilderOps =
    new RejectedLogEventsInfoBuilderOps(v)

  implicit def toRejectedLogEventsInfoOps(v: RejectedLogEventsInfo): RejectedLogEventsInfoOps =
    new RejectedLogEventsInfoOps(v)

}
