// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class ConfigurationOptionSettingBuilderOps(val self: ConfigurationOptionSetting.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceNameAsScala(value: Option[String]): ConfigurationOptionSetting.Builder = {
    value.fold(self) { v => self.resourceName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def namespaceAsScala(value: Option[String]): ConfigurationOptionSetting.Builder = {
    value.fold(self) { v => self.namespace(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def optionNameAsScala(value: Option[String]): ConfigurationOptionSetting.Builder = {
    value.fold(self) { v => self.optionName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueAsScala(value: Option[String]): ConfigurationOptionSetting.Builder = {
    value.fold(self) { v => self.value(v) }
  }

}

final class ConfigurationOptionSettingOps(val self: ConfigurationOptionSetting) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceNameAsScala: Option[String] = Option(self.resourceName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def namespaceAsScala: Option[String] = Option(self.namespace)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def optionNameAsScala: Option[String] = Option(self.optionName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueAsScala: Option[String] = Option(self.value)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToConfigurationOptionSettingOps {

  implicit def toConfigurationOptionSettingBuilderOps(
      v: ConfigurationOptionSetting.Builder
  ): ConfigurationOptionSettingBuilderOps = new ConfigurationOptionSettingBuilderOps(v)

  implicit def toConfigurationOptionSettingOps(v: ConfigurationOptionSetting): ConfigurationOptionSettingOps =
    new ConfigurationOptionSettingOps(v)

}
