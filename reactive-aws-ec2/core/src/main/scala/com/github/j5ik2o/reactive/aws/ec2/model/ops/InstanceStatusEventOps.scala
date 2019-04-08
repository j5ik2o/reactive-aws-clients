// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class InstanceStatusEventBuilderOps(val self: InstanceStatusEvent.Builder) extends AnyVal {

  final def instanceEventIdAsScala(value: Option[String]): InstanceStatusEvent.Builder = {
    value.fold(self) { v =>
      self.instanceEventId(v)
    }
  }

  final def codeAsScala(value: Option[EventCode]): InstanceStatusEvent.Builder = {
    value.fold(self) { v =>
      self.code(v)
    }
  }

  final def descriptionAsScala(value: Option[String]): InstanceStatusEvent.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def notAfterAsScala(value: Option[java.time.Instant]): InstanceStatusEvent.Builder = {
    value.fold(self) { v =>
      self.notAfter(v)
    }
  }

  final def notBeforeAsScala(value: Option[java.time.Instant]): InstanceStatusEvent.Builder = {
    value.fold(self) { v =>
      self.notBefore(v)
    }
  }

  final def notBeforeDeadlineAsScala(value: Option[java.time.Instant]): InstanceStatusEvent.Builder = {
    value.fold(self) { v =>
      self.notBeforeDeadline(v)
    }
  }

}

final class InstanceStatusEventOps(val self: InstanceStatusEvent) extends AnyVal {

  final def instanceEventIdAsScala: Option[String] = Option(self.instanceEventId)

  final def codeAsScala: Option[EventCode] = Option(self.code)

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def notAfterAsScala: Option[java.time.Instant] = Option(self.notAfter)

  final def notBeforeAsScala: Option[java.time.Instant] = Option(self.notBefore)

  final def notBeforeDeadlineAsScala: Option[java.time.Instant] = Option(self.notBeforeDeadline)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToInstanceStatusEventOps {

  implicit def toInstanceStatusEventBuilderOps(v: InstanceStatusEvent.Builder): InstanceStatusEventBuilderOps =
    new InstanceStatusEventBuilderOps(v)

  implicit def toInstanceStatusEventOps(v: InstanceStatusEvent): InstanceStatusEventOps = new InstanceStatusEventOps(v)

}
