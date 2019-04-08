// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class RestoreSummaryBuilderOps(val self: RestoreSummary.Builder) extends AnyVal {

  final def sourceBackupArnAsScala(value: Option[String]): RestoreSummary.Builder = {
    value.fold(self) { v =>
      self.sourceBackupArn(v)
    }
  } // String

  final def sourceTableArnAsScala(value: Option[String]): RestoreSummary.Builder = {
    value.fold(self) { v =>
      self.sourceTableArn(v)
    }
  } // String

  final def restoreDateTimeAsScala(value: Option[java.time.Instant]): RestoreSummary.Builder = {
    value.fold(self) { v =>
      self.restoreDateTime(v)
    }
  } // java.time.Instant

  final def restoreInProgressAsScala(value: Option[Boolean]): RestoreSummary.Builder = {
    value.fold(self) { v =>
      self.restoreInProgress(v)
    }
  } // Boolean

}

final class RestoreSummaryOps(val self: RestoreSummary) extends AnyVal {

  final def sourceBackupArnAsScala: Option[String] = Option(self.sourceBackupArn) // String

  final def sourceTableArnAsScala: Option[String] = Option(self.sourceTableArn) // String

  final def restoreDateTimeAsScala: Option[java.time.Instant] = Option(self.restoreDateTime) // java.time.Instant

  final def restoreInProgressAsScala: Option[Boolean] = Option(self.restoreInProgress) // Boolean

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRestoreSummaryOps {

  implicit def toRestoreSummaryBuilderOps(v: RestoreSummary.Builder): RestoreSummaryBuilderOps =
    new RestoreSummaryBuilderOps(v)

  implicit def toRestoreSummaryOps(v: RestoreSummary): RestoreSummaryOps = new RestoreSummaryOps(v)

}
