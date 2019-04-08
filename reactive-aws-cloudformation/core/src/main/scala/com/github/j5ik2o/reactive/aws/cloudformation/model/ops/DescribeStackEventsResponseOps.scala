// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class DescribeStackEventsResponseBuilderOps(val self: DescribeStackEventsResponse.Builder) extends AnyVal {

  final def stackEventsAsScala(value: Option[Seq[StackEvent]]): DescribeStackEventsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.stackEvents(v.asJava)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeStackEventsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeStackEventsResponseOps(val self: DescribeStackEventsResponse) extends AnyVal {

  final def stackEventsAsScala: Option[Seq[StackEvent]] = Option(self.stackEvents).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeStackEventsResponseOps {

  implicit def toDescribeStackEventsResponseBuilderOps(
      v: DescribeStackEventsResponse.Builder
  ): DescribeStackEventsResponseBuilderOps = new DescribeStackEventsResponseBuilderOps(v)

  implicit def toDescribeStackEventsResponseOps(v: DescribeStackEventsResponse): DescribeStackEventsResponseOps =
    new DescribeStackEventsResponseOps(v)

}
