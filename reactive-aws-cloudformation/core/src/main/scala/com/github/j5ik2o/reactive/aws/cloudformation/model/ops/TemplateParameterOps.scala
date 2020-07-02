// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class TemplateParameterBuilderOps(val self: TemplateParameter.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def parameterKeyAsScala(value: Option[String]): TemplateParameter.Builder = {
    value.fold(self) { v => self.parameterKey(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def defaultValueAsScala(value: Option[String]): TemplateParameter.Builder = {
    value.fold(self) { v => self.defaultValue(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def noEchoAsScala(value: Option[Boolean]): TemplateParameter.Builder = {
    value.fold(self) { v => self.noEcho(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): TemplateParameter.Builder = {
    value.fold(self) { v => self.description(v) }
  }

}

final class TemplateParameterOps(val self: TemplateParameter) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def parameterKeyAsScala: Option[String] = Option(self.parameterKey)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def defaultValueAsScala: Option[String] = Option(self.defaultValue)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def noEchoAsScala: Option[Boolean] = Option(self.noEcho)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTemplateParameterOps {

  implicit def toTemplateParameterBuilderOps(v: TemplateParameter.Builder): TemplateParameterBuilderOps =
    new TemplateParameterBuilderOps(v)

  implicit def toTemplateParameterOps(v: TemplateParameter): TemplateParameterOps = new TemplateParameterOps(v)

}
