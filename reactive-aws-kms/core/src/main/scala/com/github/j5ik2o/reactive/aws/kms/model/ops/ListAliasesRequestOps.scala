// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class ListAliasesRequestBuilderOps(val self: ListAliasesRequest.Builder) extends AnyVal {

  final def keyIdAsScala(value: Option[String]): ListAliasesRequest.Builder = {
    value.fold(self) { v =>
      self.keyId(v)
    }
  }

  final def limitAsScala(value: Option[Int]): ListAliasesRequest.Builder = {
    value.fold(self) { v =>
      self.limit(v)
    }
  }

  final def markerAsScala(value: Option[String]): ListAliasesRequest.Builder = {
    value.fold(self) { v =>
      self.marker(v)
    }
  }

}

final class ListAliasesRequestOps(val self: ListAliasesRequest) extends AnyVal {

  final def keyIdAsScala: Option[String] = Option(self.keyId)

  final def limitAsScala: Option[Int] = Option(self.limit)

  final def markerAsScala: Option[String] = Option(self.marker)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListAliasesRequestOps {

  implicit def toListAliasesRequestBuilderOps(v: ListAliasesRequest.Builder): ListAliasesRequestBuilderOps =
    new ListAliasesRequestBuilderOps(v)

  implicit def toListAliasesRequestOps(v: ListAliasesRequest): ListAliasesRequestOps = new ListAliasesRequestOps(v)

}
