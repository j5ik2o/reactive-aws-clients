// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class DescribeEventsResponseBuilderOps(val self: DescribeEventsResponse.Builder) extends AnyVal {

  final def eventsAsScala(value: Option[Seq[EventDescription]]): DescribeEventsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.events(v.asJava)
    } // Seq[EventDescription]
  }

  final def nextTokenAsScala(value: Option[String]): DescribeEventsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  } // String

}

final class DescribeEventsResponseOps(val self: DescribeEventsResponse) extends AnyVal {

  final def eventsAsScala: Option[Seq[EventDescription]] = Option(self.events).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[EventDescription]

  final def nextTokenAsScala: Option[String] = Option(self.nextToken) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeEventsResponseOps {

  implicit def toDescribeEventsResponseBuilderOps(v: DescribeEventsResponse.Builder): DescribeEventsResponseBuilderOps =
    new DescribeEventsResponseBuilderOps(v)

  implicit def toDescribeEventsResponseOps(v: DescribeEventsResponse): DescribeEventsResponseOps =
    new DescribeEventsResponseOps(v)

}
