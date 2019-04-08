// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeInstancesRequestBuilderOps(val self: DescribeInstancesRequest.Builder) extends AnyVal {

  final def filtersAsScala(value: Option[Seq[Filter]]): DescribeInstancesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.filters(v.asJava)
    }
  }

  final def instanceIdsAsScala(value: Option[Seq[String]]): DescribeInstancesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.instanceIds(v.asJava)
    }
  }

  final def maxResultsAsScala(value: Option[Int]): DescribeInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeInstancesRequestOps(val self: DescribeInstancesRequest) extends AnyVal {

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
trait ToDescribeInstancesRequestOps {

  implicit def toDescribeInstancesRequestBuilderOps(
      v: DescribeInstancesRequest.Builder
  ): DescribeInstancesRequestBuilderOps = new DescribeInstancesRequestBuilderOps(v)

  implicit def toDescribeInstancesRequestOps(v: DescribeInstancesRequest): DescribeInstancesRequestOps =
    new DescribeInstancesRequestOps(v)

}
