// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class ListVersionsByFunctionRequestBuilderOps(val self: ListVersionsByFunctionRequest.Builder) extends AnyVal {

  final def functionNameAsScala(value: Option[String]): ListVersionsByFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.functionName(v)
    }
  } // String

  final def markerAsScala(value: Option[String]): ListVersionsByFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.marker(v)
    }
  } // String

  final def maxItemsAsScala(value: Option[Int]): ListVersionsByFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.maxItems(v)
    }
  } // Int

}

final class ListVersionsByFunctionRequestOps(val self: ListVersionsByFunctionRequest) extends AnyVal {

  final def functionNameAsScala: Option[String] = Option(self.functionName) // String

  final def markerAsScala: Option[String] = Option(self.marker) // String

  final def maxItemsAsScala: Option[Int] = Option(self.maxItems) // Int

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListVersionsByFunctionRequestOps {

  implicit def toListVersionsByFunctionRequestBuilderOps(
      v: ListVersionsByFunctionRequest.Builder
  ): ListVersionsByFunctionRequestBuilderOps = new ListVersionsByFunctionRequestBuilderOps(v)

  implicit def toListVersionsByFunctionRequestOps(v: ListVersionsByFunctionRequest): ListVersionsByFunctionRequestOps =
    new ListVersionsByFunctionRequestOps(v)

}
