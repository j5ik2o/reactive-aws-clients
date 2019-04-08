// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class PutLogEventsResponseBuilderOps(val self: PutLogEventsResponse.Builder) extends AnyVal {

  final def nextSequenceTokenAsScala(value: Option[String]): PutLogEventsResponse.Builder = {
    value.fold(self) { v =>
      self.nextSequenceToken(v)
    }
  } // String

  final def rejectedLogEventsInfoAsScala(value: Option[RejectedLogEventsInfo]): PutLogEventsResponse.Builder = {
    value.fold(self) { v =>
      self.rejectedLogEventsInfo(v)
    }
  } // RejectedLogEventsInfo

}

final class PutLogEventsResponseOps(val self: PutLogEventsResponse) extends AnyVal {

  final def nextSequenceTokenAsScala: Option[String] = Option(self.nextSequenceToken) // String

  final def rejectedLogEventsInfoAsScala: Option[RejectedLogEventsInfo] =
    Option(self.rejectedLogEventsInfo) // RejectedLogEventsInfo

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutLogEventsResponseOps {

  implicit def toPutLogEventsResponseBuilderOps(v: PutLogEventsResponse.Builder): PutLogEventsResponseBuilderOps =
    new PutLogEventsResponseBuilderOps(v)

  implicit def toPutLogEventsResponseOps(v: PutLogEventsResponse): PutLogEventsResponseOps =
    new PutLogEventsResponseOps(v)

}
