// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class ChangeSetSummaryBuilderOps(val self: ChangeSetSummary.Builder) extends AnyVal {

  final def stackIdAsScala(value: Option[String]): ChangeSetSummary.Builder = {
    value.fold(self) { v =>
      self.stackId(v)
    }
  } // String

  final def stackNameAsScala(value: Option[String]): ChangeSetSummary.Builder = {
    value.fold(self) { v =>
      self.stackName(v)
    }
  } // String

  final def changeSetIdAsScala(value: Option[String]): ChangeSetSummary.Builder = {
    value.fold(self) { v =>
      self.changeSetId(v)
    }
  } // String

  final def changeSetNameAsScala(value: Option[String]): ChangeSetSummary.Builder = {
    value.fold(self) { v =>
      self.changeSetName(v)
    }
  } // String

  final def executionStatusAsScala(value: Option[ExecutionStatus]): ChangeSetSummary.Builder = {
    value.fold(self) { v =>
      self.executionStatus(v)
    }
  } // ExecutionStatus

  final def statusAsScala(value: Option[ChangeSetStatus]): ChangeSetSummary.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  } // ChangeSetStatus

  final def statusReasonAsScala(value: Option[String]): ChangeSetSummary.Builder = {
    value.fold(self) { v =>
      self.statusReason(v)
    }
  } // String

  final def creationTimeAsScala(value: Option[java.time.Instant]): ChangeSetSummary.Builder = {
    value.fold(self) { v =>
      self.creationTime(v)
    }
  } // java.time.Instant

  final def descriptionAsScala(value: Option[String]): ChangeSetSummary.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  } // String

}

final class ChangeSetSummaryOps(val self: ChangeSetSummary) extends AnyVal {

  final def stackIdAsScala: Option[String] = Option(self.stackId) // String

  final def stackNameAsScala: Option[String] = Option(self.stackName) // String

  final def changeSetIdAsScala: Option[String] = Option(self.changeSetId) // String

  final def changeSetNameAsScala: Option[String] = Option(self.changeSetName) // String

  final def executionStatusAsScala: Option[ExecutionStatus] = Option(self.executionStatus) // ExecutionStatus

  final def statusAsScala: Option[ChangeSetStatus] = Option(self.status) // ChangeSetStatus

  final def statusReasonAsScala: Option[String] = Option(self.statusReason) // String

  final def creationTimeAsScala: Option[java.time.Instant] = Option(self.creationTime) // java.time.Instant

  final def descriptionAsScala: Option[String] = Option(self.description) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToChangeSetSummaryOps {

  implicit def toChangeSetSummaryBuilderOps(v: ChangeSetSummary.Builder): ChangeSetSummaryBuilderOps =
    new ChangeSetSummaryBuilderOps(v)

  implicit def toChangeSetSummaryOps(v: ChangeSetSummary): ChangeSetSummaryOps = new ChangeSetSummaryOps(v)

}
