// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class ValidateConfigurationSettingsRequestBuilderOps(val self: ValidateConfigurationSettingsRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def applicationNameAsScala(value: Option[String]): ValidateConfigurationSettingsRequest.Builder = {
    value.fold(self) { v =>
      self.applicationName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def templateNameAsScala(value: Option[String]): ValidateConfigurationSettingsRequest.Builder = {
    value.fold(self) { v =>
      self.templateName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentNameAsScala(value: Option[String]): ValidateConfigurationSettingsRequest.Builder = {
    value.fold(self) { v =>
      self.environmentName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def optionSettingsAsScala(
      value: Option[Seq[ConfigurationOptionSetting]]
  ): ValidateConfigurationSettingsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.optionSettings(v.asJava)
    }
  }

}

final class ValidateConfigurationSettingsRequestOps(val self: ValidateConfigurationSettingsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def applicationNameAsScala: Option[String] = Option(self.applicationName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def templateNameAsScala: Option[String] = Option(self.templateName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentNameAsScala: Option[String] = Option(self.environmentName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def optionSettingsAsScala: Option[Seq[ConfigurationOptionSetting]] = Option(self.optionSettings).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
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
