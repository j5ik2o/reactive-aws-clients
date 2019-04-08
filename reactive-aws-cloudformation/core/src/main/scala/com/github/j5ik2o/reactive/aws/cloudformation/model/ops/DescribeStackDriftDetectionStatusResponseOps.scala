// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class DescribeStackDriftDetectionStatusResponseBuilderOps(
    val self: DescribeStackDriftDetectionStatusResponse.Builder
) extends AnyVal {

  final def stackIdAsScala(value: Option[String]): DescribeStackDriftDetectionStatusResponse.Builder = {
    value.fold(self) { v =>
      self.stackId(v)
    }
  } // String

  final def stackDriftDetectionIdAsScala(value: Option[String]): DescribeStackDriftDetectionStatusResponse.Builder = {
    value.fold(self) { v =>
      self.stackDriftDetectionId(v)
    }
  } // String

  final def stackDriftStatusAsScala(
      value: Option[StackDriftStatus]
  ): DescribeStackDriftDetectionStatusResponse.Builder = {
    value.fold(self) { v =>
      self.stackDriftStatus(v)
    }
  } // StackDriftStatus

  final def detectionStatusAsScala(
      value: Option[StackDriftDetectionStatus]
  ): DescribeStackDriftDetectionStatusResponse.Builder = {
    value.fold(self) { v =>
      self.detectionStatus(v)
    }
  } // StackDriftDetectionStatus

  final def detectionStatusReasonAsScala(value: Option[String]): DescribeStackDriftDetectionStatusResponse.Builder = {
    value.fold(self) { v =>
      self.detectionStatusReason(v)
    }
  } // String

  final def driftedStackResourceCountAsScala(value: Option[Int]): DescribeStackDriftDetectionStatusResponse.Builder = {
    value.fold(self) { v =>
      self.driftedStackResourceCount(v)
    }
  } // Int

  final def timestampAsScala(value: Option[java.time.Instant]): DescribeStackDriftDetectionStatusResponse.Builder = {
    value.fold(self) { v =>
      self.timestamp(v)
    }
  } // java.time.Instant

}

final class DescribeStackDriftDetectionStatusResponseOps(val self: DescribeStackDriftDetectionStatusResponse)
    extends AnyVal {

  final def stackIdAsScala: Option[String] = Option(self.stackId) // String

  final def stackDriftDetectionIdAsScala: Option[String] = Option(self.stackDriftDetectionId) // String

  final def stackDriftStatusAsScala: Option[StackDriftStatus] = Option(self.stackDriftStatus) // StackDriftStatus

  final def detectionStatusAsScala: Option[StackDriftDetectionStatus] =
    Option(self.detectionStatus) // StackDriftDetectionStatus

  final def detectionStatusReasonAsScala: Option[String] = Option(self.detectionStatusReason) // String

  final def driftedStackResourceCountAsScala: Option[Int] = Option(self.driftedStackResourceCount) // Int

  final def timestampAsScala: Option[java.time.Instant] = Option(self.timestamp) // java.time.Instant

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeStackDriftDetectionStatusResponseOps {

  implicit def toDescribeStackDriftDetectionStatusResponseBuilderOps(
      v: DescribeStackDriftDetectionStatusResponse.Builder
  ): DescribeStackDriftDetectionStatusResponseBuilderOps = new DescribeStackDriftDetectionStatusResponseBuilderOps(v)

  implicit def toDescribeStackDriftDetectionStatusResponseOps(
      v: DescribeStackDriftDetectionStatusResponse
  ): DescribeStackDriftDetectionStatusResponseOps = new DescribeStackDriftDetectionStatusResponseOps(v)

}
