// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class ApplicationVersionDescriptionBuilderOps(val self: ApplicationVersionDescription.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def applicationVersionArnAsScala(value: Option[String]): ApplicationVersionDescription.Builder = {
    value.fold(self) { v => self.applicationVersionArn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def applicationNameAsScala(value: Option[String]): ApplicationVersionDescription.Builder = {
    value.fold(self) { v => self.applicationName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): ApplicationVersionDescription.Builder = {
    value.fold(self) { v => self.description(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionLabelAsScala(value: Option[String]): ApplicationVersionDescription.Builder = {
    value.fold(self) { v => self.versionLabel(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceBuildInformationAsScala(
      value: Option[SourceBuildInformation]
  ): ApplicationVersionDescription.Builder = {
    value.fold(self) { v => self.sourceBuildInformation(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def buildArnAsScala(value: Option[String]): ApplicationVersionDescription.Builder = {
    value.fold(self) { v => self.buildArn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceBundleAsScala(value: Option[S3Location]): ApplicationVersionDescription.Builder = {
    value.fold(self) { v => self.sourceBundle(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dateCreatedAsScala(value: Option[java.time.Instant]): ApplicationVersionDescription.Builder = {
    value.fold(self) { v => self.dateCreated(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dateUpdatedAsScala(value: Option[java.time.Instant]): ApplicationVersionDescription.Builder = {
    value.fold(self) { v => self.dateUpdated(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[ApplicationVersionStatus]): ApplicationVersionDescription.Builder = {
    value.fold(self) { v => self.status(v) }
  }

}

final class ApplicationVersionDescriptionOps(val self: ApplicationVersionDescription) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def applicationVersionArnAsScala: Option[String] = Option(self.applicationVersionArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def applicationNameAsScala: Option[String] = Option(self.applicationName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionLabelAsScala: Option[String] = Option(self.versionLabel)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceBuildInformationAsScala: Option[SourceBuildInformation] = Option(self.sourceBuildInformation)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def buildArnAsScala: Option[String] = Option(self.buildArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceBundleAsScala: Option[S3Location] = Option(self.sourceBundle)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dateCreatedAsScala: Option[java.time.Instant] = Option(self.dateCreated)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dateUpdatedAsScala: Option[java.time.Instant] = Option(self.dateUpdated)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[ApplicationVersionStatus] = Option(self.status)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToApplicationVersionDescriptionOps {

  implicit def toApplicationVersionDescriptionBuilderOps(
      v: ApplicationVersionDescription.Builder
  ): ApplicationVersionDescriptionBuilderOps = new ApplicationVersionDescriptionBuilderOps(v)

  implicit def toApplicationVersionDescriptionOps(v: ApplicationVersionDescription): ApplicationVersionDescriptionOps =
    new ApplicationVersionDescriptionOps(v)

}
