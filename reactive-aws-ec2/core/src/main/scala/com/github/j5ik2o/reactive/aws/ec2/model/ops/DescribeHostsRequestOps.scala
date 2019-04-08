// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeHostsRequestBuilderOps(val self: DescribeHostsRequest.Builder) extends AnyVal {

  final def filterAsScala(value: Option[Seq[Filter]]): DescribeHostsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.filter(v.asJava)
    }
  }

  final def hostIdsAsScala(value: Option[Seq[String]]): DescribeHostsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.hostIds(v.asJava)
    }
  }

  final def maxResultsAsScala(value: Option[Int]): DescribeHostsRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeHostsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeHostsRequestOps(val self: DescribeHostsRequest) extends AnyVal {

  final def filterAsScala: Option[Seq[Filter]] = Option(self.filter).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def hostIdsAsScala: Option[Seq[String]] = Option(self.hostIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeHostsRequestOps {

  implicit def toDescribeHostsRequestBuilderOps(v: DescribeHostsRequest.Builder): DescribeHostsRequestBuilderOps =
    new DescribeHostsRequestBuilderOps(v)

  implicit def toDescribeHostsRequestOps(v: DescribeHostsRequest): DescribeHostsRequestOps =
    new DescribeHostsRequestOps(v)

}
