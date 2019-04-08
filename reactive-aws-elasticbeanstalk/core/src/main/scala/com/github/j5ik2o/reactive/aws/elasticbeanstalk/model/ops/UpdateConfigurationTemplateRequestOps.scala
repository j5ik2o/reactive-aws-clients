// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class UpdateConfigurationTemplateRequestBuilderOps(val self: UpdateConfigurationTemplateRequest.Builder)
    extends AnyVal {

  final def applicationNameAsScala(value: Option[String]): UpdateConfigurationTemplateRequest.Builder = {
    value.fold(self) { v =>
      self.applicationName(v)
    }
  } // String

  final def templateNameAsScala(value: Option[String]): UpdateConfigurationTemplateRequest.Builder = {
    value.fold(self) { v =>
      self.templateName(v)
    }
  } // String

  final def descriptionAsScala(value: Option[String]): UpdateConfigurationTemplateRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  } // String

  final def optionSettingsAsScala(
      value: Option[Seq[ConfigurationOptionSetting]]
  ): UpdateConfigurationTemplateRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.optionSettings(v.asJava)
    } // Seq[ConfigurationOptionSetting]
  }

  final def optionsToRemoveAsScala(
      value: Option[Seq[OptionSpecification]]
  ): UpdateConfigurationTemplateRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.optionsToRemove(v.asJava)
    } // Seq[OptionSpecification]
  }

}

final class UpdateConfigurationTemplateRequestOps(val self: UpdateConfigurationTemplateRequest) extends AnyVal {

  final def applicationNameAsScala: Option[String] = Option(self.applicationName) // String

  final def templateNameAsScala: Option[String] = Option(self.templateName) // String

  final def descriptionAsScala: Option[String] = Option(self.description) // String

  final def optionSettingsAsScala: Option[Seq[ConfigurationOptionSetting]] = Option(self.optionSettings).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[ConfigurationOptionSetting]

  final def optionsToRemoveAsScala: Option[Seq[OptionSpecification]] = Option(self.optionsToRemove).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[OptionSpecification]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateConfigurationTemplateRequestOps {

  implicit def toUpdateConfigurationTemplateRequestBuilderOps(
      v: UpdateConfigurationTemplateRequest.Builder
  ): UpdateConfigurationTemplateRequestBuilderOps = new UpdateConfigurationTemplateRequestBuilderOps(v)

  implicit def toUpdateConfigurationTemplateRequestOps(
      v: UpdateConfigurationTemplateRequest
  ): UpdateConfigurationTemplateRequestOps = new UpdateConfigurationTemplateRequestOps(v)

}
