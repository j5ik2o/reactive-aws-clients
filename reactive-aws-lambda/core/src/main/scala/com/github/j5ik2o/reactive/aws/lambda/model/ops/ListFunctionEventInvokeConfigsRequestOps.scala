// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class ListFunctionEventInvokeConfigsRequestBuilderOps(val self: ListFunctionEventInvokeConfigsRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionNameAsScala(value: Option[String]): ListFunctionEventInvokeConfigsRequest.Builder = {
    value.fold(self) { v =>
      self.functionName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def markerAsScala(value: Option[String]): ListFunctionEventInvokeConfigsRequest.Builder = {
    value.fold(self) { v =>
      self.marker(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxItemsAsScala(value: Option[Int]): ListFunctionEventInvokeConfigsRequest.Builder = {
    value.fold(self) { v =>
      self.maxItems(v)
    }
  }

}

final class ListFunctionEventInvokeConfigsRequestOps(val self: ListFunctionEventInvokeConfigsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionNameAsScala: Option[String] = Option(self.functionName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def markerAsScala: Option[String] = Option(self.marker)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxItemsAsScala: Option[Int] = Option(self.maxItems)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListFunctionEventInvokeConfigsRequestOps {

  implicit def toListFunctionEventInvokeConfigsRequestBuilderOps(
      v: ListFunctionEventInvokeConfigsRequest.Builder
  ): ListFunctionEventInvokeConfigsRequestBuilderOps = new ListFunctionEventInvokeConfigsRequestBuilderOps(v)

  implicit def toListFunctionEventInvokeConfigsRequestOps(
      v: ListFunctionEventInvokeConfigsRequest
  ): ListFunctionEventInvokeConfigsRequestOps = new ListFunctionEventInvokeConfigsRequestOps(v)

}
