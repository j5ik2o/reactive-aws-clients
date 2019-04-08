// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ImportImageRequestBuilderOps(val self: ImportImageRequest.Builder) extends AnyVal {

  final def architectureAsScala(value: Option[String]): ImportImageRequest.Builder = {
    value.fold(self) { v =>
      self.architecture(v)
    }
  }

  final def clientDataAsScala(value: Option[ClientData]): ImportImageRequest.Builder = {
    value.fold(self) { v =>
      self.clientData(v)
    }
  }

  final def clientTokenAsScala(value: Option[String]): ImportImageRequest.Builder = {
    value.fold(self) { v =>
      self.clientToken(v)
    }
  }

  final def descriptionAsScala(value: Option[String]): ImportImageRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def diskContainersAsScala(value: Option[Seq[ImageDiskContainer]]): ImportImageRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.diskContainers(v.asJava)
    }
  }

  final def encryptedAsScala(value: Option[Boolean]): ImportImageRequest.Builder = {
    value.fold(self) { v =>
      self.encrypted(v)
    }
  }

  final def hypervisorAsScala(value: Option[String]): ImportImageRequest.Builder = {
    value.fold(self) { v =>
      self.hypervisor(v)
    }
  }

  final def kmsKeyIdAsScala(value: Option[String]): ImportImageRequest.Builder = {
    value.fold(self) { v =>
      self.kmsKeyId(v)
    }
  }

  final def licenseTypeAsScala(value: Option[String]): ImportImageRequest.Builder = {
    value.fold(self) { v =>
      self.licenseType(v)
    }
  }

  final def platformAsScala(value: Option[String]): ImportImageRequest.Builder = {
    value.fold(self) { v =>
      self.platform(v)
    }
  }

  final def roleNameAsScala(value: Option[String]): ImportImageRequest.Builder = {
    value.fold(self) { v =>
      self.roleName(v)
    }
  }

}

final class ImportImageRequestOps(val self: ImportImageRequest) extends AnyVal {

  final def architectureAsScala: Option[String] = Option(self.architecture)

  final def clientDataAsScala: Option[ClientData] = Option(self.clientData)

  final def clientTokenAsScala: Option[String] = Option(self.clientToken)

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def diskContainersAsScala: Option[Seq[ImageDiskContainer]] = Option(self.diskContainers).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def encryptedAsScala: Option[Boolean] = Option(self.encrypted)

  final def hypervisorAsScala: Option[String] = Option(self.hypervisor)

  final def kmsKeyIdAsScala: Option[String] = Option(self.kmsKeyId)

  final def licenseTypeAsScala: Option[String] = Option(self.licenseType)

  final def platformAsScala: Option[String] = Option(self.platform)

  final def roleNameAsScala: Option[String] = Option(self.roleName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToImportImageRequestOps {

  implicit def toImportImageRequestBuilderOps(v: ImportImageRequest.Builder): ImportImageRequestBuilderOps =
    new ImportImageRequestBuilderOps(v)

  implicit def toImportImageRequestOps(v: ImportImageRequest): ImportImageRequestOps = new ImportImageRequestOps(v)

}
