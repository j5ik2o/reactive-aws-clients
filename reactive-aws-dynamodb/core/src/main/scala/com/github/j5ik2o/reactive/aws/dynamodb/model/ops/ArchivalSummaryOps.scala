// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class ArchivalSummaryBuilderOps(val self: ArchivalSummary.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def archivalDateTimeAsScala(value: Option[java.time.Instant]): ArchivalSummary.Builder = {
    value.fold(self) { v =>
      self.archivalDateTime(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def archivalReasonAsScala(value: Option[String]): ArchivalSummary.Builder = {
    value.fold(self) { v =>
      self.archivalReason(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def archivalBackupArnAsScala(value: Option[String]): ArchivalSummary.Builder = {
    value.fold(self) { v =>
      self.archivalBackupArn(v)
    }
  }

}

final class ArchivalSummaryOps(val self: ArchivalSummary) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def archivalDateTimeAsScala: Option[java.time.Instant] = Option(self.archivalDateTime)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def archivalReasonAsScala: Option[String] = Option(self.archivalReason)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def archivalBackupArnAsScala: Option[String] = Option(self.archivalBackupArn)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToArchivalSummaryOps {

  implicit def toArchivalSummaryBuilderOps(v: ArchivalSummary.Builder): ArchivalSummaryBuilderOps =
    new ArchivalSummaryBuilderOps(v)

  implicit def toArchivalSummaryOps(v: ArchivalSummary): ArchivalSummaryOps = new ArchivalSummaryOps(v)

}
