// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeFleetInstancesRequestBuilderOps(val self: DescribeFleetInstancesRequest.Builder) extends AnyVal {

  final def maxResultsAsScala(value: Option[Int]): DescribeFleetInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeFleetInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  final def fleetIdAsScala(value: Option[String]): DescribeFleetInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.fleetId(v)
    }
  }

  final def filtersAsScala(value: Option[Seq[Filter]]): DescribeFleetInstancesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.filters(v.asJava)
    }
  }

}

final class DescribeFleetInstancesRequestOps(val self: DescribeFleetInstancesRequest) extends AnyVal {

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  final def fleetIdAsScala: Option[String] = Option(self.fleetId)

  final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeFleetInstancesRequestOps {

  implicit def toDescribeFleetInstancesRequestBuilderOps(
      v: DescribeFleetInstancesRequest.Builder
  ): DescribeFleetInstancesRequestBuilderOps = new DescribeFleetInstancesRequestBuilderOps(v)

  implicit def toDescribeFleetInstancesRequestOps(v: DescribeFleetInstancesRequest): DescribeFleetInstancesRequestOps =
    new DescribeFleetInstancesRequestOps(v)

}
