// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ImportImageRequestBuilderOps(val self: ImportImageRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def architectureAsScala(value: Option[String]): ImportImageRequest.Builder = {
    value.fold(self) { v =>
      self.architecture(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientDataAsScala(value: Option[ClientData]): ImportImageRequest.Builder = {
    value.fold(self) { v =>
      self.clientData(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientTokenAsScala(value: Option[String]): ImportImageRequest.Builder = {
    value.fold(self) { v =>
      self.clientToken(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): ImportImageRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def diskContainersAsScala(value: Option[Seq[ImageDiskContainer]]): ImportImageRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.diskContainers(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def encryptedAsScala(value: Option[Boolean]): ImportImageRequest.Builder = {
    value.fold(self) { v =>
      self.encrypted(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def hypervisorAsScala(value: Option[String]): ImportImageRequest.Builder = {
    value.fold(self) { v =>
      self.hypervisor(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def kmsKeyIdAsScala(value: Option[String]): ImportImageRequest.Builder = {
    value.fold(self) { v =>
      self.kmsKeyId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def licenseTypeAsScala(value: Option[String]): ImportImageRequest.Builder = {
    value.fold(self) { v =>
      self.licenseType(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformAsScala(value: Option[String]): ImportImageRequest.Builder = {
    value.fold(self) { v =>
      self.platform(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def roleNameAsScala(value: Option[String]): ImportImageRequest.Builder = {
    value.fold(self) { v =>
      self.roleName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def licenseSpecificationsAsScala(
      value: Option[Seq[ImportImageLicenseConfigurationRequest]]
  ): ImportImageRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.licenseSpecifications(v.asJava)
    }
  }

}

final class ImportImageRequestOps(val self: ImportImageRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def architectureAsScala: Option[String] = Option(self.architecture)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientDataAsScala: Option[ClientData] = Option(self.clientData)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientTokenAsScala: Option[String] = Option(self.clientToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def diskContainersAsScala: Option[Seq[ImageDiskContainer]] = Option(self.diskContainers).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def encryptedAsScala: Option[Boolean] = Option(self.encrypted)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def hypervisorAsScala: Option[String] = Option(self.hypervisor)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def kmsKeyIdAsScala: Option[String] = Option(self.kmsKeyId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def licenseTypeAsScala: Option[String] = Option(self.licenseType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformAsScala: Option[String] = Option(self.platform)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def roleNameAsScala: Option[String] = Option(self.roleName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def licenseSpecificationsAsScala: Option[Seq[ImportImageLicenseConfigurationRequest]] =
    Option(self.licenseSpecifications).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToImportImageRequestOps {

  implicit def toImportImageRequestBuilderOps(v: ImportImageRequest.Builder): ImportImageRequestBuilderOps =
    new ImportImageRequestBuilderOps(v)

  implicit def toImportImageRequestOps(v: ImportImageRequest): ImportImageRequestOps = new ImportImageRequestOps(v)

}
