// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class AvailabilityZoneBuilderOps(val self: AvailabilityZone.Builder) extends AnyVal {

  final def stateAsScala(value: Option[AvailabilityZoneState]): AvailabilityZone.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

  final def messagesAsScala(value: Option[Seq[AvailabilityZoneMessage]]): AvailabilityZone.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.messages(v.asJava)
    }
  }

  final def regionNameAsScala(value: Option[String]): AvailabilityZone.Builder = {
    value.fold(self) { v =>
      self.regionName(v)
    }
  }

  final def zoneNameAsScala(value: Option[String]): AvailabilityZone.Builder = {
    value.fold(self) { v =>
      self.zoneName(v)
    }
  }

  final def zoneIdAsScala(value: Option[String]): AvailabilityZone.Builder = {
    value.fold(self) { v =>
      self.zoneId(v)
    }
  }

}

final class AvailabilityZoneOps(val self: AvailabilityZone) extends AnyVal {

  final def stateAsScala: Option[AvailabilityZoneState] = Option(self.state)

  final def messagesAsScala: Option[Seq[AvailabilityZoneMessage]] = Option(self.messages).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def regionNameAsScala: Option[String] = Option(self.regionName)

  final def zoneNameAsScala: Option[String] = Option(self.zoneName)

  final def zoneIdAsScala: Option[String] = Option(self.zoneId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAvailabilityZoneOps {

  implicit def toAvailabilityZoneBuilderOps(v: AvailabilityZone.Builder): AvailabilityZoneBuilderOps =
    new AvailabilityZoneBuilderOps(v)

  implicit def toAvailabilityZoneOps(v: AvailabilityZone): AvailabilityZoneOps = new AvailabilityZoneOps(v)

}
