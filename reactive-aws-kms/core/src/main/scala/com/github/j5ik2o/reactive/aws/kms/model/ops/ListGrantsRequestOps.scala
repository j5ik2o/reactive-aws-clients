// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class ListGrantsRequestBuilderOps(val self: ListGrantsRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def limitAsScala(value: Option[Int]): ListGrantsRequest.Builder = {
    value.fold(self) { v =>
      self.limit(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def markerAsScala(value: Option[String]): ListGrantsRequest.Builder = {
    value.fold(self) { v =>
      self.marker(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyIdAsScala(value: Option[String]): ListGrantsRequest.Builder = {
    value.fold(self) { v =>
      self.keyId(v)
    }
  }

}

final class ListGrantsRequestOps(val self: ListGrantsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def limitAsScala: Option[Int] = Option(self.limit)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def markerAsScala: Option[String] = Option(self.marker)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyIdAsScala: Option[String] = Option(self.keyId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListGrantsRequestOps {

  implicit def toListGrantsRequestBuilderOps(v: ListGrantsRequest.Builder): ListGrantsRequestBuilderOps =
    new ListGrantsRequestBuilderOps(v)

  implicit def toListGrantsRequestOps(v: ListGrantsRequest): ListGrantsRequestOps = new ListGrantsRequestOps(v)

}
