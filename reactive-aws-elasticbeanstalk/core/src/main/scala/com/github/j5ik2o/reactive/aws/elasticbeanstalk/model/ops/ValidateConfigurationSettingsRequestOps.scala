// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class ValidateConfigurationSettingsRequestBuilderOps(val self: ValidateConfigurationSettingsRequest.Builder)
    extends AnyVal {

  final def applicationNameAsScala(value: Option[String]): ValidateConfigurationSettingsRequest.Builder = {
    value.fold(self) { v =>
      self.applicationName(v)
    }
  }

  final def templateNameAsScala(value: Option[String]): ValidateConfigurationSettingsRequest.Builder = {
    value.fold(self) { v =>
      self.templateName(v)
    }
  }

  final def environmentNameAsScala(value: Option[String]): ValidateConfigurationSettingsRequest.Builder = {
    value.fold(self) { v =>
      self.environmentName(v)
    }
  }

  final def optionSettingsAsScala(
      value: Option[Seq[ConfigurationOptionSetting]]
  ): ValidateConfigurationSettingsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.optionSettings(v.asJava)
    }
  }

}

final class ValidateConfigurationSettingsRequestOps(val self: ValidateConfigurationSettingsRequest) extends AnyVal {

  final def applicationNameAsScala: Option[String] = Option(self.applicationName)

  final def templateNameAsScala: Option[String] = Option(self.templateName)

  final def environmentNameAsScala: Option[String] = Option(self.environmentName)

  final def optionSettingsAsScala: Option[Seq[ConfigurationOptionSetting]] = Option(self.optionSettings).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToValidateConfigurationSettingsRequestOps {

  implicit def toValidateConfigurationSettingsRequestBuilderOps(
      v: ValidateConfigurationSettingsRequest.Builder
  ): ValidateConfigurationSettingsRequestBuilderOps = new ValidateConfigurationSettingsRequestBuilderOps(v)

  implicit def toValidateConfigurationSettingsRequestOps(
      v: ValidateConfigurationSettingsRequest
  ): ValidateConfigurationSettingsRequestOps = new ValidateConfigurationSettingsRequestOps(v)

}
