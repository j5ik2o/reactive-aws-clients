// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class ConfigurationOptionSettingBuilderOps(val self: ConfigurationOptionSetting.Builder) extends AnyVal {

  final def resourceNameAsScala(value: Option[String]): ConfigurationOptionSetting.Builder = {
    value.fold(self) { v =>
      self.resourceName(v)
    }
  } // String

  final def namespaceAsScala(value: Option[String]): ConfigurationOptionSetting.Builder = {
    value.fold(self) { v =>
      self.namespace(v)
    }
  } // String

  final def optionNameAsScala(value: Option[String]): ConfigurationOptionSetting.Builder = {
    value.fold(self) { v =>
      self.optionName(v)
    }
  } // String

  final def valueAsScala(value: Option[String]): ConfigurationOptionSetting.Builder = {
    value.fold(self) { v =>
      self.value(v)
    }
  } // String

}

final class ConfigurationOptionSettingOps(val self: ConfigurationOptionSetting) extends AnyVal {

  final def resourceNameAsScala: Option[String] = Option(self.resourceName) // String

  final def namespaceAsScala: Option[String] = Option(self.namespace) // String

  final def optionNameAsScala: Option[String] = Option(self.optionName) // String

  final def valueAsScala: Option[String] = Option(self.value) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToConfigurationOptionSettingOps {

  implicit def toConfigurationOptionSettingBuilderOps(
      v: ConfigurationOptionSetting.Builder
  ): ConfigurationOptionSettingBuilderOps = new ConfigurationOptionSettingBuilderOps(v)

  implicit def toConfigurationOptionSettingOps(v: ConfigurationOptionSetting): ConfigurationOptionSettingOps =
    new ConfigurationOptionSettingOps(v)

}
