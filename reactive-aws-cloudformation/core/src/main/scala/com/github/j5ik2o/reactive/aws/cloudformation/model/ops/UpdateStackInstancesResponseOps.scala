// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class UpdateStackInstancesResponseBuilderOps(val self: UpdateStackInstancesResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def operationIdAsScala(value: Option[String]): UpdateStackInstancesResponse.Builder = {
    value.fold(self) { v =>
      self.operationId(v)
    }
  }

}

final class UpdateStackInstancesResponseOps(val self: UpdateStackInstancesResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def operationIdAsScala: Option[String] = Option(self.operationId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateStackInstancesResponseOps {

  implicit def toUpdateStackInstancesResponseBuilderOps(
      v: UpdateStackInstancesResponse.Builder
  ): UpdateStackInstancesResponseBuilderOps = new UpdateStackInstancesResponseBuilderOps(v)

  implicit def toUpdateStackInstancesResponseOps(v: UpdateStackInstancesResponse): UpdateStackInstancesResponseOps =
    new UpdateStackInstancesResponseOps(v)

}
