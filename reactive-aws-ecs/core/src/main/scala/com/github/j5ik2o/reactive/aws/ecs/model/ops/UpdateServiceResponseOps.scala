// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class UpdateServiceResponseBuilderOps(val self: UpdateServiceResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serviceAsScala(value: Option[Service]): UpdateServiceResponse.Builder = {
    value.fold(self) { v =>
      self.service(v)
    }
  }

}

final class UpdateServiceResponseOps(val self: UpdateServiceResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serviceAsScala: Option[Service] = Option(self.service)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateServiceResponseOps {

  implicit def toUpdateServiceResponseBuilderOps(v: UpdateServiceResponse.Builder): UpdateServiceResponseBuilderOps =
    new UpdateServiceResponseBuilderOps(v)

  implicit def toUpdateServiceResponseOps(v: UpdateServiceResponse): UpdateServiceResponseOps =
    new UpdateServiceResponseOps(v)

}
