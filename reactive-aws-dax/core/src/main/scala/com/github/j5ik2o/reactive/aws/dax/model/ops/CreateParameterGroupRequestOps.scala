// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class CreateParameterGroupRequestBuilderOps(val self: CreateParameterGroupRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def parameterGroupNameAsScala(value: Option[String]): CreateParameterGroupRequest.Builder = {
    value.fold(self) { v => self.parameterGroupName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): CreateParameterGroupRequest.Builder = {
    value.fold(self) { v => self.description(v) }
  }

}

final class CreateParameterGroupRequestOps(val self: CreateParameterGroupRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def parameterGroupNameAsScala: Option[String] = Option(self.parameterGroupName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateParameterGroupRequestOps {

  implicit def toCreateParameterGroupRequestBuilderOps(
      v: CreateParameterGroupRequest.Builder
  ): CreateParameterGroupRequestBuilderOps = new CreateParameterGroupRequestBuilderOps(v)

  implicit def toCreateParameterGroupRequestOps(v: CreateParameterGroupRequest): CreateParameterGroupRequestOps =
    new CreateParameterGroupRequestOps(v)

}
