// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class StackResourceDriftInformationSummaryBuilderOps(val self: StackResourceDriftInformationSummary.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackResourceDriftStatusAsScala(
      value: Option[StackResourceDriftStatus]
  ): StackResourceDriftInformationSummary.Builder = {
    value.fold(self) { v => self.stackResourceDriftStatus(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastCheckTimestampAsScala(
      value: Option[java.time.Instant]
  ): StackResourceDriftInformationSummary.Builder = {
    value.fold(self) { v => self.lastCheckTimestamp(v) }
  }

}

final class StackResourceDriftInformationSummaryOps(val self: StackResourceDriftInformationSummary) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackResourceDriftStatusAsScala: Option[StackResourceDriftStatus] = Option(self.stackResourceDriftStatus)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastCheckTimestampAsScala: Option[java.time.Instant] = Option(self.lastCheckTimestamp)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStackResourceDriftInformationSummaryOps {

  implicit def toStackResourceDriftInformationSummaryBuilderOps(
      v: StackResourceDriftInformationSummary.Builder
  ): StackResourceDriftInformationSummaryBuilderOps = new StackResourceDriftInformationSummaryBuilderOps(v)

  implicit def toStackResourceDriftInformationSummaryOps(
      v: StackResourceDriftInformationSummary
  ): StackResourceDriftInformationSummaryOps = new StackResourceDriftInformationSummaryOps(v)

}
