// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class DeleteServiceResponseBuilderOps(val self: DeleteServiceResponse.Builder) extends AnyVal {

  final def serviceAsScala(value: Option[Service]): DeleteServiceResponse.Builder = {
    value.fold(self) { v =>
      self.service(v)
    }
  }

}

final class DeleteServiceResponseOps(val self: DeleteServiceResponse) extends AnyVal {

  final def serviceAsScala: Option[Service] = Option(self.service)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteServiceResponseOps {

  implicit def toDeleteServiceResponseBuilderOps(v: DeleteServiceResponse.Builder): DeleteServiceResponseBuilderOps =
    new DeleteServiceResponseBuilderOps(v)

  implicit def toDeleteServiceResponseOps(v: DeleteServiceResponse): DeleteServiceResponseOps =
    new DeleteServiceResponseOps(v)

}
