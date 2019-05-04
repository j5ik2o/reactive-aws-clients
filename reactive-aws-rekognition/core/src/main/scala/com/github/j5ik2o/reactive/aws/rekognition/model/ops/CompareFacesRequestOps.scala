// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class CompareFacesRequestBuilderOps(val self: CompareFacesRequest.Builder) extends AnyVal {

  final def sourceImageAsScala(value: Option[Image]): CompareFacesRequest.Builder = {
    value.fold(self) { v =>
      self.sourceImage(v)
    }
  }

  final def targetImageAsScala(value: Option[Image]): CompareFacesRequest.Builder = {
    value.fold(self) { v =>
      self.targetImage(v)
    }
  }

  final def similarityThresholdAsScala(value: Option[Float]): CompareFacesRequest.Builder = {
    value.fold(self) { v =>
      self.similarityThreshold(v)
    }
  }

}

final class CompareFacesRequestOps(val self: CompareFacesRequest) extends AnyVal {

  final def sourceImageAsScala: Option[Image] = Option(self.sourceImage)

  final def targetImageAsScala: Option[Image] = Option(self.targetImage)

  final def similarityThresholdAsScala: Option[Float] = Option(self.similarityThreshold)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCompareFacesRequestOps {

  implicit def toCompareFacesRequestBuilderOps(v: CompareFacesRequest.Builder): CompareFacesRequestBuilderOps =
    new CompareFacesRequestBuilderOps(v)

  implicit def toCompareFacesRequestOps(v: CompareFacesRequest): CompareFacesRequestOps = new CompareFacesRequestOps(v)

}
