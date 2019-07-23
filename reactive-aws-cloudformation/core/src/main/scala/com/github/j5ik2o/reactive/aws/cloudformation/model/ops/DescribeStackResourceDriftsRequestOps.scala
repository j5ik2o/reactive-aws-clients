// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class DescribeStackResourceDriftsRequestBuilderOps(val self: DescribeStackResourceDriftsRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackNameAsScala(value: Option[String]): DescribeStackResourceDriftsRequest.Builder = {
    value.fold(self) { v =>
      self.stackName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackResourceDriftStatusFiltersAsScala(
      value: Option[Seq[StackResourceDriftStatus]]
  ): DescribeStackResourceDriftsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.stackResourceDriftStatusFilters(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeStackResourceDriftsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala(value: Option[Int]): DescribeStackResourceDriftsRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

}

final class DescribeStackResourceDriftsRequestOps(val self: DescribeStackResourceDriftsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackNameAsScala: Option[String] = Option(self.stackName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackResourceDriftStatusFiltersAsScala: Option[Seq[StackResourceDriftStatus]] =
    Option(self.stackResourceDriftStatusFilters).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
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
