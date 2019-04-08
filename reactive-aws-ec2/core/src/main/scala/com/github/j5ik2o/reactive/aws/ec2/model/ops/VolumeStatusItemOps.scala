// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class VolumeStatusItemBuilderOps(val self: VolumeStatusItem.Builder) extends AnyVal {

  final def actionsAsScala(value: Option[Seq[VolumeStatusAction]]): VolumeStatusItem.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.actions(v.asJava)
    }
  }

  final def availabilityZoneAsScala(value: Option[String]): VolumeStatusItem.Builder = {
    value.fold(self) { v =>
      self.availabilityZone(v)
    }
  }

  final def eventsAsScala(value: Option[Seq[VolumeStatusEvent]]): VolumeStatusItem.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.events(v.asJava)
    }
  }

  final def volumeIdAsScala(value: Option[String]): VolumeStatusItem.Builder = {
    value.fold(self) { v =>
      self.volumeId(v)
    }
  }

  final def volumeStatusAsScala(value: Option[VolumeStatusInfo]): VolumeStatusItem.Builder = {
    value.fold(self) { v =>
      self.volumeStatus(v)
    }
  }

}

final class VolumeStatusItemOps(val self: VolumeStatusItem) extends AnyVal {

  final def actionsAsScala: Option[Seq[VolumeStatusAction]] = Option(self.actions).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def availabilityZoneAsScala: Option[String] = Option(self.availabilityZone)

  final def eventsAsScala: Option[Seq[VolumeStatusEvent]] = Option(self.events).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def volumeIdAsScala: Option[String] = Option(self.volumeId)

  final def volumeStatusAsScala: Option[VolumeStatusInfo] = Option(self.volumeStatus)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToVolumeStatusItemOps {

  implicit def toVolumeStatusItemBuilderOps(v: VolumeStatusItem.Builder): VolumeStatusItemBuilderOps =
    new VolumeStatusItemBuilderOps(v)

  implicit def toVolumeStatusItemOps(v: VolumeStatusItem): VolumeStatusItemOps = new VolumeStatusItemOps(v)

}
