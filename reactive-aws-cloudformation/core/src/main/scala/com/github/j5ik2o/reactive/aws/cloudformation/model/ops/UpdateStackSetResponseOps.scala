// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class UpdateStackSetResponseBuilderOps(val self: UpdateStackSetResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def operationIdAsScala(value: Option[String]): UpdateStackSetResponse.Builder = {
    value.fold(self) { v => self.operationId(v) }
  }

}

final class UpdateStackSetResponseOps(val self: UpdateStackSetResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def operationIdAsScala: Option[String] = Option(self.operationId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateStackSetResponseOps {

  implicit def toUpdateStackSetResponseBuilderOps(v: UpdateStackSetResponse.Builder): UpdateStackSetResponseBuilderOps =
    new UpdateStackSetResponseBuilderOps(v)

  implicit def toUpdateStackSetResponseOps(v: UpdateStackSetResponse): UpdateStackSetResponseOps =
    new UpdateStackSetResponseOps(v)

}
