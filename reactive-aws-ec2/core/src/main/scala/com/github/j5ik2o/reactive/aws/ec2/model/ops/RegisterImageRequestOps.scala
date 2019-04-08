// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class RegisterImageRequestBuilderOps(val self: RegisterImageRequest.Builder) extends AnyVal {

  final def imageLocationAsScala(value: Option[String]): RegisterImageRequest.Builder = {
    value.fold(self) { v =>
      self.imageLocation(v)
    }
  }

  final def architectureAsScala(value: Option[ArchitectureValues]): RegisterImageRequest.Builder = {
    value.fold(self) { v =>
      self.architecture(v)
    }
  }

  final def blockDeviceMappingsAsScala(value: Option[Seq[BlockDeviceMapping]]): RegisterImageRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.blockDeviceMappings(v.asJava)
    }
  }

  final def descriptionAsScala(value: Option[String]): RegisterImageRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def enaSupportAsScala(value: Option[Boolean]): RegisterImageRequest.Builder = {
    value.fold(self) { v =>
      self.enaSupport(v)
    }
  }

  final def kernelIdAsScala(value: Option[String]): RegisterImageRequest.Builder = {
    value.fold(self) { v =>
      self.kernelId(v)
    }
  }

  final def nameAsScala(value: Option[String]): RegisterImageRequest.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

  final def billingProductsAsScala(value: Option[Seq[String]]): RegisterImageRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.billingProducts(v.asJava)
    }
  }

  final def ramdiskIdAsScala(value: Option[String]): RegisterImageRequest.Builder = {
    value.fold(self) { v =>
      self.ramdiskId(v)
    }
  }

  final def rootDeviceNameAsScala(value: Option[String]): RegisterImageRequest.Builder = {
    value.fold(self) { v =>
      self.rootDeviceName(v)
    }
  }

  final def sriovNetSupportAsScala(value: Option[String]): RegisterImageRequest.Builder = {
    value.fold(self) { v =>
      self.sriovNetSupport(v)
    }
  }

  final def virtualizationTypeAsScala(value: Option[String]): RegisterImageRequest.Builder = {
    value.fold(self) { v =>
      self.virtualizationType(v)
    }
  }

}

final class RegisterImageRequestOps(val self: RegisterImageRequest) extends AnyVal {

  final def imageLocationAsScala: Option[String] = Option(self.imageLocation)

  final def architectureAsScala: Option[ArchitectureValues] = Option(self.architecture)

  final def blockDeviceMappingsAsScala: Option[Seq[BlockDeviceMapping]] = Option(self.blockDeviceMappings).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def enaSupportAsScala: Option[Boolean] = Option(self.enaSupport)

  final def kernelIdAsScala: Option[String] = Option(self.kernelId)

  final def nameAsScala: Option[String] = Option(self.name)

  final def billingProductsAsScala: Option[Seq[String]] = Option(self.billingProducts).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def ramdiskIdAsScala: Option[String] = Option(self.ramdiskId)

  final def rootDeviceNameAsScala: Option[String] = Option(self.rootDeviceName)

  final def sriovNetSupportAsScala: Option[String] = Option(self.sriovNetSupport)

  final def virtualizationTypeAsScala: Option[String] = Option(self.virtualizationType)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRegisterImageRequestOps {

  implicit def toRegisterImageRequestBuilderOps(v: RegisterImageRequest.Builder): RegisterImageRequestBuilderOps =
    new RegisterImageRequestBuilderOps(v)

  implicit def toRegisterImageRequestOps(v: RegisterImageRequest): RegisterImageRequestOps =
    new RegisterImageRequestOps(v)

}
