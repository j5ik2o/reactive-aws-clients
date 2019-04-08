// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class StackResourceDetailBuilderOps(val self: StackResourceDetail.Builder) extends AnyVal {

  final def stackNameAsScala(value: Option[String]): StackResourceDetail.Builder = {
    value.fold(self) { v =>
      self.stackName(v)
    }
  } // String

  final def stackIdAsScala(value: Option[String]): StackResourceDetail.Builder = {
    value.fold(self) { v =>
      self.stackId(v)
    }
  } // String

  final def logicalResourceIdAsScala(value: Option[String]): StackResourceDetail.Builder = {
    value.fold(self) { v =>
      self.logicalResourceId(v)
    }
  } // String

  final def physicalResourceIdAsScala(value: Option[String]): StackResourceDetail.Builder = {
    value.fold(self) { v =>
      self.physicalResourceId(v)
    }
  } // String

  final def resourceTypeAsScala(value: Option[String]): StackResourceDetail.Builder = {
    value.fold(self) { v =>
      self.resourceType(v)
    }
  } // String

  final def lastUpdatedTimestampAsScala(value: Option[java.time.Instant]): StackResourceDetail.Builder = {
    value.fold(self) { v =>
      self.lastUpdatedTimestamp(v)
    }
  } // Instant

  final def resourceStatusAsScala(value: Option[ResourceStatus]): StackResourceDetail.Builder = {
    value.fold(self) { v =>
      self.resourceStatus(v)
    }
  } // String

  final def resourceStatusReasonAsScala(value: Option[String]): StackResourceDetail.Builder = {
    value.fold(self) { v =>
      self.resourceStatusReason(v)
    }
  } // String

  final def descriptionAsScala(value: Option[String]): StackResourceDetail.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  } // String

  final def metadataAsScala(value: Option[String]): StackResourceDetail.Builder = {
    value.fold(self) { v =>
      self.metadata(v)
    }
  } // String

  final def driftInformationAsScala(value: Option[StackResourceDriftInformation]): StackResourceDetail.Builder = {
    value.fold(self) { v =>
      self.driftInformation(v)
    }
  } // StackResourceDriftInformation

}

final class StackResourceDetailOps(val self: StackResourceDetail) extends AnyVal {

  final def stackNameAsScala: Option[String] = Option(self.stackName) // String

  final def stackIdAsScala: Option[String] = Option(self.stackId) // String

  final def logicalResourceIdAsScala: Option[String] = Option(self.logicalResourceId) // String

  final def physicalResourceIdAsScala: Option[String] = Option(self.physicalResourceId) // String

  final def resourceTypeAsScala: Option[String] = Option(self.resourceType) // String

  final def lastUpdatedTimestampAsScala: Option[java.time.Instant] = Option(self.lastUpdatedTimestamp) // Instant

  final def resourceStatusAsScala: Option[ResourceStatus] = Option(self.resourceStatus) // String

  final def resourceStatusReasonAsScala: Option[String] = Option(self.resourceStatusReason) // String

  final def descriptionAsScala: Option[String] = Option(self.description) // String

  final def metadataAsScala: Option[String] = Option(self.metadata) // String

  final def driftInformationAsScala: Option[StackResourceDriftInformation] =
    Option(self.driftInformation) // StackResourceDriftInformation

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStackResourceDetailOps {

  implicit def toStackResourceDetailBuilderOps(v: StackResourceDetail.Builder): StackResourceDetailBuilderOps =
    new StackResourceDetailBuilderOps(v)

  implicit def toStackResourceDetailOps(v: StackResourceDetail): StackResourceDetailOps = new StackResourceDetailOps(v)

}
