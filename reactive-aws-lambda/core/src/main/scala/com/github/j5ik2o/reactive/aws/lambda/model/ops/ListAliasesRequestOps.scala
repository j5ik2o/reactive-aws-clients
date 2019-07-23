// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class ListAliasesRequestBuilderOps(val self: ListAliasesRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionNameAsScala(value: Option[String]): ListAliasesRequest.Builder = {
    value.fold(self) { v =>
      self.functionName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionVersionAsScala(value: Option[String]): ListAliasesRequest.Builder = {
    value.fold(self) { v =>
      self.functionVersion(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def markerAsScala(value: Option[String]): ListAliasesRequest.Builder = {
    value.fold(self) { v =>
      self.marker(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxItemsAsScala(value: Option[Int]): ListAliasesRequest.Builder = {
    value.fold(self) { v =>
      self.maxItems(v)
    }
  }

}

final class ListAliasesRequestOps(val self: ListAliasesRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionNameAsScala: Option[String] = Option(self.functionName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionVersionAsScala: Option[String] = Option(self.functionVersion)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def markerAsScala: Option[String] = Option(self.marker)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxItemsAsScala: Option[Int] = Option(self.maxItems)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListAliasesRequestOps {

  implicit def toListAliasesRequestBuilderOps(v: ListAliasesRequest.Builder): ListAliasesRequestBuilderOps =
    new ListAliasesRequestBuilderOps(v)

  implicit def toListAliasesRequestOps(v: ListAliasesRequest): ListAliasesRequestOps = new ListAliasesRequestOps(v)

}
