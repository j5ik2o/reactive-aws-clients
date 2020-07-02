// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class VolumeModificationBuilderOps(val self: VolumeModification.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def volumeIdAsScala(value: Option[String]): VolumeModification.Builder = {
    value.fold(self) { v => self.volumeId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def modificationStateAsScala(value: Option[VolumeModificationState]): VolumeModification.Builder = {
    value.fold(self) { v => self.modificationState(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusMessageAsScala(value: Option[String]): VolumeModification.Builder = {
    value.fold(self) { v => self.statusMessage(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def targetSizeAsScala(value: Option[Int]): VolumeModification.Builder = {
    value.fold(self) { v => self.targetSize(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def targetIopsAsScala(value: Option[Int]): VolumeModification.Builder = {
    value.fold(self) { v => self.targetIops(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def targetVolumeTypeAsScala(value: Option[VolumeType]): VolumeModification.Builder = {
    value.fold(self) { v => self.targetVolumeType(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def originalSizeAsScala(value: Option[Int]): VolumeModification.Builder = {
    value.fold(self) { v => self.originalSize(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def originalIopsAsScala(value: Option[Int]): VolumeModification.Builder = {
    value.fold(self) { v => self.originalIops(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def originalVolumeTypeAsScala(value: Option[VolumeType]): VolumeModification.Builder = {
    value.fold(self) { v => self.originalVolumeType(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def progressAsScala(value: Option[Long]): VolumeModification.Builder = {
    value.fold(self) { v => self.progress(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def startTimeAsScala(value: Option[java.time.Instant]): VolumeModification.Builder = {
    value.fold(self) { v => self.startTime(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def endTimeAsScala(value: Option[java.time.Instant]): VolumeModification.Builder = {
    value.fold(self) { v => self.endTime(v) }
  }

}

final class VolumeModificationOps(val self: VolumeModification) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def volumeIdAsScala: Option[String] = Option(self.volumeId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def modificationStateAsScala: Option[VolumeModificationState] = Option(self.modificationState)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusMessageAsScala: Option[String] = Option(self.statusMessage)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def targetSizeAsScala: Option[Int] = Option(self.targetSize)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def targetIopsAsScala: Option[Int] = Option(self.targetIops)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def targetVolumeTypeAsScala: Option[VolumeType] = Option(self.targetVolumeType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def originalSizeAsScala: Option[Int] = Option(self.originalSize)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def originalIopsAsScala: Option[Int] = Option(self.originalIops)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def originalVolumeTypeAsScala: Option[VolumeType] = Option(self.originalVolumeType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def progressAsScala: Option[Long] = Option(self.progress)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def startTimeAsScala: Option[java.time.Instant] = Option(self.startTime)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def endTimeAsScala: Option[java.time.Instant] = Option(self.endTime)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToVolumeModificationOps {

  implicit def toVolumeModificationBuilderOps(v: VolumeModification.Builder): VolumeModificationBuilderOps =
    new VolumeModificationBuilderOps(v)

  implicit def toVolumeModificationOps(v: VolumeModification): VolumeModificationOps = new VolumeModificationOps(v)

}
