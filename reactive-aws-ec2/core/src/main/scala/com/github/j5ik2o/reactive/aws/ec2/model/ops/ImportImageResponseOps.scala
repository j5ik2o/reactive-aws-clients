// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ImportImageResponseBuilderOps(val self: ImportImageResponse.Builder) extends AnyVal {

  final def architectureAsScala(value: Option[String]): ImportImageResponse.Builder = {
    value.fold(self) { v =>
      self.architecture(v)
    }
  }

  final def descriptionAsScala(value: Option[String]): ImportImageResponse.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def encryptedAsScala(value: Option[Boolean]): ImportImageResponse.Builder = {
    value.fold(self) { v =>
      self.encrypted(v)
    }
  }

  final def hypervisorAsScala(value: Option[String]): ImportImageResponse.Builder = {
    value.fold(self) { v =>
      self.hypervisor(v)
    }
  }

  final def imageIdAsScala(value: Option[String]): ImportImageResponse.Builder = {
    value.fold(self) { v =>
      self.imageId(v)
    }
  }

  final def importTaskIdAsScala(value: Option[String]): ImportImageResponse.Builder = {
    value.fold(self) { v =>
      self.importTaskId(v)
    }
  }

  final def kmsKeyIdAsScala(value: Option[String]): ImportImageResponse.Builder = {
    value.fold(self) { v =>
      self.kmsKeyId(v)
    }
  }

  final def licenseTypeAsScala(value: Option[String]): ImportImageResponse.Builder = {
    value.fold(self) { v =>
      self.licenseType(v)
    }
  }

  final def platformAsScala(value: Option[String]): ImportImageResponse.Builder = {
    value.fold(self) { v =>
      self.platform(v)
    }
  }

  final def progressAsScala(value: Option[String]): ImportImageResponse.Builder = {
    value.fold(self) { v =>
      self.progress(v)
    }
  }

  final def snapshotDetailsAsScala(value: Option[Seq[SnapshotDetail]]): ImportImageResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.snapshotDetails(v.asJava)
    }
  }

  final def statusAsScala(value: Option[String]): ImportImageResponse.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  final def statusMessageAsScala(value: Option[String]): ImportImageResponse.Builder = {
    value.fold(self) { v =>
      self.statusMessage(v)
    }
  }

}

final class ImportImageResponseOps(val self: ImportImageResponse) extends AnyVal {

  final def architectureAsScala: Option[String] = Option(self.architecture)

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def encryptedAsScala: Option[Boolean] = Option(self.encrypted)

  final def hypervisorAsScala: Option[String] = Option(self.hypervisor)

  final def imageIdAsScala: Option[String] = Option(self.imageId)

  final def importTaskIdAsScala: Option[String] = Option(self.importTaskId)

  final def kmsKeyIdAsScala: Option[String] = Option(self.kmsKeyId)

  final def licenseTypeAsScala: Option[String] = Option(self.licenseType)

  final def platformAsScala: Option[String] = Option(self.platform)

  final def progressAsScala: Option[String] = Option(self.progress)

  final def snapshotDetailsAsScala: Option[Seq[SnapshotDetail]] = Option(self.snapshotDetails).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def statusAsScala: Option[String] = Option(self.status)

  final def statusMessageAsScala: Option[String] = Option(self.statusMessage)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToImportImageResponseOps {

  implicit def toImportImageResponseBuilderOps(v: ImportImageResponse.Builder): ImportImageResponseBuilderOps =
    new ImportImageResponseBuilderOps(v)

  implicit def toImportImageResponseOps(v: ImportImageResponse): ImportImageResponseOps = new ImportImageResponseOps(v)

}
