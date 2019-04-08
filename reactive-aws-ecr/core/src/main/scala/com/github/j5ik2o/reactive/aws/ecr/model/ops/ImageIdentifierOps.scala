// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class ImageIdentifierBuilderOps(val self: ImageIdentifier.Builder) extends AnyVal {

  final def imageDigestAsScala(value: Option[String]): ImageIdentifier.Builder = {
    value.fold(self) { v =>
      self.imageDigest(v)
    }
  }

  final def imageTagAsScala(value: Option[String]): ImageIdentifier.Builder = {
    value.fold(self) { v =>
      self.imageTag(v)
    }
  }

}

final class ImageIdentifierOps(val self: ImageIdentifier) extends AnyVal {

  final def imageDigestAsScala: Option[String] = Option(self.imageDigest)

  final def imageTagAsScala: Option[String] = Option(self.imageTag)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToImageIdentifierOps {

  implicit def toImageIdentifierBuilderOps(v: ImageIdentifier.Builder): ImageIdentifierBuilderOps =
    new ImageIdentifierBuilderOps(v)

  implicit def toImageIdentifierOps(v: ImageIdentifier): ImageIdentifierOps = new ImageIdentifierOps(v)

}
