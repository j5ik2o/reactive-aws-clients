// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class DescribeComputeEnvironmentsResponseBuilderOps(val self: DescribeComputeEnvironmentsResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def computeEnvironmentsAsScala(
      value: Option[Seq[ComputeEnvironmentDetail]]
  ): DescribeComputeEnvironmentsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.computeEnvironments(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeComputeEnvironmentsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeComputeEnvironmentsResponseOps(val self: DescribeComputeEnvironmentsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def computeEnvironmentsAsScala: Option[Seq[ComputeEnvironmentDetail]] = Option(self.computeEnvironments).map {
    v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeComputeEnvironmentsResponseOps {

  implicit def toDescribeComputeEnvironmentsResponseBuilderOps(
      v: DescribeComputeEnvironmentsResponse.Builder
  ): DescribeComputeEnvironmentsResponseBuilderOps = new DescribeComputeEnvironmentsResponseBuilderOps(v)

  implicit def toDescribeComputeEnvironmentsResponseOps(
      v: DescribeComputeEnvironmentsResponse
  ): DescribeComputeEnvironmentsResponseOps = new DescribeComputeEnvironmentsResponseOps(v)

}
