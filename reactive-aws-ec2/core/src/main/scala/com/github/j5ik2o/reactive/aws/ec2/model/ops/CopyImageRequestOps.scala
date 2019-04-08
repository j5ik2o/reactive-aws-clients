// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CopyImageRequestBuilderOps(val self: CopyImageRequest.Builder) extends AnyVal {

  final def clientTokenAsScala(value: Option[String]): CopyImageRequest.Builder = {
    value.fold(self) { v =>
      self.clientToken(v)
    }
  }

  final def descriptionAsScala(value: Option[String]): CopyImageRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def encryptedAsScala(value: Option[Boolean]): CopyImageRequest.Builder = {
    value.fold(self) { v =>
      self.encrypted(v)
    }
  }

  final def kmsKeyIdAsScala(value: Option[String]): CopyImageRequest.Builder = {
    value.fold(self) { v =>
      self.kmsKeyId(v)
    }
  }

  final def nameAsScala(value: Option[String]): CopyImageRequest.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

  final def sourceImageIdAsScala(value: Option[String]): CopyImageRequest.Builder = {
    value.fold(self) { v =>
      self.sourceImageId(v)
    }
  }

  final def sourceRegionAsScala(value: Option[String]): CopyImageRequest.Builder = {
    value.fold(self) { v =>
      self.sourceRegion(v)
    }
  }

}

final class CopyImageRequestOps(val self: CopyImageRequest) extends AnyVal {

  final def clientTokenAsScala: Option[String] = Option(self.clientToken)

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def encryptedAsScala: Option[Boolean] = Option(self.encrypted)

  final def kmsKeyIdAsScala: Option[String] = Option(self.kmsKeyId)

  final def nameAsScala: Option[String] = Option(self.name)

  final def sourceImageIdAsScala: Option[String] = Option(self.sourceImageId)

  final def sourceRegionAsScala: Option[String] = Option(self.sourceRegion)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCopyImageRequestOps {

  implicit def toCopyImageRequestBuilderOps(v: CopyImageRequest.Builder): CopyImageRequestBuilderOps =
    new CopyImageRequestBuilderOps(v)

  implicit def toCopyImageRequestOps(v: CopyImageRequest): CopyImageRequestOps = new CopyImageRequestOps(v)

}
