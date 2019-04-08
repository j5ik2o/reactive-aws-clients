// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class InstanceStatusBuilderOps(val self: InstanceStatus.Builder) extends AnyVal {

  final def availabilityZoneAsScala(value: Option[String]): InstanceStatus.Builder = {
    value.fold(self) { v =>
      self.availabilityZone(v)
    }
  }

  final def eventsAsScala(value: Option[Seq[InstanceStatusEvent]]): InstanceStatus.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.events(v.asJava)
    }
  }

  final def instanceIdAsScala(value: Option[String]): InstanceStatus.Builder = {
    value.fold(self) { v =>
      self.instanceId(v)
    }
  }

  final def instanceStateAsScala(value: Option[InstanceState]): InstanceStatus.Builder = {
    value.fold(self) { v =>
      self.instanceState(v)
    }
  }

  final def instanceStatusAsScala(value: Option[InstanceStatusSummary]): InstanceStatus.Builder = {
    value.fold(self) { v =>
      self.instanceStatus(v)
    }
  }

  final def systemStatusAsScala(value: Option[InstanceStatusSummary]): InstanceStatus.Builder = {
    value.fold(self) { v =>
      self.systemStatus(v)
    }
  }

}

final class InstanceStatusOps(val self: InstanceStatus) extends AnyVal {

  final def availabilityZoneAsScala: Option[String] = Option(self.availabilityZone)

  final def eventsAsScala: Option[Seq[InstanceStatusEvent]] = Option(self.events).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def instanceIdAsScala: Option[String] = Option(self.instanceId)

  final def instanceStateAsScala: Option[InstanceState] = Option(self.instanceState)

  final def instanceStatusAsScala: Option[InstanceStatusSummary] = Option(self.instanceStatus)

  final def systemStatusAsScala: Option[InstanceStatusSummary] = Option(self.systemStatus)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToInstanceStatusOps {

  implicit def toInstanceStatusBuilderOps(v: InstanceStatus.Builder): InstanceStatusBuilderOps =
    new InstanceStatusBuilderOps(v)

  implicit def toInstanceStatusOps(v: InstanceStatus): InstanceStatusOps = new InstanceStatusOps(v)

}
