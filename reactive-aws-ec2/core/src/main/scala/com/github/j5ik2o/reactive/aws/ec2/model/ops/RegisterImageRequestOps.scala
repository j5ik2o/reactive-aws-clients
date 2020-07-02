// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class RegisterImageRequestBuilderOps(val self: RegisterImageRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageLocationAsScala(value: Option[String]): RegisterImageRequest.Builder = {
    value.fold(self) { v => self.imageLocation(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def architectureAsScala(value: Option[ArchitectureValues]): RegisterImageRequest.Builder = {
    value.fold(self) { v => self.architecture(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def blockDeviceMappingsAsScala(value: Option[Seq[BlockDeviceMapping]]): RegisterImageRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.blockDeviceMappings(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): RegisterImageRequest.Builder = {
    value.fold(self) { v => self.description(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def enaSupportAsScala(value: Option[Boolean]): RegisterImageRequest.Builder = {
    value.fold(self) { v => self.enaSupport(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def kernelIdAsScala(value: Option[String]): RegisterImageRequest.Builder = {
    value.fold(self) { v => self.kernelId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala(value: Option[String]): RegisterImageRequest.Builder = {
    value.fold(self) { v => self.name(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def billingProductsAsScala(value: Option[Seq[String]]): RegisterImageRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.billingProducts(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ramdiskIdAsScala(value: Option[String]): RegisterImageRequest.Builder = {
    value.fold(self) { v => self.ramdiskId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def rootDeviceNameAsScala(value: Option[String]): RegisterImageRequest.Builder = {
    value.fold(self) { v => self.rootDeviceName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sriovNetSupportAsScala(value: Option[String]): RegisterImageRequest.Builder = {
    value.fold(self) { v => self.sriovNetSupport(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def virtualizationTypeAsScala(value: Option[String]): RegisterImageRequest.Builder = {
    value.fold(self) { v => self.virtualizationType(v) }
  }

}

final class RegisterImageRequestOps(val self: RegisterImageRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageLocationAsScala: Option[String] = Option(self.imageLocation)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def architectureAsScala: Option[ArchitectureValues] = Option(self.architecture)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def blockDeviceMappingsAsScala: Option[Seq[BlockDeviceMapping]] =
    Option(self.blockDeviceMappings).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def enaSupportAsScala: Option[Boolean] = Option(self.enaSupport)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def kernelIdAsScala: Option[String] = Option(self.kernelId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala: Option[String] = Option(self.name)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def billingProductsAsScala: Option[Seq[String]] =
    Option(self.billingProducts).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ramdiskIdAsScala: Option[String] = Option(self.ramdiskId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def rootDeviceNameAsScala: Option[String] = Option(self.rootDeviceName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sriovNetSupportAsScala: Option[String] = Option(self.sriovNetSupport)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def virtualizationTypeAsScala: Option[String] = Option(self.virtualizationType)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRegisterImageRequestOps {

  implicit def toRegisterImageRequestBuilderOps(v: RegisterImageRequest.Builder): RegisterImageRequestBuilderOps =
    new RegisterImageRequestBuilderOps(v)

  implicit def toRegisterImageRequestOps(v: RegisterImageRequest): RegisterImageRequestOps =
    new RegisterImageRequestOps(v)

}
