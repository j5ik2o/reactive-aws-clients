// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class VolumeStatusItemBuilderOps(val self: VolumeStatusItem.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def actionsAsScala(value: Option[Seq[VolumeStatusAction]]): VolumeStatusItem.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.actions(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def availabilityZoneAsScala(value: Option[String]): VolumeStatusItem.Builder = {
    value.fold(self) { v =>
      self.availabilityZone(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def outpostArnAsScala(value: Option[String]): VolumeStatusItem.Builder = {
    value.fold(self) { v =>
      self.outpostArn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def eventsAsScala(value: Option[Seq[VolumeStatusEvent]]): VolumeStatusItem.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.events(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def volumeIdAsScala(value: Option[String]): VolumeStatusItem.Builder = {
    value.fold(self) { v =>
      self.volumeId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def volumeStatusAsScala(value: Option[VolumeStatusInfo]): VolumeStatusItem.Builder = {
    value.fold(self) { v =>
      self.volumeStatus(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attachmentStatusesAsScala(value: Option[Seq[VolumeStatusAttachmentStatus]]): VolumeStatusItem.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.attachmentStatuses(v.asJava)
    }
  }

}

final class VolumeStatusItemOps(val self: VolumeStatusItem) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def actionsAsScala: Option[Seq[VolumeStatusAction]] = Option(self.actions).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def availabilityZoneAsScala: Option[String] = Option(self.availabilityZone)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def outpostArnAsScala: Option[String] = Option(self.outpostArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def eventsAsScala: Option[Seq[VolumeStatusEvent]] = Option(self.events).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def volumeIdAsScala: Option[String] = Option(self.volumeId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def volumeStatusAsScala: Option[VolumeStatusInfo] = Option(self.volumeStatus)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attachmentStatusesAsScala: Option[Seq[VolumeStatusAttachmentStatus]] = Option(self.attachmentStatuses).map {
    v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToVolumeStatusItemOps {

  implicit def toVolumeStatusItemBuilderOps(v: VolumeStatusItem.Builder): VolumeStatusItemBuilderOps =
    new VolumeStatusItemBuilderOps(v)

  implicit def toVolumeStatusItemOps(v: VolumeStatusItem): VolumeStatusItemOps = new VolumeStatusItemOps(v)

}
