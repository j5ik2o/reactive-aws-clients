// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class HostBuilderOps(val self: Host.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def autoPlacementAsScala(value: Option[AutoPlacement]): Host.Builder = {
    value.fold(self) { v =>
      self.autoPlacement(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def availabilityZoneAsScala(value: Option[String]): Host.Builder = {
    value.fold(self) { v =>
      self.availabilityZone(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def availableCapacityAsScala(value: Option[AvailableCapacity]): Host.Builder = {
    value.fold(self) { v =>
      self.availableCapacity(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientTokenAsScala(value: Option[String]): Host.Builder = {
    value.fold(self) { v =>
      self.clientToken(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def hostIdAsScala(value: Option[String]): Host.Builder = {
    value.fold(self) { v =>
      self.hostId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def hostPropertiesAsScala(value: Option[HostProperties]): Host.Builder = {
    value.fold(self) { v =>
      self.hostProperties(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def hostReservationIdAsScala(value: Option[String]): Host.Builder = {
    value.fold(self) { v =>
      self.hostReservationId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instancesAsScala(value: Option[Seq[HostInstance]]): Host.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.instances(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala(value: Option[AllocationState]): Host.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def allocationTimeAsScala(value: Option[java.time.Instant]): Host.Builder = {
    value.fold(self) { v =>
      self.allocationTime(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def releaseTimeAsScala(value: Option[java.time.Instant]): Host.Builder = {
    value.fold(self) { v =>
      self.releaseTime(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Seq[Tag]]): Host.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def hostRecoveryAsScala(value: Option[HostRecovery]): Host.Builder = {
    value.fold(self) { v =>
      self.hostRecovery(v)
    }
  }

}

final class HostOps(val self: Host) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def autoPlacementAsScala: Option[AutoPlacement] = Option(self.autoPlacement)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def availabilityZoneAsScala: Option[String] = Option(self.availabilityZone)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def availableCapacityAsScala: Option[AvailableCapacity] = Option(self.availableCapacity)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientTokenAsScala: Option[String] = Option(self.clientToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def hostIdAsScala: Option[String] = Option(self.hostId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def hostPropertiesAsScala: Option[HostProperties] = Option(self.hostProperties)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def hostReservationIdAsScala: Option[String] = Option(self.hostReservationId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instancesAsScala: Option[Seq[HostInstance]] = Option(self.instances).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala: Option[AllocationState] = Option(self.state)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def allocationTimeAsScala: Option[java.time.Instant] = Option(self.allocationTime)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def releaseTimeAsScala: Option[java.time.Instant] = Option(self.releaseTime)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def hostRecoveryAsScala: Option[HostRecovery] = Option(self.hostRecovery)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToHostOps {

  implicit def toHostBuilderOps(v: Host.Builder): HostBuilderOps = new HostBuilderOps(v)

  implicit def toHostOps(v: Host): HostOps = new HostOps(v)

}
