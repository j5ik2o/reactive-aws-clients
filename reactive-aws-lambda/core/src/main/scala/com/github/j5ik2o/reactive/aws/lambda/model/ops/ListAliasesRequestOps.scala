// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class ListAliasesRequestBuilderOps(val self: ListAliasesRequest.Builder) extends AnyVal {

  final def functionNameAsScala(value: Option[String]): ListAliasesRequest.Builder = {
    value.fold(self) { v =>
      self.functionName(v)
    }
  } // String

  final def functionVersionAsScala(value: Option[String]): ListAliasesRequest.Builder = {
    value.fold(self) { v =>
      self.functionVersion(v)
    }
  } // String

  final def markerAsScala(value: Option[String]): ListAliasesRequest.Builder = {
    value.fold(self) { v =>
      self.marker(v)
    }
  } // String

  final def maxItemsAsScala(value: Option[Int]): ListAliasesRequest.Builder = {
    value.fold(self) { v =>
      self.maxItems(v)
    }
  } // Int

}

final class ListAliasesRequestOps(val self: ListAliasesRequest) extends AnyVal {

  final def functionNameAsScala: Option[String] = Option(self.functionName) // String

  final def functionVersionAsScala: Option[String] = Option(self.functionVersion) // String

  final def markerAsScala: Option[String] = Option(self.marker) // String

  final def maxItemsAsScala: Option[Int] = Option(self.maxItems) // Int

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListAliasesRequestOps {

  implicit def toListAliasesRequestBuilderOps(v: ListAliasesRequest.Builder): ListAliasesRequestBuilderOps =
    new ListAliasesRequestBuilderOps(v)

  implicit def toListAliasesRequestOps(v: ListAliasesRequest): ListAliasesRequestOps = new ListAliasesRequestOps(v)

}
