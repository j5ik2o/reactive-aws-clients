// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class DescribeStackResourceDriftsRequestBuilderOps(val self: DescribeStackResourceDriftsRequest.Builder)
    extends AnyVal {

  final def stackNameAsScala(value: Option[String]): DescribeStackResourceDriftsRequest.Builder = {
    value.fold(self) { v =>
      self.stackName(v)
    }
  }

  final def stackResourceDriftStatusFiltersAsScala(
      value: Option[Seq[StackResourceDriftStatus]]
  ): DescribeStackResourceDriftsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.stackResourceDriftStatusFilters(v.asJava)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeStackResourceDriftsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  final def maxResultsAsScala(value: Option[Int]): DescribeStackResourceDriftsRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

}

final class DescribeStackResourceDriftsRequestOps(val self: DescribeStackResourceDriftsRequest) extends AnyVal {

  final def stackNameAsScala: Option[String] = Option(self.stackName)

  final def stackResourceDriftStatusFiltersAsScala: Option[Seq[StackResourceDriftStatus]] =
    Option(self.stackResourceDriftStatusFilters).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeStackResourceDriftsRequestOps {

  implicit def toDescribeStackResourceDriftsRequestBuilderOps(
      v: DescribeStackResourceDriftsRequest.Builder
  ): DescribeStackResourceDriftsRequestBuilderOps = new DescribeStackResourceDriftsRequestBuilderOps(v)

  implicit def toDescribeStackResourceDriftsRequestOps(
      v: DescribeStackResourceDriftsRequest
  ): DescribeStackResourceDriftsRequestOps = new DescribeStackResourceDriftsRequestOps(v)

}
