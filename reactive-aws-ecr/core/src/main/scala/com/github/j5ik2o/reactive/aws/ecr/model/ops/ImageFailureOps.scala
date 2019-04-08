// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class ImageFailureBuilderOps(val self: ImageFailure.Builder) extends AnyVal {

  final def imageIdAsScala(value: Option[ImageIdentifier]): ImageFailure.Builder = {
    value.fold(self) { v =>
      self.imageId(v)
    }
  }

  final def failureCodeAsScala(value: Option[ImageFailureCode]): ImageFailure.Builder = {
    value.fold(self) { v =>
      self.failureCode(v)
    }
  }

  final def failureReasonAsScala(value: Option[String]): ImageFailure.Builder = {
    value.fold(self) { v =>
      self.failureReason(v)
    }
  }

}

final class ImageFailureOps(val self: ImageFailure) extends AnyVal {

  final def imageIdAsScala: Option[ImageIdentifier] = Option(self.imageId)

  final def failureCodeAsScala: Option[ImageFailureCode] = Option(self.failureCode)

  final def failureReasonAsScala: Option[String] = Option(self.failureReason)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToImageFailureOps {

  implicit def toImageFailureBuilderOps(v: ImageFailure.Builder): ImageFailureBuilderOps = new ImageFailureBuilderOps(v)

  implicit def toImageFailureOps(v: ImageFailure): ImageFailureOps = new ImageFailureOps(v)

}
