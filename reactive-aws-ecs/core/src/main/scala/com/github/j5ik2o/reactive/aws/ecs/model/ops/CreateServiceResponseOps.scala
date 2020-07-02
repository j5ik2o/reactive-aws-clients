// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class CreateServiceResponseBuilderOps(val self: CreateServiceResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serviceAsScala(value: Option[Service]): CreateServiceResponse.Builder = {
    value.fold(self) { v => self.service(v) }
  }

}

final class CreateServiceResponseOps(val self: CreateServiceResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serviceAsScala: Option[Service] = Option(self.service)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateServiceResponseOps {

  implicit def toCreateServiceResponseBuilderOps(v: CreateServiceResponse.Builder): CreateServiceResponseBuilderOps =
    new CreateServiceResponseBuilderOps(v)

  implicit def toCreateServiceResponseOps(v: CreateServiceResponse): CreateServiceResponseOps =
    new CreateServiceResponseOps(v)

}
