// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class StackDriftInformationBuilderOps(val self: StackDriftInformation.Builder) extends AnyVal {

  final def stackDriftStatusAsScala(value: Option[StackDriftStatus]): StackDriftInformation.Builder = {
    value.fold(self) { v =>
      self.stackDriftStatus(v)
    }
  } // StackDriftStatus

  final def lastCheckTimestampAsScala(value: Option[java.time.Instant]): StackDriftInformation.Builder = {
    value.fold(self) { v =>
      self.lastCheckTimestamp(v)
    }
  } // java.time.Instant

}

final class StackDriftInformationOps(val self: StackDriftInformation) extends AnyVal {

  final def stackDriftStatusAsScala: Option[StackDriftStatus] = Option(self.stackDriftStatus) // StackDriftStatus

  final def lastCheckTimestampAsScala: Option[java.time.Instant] = Option(self.lastCheckTimestamp) // java.time.Instant

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStackDriftInformationOps {

  implicit def toStackDriftInformationBuilderOps(v: StackDriftInformation.Builder): StackDriftInformationBuilderOps =
    new StackDriftInformationBuilderOps(v)

  implicit def toStackDriftInformationOps(v: StackDriftInformation): StackDriftInformationOps =
    new StackDriftInformationOps(v)

}
