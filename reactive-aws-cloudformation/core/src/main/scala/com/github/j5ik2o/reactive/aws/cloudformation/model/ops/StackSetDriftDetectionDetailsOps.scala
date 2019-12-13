// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class StackSetDriftDetectionDetailsBuilderOps(val self: StackSetDriftDetectionDetails.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def driftStatusAsScala(value: Option[StackSetDriftStatus]): StackSetDriftDetectionDetails.Builder = {
    value.fold(self) { v =>
      self.driftStatus(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def driftDetectionStatusAsScala(
      value: Option[StackSetDriftDetectionStatus]
  ): StackSetDriftDetectionDetails.Builder = {
    value.fold(self) { v =>
      self.driftDetectionStatus(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastDriftCheckTimestampAsScala(value: Option[java.time.Instant]): StackSetDriftDetectionDetails.Builder = {
    value.fold(self) { v =>
      self.lastDriftCheckTimestamp(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def totalStackInstancesCountAsScala(value: Option[Int]): StackSetDriftDetectionDetails.Builder = {
    value.fold(self) { v =>
      self.totalStackInstancesCount(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def driftedStackInstancesCountAsScala(value: Option[Int]): StackSetDriftDetectionDetails.Builder = {
    value.fold(self) { v =>
      self.driftedStackInstancesCount(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def inSyncStackInstancesCountAsScala(value: Option[Int]): StackSetDriftDetectionDetails.Builder = {
    value.fold(self) { v =>
      self.inSyncStackInstancesCount(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def inProgressStackInstancesCountAsScala(value: Option[Int]): StackSetDriftDetectionDetails.Builder = {
    value.fold(self) { v =>
      self.inProgressStackInstancesCount(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def failedStackInstancesCountAsScala(value: Option[Int]): StackSetDriftDetectionDetails.Builder = {
    value.fold(self) { v =>
      self.failedStackInstancesCount(v)
    }
  }

}

final class StackSetDriftDetectionDetailsOps(val self: StackSetDriftDetectionDetails) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def driftStatusAsScala: Option[StackSetDriftStatus] = Option(self.driftStatus)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def driftDetectionStatusAsScala: Option[StackSetDriftDetectionStatus] = Option(self.driftDetectionStatus)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastDriftCheckTimestampAsScala: Option[java.time.Instant] = Option(self.lastDriftCheckTimestamp)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def totalStackInstancesCountAsScala: Option[Int] = Option(self.totalStackInstancesCount)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def driftedStackInstancesCountAsScala: Option[Int] = Option(self.driftedStackInstancesCount)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def inSyncStackInstancesCountAsScala: Option[Int] = Option(self.inSyncStackInstancesCount)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def inProgressStackInstancesCountAsScala: Option[Int] = Option(self.inProgressStackInstancesCount)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def failedStackInstancesCountAsScala: Option[Int] = Option(self.failedStackInstancesCount)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStackSetDriftDetectionDetailsOps {

  implicit def toStackSetDriftDetectionDetailsBuilderOps(
      v: StackSetDriftDetectionDetails.Builder
  ): StackSetDriftDetectionDetailsBuilderOps = new StackSetDriftDetectionDetailsBuilderOps(v)

  implicit def toStackSetDriftDetectionDetailsOps(v: StackSetDriftDetectionDetails): StackSetDriftDetectionDetailsOps =
    new StackSetDriftDetectionDetailsOps(v)

}
