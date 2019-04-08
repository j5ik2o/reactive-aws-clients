// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class DescribeComputeEnvironmentsResponseBuilderOps(val self: DescribeComputeEnvironmentsResponse.Builder)
    extends AnyVal {

  final def computeEnvironmentsAsScala(
      value: Option[Seq[ComputeEnvironmentDetail]]
  ): DescribeComputeEnvironmentsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.computeEnvironments(v.asJava)
    } // Seq[ComputeEnvironmentDetail]
  }

  final def nextTokenAsScala(value: Option[String]): DescribeComputeEnvironmentsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  } // String

}

final class DescribeComputeEnvironmentsResponseOps(val self: DescribeComputeEnvironmentsResponse) extends AnyVal {

  final def computeEnvironmentsAsScala: Option[Seq[ComputeEnvironmentDetail]] = Option(self.computeEnvironments).map {
    v =>
      import scala.collection.JavaConverters._; v.asScala
  } // Seq[ComputeEnvironmentDetail]

  final def nextTokenAsScala: Option[String] = Option(self.nextToken) // String

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
