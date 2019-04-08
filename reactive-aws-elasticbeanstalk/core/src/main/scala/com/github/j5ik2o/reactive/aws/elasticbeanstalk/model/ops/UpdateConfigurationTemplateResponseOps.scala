// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class UpdateConfigurationTemplateResponseBuilderOps(val self: UpdateConfigurationTemplateResponse.Builder)
    extends AnyVal {

  final def solutionStackNameAsScala(value: Option[String]): UpdateConfigurationTemplateResponse.Builder = {
    value.fold(self) { v =>
      self.solutionStackName(v)
    }
  }

  final def platformArnAsScala(value: Option[String]): UpdateConfigurationTemplateResponse.Builder = {
    value.fold(self) { v =>
      self.platformArn(v)
    }
  }

  final def applicationNameAsScala(value: Option[String]): UpdateConfigurationTemplateResponse.Builder = {
    value.fold(self) { v =>
      self.applicationName(v)
    }
  }

  final def templateNameAsScala(value: Option[String]): UpdateConfigurationTemplateResponse.Builder = {
    value.fold(self) { v =>
      self.templateName(v)
    }
  }

  final def descriptionAsScala(value: Option[String]): UpdateConfigurationTemplateResponse.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def environmentNameAsScala(value: Option[String]): UpdateConfigurationTemplateResponse.Builder = {
    value.fold(self) { v =>
      self.environmentName(v)
    }
  }

  final def deploymentStatusAsScala(
      value: Option[ConfigurationDeploymentStatus]
  ): UpdateConfigurationTemplateResponse.Builder = {
    value.fold(self) { v =>
      self.deploymentStatus(v)
    }
  }

  final def dateCreatedAsScala(value: Option[java.time.Instant]): UpdateConfigurationTemplateResponse.Builder = {
    value.fold(self) { v =>
      self.dateCreated(v)
    }
  }

  final def dateUpdatedAsScala(value: Option[java.time.Instant]): UpdateConfigurationTemplateResponse.Builder = {
    value.fold(self) { v =>
      self.dateUpdated(v)
    }
  }

  final def optionSettingsAsScala(
      value: Option[Seq[ConfigurationOptionSetting]]
  ): UpdateConfigurationTemplateResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.optionSettings(v.asJava)
    }
  }

}

final class UpdateConfigurationTemplateResponseOps(val self: UpdateConfigurationTemplateResponse) extends AnyVal {

  final def solutionStackNameAsScala: Option[String] = Option(self.solutionStackName)

  final def platformArnAsScala: Option[String] = Option(self.platformArn)

  final def applicationNameAsScala: Option[String] = Option(self.applicationName)

  final def templateNameAsScala: Option[String] = Option(self.templateName)

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def environmentNameAsScala: Option[String] = Option(self.environmentName)

  final def deploymentStatusAsScala: Option[ConfigurationDeploymentStatus] = Option(self.deploymentStatus)

  final def dateCreatedAsScala: Option[java.time.Instant] = Option(self.dateCreated)

  final def dateUpdatedAsScala: Option[java.time.Instant] = Option(self.dateUpdated)

  final def optionSettingsAsScala: Option[Seq[ConfigurationOptionSetting]] = Option(self.optionSettings).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateConfigurationTemplateResponseOps {

  implicit def toUpdateConfigurationTemplateResponseBuilderOps(
      v: UpdateConfigurationTemplateResponse.Builder
  ): UpdateConfigurationTemplateResponseBuilderOps = new UpdateConfigurationTemplateResponseBuilderOps(v)

  implicit def toUpdateConfigurationTemplateResponseOps(
      v: UpdateConfigurationTemplateResponse
  ): UpdateConfigurationTemplateResponseOps = new UpdateConfigurationTemplateResponseOps(v)

}
