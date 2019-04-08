// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class DescribeLogGroupsResponseBuilderOps(val self: DescribeLogGroupsResponse.Builder) extends AnyVal {

  final def logGroupsAsScala(value: Option[Seq[LogGroup]]): DescribeLogGroupsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.logGroups(v.asJava)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeLogGroupsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeLogGroupsResponseOps(val self: DescribeLogGroupsResponse) extends AnyVal {

  final def logGroupsAsScala: Option[Seq[LogGroup]] = Option(self.logGroups).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeLogGroupsResponseOps {

  implicit def toDescribeLogGroupsResponseBuilderOps(
      v: DescribeLogGroupsResponse.Builder
  ): DescribeLogGroupsResponseBuilderOps = new DescribeLogGroupsResponseBuilderOps(v)

  implicit def toDescribeLogGroupsResponseOps(v: DescribeLogGroupsResponse): DescribeLogGroupsResponseOps =
    new DescribeLogGroupsResponseOps(v)

}
