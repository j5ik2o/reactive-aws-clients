// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ImageBuilderOps(val self: Image.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def architectureAsScala(value: Option[ArchitectureValues]): Image.Builder = {
    value.fold(self) { v =>
      self.architecture(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def creationDateAsScala(value: Option[String]): Image.Builder = {
    value.fold(self) { v =>
      self.creationDate(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageIdAsScala(value: Option[String]): Image.Builder = {
    value.fold(self) { v =>
      self.imageId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageLocationAsScala(value: Option[String]): Image.Builder = {
    value.fold(self) { v =>
      self.imageLocation(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageTypeAsScala(value: Option[ImageTypeValues]): Image.Builder = {
    value.fold(self) { v =>
      self.imageType(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def kernelIdAsScala(value: Option[String]): Image.Builder = {
    value.fold(self) { v =>
      self.kernelId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ownerIdAsScala(value: Option[String]): Image.Builder = {
    value.fold(self) { v =>
      self.ownerId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformAsScala(value: Option[PlatformValues]): Image.Builder = {
    value.fold(self) { v =>
      self.platform(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformDetailsAsScala(value: Option[String]): Image.Builder = {
    value.fold(self) { v =>
      self.platformDetails(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def usageOperationAsScala(value: Option[String]): Image.Builder = {
    value.fold(self) { v =>
      self.usageOperation(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def productCodesAsScala(value: Option[Seq[ProductCode]]): Image.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.productCodes(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ramdiskIdAsScala(value: Option[String]): Image.Builder = {
    value.fold(self) { v =>
      self.ramdiskId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala(value: Option[ImageState]): Image.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def blockDeviceMappingsAsScala(value: Option[Seq[BlockDeviceMapping]]): Image.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.blockDeviceMappings(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): Image.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def enaSupportAsScala(value: Option[Boolean]): Image.Builder = {
    value.fold(self) { v =>
      self.enaSupport(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def hypervisorAsScala(value: Option[HypervisorType]): Image.Builder = {
    value.fold(self) { v =>
      self.hypervisor(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageOwnerAliasAsScala(value: Option[String]): Image.Builder = {
    value.fold(self) { v =>
      self.imageOwnerAlias(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala(value: Option[String]): Image.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def rootDeviceNameAsScala(value: Option[String]): Image.Builder = {
    value.fold(self) { v =>
      self.rootDeviceName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def rootDeviceTypeAsScala(value: Option[DeviceType]): Image.Builder = {
    value.fold(self) { v =>
      self.rootDeviceType(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sriovNetSupportAsScala(value: Option[String]): Image.Builder = {
    value.fold(self) { v =>
      self.sriovNetSupport(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateReasonAsScala(value: Option[StateReason]): Image.Builder = {
    value.fold(self) { v =>
      self.stateReason(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Seq[Tag]]): Image.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def virtualizationTypeAsScala(value: Option[VirtualizationType]): Image.Builder = {
    value.fold(self) { v =>
      self.virtualizationType(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def publicLaunchPermissionsAsScala(value: Option[Boolean]): Image.Builder = {
    value.fold(self) { v =>
      self.publicLaunchPermissions(v)
    }
  }

}

final class ImageOps(val self: Image) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def architectureAsScala: Option[ArchitectureValues] = Option(self.architecture)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def creationDateAsScala: Option[String] = Option(self.creationDate)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageIdAsScala: Option[String] = Option(self.imageId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageLocationAsScala: Option[String] = Option(self.imageLocation)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageTypeAsScala: Option[ImageTypeValues] = Option(self.imageType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def kernelIdAsScala: Option[String] = Option(self.kernelId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ownerIdAsScala: Option[String] = Option(self.ownerId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformAsScala: Option[PlatformValues] = Option(self.platform)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformDetailsAsScala: Option[String] = Option(self.platformDetails)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def usageOperationAsScala: Option[String] = Option(self.usageOperation)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def productCodesAsScala: Option[Seq[ProductCode]] = Option(self.productCodes).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ramdiskIdAsScala: Option[String] = Option(self.ramdiskId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala: Option[ImageState] = Option(self.state)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def blockDeviceMappingsAsScala: Option[Seq[BlockDeviceMapping]] = Option(self.blockDeviceMappings).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def enaSupportAsScala: Option[Boolean] = Option(self.enaSupport)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def hypervisorAsScala: Option[HypervisorType] = Option(self.hypervisor)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageOwnerAliasAsScala: Option[String] = Option(self.imageOwnerAlias)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala: Option[String] = Option(self.name)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def rootDeviceNameAsScala: Option[String] = Option(self.rootDeviceName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def rootDeviceTypeAsScala: Option[DeviceType] = Option(self.rootDeviceType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sriovNetSupportAsScala: Option[String] = Option(self.sriovNetSupport)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateReasonAsScala: Option[StateReason] = Option(self.stateReason)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def virtualizationTypeAsScala: Option[VirtualizationType] = Option(self.virtualizationType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def publicLaunchPermissionsAsScala: Option[Boolean] = Option(self.publicLaunchPermissions)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToImageOps {

  implicit def toImageBuilderOps(v: Image.Builder): ImageBuilderOps = new ImageBuilderOps(v)

  implicit def toImageOps(v: Image): ImageOps = new ImageOps(v)

}
