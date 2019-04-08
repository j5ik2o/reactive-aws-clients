// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class DescribeLogStreamsResponseBuilderOps(val self: DescribeLogStreamsResponse.Builder) extends AnyVal {

  final def logStreamsAsScala(value: Option[Seq[LogStream]]): DescribeLogStreamsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.logStreams(v.asJava)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeLogStreamsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeLogStreamsResponseOps(val self: DescribeLogStreamsResponse) extends AnyVal {

  final def logStreamsAsScala: Option[Seq[LogStream]] = Option(self.logStreams).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeLogStreamsResponseOps {

  implicit def toDescribeLogStreamsResponseBuilderOps(
      v: DescribeLogStreamsResponse.Builder
  ): DescribeLogStreamsResponseBuilderOps = new DescribeLogStreamsResponseBuilderOps(v)

  implicit def toDescribeLogStreamsResponseOps(v: DescribeLogStreamsResponse): DescribeLogStreamsResponseOps =
    new DescribeLogStreamsResponseOps(v)

}
