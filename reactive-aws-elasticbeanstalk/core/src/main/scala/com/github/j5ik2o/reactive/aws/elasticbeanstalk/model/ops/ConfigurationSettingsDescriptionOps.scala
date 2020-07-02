// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class ConfigurationSettingsDescriptionBuilderOps(val self: ConfigurationSettingsDescription.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def solutionStackNameAsScala(value: Option[String]): ConfigurationSettingsDescription.Builder = {
    value.fold(self) { v => self.solutionStackName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformArnAsScala(value: Option[String]): ConfigurationSettingsDescription.Builder = {
    value.fold(self) { v => self.platformArn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def applicationNameAsScala(value: Option[String]): ConfigurationSettingsDescription.Builder = {
    value.fold(self) { v => self.applicationName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def templateNameAsScala(value: Option[String]): ConfigurationSettingsDescription.Builder = {
    value.fold(self) { v => self.templateName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): ConfigurationSettingsDescription.Builder = {
    value.fold(self) { v => self.description(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentNameAsScala(value: Option[String]): ConfigurationSettingsDescription.Builder = {
    value.fold(self) { v => self.environmentName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deploymentStatusAsScala(
      value: Option[ConfigurationDeploymentStatus]
  ): ConfigurationSettingsDescription.Builder = {
    value.fold(self) { v => self.deploymentStatus(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dateCreatedAsScala(value: Option[java.time.Instant]): ConfigurationSettingsDescription.Builder = {
    value.fold(self) { v => self.dateCreated(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dateUpdatedAsScala(value: Option[java.time.Instant]): ConfigurationSettingsDescription.Builder = {
    value.fold(self) { v => self.dateUpdated(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def optionSettingsAsScala(
      value: Option[Seq[ConfigurationOptionSetting]]
  ): ConfigurationSettingsDescription.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.optionSettings(v.asJava)
    }
  }

}

final class ConfigurationSettingsDescriptionOps(val self: ConfigurationSettingsDescription) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def solutionStackNameAsScala: Option[String] = Option(self.solutionStackName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformArnAsScala: Option[String] = Option(self.platformArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def applicationNameAsScala: Option[String] = Option(self.applicationName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def templateNameAsScala: Option[String] = Option(self.templateName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentNameAsScala: Option[String] = Option(self.environmentName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deploymentStatusAsScala: Option[ConfigurationDeploymentStatus] = Option(self.deploymentStatus)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dateCreatedAsScala: Option[java.time.Instant] = Option(self.dateCreated)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dateUpdatedAsScala: Option[java.time.Instant] = Option(self.dateUpdated)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def optionSettingsAsScala: Option[Seq[ConfigurationOptionSetting]] =
    Option(self.optionSettings).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

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
