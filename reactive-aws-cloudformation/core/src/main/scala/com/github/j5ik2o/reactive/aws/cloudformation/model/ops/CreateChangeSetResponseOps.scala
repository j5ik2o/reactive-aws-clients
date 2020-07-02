// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class CreateChangeSetResponseBuilderOps(val self: CreateChangeSetResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def idAsScala(value: Option[String]): CreateChangeSetResponse.Builder = {
    value.fold(self) { v => self.id(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackIdAsScala(value: Option[String]): CreateChangeSetResponse.Builder = {
    value.fold(self) { v => self.stackId(v) }
  }

}

final class CreateChangeSetResponseOps(val self: CreateChangeSetResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def idAsScala: Option[String] = Option(self.id)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackIdAsScala: Option[String] = Option(self.stackId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateChangeSetResponseOps {

  implicit def toCreateChangeSetResponseBuilderOps(
      v: CreateChangeSetResponse.Builder
  ): CreateChangeSetResponseBuilderOps = new CreateChangeSetResponseBuilderOps(v)

  implicit def toCreateChangeSetResponseOps(v: CreateChangeSetResponse): CreateChangeSetResponseOps =
    new CreateChangeSetResponseOps(v)

}
