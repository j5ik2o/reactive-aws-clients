// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class DeleteParameterGroupRequestBuilderOps(val self: DeleteParameterGroupRequest.Builder) extends AnyVal {

  final def withParameterGroupNameAsScala(value: Option[String]): DeleteParameterGroupRequest.Builder = {
    value.fold(self) { v =>
      self.parameterGroupName(v)
    }
  } // String

}

final class DeleteParameterGroupRequestOps(val self: DeleteParameterGroupRequest) extends AnyVal {

  final def parameterGroupNameAsScala: Option[String] = Option(self.parameterGroupName) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteParameterGroupRequestOps {

  implicit def toDeleteParameterGroupRequestBuilderOps(
      v: DeleteParameterGroupRequest.Builder
  ): DeleteParameterGroupRequestBuilderOps = new DeleteParameterGroupRequestBuilderOps(v)

  implicit def toDeleteParameterGroupRequestOps(v: DeleteParameterGroupRequest): DeleteParameterGroupRequestOps =
    new DeleteParameterGroupRequestOps(v)

}
