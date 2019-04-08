// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class ConfigurationSettingsDescriptionBuilderOps(val self: ConfigurationSettingsDescription.Builder)
    extends AnyVal {

  final def solutionStackNameAsScala(value: Option[String]): ConfigurationSettingsDescription.Builder = {
    value.fold(self) { v =>
      self.solutionStackName(v)
    }
  } // String

  final def platformArnAsScala(value: Option[String]): ConfigurationSettingsDescription.Builder = {
    value.fold(self) { v =>
      self.platformArn(v)
    }
  } // String

  final def applicationNameAsScala(value: Option[String]): ConfigurationSettingsDescription.Builder = {
    value.fold(self) { v =>
      self.applicationName(v)
    }
  } // String

  final def templateNameAsScala(value: Option[String]): ConfigurationSettingsDescription.Builder = {
    value.fold(self) { v =>
      self.templateName(v)
    }
  } // String

  final def descriptionAsScala(value: Option[String]): ConfigurationSettingsDescription.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  } // String

  final def environmentNameAsScala(value: Option[String]): ConfigurationSettingsDescription.Builder = {
    value.fold(self) { v =>
      self.environmentName(v)
    }
  } // String

  final def deploymentStatusAsScala(
      value: Option[ConfigurationDeploymentStatus]
  ): ConfigurationSettingsDescription.Builder = {
    value.fold(self) { v =>
      self.deploymentStatus(v)
    }
  } // ConfigurationDeploymentStatus

  final def dateCreatedAsScala(value: Option[java.time.Instant]): ConfigurationSettingsDescription.Builder = {
    value.fold(self) { v =>
      self.dateCreated(v)
    }
  } // java.time.Instant

  final def dateUpdatedAsScala(value: Option[java.time.Instant]): ConfigurationSettingsDescription.Builder = {
    value.fold(self) { v =>
      self.dateUpdated(v)
    }
  } // java.time.Instant

  final def optionSettingsAsScala(
      value: Option[Seq[ConfigurationOptionSetting]]
  ): ConfigurationSettingsDescription.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.optionSettings(v.asJava)
    } // Seq[ConfigurationOptionSetting]
  }

}

final class ConfigurationSettingsDescriptionOps(val self: ConfigurationSettingsDescription) extends AnyVal {

  final def solutionStackNameAsScala: Option[String] = Option(self.solutionStackName) // String

  final def platformArnAsScala: Option[String] = Option(self.platformArn) // String

  final def applicationNameAsScala: Option[String] = Option(self.applicationName) // String

  final def templateNameAsScala: Option[String] = Option(self.templateName) // String

  final def descriptionAsScala: Option[String] = Option(self.description) // String

  final def environmentNameAsScala: Option[String] = Option(self.environmentName) // String

  final def deploymentStatusAsScala: Option[ConfigurationDeploymentStatus] =
    Option(self.deploymentStatus) // ConfigurationDeploymentStatus

  final def dateCreatedAsScala: Option[java.time.Instant] = Option(self.dateCreated) // java.time.Instant

  final def dateUpdatedAsScala: Option[java.time.Instant] = Option(self.dateUpdated) // java.time.Instant

  final def optionSettingsAsScala: Option[Seq[ConfigurationOptionSetting]] = Option(self.optionSettings).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[ConfigurationOptionSetting]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToConfigurationSettingsDescriptionOps {

  implicit def toConfigurationSettingsDescriptionBuilderOps(
      v: ConfigurationSettingsDescription.Builder
  ): ConfigurationSettingsDescriptionBuilderOps = new ConfigurationSettingsDescriptionBuilderOps(v)

  implicit def toConfigurationSettingsDescriptionOps(
      v: ConfigurationSettingsDescription
  ): ConfigurationSettingsDescriptionOps = new ConfigurationSettingsDescriptionOps(v)

}
