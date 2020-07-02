// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class CreateStackResponseBuilderOps(val self: CreateStackResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackIdAsScala(value: Option[String]): CreateStackResponse.Builder = {
    value.fold(self) { v => self.stackId(v) }
  }

}

final class CreateStackResponseOps(val self: CreateStackResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackIdAsScala: Option[String] = Option(self.stackId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateStackResponseOps {

  implicit def toCreateStackResponseBuilderOps(v: CreateStackResponse.Builder): CreateStackResponseBuilderOps =
    new CreateStackResponseBuilderOps(v)

  implicit def toCreateStackResponseOps(v: CreateStackResponse): CreateStackResponseOps = new CreateStackResponseOps(v)

}
