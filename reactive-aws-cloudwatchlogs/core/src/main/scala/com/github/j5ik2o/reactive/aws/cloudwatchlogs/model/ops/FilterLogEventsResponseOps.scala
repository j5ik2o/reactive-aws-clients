// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class FilterLogEventsResponseBuilderOps(val self: FilterLogEventsResponse.Builder) extends AnyVal {

  final def eventsAsScala(value: Option[Seq[FilteredLogEvent]]): FilterLogEventsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.events(v.asJava)
    } // Seq[FilteredLogEvent]
  }

  final def searchedLogStreamsAsScala(value: Option[Seq[SearchedLogStream]]): FilterLogEventsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.searchedLogStreams(v.asJava)
    } // Seq[SearchedLogStream]
  }

  final def nextTokenAsScala(value: Option[String]): FilterLogEventsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  } // String

}

final class FilterLogEventsResponseOps(val self: FilterLogEventsResponse) extends AnyVal {

  final def eventsAsScala: Option[Seq[FilteredLogEvent]] = Option(self.events).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[FilteredLogEvent]

  final def searchedLogStreamsAsScala: Option[Seq[SearchedLogStream]] = Option(self.searchedLogStreams).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[SearchedLogStream]

  final def nextTokenAsScala: Option[String] = Option(self.nextToken) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToFilterLogEventsResponseOps {

  implicit def toFilterLogEventsResponseBuilderOps(
      v: FilterLogEventsResponse.Builder
  ): FilterLogEventsResponseBuilderOps = new FilterLogEventsResponseBuilderOps(v)

  implicit def toFilterLogEventsResponseOps(v: FilterLogEventsResponse): FilterLogEventsResponseOps =
    new FilterLogEventsResponseOps(v)

}
