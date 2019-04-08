// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class GetTypeResponseBuilderOps(val self: GetTypeResponse.Builder) extends AnyVal {

  final def typeAsScala(value: Option[Type]): GetTypeResponse.Builder = {
    value.fold(self) { v =>
      self.`type`(v)
    }
  } // Type

}

final class GetTypeResponseOps(val self: GetTypeResponse) extends AnyVal {

  final def typeAsScala: Option[Type] = Option(self.`type`) // Type

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetTypeResponseOps {

  implicit def toGetTypeResponseBuilderOps(v: GetTypeResponse.Builder): GetTypeResponseBuilderOps =
    new GetTypeResponseBuilderOps(v)

  implicit def toGetTypeResponseOps(v: GetTypeResponse): GetTypeResponseOps = new GetTypeResponseOps(v)

}
