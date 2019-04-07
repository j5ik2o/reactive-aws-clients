// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class ParameterNameValueBuilderOps(val self: ParameterNameValue.Builder) extends AnyVal {

  final def withParameterNameAsScala(value: Option[String]): ParameterNameValue.Builder = {
    value.fold(self) { v =>
      self.parameterName(v)
    }
  } // String

  final def withParameterValueAsScala(value: Option[String]): ParameterNameValue.Builder = {
    value.fold(self) { v =>
      self.parameterValue(v)
    }
  } // String

}

final class ParameterNameValueOps(val self: ParameterNameValue) extends AnyVal {

  final def parameterNameAsScala: Option[String] = Option(self.parameterName) // String

  final def parameterValueAsScala: Option[String] = Option(self.parameterValue) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToParameterNameValueOps {

  implicit def toParameterNameValueBuilderOps(v: ParameterNameValue.Builder): ParameterNameValueBuilderOps =
    new ParameterNameValueBuilderOps(v)

  implicit def toParameterNameValueOps(v: ParameterNameValue): ParameterNameValueOps = new ParameterNameValueOps(v)

}
