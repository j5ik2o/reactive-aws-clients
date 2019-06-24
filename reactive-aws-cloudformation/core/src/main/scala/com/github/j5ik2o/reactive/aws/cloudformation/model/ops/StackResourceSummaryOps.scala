// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class StackResourceSummaryBuilderOps(val self: StackResourceSummary.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logicalResourceIdAsScala(value: Option[String]): StackResourceSummary.Builder = {
    value.fold(self) { v =>
      self.logicalResourceId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def physicalResourceIdAsScala(value: Option[String]): StackResourceSummary.Builder = {
    value.fold(self) { v =>
      self.physicalResourceId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceTypeAsScala(value: Option[String]): StackResourceSummary.Builder = {
    value.fold(self) { v =>
      self.resourceType(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastUpdatedTimestampAsScala(value: Option[java.time.Instant]): StackResourceSummary.Builder = {
    value.fold(self) { v =>
      self.lastUpdatedTimestamp(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceStatusAsScala(value: Option[ResourceStatus]): StackResourceSummary.Builder = {
    value.fold(self) { v =>
      self.resourceStatus(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceStatusReasonAsScala(value: Option[String]): StackResourceSummary.Builder = {
    value.fold(self) { v =>
      self.resourceStatusReason(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def driftInformationAsScala(
      value: Option[StackResourceDriftInformationSummary]
  ): StackResourceSummary.Builder = {
    value.fold(self) { v =>
      self.driftInformation(v)
    }
  }

}

final class StackResourceSummaryOps(val self: StackResourceSummary) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logicalResourceIdAsScala: Option[String] = Option(self.logicalResourceId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def physicalResourceIdAsScala: Option[String] = Option(self.physicalResourceId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceTypeAsScala: Option[String] = Option(self.resourceType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastUpdatedTimestampAsScala: Option[java.time.Instant] = Option(self.lastUpdatedTimestamp)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceStatusAsScala: Option[ResourceStatus] = Option(self.resourceStatus)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceStatusReasonAsScala: Option[String] = Option(self.resourceStatusReason)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def driftInformationAsScala: Option[StackResourceDriftInformationSummary] = Option(self.driftInformation)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStackResourceSummaryOps {

  implicit def toStackResourceSummaryBuilderOps(v: StackResourceSummary.Builder): StackResourceSummaryBuilderOps =
    new StackResourceSummaryBuilderOps(v)

  implicit def toStackResourceSummaryOps(v: StackResourceSummary): StackResourceSummaryOps =
    new StackResourceSummaryOps(v)

}
