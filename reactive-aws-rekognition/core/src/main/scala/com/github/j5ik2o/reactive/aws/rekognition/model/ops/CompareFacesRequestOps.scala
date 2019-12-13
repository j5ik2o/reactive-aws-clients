// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class CompareFacesRequestBuilderOps(val self: CompareFacesRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceImageAsScala(value: Option[Image]): CompareFacesRequest.Builder = {
    value.fold(self) { v =>
      self.sourceImage(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def targetImageAsScala(value: Option[Image]): CompareFacesRequest.Builder = {
    value.fold(self) { v =>
      self.targetImage(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def similarityThresholdAsScala(value: Option[Float]): CompareFacesRequest.Builder = {
    value.fold(self) { v =>
      self.similarityThreshold(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def qualityFilterAsScala(value: Option[QualityFilter]): CompareFacesRequest.Builder = {
    value.fold(self) { v =>
      self.qualityFilter(v)
    }
  }

}

final class CompareFacesRequestOps(val self: CompareFacesRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceImageAsScala: Option[Image] = Option(self.sourceImage)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def targetImageAsScala: Option[Image] = Option(self.targetImage)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def similarityThresholdAsScala: Option[Float] = Option(self.similarityThreshold)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def qualityFilterAsScala: Option[QualityFilter] = Option(self.qualityFilter)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCompareFacesRequestOps {

  implicit def toCompareFacesRequestBuilderOps(v: CompareFacesRequest.Builder): CompareFacesRequestBuilderOps =
    new CompareFacesRequestBuilderOps(v)

  implicit def toCompareFacesRequestOps(v: CompareFacesRequest): CompareFacesRequestOps = new CompareFacesRequestOps(v)

}
