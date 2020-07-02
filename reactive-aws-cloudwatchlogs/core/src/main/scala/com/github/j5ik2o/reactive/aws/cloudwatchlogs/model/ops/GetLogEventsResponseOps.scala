// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class GetLogEventsResponseBuilderOps(val self: GetLogEventsResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def eventsAsScala(value: Option[Seq[OutputLogEvent]]): GetLogEventsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.events(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextForwardTokenAsScala(value: Option[String]): GetLogEventsResponse.Builder = {
    value.fold(self) { v => self.nextForwardToken(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextBackwardTokenAsScala(value: Option[String]): GetLogEventsResponse.Builder = {
    value.fold(self) { v => self.nextBackwardToken(v) }
  }

}

final class GetLogEventsResponseOps(val self: GetLogEventsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def eventsAsScala: Option[Seq[OutputLogEvent]] =
    Option(self.events).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextForwardTokenAsScala: Option[String] = Option(self.nextForwardToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextBackwardTokenAsScala: Option[String] = Option(self.nextBackwardToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetLogEventsResponseOps {

  implicit def toGetLogEventsResponseBuilderOps(v: GetLogEventsResponse.Builder): GetLogEventsResponseBuilderOps =
    new GetLogEventsResponseBuilderOps(v)

  implicit def toGetLogEventsResponseOps(v: GetLogEventsResponse): GetLogEventsResponseOps =
    new GetLogEventsResponseOps(v)

}
