// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class StackSummaryBuilderOps(val self: StackSummary.Builder) extends AnyVal {

  final def stackIdAsScala(value: Option[String]): StackSummary.Builder = {
    value.fold(self) { v =>
      self.stackId(v)
    }
  } // String

  final def stackNameAsScala(value: Option[String]): StackSummary.Builder = {
    value.fold(self) { v =>
      self.stackName(v)
    }
  } // String

  final def templateDescriptionAsScala(value: Option[String]): StackSummary.Builder = {
    value.fold(self) { v =>
      self.templateDescription(v)
    }
  } // String

  final def creationTimeAsScala(value: Option[java.time.Instant]): StackSummary.Builder = {
    value.fold(self) { v =>
      self.creationTime(v)
    }
  } // Instant

  final def lastUpdatedTimeAsScala(value: Option[java.time.Instant]): StackSummary.Builder = {
    value.fold(self) { v =>
      self.lastUpdatedTime(v)
    }
  } // Instant

  final def deletionTimeAsScala(value: Option[java.time.Instant]): StackSummary.Builder = {
    value.fold(self) { v =>
      self.deletionTime(v)
    }
  } // Instant

  final def stackStatusAsScala(value: Option[StackStatus]): StackSummary.Builder = {
    value.fold(self) { v =>
      self.stackStatus(v)
    }
  } // String

  final def stackStatusReasonAsScala(value: Option[String]): StackSummary.Builder = {
    value.fold(self) { v =>
      self.stackStatusReason(v)
    }
  } // String

  final def parentIdAsScala(value: Option[String]): StackSummary.Builder = {
    value.fold(self) { v =>
      self.parentId(v)
    }
  } // String

  final def rootIdAsScala(value: Option[String]): StackSummary.Builder = {
    value.fold(self) { v =>
      self.rootId(v)
    }
  } // String

  final def driftInformationAsScala(value: Option[StackDriftInformationSummary]): StackSummary.Builder = {
    value.fold(self) { v =>
      self.driftInformation(v)
    }
  } // StackDriftInformationSummary

}

final class StackSummaryOps(val self: StackSummary) extends AnyVal {

  final def stackIdAsScala: Option[String] = Option(self.stackId) // String

  final def stackNameAsScala: Option[String] = Option(self.stackName) // String

  final def templateDescriptionAsScala: Option[String] = Option(self.templateDescription) // String

  final def creationTimeAsScala: Option[java.time.Instant] = Option(self.creationTime) // Instant

  final def lastUpdatedTimeAsScala: Option[java.time.Instant] = Option(self.lastUpdatedTime) // Instant

  final def deletionTimeAsScala: Option[java.time.Instant] = Option(self.deletionTime) // Instant

  final def stackStatusAsScala: Option[StackStatus] = Option(self.stackStatus) // String

  final def stackStatusReasonAsScala: Option[String] = Option(self.stackStatusReason) // String

  final def parentIdAsScala: Option[String] = Option(self.parentId) // String

  final def rootIdAsScala: Option[String] = Option(self.rootId) // String

  final def driftInformationAsScala: Option[StackDriftInformationSummary] =
    Option(self.driftInformation) // StackDriftInformationSummary

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStackSummaryOps {

  implicit def toStackSummaryBuilderOps(v: StackSummary.Builder): StackSummaryBuilderOps = new StackSummaryBuilderOps(v)

  implicit def toStackSummaryOps(v: StackSummary): StackSummaryOps = new StackSummaryOps(v)

}
