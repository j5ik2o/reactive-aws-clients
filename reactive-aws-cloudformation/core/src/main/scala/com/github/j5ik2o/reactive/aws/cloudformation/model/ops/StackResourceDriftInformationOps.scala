// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class StackResourceDriftInformationBuilderOps(val self: StackResourceDriftInformation.Builder) extends AnyVal {

  final def stackResourceDriftStatusAsScala(
      value: Option[StackResourceDriftStatus]
  ): StackResourceDriftInformation.Builder = {
    value.fold(self) { v =>
      self.stackResourceDriftStatus(v)
    }
  }

  final def lastCheckTimestampAsScala(value: Option[java.time.Instant]): StackResourceDriftInformation.Builder = {
    value.fold(self) { v =>
      self.lastCheckTimestamp(v)
    }
  }

}

final class StackResourceDriftInformationOps(val self: StackResourceDriftInformation) extends AnyVal {

  final def stackResourceDriftStatusAsScala: Option[StackResourceDriftStatus] = Option(self.stackResourceDriftStatus)

  final def lastCheckTimestampAsScala: Option[java.time.Instant] = Option(self.lastCheckTimestamp)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStackResourceDriftInformationOps {

  implicit def toStackResourceDriftInformationBuilderOps(
      v: StackResourceDriftInformation.Builder
  ): StackResourceDriftInformationBuilderOps = new StackResourceDriftInformationBuilderOps(v)

  implicit def toStackResourceDriftInformationOps(v: StackResourceDriftInformation): StackResourceDriftInformationOps =
    new StackResourceDriftInformationOps(v)

}
