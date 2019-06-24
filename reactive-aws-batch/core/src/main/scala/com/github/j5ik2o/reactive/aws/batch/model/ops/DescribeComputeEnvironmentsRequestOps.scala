// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class DescribeComputeEnvironmentsRequestBuilderOps(val self: DescribeComputeEnvironmentsRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def computeEnvironmentsAsScala(value: Option[Seq[String]]): DescribeComputeEnvironmentsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.computeEnvironments(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala(value: Option[Int]): DescribeComputeEnvironmentsRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeComputeEnvironmentsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeComputeEnvironmentsRequestOps(val self: DescribeComputeEnvironmentsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def computeEnvironmentsAsScala: Option[Seq[String]] = Option(self.computeEnvironments).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeComputeEnvironmentsRequestOps {

  implicit def toDescribeComputeEnvironmentsRequestBuilderOps(
      v: DescribeComputeEnvironmentsRequest.Builder
  ): DescribeComputeEnvironmentsRequestBuilderOps = new DescribeComputeEnvironmentsRequestBuilderOps(v)

  implicit def toDescribeComputeEnvironmentsRequestOps(
      v: DescribeComputeEnvironmentsRequest
  ): DescribeComputeEnvironmentsRequestOps = new DescribeComputeEnvironmentsRequestOps(v)

}
