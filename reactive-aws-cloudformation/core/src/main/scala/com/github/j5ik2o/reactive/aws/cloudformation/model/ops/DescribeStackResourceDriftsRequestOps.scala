// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class DescribeStackResourceDriftsRequestBuilderOps(val self: DescribeStackResourceDriftsRequest.Builder)
    extends AnyVal {

  final def stackNameAsScala(value: Option[String]): DescribeStackResourceDriftsRequest.Builder = {
    value.fold(self) { v =>
      self.stackName(v)
    }
  } // String

  final def stackResourceDriftStatusFiltersAsScala(
      value: Option[Seq[StackResourceDriftStatus]]
  ): DescribeStackResourceDriftsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.stackResourceDriftStatusFilters(v.asJava)
    } // Seq[String]
  }

  final def nextTokenAsScala(value: Option[String]): DescribeStackResourceDriftsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  } // String

  final def maxResultsAsScala(value: Option[Int]): DescribeStackResourceDriftsRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  } // Int

}

final class DescribeStackResourceDriftsRequestOps(val self: DescribeStackResourceDriftsRequest) extends AnyVal {

  final def stackNameAsScala: Option[String] = Option(self.stackName) // String

  final def stackResourceDriftStatusFiltersAsScala: Option[Seq[StackResourceDriftStatus]] =
    Option(self.stackResourceDriftStatusFilters).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    } // Seq[String]

  final def nextTokenAsScala: Option[String] = Option(self.nextToken) // String

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults) // Int

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
