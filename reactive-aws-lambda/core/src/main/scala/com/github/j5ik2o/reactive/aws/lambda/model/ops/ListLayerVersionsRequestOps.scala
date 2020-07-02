// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class ListLayerVersionsRequestBuilderOps(val self: ListLayerVersionsRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def compatibleRuntimeAsScala(value: Option[Runtime]): ListLayerVersionsRequest.Builder = {
    value.fold(self) { v => self.compatibleRuntime(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def layerNameAsScala(value: Option[String]): ListLayerVersionsRequest.Builder = {
    value.fold(self) { v => self.layerName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def markerAsScala(value: Option[String]): ListLayerVersionsRequest.Builder = {
    value.fold(self) { v => self.marker(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxItemsAsScala(value: Option[Int]): ListLayerVersionsRequest.Builder = {
    value.fold(self) { v => self.maxItems(v) }
  }

}

final class ListLayerVersionsRequestOps(val self: ListLayerVersionsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def compatibleRuntimeAsScala: Option[Runtime] = Option(self.compatibleRuntime)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def layerNameAsScala: Option[String] = Option(self.layerName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def markerAsScala: Option[String] = Option(self.marker)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
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
