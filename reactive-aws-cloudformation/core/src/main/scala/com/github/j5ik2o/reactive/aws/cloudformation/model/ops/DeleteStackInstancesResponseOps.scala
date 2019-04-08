// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class DeleteStackInstancesResponseBuilderOps(val self: DeleteStackInstancesResponse.Builder) extends AnyVal {

  final def operationIdAsScala(value: Option[String]): DeleteStackInstancesResponse.Builder = {
    value.fold(self) { v =>
      self.operationId(v)
    }
  }

}

final class DeleteStackInstancesResponseOps(val self: DeleteStackInstancesResponse) extends AnyVal {

  final def operationIdAsScala: Option[String] = Option(self.operationId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteStackInstancesResponseOps {

  implicit def toDeleteStackInstancesResponseBuilderOps(
      v: DeleteStackInstancesResponse.Builder
  ): DeleteStackInstancesResponseBuilderOps = new DeleteStackInstancesResponseBuilderOps(v)

  implicit def toDeleteStackInstancesResponseOps(v: DeleteStackInstancesResponse): DeleteStackInstancesResponseOps =
    new DeleteStackInstancesResponseOps(v)

}
