// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class ParameterGroupBuilderOps(val self: ParameterGroup.Builder) extends AnyVal {

  final def withParameterGroupNameAsScala(value: Option[String]): ParameterGroup.Builder = {
    value.fold(self) { v =>
      self.parameterGroupName(v)
    }
  } // String

  final def withDescriptionAsScala(value: Option[String]): ParameterGroup.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  } // String

}

final class ParameterGroupOps(val self: ParameterGroup) extends AnyVal {

  final def parameterGroupNameAsScala: Option[String] = Option(self.parameterGroupName) // String

  final def descriptionAsScala: Option[String] = Option(self.description) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToParameterGroupOps {

  implicit def toParameterGroupBuilderOps(v: ParameterGroup.Builder): ParameterGroupBuilderOps =
    new ParameterGroupBuilderOps(v)

  implicit def toParameterGroupOps(v: ParameterGroup): ParameterGroupOps = new ParameterGroupOps(v)

}
