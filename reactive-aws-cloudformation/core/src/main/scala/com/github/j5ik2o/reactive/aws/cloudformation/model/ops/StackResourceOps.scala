// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class StackResourceBuilderOps(val self: StackResource.Builder) extends AnyVal {

  final def stackNameAsScala(value: Option[String]): StackResource.Builder = {
    value.fold(self) { v =>
      self.stackName(v)
    }
  }

  final def stackIdAsScala(value: Option[String]): StackResource.Builder = {
    value.fold(self) { v =>
      self.stackId(v)
    }
  }

  final def logicalResourceIdAsScala(value: Option[String]): StackResource.Builder = {
    value.fold(self) { v =>
      self.logicalResourceId(v)
    }
  }

  final def physicalResourceIdAsScala(value: Option[String]): StackResource.Builder = {
    value.fold(self) { v =>
      self.physicalResourceId(v)
    }
  }

  final def resourceTypeAsScala(value: Option[String]): StackResource.Builder = {
    value.fold(self) { v =>
      self.resourceType(v)
    }
  }

  final def timestampAsScala(value: Option[java.time.Instant]): StackResource.Builder = {
    value.fold(self) { v =>
      self.timestamp(v)
    }
  }

  final def resourceStatusAsScala(value: Option[ResourceStatus]): StackResource.Builder = {
    value.fold(self) { v =>
      self.resourceStatus(v)
    }
  }

  final def resourceStatusReasonAsScala(value: Option[String]): StackResource.Builder = {
    value.fold(self) { v =>
      self.resourceStatusReason(v)
    }
  }

  final def descriptionAsScala(value: Option[String]): StackResource.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def driftInformationAsScala(value: Option[StackResourceDriftInformation]): StackResource.Builder = {
    value.fold(self) { v =>
      self.driftInformation(v)
    }
  }

}

final class StackResourceOps(val self: StackResource) extends AnyVal {

  final def stackNameAsScala: Option[String] = Option(self.stackName)

  final def stackIdAsScala: Option[String] = Option(self.stackId)

  final def logicalResourceIdAsScala: Option[String] = Option(self.logicalResourceId)

  final def physicalResourceIdAsScala: Option[String] = Option(self.physicalResourceId)

  final def resourceTypeAsScala: Option[String] = Option(self.resourceType)

  final def timestampAsScala: Option[java.time.Instant] = Option(self.timestamp)

  final def resourceStatusAsScala: Option[ResourceStatus] = Option(self.resourceStatus)

  final def resourceStatusReasonAsScala: Option[String] = Option(self.resourceStatusReason)

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def driftInformationAsScala: Option[StackResourceDriftInformation] = Option(self.driftInformation)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStackResourceOps {

  implicit def toStackResourceBuilderOps(v: StackResource.Builder): StackResourceBuilderOps =
    new StackResourceBuilderOps(v)

  implicit def toStackResourceOps(v: StackResource): StackResourceOps = new StackResourceOps(v)

}
