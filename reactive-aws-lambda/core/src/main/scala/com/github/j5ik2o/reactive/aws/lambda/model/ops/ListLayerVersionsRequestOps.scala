// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class ListLayerVersionsRequestBuilderOps(val self: ListLayerVersionsRequest.Builder) extends AnyVal {

  final def compatibleRuntimeAsScala(value: Option[Runtime]): ListLayerVersionsRequest.Builder = {
    value.fold(self) { v =>
      self.compatibleRuntime(v)
    }
  }

  final def layerNameAsScala(value: Option[String]): ListLayerVersionsRequest.Builder = {
    value.fold(self) { v =>
      self.layerName(v)
    }
  }

  final def markerAsScala(value: Option[String]): ListLayerVersionsRequest.Builder = {
    value.fold(self) { v =>
      self.marker(v)
    }
  }

  final def maxItemsAsScala(value: Option[Int]): ListLayerVersionsRequest.Builder = {
    value.fold(self) { v =>
      self.maxItems(v)
    }
  }

}

final class ListLayerVersionsRequestOps(val self: ListLayerVersionsRequest) extends AnyVal {

  final def compatibleRuntimeAsScala: Option[Runtime] = Option(self.compatibleRuntime)

  final def layerNameAsScala: Option[String] = Option(self.layerName)

  final def markerAsScala: Option[String] = Option(self.marker)

  final def maxItemsAsScala: Option[Int] = Option(self.maxItems)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListLayerVersionsRequestOps {

  implicit def toListLayerVersionsRequestBuilderOps(
      v: ListLayerVersionsRequest.Builder
  ): ListLayerVersionsRequestBuilderOps = new ListLayerVersionsRequestBuilderOps(v)

  implicit def toListLayerVersionsRequestOps(v: ListLayerVersionsRequest): ListLayerVersionsRequestOps =
    new ListLayerVersionsRequestOps(v)

}
