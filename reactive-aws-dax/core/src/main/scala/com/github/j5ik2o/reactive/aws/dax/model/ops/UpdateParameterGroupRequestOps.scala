// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class UpdateParameterGroupRequestBuilderOps(val self: UpdateParameterGroupRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def parameterGroupNameAsScala(value: Option[String]): UpdateParameterGroupRequest.Builder = {
    value.fold(self) { v =>
      self.parameterGroupName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def parameterNameValuesAsScala(value: Option[Seq[ParameterNameValue]]): UpdateParameterGroupRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.parameterNameValues(v.asJava)
    }
  }

}

final class UpdateParameterGroupRequestOps(val self: UpdateParameterGroupRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def parameterGroupNameAsScala: Option[String] = Option(self.parameterGroupName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def parameterNameValuesAsScala: Option[Seq[ParameterNameValue]] = Option(self.parameterNameValues).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateParameterGroupRequestOps {

  implicit def toUpdateParameterGroupRequestBuilderOps(
      v: UpdateParameterGroupRequest.Builder
  ): UpdateParameterGroupRequestBuilderOps = new UpdateParameterGroupRequestBuilderOps(v)

  implicit def toUpdateParameterGroupRequestOps(v: UpdateParameterGroupRequest): UpdateParameterGroupRequestOps =
    new UpdateParameterGroupRequestOps(v)

}
