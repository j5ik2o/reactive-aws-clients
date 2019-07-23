// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class DescribeStackDriftDetectionStatusResponseBuilderOps(
    val self: DescribeStackDriftDetectionStatusResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackIdAsScala(value: Option[String]): DescribeStackDriftDetectionStatusResponse.Builder = {
    value.fold(self) { v =>
      self.stackId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackDriftDetectionIdAsScala(value: Option[String]): DescribeStackDriftDetectionStatusResponse.Builder = {
    value.fold(self) { v =>
      self.stackDriftDetectionId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackDriftStatusAsScala(
      value: Option[StackDriftStatus]
  ): DescribeStackDriftDetectionStatusResponse.Builder = {
    value.fold(self) { v =>
      self.stackDriftStatus(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def detectionStatusAsScala(
      value: Option[StackDriftDetectionStatus]
  ): DescribeStackDriftDetectionStatusResponse.Builder = {
    value.fold(self) { v =>
      self.detectionStatus(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def detectionStatusReasonAsScala(value: Option[String]): DescribeStackDriftDetectionStatusResponse.Builder = {
    value.fold(self) { v =>
      self.detectionStatusReason(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def driftedStackResourceCountAsScala(value: Option[Int]): DescribeStackDriftDetectionStatusResponse.Builder = {
    value.fold(self) { v =>
      self.driftedStackResourceCount(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def timestampAsScala(value: Option[java.time.Instant]): DescribeStackDriftDetectionStatusResponse.Builder = {
    value.fold(self) { v =>
      self.timestamp(v)
    }
  }

}

final class DescribeStackDriftDetectionStatusResponseOps(val self: DescribeStackDriftDetectionStatusResponse)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackIdAsScala: Option[String] = Option(self.stackId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackDriftDetectionIdAsScala: Option[String] = Option(self.stackDriftDetectionId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackDriftStatusAsScala: Option[StackDriftStatus] = Option(self.stackDriftStatus)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def detectionStatusAsScala: Option[StackDriftDetectionStatus] = Option(self.detectionStatus)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def detectionStatusReasonAsScala: Option[String] = Option(self.detectionStatusReason)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def driftedStackResourceCountAsScala: Option[Int] = Option(self.driftedStackResourceCount)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def timestampAsScala: Option[java.time.Instant] = Option(self.timestamp)

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
