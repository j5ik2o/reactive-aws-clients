// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class ParameterBuilderOps(val self: Parameter.Builder) extends AnyVal {

  final def parameterKeyAsScala(value: Option[String]): Parameter.Builder = {
    value.fold(self) { v =>
      self.parameterKey(v)
    }
  } // String

  final def parameterValueAsScala(value: Option[String]): Parameter.Builder = {
    value.fold(self) { v =>
      self.parameterValue(v)
    }
  } // String

  final def usePreviousValueAsScala(value: Option[Boolean]): Parameter.Builder = {
    value.fold(self) { v =>
      self.usePreviousValue(v)
    }
  } // Boolean

  final def resolvedValueAsScala(value: Option[String]): Parameter.Builder = {
    value.fold(self) { v =>
      self.resolvedValue(v)
    }
  } // String

}

final class ParameterOps(val self: Parameter) extends AnyVal {

  final def parameterKeyAsScala: Option[String] = Option(self.parameterKey) // String

  final def parameterValueAsScala: Option[String] = Option(self.parameterValue) // String

  final def usePreviousValueAsScala: Option[Boolean] = Option(self.usePreviousValue) // Boolean

  final def resolvedValueAsScala: Option[String] = Option(self.resolvedValue) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToParameterOps {

  implicit def toParameterBuilderOps(v: Parameter.Builder): ParameterBuilderOps = new ParameterBuilderOps(v)

  implicit def toParameterOps(v: Parameter): ParameterOps = new ParameterOps(v)

}
