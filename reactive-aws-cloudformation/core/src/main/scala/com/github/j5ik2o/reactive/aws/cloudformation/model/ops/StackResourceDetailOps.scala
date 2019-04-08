// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class StackResourceDetailBuilderOps(val self: StackResourceDetail.Builder) extends AnyVal {

  final def stackNameAsScala(value: Option[String]): StackResourceDetail.Builder = {
    value.fold(self) { v =>
      self.stackName(v)
    }
  }

  final def stackIdAsScala(value: Option[String]): StackResourceDetail.Builder = {
    value.fold(self) { v =>
      self.stackId(v)
    }
  }

  final def logicalResourceIdAsScala(value: Option[String]): StackResourceDetail.Builder = {
    value.fold(self) { v =>
      self.logicalResourceId(v)
    }
  }

  final def physicalResourceIdAsScala(value: Option[String]): StackResourceDetail.Builder = {
    value.fold(self) { v =>
      self.physicalResourceId(v)
    }
  }

  final def resourceTypeAsScala(value: Option[String]): StackResourceDetail.Builder = {
    value.fold(self) { v =>
      self.resourceType(v)
    }
  }

  final def lastUpdatedTimestampAsScala(value: Option[java.time.Instant]): StackResourceDetail.Builder = {
    value.fold(self) { v =>
      self.lastUpdatedTimestamp(v)
    }
  }

  final def resourceStatusAsScala(value: Option[ResourceStatus]): StackResourceDetail.Builder = {
    value.fold(self) { v =>
      self.resourceStatus(v)
    }
  }

  final def resourceStatusReasonAsScala(value: Option[String]): StackResourceDetail.Builder = {
    value.fold(self) { v =>
      self.resourceStatusReason(v)
    }
  }

  final def descriptionAsScala(value: Option[String]): StackResourceDetail.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def metadataAsScala(value: Option[String]): StackResourceDetail.Builder = {
    value.fold(self) { v =>
      self.metadata(v)
    }
  }

  final def driftInformationAsScala(value: Option[StackResourceDriftInformation]): StackResourceDetail.Builder = {
    value.fold(self) { v =>
      self.driftInformation(v)
    }
  }

}

final class StackResourceDetailOps(val self: StackResourceDetail) extends AnyVal {

  final def stackNameAsScala: Option[String] = Option(self.stackName)

  final def stackIdAsScala: Option[String] = Option(self.stackId)

  final def logicalResourceIdAsScala: Option[String] = Option(self.logicalResourceId)

  final def physicalResourceIdAsScala: Option[String] = Option(self.physicalResourceId)

  final def resourceTypeAsScala: Option[String] = Option(self.resourceType)

  final def lastUpdatedTimestampAsScala: Option[java.time.Instant] = Option(self.lastUpdatedTimestamp)

  final def resourceStatusAsScala: Option[ResourceStatus] = Option(self.resourceStatus)

  final def resourceStatusReasonAsScala: Option[String] = Option(self.resourceStatusReason)

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def metadataAsScala: Option[String] = Option(self.metadata)

  final def driftInformationAsScala: Option[StackResourceDriftInformation] = Option(self.driftInformation)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStackResourceDetailOps {

  implicit def toStackResourceDetailBuilderOps(v: StackResourceDetail.Builder): StackResourceDetailBuilderOps =
    new StackResourceDetailBuilderOps(v)

  implicit def toStackResourceDetailOps(v: StackResourceDetail): StackResourceDetailOps = new StackResourceDetailOps(v)

}
