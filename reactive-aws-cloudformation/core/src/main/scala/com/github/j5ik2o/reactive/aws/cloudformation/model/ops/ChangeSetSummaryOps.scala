// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class ChangeSetSummaryBuilderOps(val self: ChangeSetSummary.Builder) extends AnyVal {

  final def stackIdAsScala(value: Option[String]): ChangeSetSummary.Builder = {
    value.fold(self) { v =>
      self.stackId(v)
    }
  }

  final def stackNameAsScala(value: Option[String]): ChangeSetSummary.Builder = {
    value.fold(self) { v =>
      self.stackName(v)
    }
  }

  final def changeSetIdAsScala(value: Option[String]): ChangeSetSummary.Builder = {
    value.fold(self) { v =>
      self.changeSetId(v)
    }
  }

  final def changeSetNameAsScala(value: Option[String]): ChangeSetSummary.Builder = {
    value.fold(self) { v =>
      self.changeSetName(v)
    }
  }

  final def executionStatusAsScala(value: Option[ExecutionStatus]): ChangeSetSummary.Builder = {
    value.fold(self) { v =>
      self.executionStatus(v)
    }
  }

  final def statusAsScala(value: Option[ChangeSetStatus]): ChangeSetSummary.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  final def statusReasonAsScala(value: Option[String]): ChangeSetSummary.Builder = {
    value.fold(self) { v =>
      self.statusReason(v)
    }
  }

  final def creationTimeAsScala(value: Option[java.time.Instant]): ChangeSetSummary.Builder = {
    value.fold(self) { v =>
      self.creationTime(v)
    }
  }

  final def descriptionAsScala(value: Option[String]): ChangeSetSummary.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

}

final class ChangeSetSummaryOps(val self: ChangeSetSummary) extends AnyVal {

  final def stackIdAsScala: Option[String] = Option(self.stackId)

  final def stackNameAsScala: Option[String] = Option(self.stackName)

  final def changeSetIdAsScala: Option[String] = Option(self.changeSetId)

  final def changeSetNameAsScala: Option[String] = Option(self.changeSetName)

  final def executionStatusAsScala: Option[ExecutionStatus] = Option(self.executionStatus)

  final def statusAsScala: Option[ChangeSetStatus] = Option(self.status)

  final def statusReasonAsScala: Option[String] = Option(self.statusReason)

  final def creationTimeAsScala: Option[java.time.Instant] = Option(self.creationTime)

  final def descriptionAsScala: Option[String] = Option(self.description)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToChangeSetSummaryOps {

  implicit def toChangeSetSummaryBuilderOps(v: ChangeSetSummary.Builder): ChangeSetSummaryBuilderOps =
    new ChangeSetSummaryBuilderOps(v)

  implicit def toChangeSetSummaryOps(v: ChangeSetSummary): ChangeSetSummaryOps = new ChangeSetSummaryOps(v)

}
