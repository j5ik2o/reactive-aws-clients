// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class StackSummaryBuilderOps(val self: StackSummary.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackIdAsScala(value: Option[String]): StackSummary.Builder = {
    value.fold(self) { v =>
      self.stackId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackNameAsScala(value: Option[String]): StackSummary.Builder = {
    value.fold(self) { v =>
      self.stackName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def templateDescriptionAsScala(value: Option[String]): StackSummary.Builder = {
    value.fold(self) { v =>
      self.templateDescription(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def creationTimeAsScala(value: Option[java.time.Instant]): StackSummary.Builder = {
    value.fold(self) { v =>
      self.creationTime(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastUpdatedTimeAsScala(value: Option[java.time.Instant]): StackSummary.Builder = {
    value.fold(self) { v =>
      self.lastUpdatedTime(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deletionTimeAsScala(value: Option[java.time.Instant]): StackSummary.Builder = {
    value.fold(self) { v =>
      self.deletionTime(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackStatusAsScala(value: Option[StackStatus]): StackSummary.Builder = {
    value.fold(self) { v =>
      self.stackStatus(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackStatusReasonAsScala(value: Option[String]): StackSummary.Builder = {
    value.fold(self) { v =>
      self.stackStatusReason(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def parentIdAsScala(value: Option[String]): StackSummary.Builder = {
    value.fold(self) { v =>
      self.parentId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def rootIdAsScala(value: Option[String]): StackSummary.Builder = {
    value.fold(self) { v =>
      self.rootId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def driftInformationAsScala(value: Option[StackDriftInformationSummary]): StackSummary.Builder = {
    value.fold(self) { v =>
      self.driftInformation(v)
    }
  }

}

final class StackSummaryOps(val self: StackSummary) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackIdAsScala: Option[String] = Option(self.stackId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackNameAsScala: Option[String] = Option(self.stackName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def templateDescriptionAsScala: Option[String] = Option(self.templateDescription)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def creationTimeAsScala: Option[java.time.Instant] = Option(self.creationTime)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastUpdatedTimeAsScala: Option[java.time.Instant] = Option(self.lastUpdatedTime)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deletionTimeAsScala: Option[java.time.Instant] = Option(self.deletionTime)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackStatusAsScala: Option[StackStatus] = Option(self.stackStatus)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackStatusReasonAsScala: Option[String] = Option(self.stackStatusReason)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def parentIdAsScala: Option[String] = Option(self.parentId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def rootIdAsScala: Option[String] = Option(self.rootId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def driftInformationAsScala: Option[StackDriftInformationSummary] = Option(self.driftInformation)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStackSummaryOps {

  implicit def toStackSummaryBuilderOps(v: StackSummary.Builder): StackSummaryBuilderOps = new StackSummaryBuilderOps(v)

  implicit def toStackSummaryOps(v: StackSummary): StackSummaryOps = new StackSummaryOps(v)

}
