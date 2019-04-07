// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class CreateParameterGroupRequestBuilderOps(val self: CreateParameterGroupRequest.Builder) extends AnyVal {

  final def withParameterGroupNameAsScala(value: Option[String]): CreateParameterGroupRequest.Builder = {
    value.fold(self) { v =>
      self.parameterGroupName(v)
    }
  } // String

  final def withDescriptionAsScala(value: Option[String]): CreateParameterGroupRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  } // String

}

final class CreateParameterGroupRequestOps(val self: CreateParameterGroupRequest) extends AnyVal {

  final def parameterGroupNameAsScala: Option[String] = Option(self.parameterGroupName) // String

  final def descriptionAsScala: Option[String] = Option(self.description) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateParameterGroupRequestOps {

  implicit def toCreateParameterGroupRequestBuilderOps(
      v: CreateParameterGroupRequest.Builder
  ): CreateParameterGroupRequestBuilderOps = new CreateParameterGroupRequestBuilderOps(v)

  implicit def toCreateParameterGroupRequestOps(v: CreateParameterGroupRequest): CreateParameterGroupRequestOps =
    new CreateParameterGroupRequestOps(v)

}
