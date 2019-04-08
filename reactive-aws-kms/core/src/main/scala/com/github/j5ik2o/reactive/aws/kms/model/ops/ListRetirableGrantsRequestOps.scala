// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class ListRetirableGrantsRequestBuilderOps(val self: ListRetirableGrantsRequest.Builder) extends AnyVal {

  final def limitAsScala(value: Option[Int]): ListRetirableGrantsRequest.Builder = {
    value.fold(self) { v =>
      self.limit(v)
    }
  }

  final def markerAsScala(value: Option[String]): ListRetirableGrantsRequest.Builder = {
    value.fold(self) { v =>
      self.marker(v)
    }
  }

  final def retiringPrincipalAsScala(value: Option[String]): ListRetirableGrantsRequest.Builder = {
    value.fold(self) { v =>
      self.retiringPrincipal(v)
    }
  }

}

final class ListRetirableGrantsRequestOps(val self: ListRetirableGrantsRequest) extends AnyVal {

  final def limitAsScala: Option[Int] = Option(self.limit)

  final def markerAsScala: Option[String] = Option(self.marker)

  final def retiringPrincipalAsScala: Option[String] = Option(self.retiringPrincipal)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListRetirableGrantsRequestOps {

  implicit def toListRetirableGrantsRequestBuilderOps(
      v: ListRetirableGrantsRequest.Builder
  ): ListRetirableGrantsRequestBuilderOps = new ListRetirableGrantsRequestBuilderOps(v)

  implicit def toListRetirableGrantsRequestOps(v: ListRetirableGrantsRequest): ListRetirableGrantsRequestOps =
    new ListRetirableGrantsRequestOps(v)

}
