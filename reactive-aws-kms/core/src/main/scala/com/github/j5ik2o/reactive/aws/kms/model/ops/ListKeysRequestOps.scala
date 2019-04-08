// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class ListKeysRequestBuilderOps(val self: ListKeysRequest.Builder) extends AnyVal {

  final def limitAsScala(value: Option[Int]): ListKeysRequest.Builder = {
    value.fold(self) { v =>
      self.limit(v)
    }
  }

  final def markerAsScala(value: Option[String]): ListKeysRequest.Builder = {
    value.fold(self) { v =>
      self.marker(v)
    }
  }

}

final class ListKeysRequestOps(val self: ListKeysRequest) extends AnyVal {

  final def limitAsScala: Option[Int] = Option(self.limit)

  final def markerAsScala: Option[String] = Option(self.marker)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListKeysRequestOps {

  implicit def toListKeysRequestBuilderOps(v: ListKeysRequest.Builder): ListKeysRequestBuilderOps =
    new ListKeysRequestBuilderOps(v)

  implicit def toListKeysRequestOps(v: ListKeysRequest): ListKeysRequestOps = new ListKeysRequestOps(v)

}
