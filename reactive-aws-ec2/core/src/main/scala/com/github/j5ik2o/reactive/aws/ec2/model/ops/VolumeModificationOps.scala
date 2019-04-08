// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class VolumeModificationBuilderOps(val self: VolumeModification.Builder) extends AnyVal {

  final def volumeIdAsScala(value: Option[String]): VolumeModification.Builder = {
    value.fold(self) { v =>
      self.volumeId(v)
    }
  }

  final def modificationStateAsScala(value: Option[VolumeModificationState]): VolumeModification.Builder = {
    value.fold(self) { v =>
      self.modificationState(v)
    }
  }

  final def statusMessageAsScala(value: Option[String]): VolumeModification.Builder = {
    value.fold(self) { v =>
      self.statusMessage(v)
    }
  }

  final def targetSizeAsScala(value: Option[Int]): VolumeModification.Builder = {
    value.fold(self) { v =>
      self.targetSize(v)
    }
  }

  final def targetIopsAsScala(value: Option[Int]): VolumeModification.Builder = {
    value.fold(self) { v =>
      self.targetIops(v)
    }
  }

  final def targetVolumeTypeAsScala(value: Option[VolumeType]): VolumeModification.Builder = {
    value.fold(self) { v =>
      self.targetVolumeType(v)
    }
  }

  final def originalSizeAsScala(value: Option[Int]): VolumeModification.Builder = {
    value.fold(self) { v =>
      self.originalSize(v)
    }
  }

  final def originalIopsAsScala(value: Option[Int]): VolumeModification.Builder = {
    value.fold(self) { v =>
      self.originalIops(v)
    }
  }

  final def originalVolumeTypeAsScala(value: Option[VolumeType]): VolumeModification.Builder = {
    value.fold(self) { v =>
      self.originalVolumeType(v)
    }
  }

  final def progressAsScala(value: Option[Long]): VolumeModification.Builder = {
    value.fold(self) { v =>
      self.progress(v)
    }
  }

  final def startTimeAsScala(value: Option[java.time.Instant]): VolumeModification.Builder = {
    value.fold(self) { v =>
      self.startTime(v)
    }
  }

  final def endTimeAsScala(value: Option[java.time.Instant]): VolumeModification.Builder = {
    value.fold(self) { v =>
      self.endTime(v)
    }
  }

}

final class VolumeModificationOps(val self: VolumeModification) extends AnyVal {

  final def volumeIdAsScala: Option[String] = Option(self.volumeId)

  final def modificationStateAsScala: Option[VolumeModificationState] = Option(self.modificationState)

  final def statusMessageAsScala: Option[String] = Option(self.statusMessage)

  final def targetSizeAsScala: Option[Int] = Option(self.targetSize)

  final def targetIopsAsScala: Option[Int] = Option(self.targetIops)

  final def targetVolumeTypeAsScala: Option[VolumeType] = Option(self.targetVolumeType)

  final def originalSizeAsScala: Option[Int] = Option(self.originalSize)

  final def originalIopsAsScala: Option[Int] = Option(self.originalIops)

  final def originalVolumeTypeAsScala: Option[VolumeType] = Option(self.originalVolumeType)

  final def progressAsScala: Option[Long] = Option(self.progress)

  final def startTimeAsScala: Option[java.time.Instant] = Option(self.startTime)

  final def endTimeAsScala: Option[java.time.Instant] = Option(self.endTime)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToVolumeModificationOps {

  implicit def toVolumeModificationBuilderOps(v: VolumeModification.Builder): VolumeModificationBuilderOps =
    new VolumeModificationBuilderOps(v)

  implicit def toVolumeModificationOps(v: VolumeModification): VolumeModificationOps = new VolumeModificationOps(v)

}
