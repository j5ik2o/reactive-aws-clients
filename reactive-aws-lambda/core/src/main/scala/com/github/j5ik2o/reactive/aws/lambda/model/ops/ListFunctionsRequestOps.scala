// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class ListFunctionsRequestBuilderOps(val self: ListFunctionsRequest.Builder) extends AnyVal {

  final def masterRegionAsScala(value: Option[String]): ListFunctionsRequest.Builder = {
    value.fold(self) { v =>
      self.masterRegion(v)
    }
  } // String

  final def functionVersionAsScala(value: Option[FunctionVersion]): ListFunctionsRequest.Builder = {
    value.fold(self) { v =>
      self.functionVersion(v)
    }
  } // FunctionVersion

  final def markerAsScala(value: Option[String]): ListFunctionsRequest.Builder = {
    value.fold(self) { v =>
      self.marker(v)
    }
  } // String

  final def maxItemsAsScala(value: Option[Int]): ListFunctionsRequest.Builder = {
    value.fold(self) { v =>
      self.maxItems(v)
    }
  } // Int

}

final class ListFunctionsRequestOps(val self: ListFunctionsRequest) extends AnyVal {

  final def masterRegionAsScala: Option[String] = Option(self.masterRegion) // String

  final def functionVersionAsScala: Option[FunctionVersion] = Option(self.functionVersion) // FunctionVersion

  final def markerAsScala: Option[String] = Option(self.marker) // String

  final def maxItemsAsScala: Option[Int] = Option(self.maxItems) // Int

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListFunctionsRequestOps {

  implicit def toListFunctionsRequestBuilderOps(v: ListFunctionsRequest.Builder): ListFunctionsRequestBuilderOps =
    new ListFunctionsRequestBuilderOps(v)

  implicit def toListFunctionsRequestOps(v: ListFunctionsRequest): ListFunctionsRequestOps =
    new ListFunctionsRequestOps(v)

}
