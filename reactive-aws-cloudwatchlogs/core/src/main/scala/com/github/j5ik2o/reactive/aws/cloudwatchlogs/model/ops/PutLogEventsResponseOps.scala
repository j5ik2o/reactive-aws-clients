// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class PutLogEventsResponseBuilderOps(val self: PutLogEventsResponse.Builder) extends AnyVal {

  final def nextSequenceTokenAsScala(value: Option[String]): PutLogEventsResponse.Builder = {
    value.fold(self) { v =>
      self.nextSequenceToken(v)
    }
  }

  final def rejectedLogEventsInfoAsScala(value: Option[RejectedLogEventsInfo]): PutLogEventsResponse.Builder = {
    value.fold(self) { v =>
      self.rejectedLogEventsInfo(v)
    }
  }

}

final class PutLogEventsResponseOps(val self: PutLogEventsResponse) extends AnyVal {

  final def nextSequenceTokenAsScala: Option[String] = Option(self.nextSequenceToken)

  final def rejectedLogEventsInfoAsScala: Option[RejectedLogEventsInfo] = Option(self.rejectedLogEventsInfo)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutLogEventsResponseOps {

  implicit def toPutLogEventsResponseBuilderOps(v: PutLogEventsResponse.Builder): PutLogEventsResponseBuilderOps =
    new PutLogEventsResponseBuilderOps(v)

  implicit def toPutLogEventsResponseOps(v: PutLogEventsResponse): PutLogEventsResponseOps =
    new PutLogEventsResponseOps(v)

}
