// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class CreateConfigurationTemplateRequestBuilderOps(val self: CreateConfigurationTemplateRequest.Builder)
    extends AnyVal {

  final def applicationNameAsScala(value: Option[String]): CreateConfigurationTemplateRequest.Builder = {
    value.fold(self) { v =>
      self.applicationName(v)
    }
  }

  final def templateNameAsScala(value: Option[String]): CreateConfigurationTemplateRequest.Builder = {
    value.fold(self) { v =>
      self.templateName(v)
    }
  }

  final def solutionStackNameAsScala(value: Option[String]): CreateConfigurationTemplateRequest.Builder = {
    value.fold(self) { v =>
      self.solutionStackName(v)
    }
  }

  final def platformArnAsScala(value: Option[String]): CreateConfigurationTemplateRequest.Builder = {
    value.fold(self) { v =>
      self.platformArn(v)
    }
  }

  final def sourceConfigurationAsScala(
      value: Option[SourceConfiguration]
  ): CreateConfigurationTemplateRequest.Builder = {
    value.fold(self) { v =>
      self.sourceConfiguration(v)
    }
  }

  final def environmentIdAsScala(value: Option[String]): CreateConfigurationTemplateRequest.Builder = {
    value.fold(self) { v =>
      self.environmentId(v)
    }
  }

  final def descriptionAsScala(value: Option[String]): CreateConfigurationTemplateRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def optionSettingsAsScala(
      value: Option[Seq[ConfigurationOptionSetting]]
  ): CreateConfigurationTemplateRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.optionSettings(v.asJava)
    }
  }

}

final class CreateConfigurationTemplateRequestOps(val self: CreateConfigurationTemplateRequest) extends AnyVal {

  final def applicationNameAsScala: Option[String] = Option(self.applicationName)

  final def templateNameAsScala: Option[String] = Option(self.templateName)

  final def solutionStackNameAsScala: Option[String] = Option(self.solutionStackName)

  final def platformArnAsScala: Option[String] = Option(self.platformArn)

  final def sourceConfigurationAsScala: Option[SourceConfiguration] = Option(self.sourceConfiguration)

  final def environmentIdAsScala: Option[String] = Option(self.environmentId)

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def optionSettingsAsScala: Option[Seq[ConfigurationOptionSetting]] = Option(self.optionSettings).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

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
