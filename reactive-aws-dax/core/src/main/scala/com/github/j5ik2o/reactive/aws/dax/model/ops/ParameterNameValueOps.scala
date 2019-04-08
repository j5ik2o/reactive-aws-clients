// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class ParameterNameValueBuilderOps(val self: ParameterNameValue.Builder) extends AnyVal {

  final def parameterNameAsScala(value: Option[String]): ParameterNameValue.Builder = {
    value.fold(self) { v =>
      self.parameterName(v)
    }
  }

  final def parameterValueAsScala(value: Option[String]): ParameterNameValue.Builder = {
    value.fold(self) { v =>
      self.parameterValue(v)
    }
  }

}

final class ParameterNameValueOps(val self: ParameterNameValue) extends AnyVal {

  final def parameterNameAsScala: Option[String] = Option(self.parameterName)

  final def parameterValueAsScala: Option[String] = Option(self.parameterValue)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToParameterNameValueOps {

  implicit def toParameterNameValueBuilderOps(v: ParameterNameValue.Builder): ParameterNameValueBuilderOps =
    new ParameterNameValueBuilderOps(v)

  implicit def toParameterNameValueOps(v: ParameterNameValue): ParameterNameValueOps = new ParameterNameValueOps(v)

}
