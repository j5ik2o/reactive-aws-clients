// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class RestoreSummaryBuilderOps(val self: RestoreSummary.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceBackupArnAsScala(value: Option[String]): RestoreSummary.Builder = {
    value.fold(self) { v => self.sourceBackupArn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceTableArnAsScala(value: Option[String]): RestoreSummary.Builder = {
    value.fold(self) { v => self.sourceTableArn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def restoreDateTimeAsScala(value: Option[java.time.Instant]): RestoreSummary.Builder = {
    value.fold(self) { v => self.restoreDateTime(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def restoreInProgressAsScala(value: Option[Boolean]): RestoreSummary.Builder = {
    value.fold(self) { v => self.restoreInProgress(v) }
  }

}

final class RestoreSummaryOps(val self: RestoreSummary) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceBackupArnAsScala: Option[String] = Option(self.sourceBackupArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceTableArnAsScala: Option[String] = Option(self.sourceTableArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def restoreDateTimeAsScala: Option[java.time.Instant] = Option(self.restoreDateTime)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def restoreInProgressAsScala: Option[Boolean] = Option(self.restoreInProgress)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRestoreSummaryOps {

  implicit def toRestoreSummaryBuilderOps(v: RestoreSummary.Builder): RestoreSummaryBuilderOps =
    new RestoreSummaryBuilderOps(v)

  implicit def toRestoreSummaryOps(v: RestoreSummary): RestoreSummaryOps = new RestoreSummaryOps(v)

}
