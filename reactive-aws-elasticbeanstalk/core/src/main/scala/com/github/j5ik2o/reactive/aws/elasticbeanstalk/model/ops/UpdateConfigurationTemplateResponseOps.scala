// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class UpdateConfigurationTemplateResponseBuilderOps(val self: UpdateConfigurationTemplateResponse.Builder)
    extends AnyVal {

  final def solutionStackNameAsScala(value: Option[String]): UpdateConfigurationTemplateResponse.Builder = {
    value.fold(self) { v =>
      self.solutionStackName(v)
    }
  } // String

  final def platformArnAsScala(value: Option[String]): UpdateConfigurationTemplateResponse.Builder = {
    value.fold(self) { v =>
      self.platformArn(v)
    }
  } // String

  final def applicationNameAsScala(value: Option[String]): UpdateConfigurationTemplateResponse.Builder = {
    value.fold(self) { v =>
      self.applicationName(v)
    }
  } // String

  final def templateNameAsScala(value: Option[String]): UpdateConfigurationTemplateResponse.Builder = {
    value.fold(self) { v =>
      self.templateName(v)
    }
  } // String

  final def descriptionAsScala(value: Option[String]): UpdateConfigurationTemplateResponse.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  } // String

  final def environmentNameAsScala(value: Option[String]): UpdateConfigurationTemplateResponse.Builder = {
    value.fold(self) { v =>
      self.environmentName(v)
    }
  } // String

  final def deploymentStatusAsScala(
      value: Option[ConfigurationDeploymentStatus]
  ): UpdateConfigurationTemplateResponse.Builder = {
    value.fold(self) { v =>
      self.deploymentStatus(v)
    }
  } // String

  final def dateCreatedAsScala(value: Option[java.time.Instant]): UpdateConfigurationTemplateResponse.Builder = {
    value.fold(self) { v =>
      self.dateCreated(v)
    }
  } // Instant

  final def dateUpdatedAsScala(value: Option[java.time.Instant]): UpdateConfigurationTemplateResponse.Builder = {
    value.fold(self) { v =>
      self.dateUpdated(v)
    }
  } // Instant

  final def optionSettingsAsScala(
      value: Option[Seq[ConfigurationOptionSetting]]
  ): UpdateConfigurationTemplateResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.optionSettings(v.asJava)
    } // Seq[ConfigurationOptionSetting]
  }

}

final class UpdateConfigurationTemplateResponseOps(val self: UpdateConfigurationTemplateResponse) extends AnyVal {

  final def solutionStackNameAsScala: Option[String] = Option(self.solutionStackName) // String

  final def platformArnAsScala: Option[String] = Option(self.platformArn) // String

  final def applicationNameAsScala: Option[String] = Option(self.applicationName) // String

  final def templateNameAsScala: Option[String] = Option(self.templateName) // String

  final def descriptionAsScala: Option[String] = Option(self.description) // String

  final def environmentNameAsScala: Option[String] = Option(self.environmentName) // String

  final def deploymentStatusAsScala: Option[ConfigurationDeploymentStatus] = Option(self.deploymentStatus) // String

  final def dateCreatedAsScala: Option[java.time.Instant] = Option(self.dateCreated) // Instant

  final def dateUpdatedAsScala: Option[java.time.Instant] = Option(self.dateUpdated) // Instant

  final def optionSettingsAsScala: Option[Seq[ConfigurationOptionSetting]] = Option(self.optionSettings).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[ConfigurationOptionSetting]

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
