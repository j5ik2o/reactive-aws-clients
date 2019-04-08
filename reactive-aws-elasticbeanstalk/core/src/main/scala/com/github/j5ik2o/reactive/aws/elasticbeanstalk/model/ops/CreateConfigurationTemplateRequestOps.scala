// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class CreateConfigurationTemplateRequestBuilderOps(val self: CreateConfigurationTemplateRequest.Builder)
    extends AnyVal {

  final def applicationNameAsScala(value: Option[String]): CreateConfigurationTemplateRequest.Builder = {
    value.fold(self) { v =>
      self.applicationName(v)
    }
  } // String

  final def templateNameAsScala(value: Option[String]): CreateConfigurationTemplateRequest.Builder = {
    value.fold(self) { v =>
      self.templateName(v)
    }
  } // String

  final def solutionStackNameAsScala(value: Option[String]): CreateConfigurationTemplateRequest.Builder = {
    value.fold(self) { v =>
      self.solutionStackName(v)
    }
  } // String

  final def platformArnAsScala(value: Option[String]): CreateConfigurationTemplateRequest.Builder = {
    value.fold(self) { v =>
      self.platformArn(v)
    }
  } // String

  final def sourceConfigurationAsScala(
      value: Option[SourceConfiguration]
  ): CreateConfigurationTemplateRequest.Builder = {
    value.fold(self) { v =>
      self.sourceConfiguration(v)
    }
  } // SourceConfiguration

  final def environmentIdAsScala(value: Option[String]): CreateConfigurationTemplateRequest.Builder = {
    value.fold(self) { v =>
      self.environmentId(v)
    }
  } // String

  final def descriptionAsScala(value: Option[String]): CreateConfigurationTemplateRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  } // String

  final def optionSettingsAsScala(
      value: Option[Seq[ConfigurationOptionSetting]]
  ): CreateConfigurationTemplateRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.optionSettings(v.asJava)
    } // Seq[ConfigurationOptionSetting]
  }

}

final class CreateConfigurationTemplateRequestOps(val self: CreateConfigurationTemplateRequest) extends AnyVal {

  final def applicationNameAsScala: Option[String] = Option(self.applicationName) // String

  final def templateNameAsScala: Option[String] = Option(self.templateName) // String

  final def solutionStackNameAsScala: Option[String] = Option(self.solutionStackName) // String

  final def platformArnAsScala: Option[String] = Option(self.platformArn) // String

  final def sourceConfigurationAsScala: Option[SourceConfiguration] =
    Option(self.sourceConfiguration) // SourceConfiguration

  final def environmentIdAsScala: Option[String] = Option(self.environmentId) // String

  final def descriptionAsScala: Option[String] = Option(self.description) // String

  final def optionSettingsAsScala: Option[Seq[ConfigurationOptionSetting]] = Option(self.optionSettings).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[ConfigurationOptionSetting]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateConfigurationTemplateRequestOps {

  implicit def toCreateConfigurationTemplateRequestBuilderOps(
      v: CreateConfigurationTemplateRequest.Builder
  ): CreateConfigurationTemplateRequestBuilderOps = new CreateConfigurationTemplateRequestBuilderOps(v)

  implicit def toCreateConfigurationTemplateRequestOps(
      v: CreateConfigurationTemplateRequest
  ): CreateConfigurationTemplateRequestOps = new CreateConfigurationTemplateRequestOps(v)

}
