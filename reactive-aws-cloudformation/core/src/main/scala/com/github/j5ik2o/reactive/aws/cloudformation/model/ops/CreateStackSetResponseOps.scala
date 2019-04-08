// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class CreateStackSetResponseBuilderOps(val self: CreateStackSetResponse.Builder) extends AnyVal {

  final def stackSetIdAsScala(value: Option[String]): CreateStackSetResponse.Builder = {
    value.fold(self) { v =>
      self.stackSetId(v)
    }
  }

}

final class CreateStackSetResponseOps(val self: CreateStackSetResponse) extends AnyVal {

  final def stackSetIdAsScala: Option[String] = Option(self.stackSetId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateStackSetResponseOps {

  implicit def toCreateStackSetResponseBuilderOps(v: CreateStackSetResponse.Builder): CreateStackSetResponseBuilderOps =
    new CreateStackSetResponseBuilderOps(v)

  implicit def toCreateStackSetResponseOps(v: CreateStackSetResponse): CreateStackSetResponseOps =
    new CreateStackSetResponseOps(v)

}
