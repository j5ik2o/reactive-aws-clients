// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class DescribeEventsResponseBuilderOps(val self: DescribeEventsResponse.Builder) extends AnyVal {

  final def withNextTokenAsScala(value: Option[String]): DescribeEventsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  } // String

  final def withEventsAsScala(value: Option[Seq[Event]]): DescribeEventsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.events(v.asJava)
    } // Seq[Event]
  }

}

final class DescribeEventsResponseOps(val self: DescribeEventsResponse) extends AnyVal {

  final def nextTokenAsScala: Option[String] = Option(self.nextToken) // String

  final def eventsAsScala: Option[Seq[Event]] = Option(self.events).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[Event]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeEventsResponseOps {

  implicit def toDescribeEventsResponseBuilderOps(v: DescribeEventsResponse.Builder): DescribeEventsResponseBuilderOps =
    new DescribeEventsResponseBuilderOps(v)

  implicit def toDescribeEventsResponseOps(v: DescribeEventsResponse): DescribeEventsResponseOps =
    new DescribeEventsResponseOps(v)

}
