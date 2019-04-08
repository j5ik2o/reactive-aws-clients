// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class ImageBuilderOps(val self: Image.Builder) extends AnyVal {

  final def registryIdAsScala(value: Option[String]): Image.Builder = {
    value.fold(self) { v =>
      self.registryId(v)
    }
  }

  final def repositoryNameAsScala(value: Option[String]): Image.Builder = {
    value.fold(self) { v =>
      self.repositoryName(v)
    }
  }

  final def imageIdAsScala(value: Option[ImageIdentifier]): Image.Builder = {
    value.fold(self) { v =>
      self.imageId(v)
    }
  }

  final def imageManifestAsScala(value: Option[String]): Image.Builder = {
    value.fold(self) { v =>
      self.imageManifest(v)
    }
  }

}

final class ImageOps(val self: Image) extends AnyVal {

  final def registryIdAsScala: Option[String] = Option(self.registryId)

  final def repositoryNameAsScala: Option[String] = Option(self.repositoryName)

  final def imageIdAsScala: Option[ImageIdentifier] = Option(self.imageId)

  final def imageManifestAsScala: Option[String] = Option(self.imageManifest)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToImageOps {

  implicit def toImageBuilderOps(v: Image.Builder): ImageBuilderOps = new ImageBuilderOps(v)

  implicit def toImageOps(v: Image): ImageOps = new ImageOps(v)

}
