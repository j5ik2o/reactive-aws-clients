// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeFlowLogsRequestBuilderOps(val self: DescribeFlowLogsRequest.Builder) extends AnyVal {

  final def filterAsScala(value: Option[Seq[Filter]]): DescribeFlowLogsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.filter(v.asJava)
    }
  }

  final def flowLogIdsAsScala(value: Option[Seq[String]]): DescribeFlowLogsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.flowLogIds(v.asJava)
    }
  }

  final def maxResultsAsScala(value: Option[Int]): DescribeFlowLogsRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeFlowLogsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeFlowLogsRequestOps(val self: DescribeFlowLogsRequest) extends AnyVal {

  final def filterAsScala: Option[Seq[Filter]] = Option(self.filter).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def flowLogIdsAsScala: Option[Seq[String]] = Option(self.flowLogIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeFlowLogsRequestOps {

  implicit def toDescribeFlowLogsRequestBuilderOps(
      v: DescribeFlowLogsRequest.Builder
  ): DescribeFlowLogsRequestBuilderOps = new DescribeFlowLogsRequestBuilderOps(v)

  implicit def toDescribeFlowLogsRequestOps(v: DescribeFlowLogsRequest): DescribeFlowLogsRequestOps =
    new DescribeFlowLogsRequestOps(v)

}
