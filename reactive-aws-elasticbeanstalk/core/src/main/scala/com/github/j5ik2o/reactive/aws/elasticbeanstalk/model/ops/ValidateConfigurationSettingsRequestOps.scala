// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class ValidateConfigurationSettingsRequestBuilderOps(val self: ValidateConfigurationSettingsRequest.Builder)
    extends AnyVal {

  final def applicationNameAsScala(value: Option[String]): ValidateConfigurationSettingsRequest.Builder = {
    value.fold(self) { v =>
      self.applicationName(v)
    }
  } // String

  final def templateNameAsScala(value: Option[String]): ValidateConfigurationSettingsRequest.Builder = {
    value.fold(self) { v =>
      self.templateName(v)
    }
  } // String

  final def environmentNameAsScala(value: Option[String]): ValidateConfigurationSettingsRequest.Builder = {
    value.fold(self) { v =>
      self.environmentName(v)
    }
  } // String

  final def optionSettingsAsScala(
      value: Option[Seq[ConfigurationOptionSetting]]
  ): ValidateConfigurationSettingsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.optionSettings(v.asJava)
    } // Seq[ConfigurationOptionSetting]
  }

}

final class ValidateConfigurationSettingsRequestOps(val self: ValidateConfigurationSettingsRequest) extends AnyVal {

  final def applicationNameAsScala: Option[String] = Option(self.applicationName) // String

  final def templateNameAsScala: Option[String] = Option(self.templateName) // String

  final def environmentNameAsScala: Option[String] = Option(self.environmentName) // String

  final def optionSettingsAsScala: Option[Seq[ConfigurationOptionSetting]] = Option(self.optionSettings).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[ConfigurationOptionSetting]

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
