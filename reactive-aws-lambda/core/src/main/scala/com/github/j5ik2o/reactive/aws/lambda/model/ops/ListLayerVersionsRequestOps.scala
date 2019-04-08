// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class ListLayerVersionsRequestBuilderOps(val self: ListLayerVersionsRequest.Builder) extends AnyVal {

  final def compatibleRuntimeAsScala(value: Option[Runtime]): ListLayerVersionsRequest.Builder = {
    value.fold(self) { v =>
      self.compatibleRuntime(v)
    }
  } // String

  final def layerNameAsScala(value: Option[String]): ListLayerVersionsRequest.Builder = {
    value.fold(self) { v =>
      self.layerName(v)
    }
  } // String

  final def markerAsScala(value: Option[String]): ListLayerVersionsRequest.Builder = {
    value.fold(self) { v =>
      self.marker(v)
    }
  } // String

  final def maxItemsAsScala(value: Option[Int]): ListLayerVersionsRequest.Builder = {
    value.fold(self) { v =>
      self.maxItems(v)
    }
  } // Int

}

final class ListLayerVersionsRequestOps(val self: ListLayerVersionsRequest) extends AnyVal {

  final def compatibleRuntimeAsScala: Option[Runtime] = Option(self.compatibleRuntime) // String

  final def layerNameAsScala: Option[String] = Option(self.layerName) // String

  final def markerAsScala: Option[String] = Option(self.marker) // String

  final def maxItemsAsScala: Option[Int] = Option(self.maxItems) // Int

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListLayerVersionsRequestOps {

  implicit def toListLayerVersionsRequestBuilderOps(
      v: ListLayerVersionsRequest.Builder
  ): ListLayerVersionsRequestBuilderOps = new ListLayerVersionsRequestBuilderOps(v)

  implicit def toListLayerVersionsRequestOps(v: ListLayerVersionsRequest): ListLayerVersionsRequestOps =
    new ListLayerVersionsRequestOps(v)

}
