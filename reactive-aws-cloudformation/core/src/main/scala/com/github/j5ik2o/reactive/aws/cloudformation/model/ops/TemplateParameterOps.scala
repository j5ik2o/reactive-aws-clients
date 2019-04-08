// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class TemplateParameterBuilderOps(val self: TemplateParameter.Builder) extends AnyVal {

  final def parameterKeyAsScala(value: Option[String]): TemplateParameter.Builder = {
    value.fold(self) { v =>
      self.parameterKey(v)
    }
  } // String

  final def defaultValueAsScala(value: Option[String]): TemplateParameter.Builder = {
    value.fold(self) { v =>
      self.defaultValue(v)
    }
  } // String

  final def noEchoAsScala(value: Option[Boolean]): TemplateParameter.Builder = {
    value.fold(self) { v =>
      self.noEcho(v)
    }
  } // Boolean

  final def descriptionAsScala(value: Option[String]): TemplateParameter.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  } // String

}

final class TemplateParameterOps(val self: TemplateParameter) extends AnyVal {

  final def parameterKeyAsScala: Option[String] = Option(self.parameterKey) // String

  final def defaultValueAsScala: Option[String] = Option(self.defaultValue) // String

  final def noEchoAsScala: Option[Boolean] = Option(self.noEcho) // Boolean

  final def descriptionAsScala: Option[String] = Option(self.description) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTemplateParameterOps {

  implicit def toTemplateParameterBuilderOps(v: TemplateParameter.Builder): TemplateParameterBuilderOps =
    new TemplateParameterBuilderOps(v)

  implicit def toTemplateParameterOps(v: TemplateParameter): TemplateParameterOps = new TemplateParameterOps(v)

}
