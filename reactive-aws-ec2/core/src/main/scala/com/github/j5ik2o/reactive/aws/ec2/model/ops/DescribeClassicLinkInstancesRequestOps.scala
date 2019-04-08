// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeClassicLinkInstancesRequestBuilderOps(val self: DescribeClassicLinkInstancesRequest.Builder)
    extends AnyVal {

  final def filtersAsScala(value: Option[Seq[Filter]]): DescribeClassicLinkInstancesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.filters(v.asJava)
    }
  }

  final def instanceIdsAsScala(value: Option[Seq[String]]): DescribeClassicLinkInstancesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.instanceIds(v.asJava)
    }
  }

  final def maxResultsAsScala(value: Option[Int]): DescribeClassicLinkInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeClassicLinkInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeClassicLinkInstancesRequestOps(val self: DescribeClassicLinkInstancesRequest) extends AnyVal {

  final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def instanceIdsAsScala: Option[Seq[String]] = Option(self.instanceIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeClassicLinkInstancesRequestOps {

  implicit def toDescribeClassicLinkInstancesRequestBuilderOps(
      v: DescribeClassicLinkInstancesRequest.Builder
  ): DescribeClassicLinkInstancesRequestBuilderOps = new DescribeClassicLinkInstancesRequestBuilderOps(v)

  implicit def toDescribeClassicLinkInstancesRequestOps(
      v: DescribeClassicLinkInstancesRequest
  ): DescribeClassicLinkInstancesRequestOps = new DescribeClassicLinkInstancesRequestOps(v)

}
