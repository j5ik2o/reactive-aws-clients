// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class GetLogEventsResponseBuilderOps(val self: GetLogEventsResponse.Builder) extends AnyVal {

  final def eventsAsScala(value: Option[Seq[OutputLogEvent]]): GetLogEventsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.events(v.asJava)
    }
  }

  final def nextForwardTokenAsScala(value: Option[String]): GetLogEventsResponse.Builder = {
    value.fold(self) { v =>
      self.nextForwardToken(v)
    }
  }

  final def nextBackwardTokenAsScala(value: Option[String]): GetLogEventsResponse.Builder = {
    value.fold(self) { v =>
      self.nextBackwardToken(v)
    }
  }

}

final class GetLogEventsResponseOps(val self: GetLogEventsResponse) extends AnyVal {

  final def eventsAsScala: Option[Seq[OutputLogEvent]] = Option(self.events).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def nextForwardTokenAsScala: Option[String] = Option(self.nextForwardToken)

  final def nextBackwardTokenAsScala: Option[String] = Option(self.nextBackwardToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetLogEventsResponseOps {

  implicit def toGetLogEventsResponseBuilderOps(v: GetLogEventsResponse.Builder): GetLogEventsResponseBuilderOps =
    new GetLogEventsResponseBuilderOps(v)

  implicit def toGetLogEventsResponseOps(v: GetLogEventsResponse): GetLogEventsResponseOps =
    new GetLogEventsResponseOps(v)

}
