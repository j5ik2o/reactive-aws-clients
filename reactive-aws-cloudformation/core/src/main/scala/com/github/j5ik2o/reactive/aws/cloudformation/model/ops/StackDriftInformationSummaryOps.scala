// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class StackDriftInformationSummaryBuilderOps(val self: StackDriftInformationSummary.Builder) extends AnyVal {

  final def stackDriftStatusAsScala(value: Option[StackDriftStatus]): StackDriftInformationSummary.Builder = {
    value.fold(self) { v =>
      self.stackDriftStatus(v)
    }
  } // String

  final def lastCheckTimestampAsScala(value: Option[java.time.Instant]): StackDriftInformationSummary.Builder = {
    value.fold(self) { v =>
      self.lastCheckTimestamp(v)
    }
  } // Instant

}

final class StackDriftInformationSummaryOps(val self: StackDriftInformationSummary) extends AnyVal {

  final def stackDriftStatusAsScala: Option[StackDriftStatus] = Option(self.stackDriftStatus) // String

  final def lastCheckTimestampAsScala: Option[java.time.Instant] = Option(self.lastCheckTimestamp) // Instant

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStackDriftInformationSummaryOps {

  implicit def toStackDriftInformationSummaryBuilderOps(
      v: StackDriftInformationSummary.Builder
  ): StackDriftInformationSummaryBuilderOps = new StackDriftInformationSummaryBuilderOps(v)

  implicit def toStackDriftInformationSummaryOps(v: StackDriftInformationSummary): StackDriftInformationSummaryOps =
    new StackDriftInformationSummaryOps(v)

}
