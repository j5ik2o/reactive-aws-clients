// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class PutLogEventsResponseBuilderOps(val self: PutLogEventsResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextSequenceTokenAsScala(value: Option[String]): PutLogEventsResponse.Builder = {
    value.fold(self) { v => self.nextSequenceToken(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def rejectedLogEventsInfoAsScala(value: Option[RejectedLogEventsInfo]): PutLogEventsResponse.Builder = {
    value.fold(self) { v => self.rejectedLogEventsInfo(v) }
  }

}

final class PutLogEventsResponseOps(val self: PutLogEventsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextSequenceTokenAsScala: Option[String] = Option(self.nextSequenceToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def rejectedLogEventsInfoAsScala: Option[RejectedLogEventsInfo] = Option(self.rejectedLogEventsInfo)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutLogEventsResponseOps {

  implicit def toPutLogEventsResponseBuilderOps(v: PutLogEventsResponse.Builder): PutLogEventsResponseBuilderOps =
    new PutLogEventsResponseBuilderOps(v)

  implicit def toPutLogEventsResponseOps(v: PutLogEventsResponse): PutLogEventsResponseOps =
    new PutLogEventsResponseOps(v)

}
