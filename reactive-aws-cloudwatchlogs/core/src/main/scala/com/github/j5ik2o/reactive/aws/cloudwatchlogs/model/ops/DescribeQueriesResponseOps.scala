// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class DescribeQueriesResponseBuilderOps(val self: DescribeQueriesResponse.Builder) extends AnyVal {

  final def queriesAsScala(value: Option[Seq[QueryInfo]]): DescribeQueriesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.queries(v.asJava)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeQueriesResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeQueriesResponseOps(val self: DescribeQueriesResponse) extends AnyVal {

  final def queriesAsScala: Option[Seq[QueryInfo]] = Option(self.queries).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeQueriesResponseOps {

  implicit def toDescribeQueriesResponseBuilderOps(
      v: DescribeQueriesResponse.Builder
  ): DescribeQueriesResponseBuilderOps = new DescribeQueriesResponseBuilderOps(v)

  implicit def toDescribeQueriesResponseOps(v: DescribeQueriesResponse): DescribeQueriesResponseOps =
    new DescribeQueriesResponseOps(v)

}
