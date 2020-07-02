// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class UpdateStackResponseBuilderOps(val self: UpdateStackResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackIdAsScala(value: Option[String]): UpdateStackResponse.Builder = {
    value.fold(self) { v => self.stackId(v) }
  }

}

final class UpdateStackResponseOps(val self: UpdateStackResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackIdAsScala: Option[String] = Option(self.stackId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateStackResponseOps {

  implicit def toUpdateStackResponseBuilderOps(v: UpdateStackResponse.Builder): UpdateStackResponseBuilderOps =
    new UpdateStackResponseBuilderOps(v)

  implicit def toUpdateStackResponseOps(v: UpdateStackResponse): UpdateStackResponseOps = new UpdateStackResponseOps(v)

}
