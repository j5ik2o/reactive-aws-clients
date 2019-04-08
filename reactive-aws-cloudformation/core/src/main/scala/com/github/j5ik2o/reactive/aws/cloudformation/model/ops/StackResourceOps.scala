// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class StackResourceBuilderOps(val self: StackResource.Builder) extends AnyVal {

  final def stackNameAsScala(value: Option[String]): StackResource.Builder = {
    value.fold(self) { v =>
      self.stackName(v)
    }
  } // String

  final def stackIdAsScala(value: Option[String]): StackResource.Builder = {
    value.fold(self) { v =>
      self.stackId(v)
    }
  } // String

  final def logicalResourceIdAsScala(value: Option[String]): StackResource.Builder = {
    value.fold(self) { v =>
      self.logicalResourceId(v)
    }
  } // String

  final def physicalResourceIdAsScala(value: Option[String]): StackResource.Builder = {
    value.fold(self) { v =>
      self.physicalResourceId(v)
    }
  } // String

  final def resourceTypeAsScala(value: Option[String]): StackResource.Builder = {
    value.fold(self) { v =>
      self.resourceType(v)
    }
  } // String

  final def timestampAsScala(value: Option[java.time.Instant]): StackResource.Builder = {
    value.fold(self) { v =>
      self.timestamp(v)
    }
  } // java.time.Instant

  final def resourceStatusAsScala(value: Option[ResourceStatus]): StackResource.Builder = {
    value.fold(self) { v =>
      self.resourceStatus(v)
    }
  } // ResourceStatus

  final def resourceStatusReasonAsScala(value: Option[String]): StackResource.Builder = {
    value.fold(self) { v =>
      self.resourceStatusReason(v)
    }
  } // String

  final def descriptionAsScala(value: Option[String]): StackResource.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  } // String

  final def driftInformationAsScala(value: Option[StackResourceDriftInformation]): StackResource.Builder = {
    value.fold(self) { v =>
      self.driftInformation(v)
    }
  } // StackResourceDriftInformation

}

final class StackResourceOps(val self: StackResource) extends AnyVal {

  final def stackNameAsScala: Option[String] = Option(self.stackName) // String

  final def stackIdAsScala: Option[String] = Option(self.stackId) // String

  final def logicalResourceIdAsScala: Option[String] = Option(self.logicalResourceId) // String

  final def physicalResourceIdAsScala: Option[String] = Option(self.physicalResourceId) // String

  final def resourceTypeAsScala: Option[String] = Option(self.resourceType) // String

  final def timestampAsScala: Option[java.time.Instant] = Option(self.timestamp) // java.time.Instant

  final def resourceStatusAsScala: Option[ResourceStatus] = Option(self.resourceStatus) // ResourceStatus

  final def resourceStatusReasonAsScala: Option[String] = Option(self.resourceStatusReason) // String

  final def descriptionAsScala: Option[String] = Option(self.description) // String

  final def driftInformationAsScala: Option[StackResourceDriftInformation] =
    Option(self.driftInformation) // StackResourceDriftInformation

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStackResourceOps {

  implicit def toStackResourceBuilderOps(v: StackResource.Builder): StackResourceBuilderOps =
    new StackResourceBuilderOps(v)

  implicit def toStackResourceOps(v: StackResource): StackResourceOps = new StackResourceOps(v)

}
