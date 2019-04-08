// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class ListLayersRequestBuilderOps(val self: ListLayersRequest.Builder) extends AnyVal {

  final def compatibleRuntimeAsScala(value: Option[Runtime]): ListLayersRequest.Builder = {
    value.fold(self) { v =>
      self.compatibleRuntime(v)
    }
  } // Runtime

  final def markerAsScala(value: Option[String]): ListLayersRequest.Builder = {
    value.fold(self) { v =>
      self.marker(v)
    }
  } // String

  final def maxItemsAsScala(value: Option[Int]): ListLayersRequest.Builder = {
    value.fold(self) { v =>
      self.maxItems(v)
    }
  } // Int

}

final class ListLayersRequestOps(val self: ListLayersRequest) extends AnyVal {

  final def compatibleRuntimeAsScala: Option[Runtime] = Option(self.compatibleRuntime) // Runtime

  final def markerAsScala: Option[String] = Option(self.marker) // String

  final def maxItemsAsScala: Option[Int] = Option(self.maxItems) // Int

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListLayersRequestOps {

  implicit def toListLayersRequestBuilderOps(v: ListLayersRequest.Builder): ListLayersRequestBuilderOps =
    new ListLayersRequestBuilderOps(v)

  implicit def toListLayersRequestOps(v: ListLayersRequest): ListLayersRequestOps = new ListLayersRequestOps(v)

}
