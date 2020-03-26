// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class DetectTextRequestBuilderOps(val self: DetectTextRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageAsScala(value: Option[Image]): DetectTextRequest.Builder = {
    value.fold(self) { v =>
      self.image(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filtersAsScala(value: Option[DetectTextFilters]): DetectTextRequest.Builder = {
    value.fold(self) { v =>
      self.filters(v)
    }
  }

}

final class DetectTextRequestOps(val self: DetectTextRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageAsScala: Option[Image] = Option(self.image)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filtersAsScala: Option[DetectTextFilters] = Option(self.filters)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDetectTextRequestOps {

  implicit def toDetectTextRequestBuilderOps(v: DetectTextRequest.Builder): DetectTextRequestBuilderOps =
    new DetectTextRequestBuilderOps(v)

  implicit def toDetectTextRequestOps(v: DetectTextRequest): DetectTextRequestOps = new DetectTextRequestOps(v)

}
