// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class StackEventBuilderOps(val self: StackEvent.Builder) extends AnyVal {

  final def stackIdAsScala(value: Option[String]): StackEvent.Builder = {
    value.fold(self) { v =>
      self.stackId(v)
    }
  } // String

  final def eventIdAsScala(value: Option[String]): StackEvent.Builder = {
    value.fold(self) { v =>
      self.eventId(v)
    }
  } // String

  final def stackNameAsScala(value: Option[String]): StackEvent.Builder = {
    value.fold(self) { v =>
      self.stackName(v)
    }
  } // String

  final def logicalResourceIdAsScala(value: Option[String]): StackEvent.Builder = {
    value.fold(self) { v =>
      self.logicalResourceId(v)
    }
  } // String

  final def physicalResourceIdAsScala(value: Option[String]): StackEvent.Builder = {
    value.fold(self) { v =>
      self.physicalResourceId(v)
    }
  } // String

  final def resourceTypeAsScala(value: Option[String]): StackEvent.Builder = {
    value.fold(self) { v =>
      self.resourceType(v)
    }
  } // String

  final def timestampAsScala(value: Option[java.time.Instant]): StackEvent.Builder = {
    value.fold(self) { v =>
      self.timestamp(v)
    }
  } // Instant

  final def resourceStatusAsScala(value: Option[ResourceStatus]): StackEvent.Builder = {
    value.fold(self) { v =>
      self.resourceStatus(v)
    }
  } // String

  final def resourceStatusReasonAsScala(value: Option[String]): StackEvent.Builder = {
    value.fold(self) { v =>
      self.resourceStatusReason(v)
    }
  } // String

  final def resourcePropertiesAsScala(value: Option[String]): StackEvent.Builder = {
    value.fold(self) { v =>
      self.resourceProperties(v)
    }
  } // String

  final def clientRequestTokenAsScala(value: Option[String]): StackEvent.Builder = {
    value.fold(self) { v =>
      self.clientRequestToken(v)
    }
  } // String

}

final class StackEventOps(val self: StackEvent) extends AnyVal {

  final def stackIdAsScala: Option[String] = Option(self.stackId) // String

  final def eventIdAsScala: Option[String] = Option(self.eventId) // String

  final def stackNameAsScala: Option[String] = Option(self.stackName) // String

  final def logicalResourceIdAsScala: Option[String] = Option(self.logicalResourceId) // String

  final def physicalResourceIdAsScala: Option[String] = Option(self.physicalResourceId) // String

  final def resourceTypeAsScala: Option[String] = Option(self.resourceType) // String

  final def timestampAsScala: Option[java.time.Instant] = Option(self.timestamp) // Instant

  final def resourceStatusAsScala: Option[ResourceStatus] = Option(self.resourceStatus) // String

  final def resourceStatusReasonAsScala: Option[String] = Option(self.resourceStatusReason) // String

  final def resourcePropertiesAsScala: Option[String] = Option(self.resourceProperties) // String

  final def clientRequestTokenAsScala: Option[String] = Option(self.clientRequestToken) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStackEventOps {

  implicit def toStackEventBuilderOps(v: StackEvent.Builder): StackEventBuilderOps = new StackEventBuilderOps(v)

  implicit def toStackEventOps(v: StackEvent): StackEventOps = new StackEventOps(v)

}
