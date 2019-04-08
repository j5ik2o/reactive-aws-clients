// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class InstanceStatusDetailsBuilderOps(val self: InstanceStatusDetails.Builder) extends AnyVal {

  final def impairedSinceAsScala(value: Option[java.time.Instant]): InstanceStatusDetails.Builder = {
    value.fold(self) { v =>
      self.impairedSince(v)
    }
  }

  final def nameAsScala(value: Option[StatusName]): InstanceStatusDetails.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

  final def statusAsScala(value: Option[StatusType]): InstanceStatusDetails.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

}

final class InstanceStatusDetailsOps(val self: InstanceStatusDetails) extends AnyVal {

  final def impairedSinceAsScala: Option[java.time.Instant] = Option(self.impairedSince)

  final def nameAsScala: Option[StatusName] = Option(self.name)

  final def statusAsScala: Option[StatusType] = Option(self.status)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToInstanceStatusDetailsOps {

  implicit def toInstanceStatusDetailsBuilderOps(v: InstanceStatusDetails.Builder): InstanceStatusDetailsBuilderOps =
    new InstanceStatusDetailsBuilderOps(v)

  implicit def toInstanceStatusDetailsOps(v: InstanceStatusDetails): InstanceStatusDetailsOps =
    new InstanceStatusDetailsOps(v)

}
