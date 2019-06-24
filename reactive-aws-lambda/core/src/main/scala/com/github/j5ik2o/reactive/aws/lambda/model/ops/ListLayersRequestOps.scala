// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class ListLayersRequestBuilderOps(val self: ListLayersRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def compatibleRuntimeAsScala(value: Option[Runtime]): ListLayersRequest.Builder = {
    value.fold(self) { v =>
      self.compatibleRuntime(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def markerAsScala(value: Option[String]): ListLayersRequest.Builder = {
    value.fold(self) { v =>
      self.marker(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxItemsAsScala(value: Option[Int]): ListLayersRequest.Builder = {
    value.fold(self) { v =>
      self.maxItems(v)
    }
  }

}

final class ListLayersRequestOps(val self: ListLayersRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def compatibleRuntimeAsScala: Option[Runtime] = Option(self.compatibleRuntime)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def markerAsScala: Option[String] = Option(self.marker)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxItemsAsScala: Option[Int] = Option(self.maxItems)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListLayersRequestOps {

  implicit def toListLayersRequestBuilderOps(v: ListLayersRequest.Builder): ListLayersRequestBuilderOps =
    new ListLayersRequestBuilderOps(v)

  implicit def toListLayersRequestOps(v: ListLayersRequest): ListLayersRequestOps = new ListLayersRequestOps(v)

}
