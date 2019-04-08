// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class StackEventBuilderOps(val self: StackEvent.Builder) extends AnyVal {

  final def stackIdAsScala(value: Option[String]): StackEvent.Builder = {
    value.fold(self) { v =>
      self.stackId(v)
    }
  }

  final def eventIdAsScala(value: Option[String]): StackEvent.Builder = {
    value.fold(self) { v =>
      self.eventId(v)
    }
  }

  final def stackNameAsScala(value: Option[String]): StackEvent.Builder = {
    value.fold(self) { v =>
      self.stackName(v)
    }
  }

  final def logicalResourceIdAsScala(value: Option[String]): StackEvent.Builder = {
    value.fold(self) { v =>
      self.logicalResourceId(v)
    }
  }

  final def physicalResourceIdAsScala(value: Option[String]): StackEvent.Builder = {
    value.fold(self) { v =>
      self.physicalResourceId(v)
    }
  }

  final def resourceTypeAsScala(value: Option[String]): StackEvent.Builder = {
    value.fold(self) { v =>
      self.resourceType(v)
    }
  }

  final def timestampAsScala(value: Option[java.time.Instant]): StackEvent.Builder = {
    value.fold(self) { v =>
      self.timestamp(v)
    }
  }

  final def resourceStatusAsScala(value: Option[ResourceStatus]): StackEvent.Builder = {
    value.fold(self) { v =>
      self.resourceStatus(v)
    }
  }

  final def resourceStatusReasonAsScala(value: Option[String]): StackEvent.Builder = {
    value.fold(self) { v =>
      self.resourceStatusReason(v)
    }
  }

  final def resourcePropertiesAsScala(value: Option[String]): StackEvent.Builder = {
    value.fold(self) { v =>
      self.resourceProperties(v)
    }
  }

  final def clientRequestTokenAsScala(value: Option[String]): StackEvent.Builder = {
    value.fold(self) { v =>
      self.clientRequestToken(v)
    }
  }

}

final class StackEventOps(val self: StackEvent) extends AnyVal {

  final def stackIdAsScala: Option[String] = Option(self.stackId)

  final def eventIdAsScala: Option[String] = Option(self.eventId)

  final def stackNameAsScala: Option[String] = Option(self.stackName)

  final def logicalResourceIdAsScala: Option[String] = Option(self.logicalResourceId)

  final def physicalResourceIdAsScala: Option[String] = Option(self.physicalResourceId)

  final def resourceTypeAsScala: Option[String] = Option(self.resourceType)

  final def timestampAsScala: Option[java.time.Instant] = Option(self.timestamp)

  final def resourceStatusAsScala: Option[ResourceStatus] = Option(self.resourceStatus)

  final def resourceStatusReasonAsScala: Option[String] = Option(self.resourceStatusReason)

  final def resourcePropertiesAsScala: Option[String] = Option(self.resourceProperties)

  final def clientRequestTokenAsScala: Option[String] = Option(self.clientRequestToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStackEventOps {

  implicit def toStackEventBuilderOps(v: StackEvent.Builder): StackEventBuilderOps = new StackEventBuilderOps(v)

  implicit def toStackEventOps(v: StackEvent): StackEventOps = new StackEventOps(v)

}
