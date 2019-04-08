// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class ListFunctionsRequestBuilderOps(val self: ListFunctionsRequest.Builder) extends AnyVal {

  final def masterRegionAsScala(value: Option[String]): ListFunctionsRequest.Builder = {
    value.fold(self) { v =>
      self.masterRegion(v)
    }
  }

  final def functionVersionAsScala(value: Option[FunctionVersion]): ListFunctionsRequest.Builder = {
    value.fold(self) { v =>
      self.functionVersion(v)
    }
  }

  final def markerAsScala(value: Option[String]): ListFunctionsRequest.Builder = {
    value.fold(self) { v =>
      self.marker(v)
    }
  }

  final def maxItemsAsScala(value: Option[Int]): ListFunctionsRequest.Builder = {
    value.fold(self) { v =>
      self.maxItems(v)
    }
  }

}

final class ListFunctionsRequestOps(val self: ListFunctionsRequest) extends AnyVal {

  final def masterRegionAsScala: Option[String] = Option(self.masterRegion)

  final def functionVersionAsScala: Option[FunctionVersion] = Option(self.functionVersion)

  final def markerAsScala: Option[String] = Option(self.marker)

  final def maxItemsAsScala: Option[Int] = Option(self.maxItems)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListFunctionsRequestOps {

  implicit def toListFunctionsRequestBuilderOps(v: ListFunctionsRequest.Builder): ListFunctionsRequestBuilderOps =
    new ListFunctionsRequestBuilderOps(v)

  implicit def toListFunctionsRequestOps(v: ListFunctionsRequest): ListFunctionsRequestOps =
    new ListFunctionsRequestOps(v)

}
