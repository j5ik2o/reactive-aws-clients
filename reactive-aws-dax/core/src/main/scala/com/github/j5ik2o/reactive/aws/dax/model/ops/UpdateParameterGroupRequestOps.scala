// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class UpdateParameterGroupRequestBuilderOps(val self: UpdateParameterGroupRequest.Builder) extends AnyVal {

  final def withParameterGroupNameAsScala(value: Option[String]): UpdateParameterGroupRequest.Builder = {
    value.fold(self) { v =>
      self.parameterGroupName(v)
    }
  } // String

  final def withParameterNameValuesAsScala(
      value: Option[Seq[ParameterNameValue]]
  ): UpdateParameterGroupRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.parameterNameValues(v.asJava)
    } // Seq[ParameterNameValue]
  }

}

final class UpdateParameterGroupRequestOps(val self: UpdateParameterGroupRequest) extends AnyVal {

  final def parameterGroupNameAsScala: Option[String] = Option(self.parameterGroupName) // String

  final def parameterNameValuesAsScala: Option[Seq[ParameterNameValue]] = Option(self.parameterNameValues).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[ParameterNameValue]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateParameterGroupRequestOps {

  implicit def toUpdateParameterGroupRequestBuilderOps(
      v: UpdateParameterGroupRequest.Builder
  ): UpdateParameterGroupRequestBuilderOps = new UpdateParameterGroupRequestBuilderOps(v)

  implicit def toUpdateParameterGroupRequestOps(v: UpdateParameterGroupRequest): UpdateParameterGroupRequestOps =
    new UpdateParameterGroupRequestOps(v)

}
