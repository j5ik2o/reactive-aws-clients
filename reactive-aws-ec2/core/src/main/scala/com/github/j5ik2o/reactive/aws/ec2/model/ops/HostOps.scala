// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class HostBuilderOps(val self: Host.Builder) extends AnyVal {

  final def autoPlacementAsScala(value: Option[AutoPlacement]): Host.Builder = {
    value.fold(self) { v =>
      self.autoPlacement(v)
    }
  }

  final def availabilityZoneAsScala(value: Option[String]): Host.Builder = {
    value.fold(self) { v =>
      self.availabilityZone(v)
    }
  }

  final def availableCapacityAsScala(value: Option[AvailableCapacity]): Host.Builder = {
    value.fold(self) { v =>
      self.availableCapacity(v)
    }
  }

  final def clientTokenAsScala(value: Option[String]): Host.Builder = {
    value.fold(self) { v =>
      self.clientToken(v)
    }
  }

  final def hostIdAsScala(value: Option[String]): Host.Builder = {
    value.fold(self) { v =>
      self.hostId(v)
    }
  }

  final def hostPropertiesAsScala(value: Option[HostProperties]): Host.Builder = {
    value.fold(self) { v =>
      self.hostProperties(v)
    }
  }

  final def hostReservationIdAsScala(value: Option[String]): Host.Builder = {
    value.fold(self) { v =>
      self.hostReservationId(v)
    }
  }

  final def instancesAsScala(value: Option[Seq[HostInstance]]): Host.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.instances(v.asJava)
    }
  }

  final def stateAsScala(value: Option[AllocationState]): Host.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

  final def allocationTimeAsScala(value: Option[java.time.Instant]): Host.Builder = {
    value.fold(self) { v =>
      self.allocationTime(v)
    }
  }

  final def releaseTimeAsScala(value: Option[java.time.Instant]): Host.Builder = {
    value.fold(self) { v =>
      self.releaseTime(v)
    }
  }

  final def tagsAsScala(value: Option[Seq[Tag]]): Host.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    }
  }

}

final class HostOps(val self: Host) extends AnyVal {

  final def autoPlacementAsScala: Option[AutoPlacement] = Option(self.autoPlacement)

  final def availabilityZoneAsScala: Option[String] = Option(self.availabilityZone)

  final def availableCapacityAsScala: Option[AvailableCapacity] = Option(self.availableCapacity)

  final def clientTokenAsScala: Option[String] = Option(self.clientToken)

  final def hostIdAsScala: Option[String] = Option(self.hostId)

  final def hostPropertiesAsScala: Option[HostProperties] = Option(self.hostProperties)

  final def hostReservationIdAsScala: Option[String] = Option(self.hostReservationId)

  final def instancesAsScala: Option[Seq[HostInstance]] = Option(self.instances).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def stateAsScala: Option[AllocationState] = Option(self.state)

  final def allocationTimeAsScala: Option[java.time.Instant] = Option(self.allocationTime)

  final def releaseTimeAsScala: Option[java.time.Instant] = Option(self.releaseTime)

  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToHostOps {

  implicit def toHostBuilderOps(v: Host.Builder): HostBuilderOps = new HostBuilderOps(v)

  implicit def toHostOps(v: Host): HostOps = new HostOps(v)

}
