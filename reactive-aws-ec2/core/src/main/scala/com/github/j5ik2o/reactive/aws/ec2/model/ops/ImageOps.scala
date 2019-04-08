// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ImageBuilderOps(val self: Image.Builder) extends AnyVal {

  final def architectureAsScala(value: Option[ArchitectureValues]): Image.Builder = {
    value.fold(self) { v =>
      self.architecture(v)
    }
  }

  final def creationDateAsScala(value: Option[String]): Image.Builder = {
    value.fold(self) { v =>
      self.creationDate(v)
    }
  }

  final def imageIdAsScala(value: Option[String]): Image.Builder = {
    value.fold(self) { v =>
      self.imageId(v)
    }
  }

  final def imageLocationAsScala(value: Option[String]): Image.Builder = {
    value.fold(self) { v =>
      self.imageLocation(v)
    }
  }

  final def imageTypeAsScala(value: Option[ImageTypeValues]): Image.Builder = {
    value.fold(self) { v =>
      self.imageType(v)
    }
  }

  final def kernelIdAsScala(value: Option[String]): Image.Builder = {
    value.fold(self) { v =>
      self.kernelId(v)
    }
  }

  final def ownerIdAsScala(value: Option[String]): Image.Builder = {
    value.fold(self) { v =>
      self.ownerId(v)
    }
  }

  final def platformAsScala(value: Option[PlatformValues]): Image.Builder = {
    value.fold(self) { v =>
      self.platform(v)
    }
  }

  final def productCodesAsScala(value: Option[Seq[ProductCode]]): Image.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.productCodes(v.asJava)
    }
  }

  final def ramdiskIdAsScala(value: Option[String]): Image.Builder = {
    value.fold(self) { v =>
      self.ramdiskId(v)
    }
  }

  final def stateAsScala(value: Option[ImageState]): Image.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

  final def blockDeviceMappingsAsScala(value: Option[Seq[BlockDeviceMapping]]): Image.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.blockDeviceMappings(v.asJava)
    }
  }

  final def descriptionAsScala(value: Option[String]): Image.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def enaSupportAsScala(value: Option[Boolean]): Image.Builder = {
    value.fold(self) { v =>
      self.enaSupport(v)
    }
  }

  final def hypervisorAsScala(value: Option[HypervisorType]): Image.Builder = {
    value.fold(self) { v =>
      self.hypervisor(v)
    }
  }

  final def imageOwnerAliasAsScala(value: Option[String]): Image.Builder = {
    value.fold(self) { v =>
      self.imageOwnerAlias(v)
    }
  }

  final def nameAsScala(value: Option[String]): Image.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

  final def rootDeviceNameAsScala(value: Option[String]): Image.Builder = {
    value.fold(self) { v =>
      self.rootDeviceName(v)
    }
  }

  final def rootDeviceTypeAsScala(value: Option[DeviceType]): Image.Builder = {
    value.fold(self) { v =>
      self.rootDeviceType(v)
    }
  }

  final def sriovNetSupportAsScala(value: Option[String]): Image.Builder = {
    value.fold(self) { v =>
      self.sriovNetSupport(v)
    }
  }

  final def stateReasonAsScala(value: Option[StateReason]): Image.Builder = {
    value.fold(self) { v =>
      self.stateReason(v)
    }
  }

  final def tagsAsScala(value: Option[Seq[Tag]]): Image.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    }
  }

  final def virtualizationTypeAsScala(value: Option[VirtualizationType]): Image.Builder = {
    value.fold(self) { v =>
      self.virtualizationType(v)
    }
  }

  final def publicLaunchPermissionsAsScala(value: Option[Boolean]): Image.Builder = {
    value.fold(self) { v =>
      self.publicLaunchPermissions(v)
    }
  }

}

final class ImageOps(val self: Image) extends AnyVal {

  final def architectureAsScala: Option[ArchitectureValues] = Option(self.architecture)

  final def creationDateAsScala: Option[String] = Option(self.creationDate)

  final def imageIdAsScala: Option[String] = Option(self.imageId)

  final def imageLocationAsScala: Option[String] = Option(self.imageLocation)

  final def imageTypeAsScala: Option[ImageTypeValues] = Option(self.imageType)

  final def kernelIdAsScala: Option[String] = Option(self.kernelId)

  final def ownerIdAsScala: Option[String] = Option(self.ownerId)

  final def platformAsScala: Option[PlatformValues] = Option(self.platform)

  final def productCodesAsScala: Option[Seq[ProductCode]] = Option(self.productCodes).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def ramdiskIdAsScala: Option[String] = Option(self.ramdiskId)

  final def stateAsScala: Option[ImageState] = Option(self.state)

  final def blockDeviceMappingsAsScala: Option[Seq[BlockDeviceMapping]] = Option(self.blockDeviceMappings).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def enaSupportAsScala: Option[Boolean] = Option(self.enaSupport)

  final def hypervisorAsScala: Option[HypervisorType] = Option(self.hypervisor)

  final def imageOwnerAliasAsScala: Option[String] = Option(self.imageOwnerAlias)

  final def nameAsScala: Option[String] = Option(self.name)

  final def rootDeviceNameAsScala: Option[String] = Option(self.rootDeviceName)

  final def rootDeviceTypeAsScala: Option[DeviceType] = Option(self.rootDeviceType)

  final def sriovNetSupportAsScala: Option[String] = Option(self.sriovNetSupport)

  final def stateReasonAsScala: Option[StateReason] = Option(self.stateReason)

  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def virtualizationTypeAsScala: Option[VirtualizationType] = Option(self.virtualizationType)

  final def publicLaunchPermissionsAsScala: Option[Boolean] = Option(self.publicLaunchPermissions)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToImageOps {

  implicit def toImageBuilderOps(v: Image.Builder): ImageBuilderOps = new ImageBuilderOps(v)

  implicit def toImageOps(v: Image): ImageOps = new ImageOps(v)

}
