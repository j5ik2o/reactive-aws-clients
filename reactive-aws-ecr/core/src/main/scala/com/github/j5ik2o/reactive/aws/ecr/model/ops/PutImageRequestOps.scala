// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class PutImageRequestBuilderOps(val self: PutImageRequest.Builder) extends AnyVal {

  final def registryIdAsScala(value: Option[String]): PutImageRequest.Builder = {
    value.fold(self) { v =>
      self.registryId(v)
    }
  }

  final def repositoryNameAsScala(value: Option[String]): PutImageRequest.Builder = {
    value.fold(self) { v =>
      self.repositoryName(v)
    }
  }

  final def imageManifestAsScala(value: Option[String]): PutImageRequest.Builder = {
    value.fold(self) { v =>
      self.imageManifest(v)
    }
  }

  final def imageTagAsScala(value: Option[String]): PutImageRequest.Builder = {
    value.fold(self) { v =>
      self.imageTag(v)
    }
  }

}

final class PutImageRequestOps(val self: PutImageRequest) extends AnyVal {

  final def registryIdAsScala: Option[String] = Option(self.registryId)

  final def repositoryNameAsScala: Option[String] = Option(self.repositoryName)

  final def imageManifestAsScala: Option[String] = Option(self.imageManifest)

  final def imageTagAsScala: Option[String] = Option(self.imageTag)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutImageRequestOps {

  implicit def toPutImageRequestBuilderOps(v: PutImageRequest.Builder): PutImageRequestBuilderOps =
    new PutImageRequestBuilderOps(v)

  implicit def toPutImageRequestOps(v: PutImageRequest): PutImageRequestOps = new PutImageRequestOps(v)

}
