// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class ListKeyPoliciesRequestBuilderOps(val self: ListKeyPoliciesRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyIdAsScala(value: Option[String]): ListKeyPoliciesRequest.Builder = {
    value.fold(self) { v =>
      self.keyId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def limitAsScala(value: Option[Int]): ListKeyPoliciesRequest.Builder = {
    value.fold(self) { v =>
      self.limit(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def markerAsScala(value: Option[String]): ListKeyPoliciesRequest.Builder = {
    value.fold(self) { v =>
      self.marker(v)
    }
  }

}

final class ListKeyPoliciesRequestOps(val self: ListKeyPoliciesRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyIdAsScala: Option[String] = Option(self.keyId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def limitAsScala: Option[Int] = Option(self.limit)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def markerAsScala: Option[String] = Option(self.marker)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListKeyPoliciesRequestOps {

  implicit def toListKeyPoliciesRequestBuilderOps(v: ListKeyPoliciesRequest.Builder): ListKeyPoliciesRequestBuilderOps =
    new ListKeyPoliciesRequestBuilderOps(v)

  implicit def toListKeyPoliciesRequestOps(v: ListKeyPoliciesRequest): ListKeyPoliciesRequestOps =
    new ListKeyPoliciesRequestOps(v)

}
