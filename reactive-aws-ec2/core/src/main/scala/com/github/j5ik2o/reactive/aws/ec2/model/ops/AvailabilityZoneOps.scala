// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class AvailabilityZoneBuilderOps(val self: AvailabilityZone.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala(value: Option[AvailabilityZoneState]): AvailabilityZone.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def optInStatusAsScala(value: Option[AvailabilityZoneOptInStatus]): AvailabilityZone.Builder = {
    value.fold(self) { v =>
      self.optInStatus(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messagesAsScala(value: Option[Seq[AvailabilityZoneMessage]]): AvailabilityZone.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.messages(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def regionNameAsScala(value: Option[String]): AvailabilityZone.Builder = {
    value.fold(self) { v =>
      self.regionName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def zoneNameAsScala(value: Option[String]): AvailabilityZone.Builder = {
    value.fold(self) { v =>
      self.zoneName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def zoneIdAsScala(value: Option[String]): AvailabilityZone.Builder = {
    value.fold(self) { v =>
      self.zoneId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupNameAsScala(value: Option[String]): AvailabilityZone.Builder = {
    value.fold(self) { v =>
      self.groupName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkBorderGroupAsScala(value: Option[String]): AvailabilityZone.Builder = {
    value.fold(self) { v =>
      self.networkBorderGroup(v)
    }
  }

}

final class AvailabilityZoneOps(val self: AvailabilityZone) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala: Option[AvailabilityZoneState] = Option(self.state)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def optInStatusAsScala: Option[AvailabilityZoneOptInStatus] = Option(self.optInStatus)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messagesAsScala: Option[Seq[AvailabilityZoneMessage]] = Option(self.messages).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def regionNameAsScala: Option[String] = Option(self.regionName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def zoneNameAsScala: Option[String] = Option(self.zoneName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def zoneIdAsScala: Option[String] = Option(self.zoneId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupNameAsScala: Option[String] = Option(self.groupName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkBorderGroupAsScala: Option[String] = Option(self.networkBorderGroup)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAvailabilityZoneOps {

  implicit def toAvailabilityZoneBuilderOps(v: AvailabilityZone.Builder): AvailabilityZoneBuilderOps =
    new AvailabilityZoneBuilderOps(v)

  implicit def toAvailabilityZoneOps(v: AvailabilityZone): AvailabilityZoneOps = new AvailabilityZoneOps(v)

}
