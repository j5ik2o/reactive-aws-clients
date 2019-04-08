// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class ApplicationVersionDescriptionBuilderOps(val self: ApplicationVersionDescription.Builder) extends AnyVal {

  final def applicationVersionArnAsScala(value: Option[String]): ApplicationVersionDescription.Builder = {
    value.fold(self) { v =>
      self.applicationVersionArn(v)
    }
  } // String

  final def applicationNameAsScala(value: Option[String]): ApplicationVersionDescription.Builder = {
    value.fold(self) { v =>
      self.applicationName(v)
    }
  } // String

  final def descriptionAsScala(value: Option[String]): ApplicationVersionDescription.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  } // String

  final def versionLabelAsScala(value: Option[String]): ApplicationVersionDescription.Builder = {
    value.fold(self) { v =>
      self.versionLabel(v)
    }
  } // String

  final def sourceBuildInformationAsScala(
      value: Option[SourceBuildInformation]
  ): ApplicationVersionDescription.Builder = {
    value.fold(self) { v =>
      self.sourceBuildInformation(v)
    }
  } // SourceBuildInformation

  final def buildArnAsScala(value: Option[String]): ApplicationVersionDescription.Builder = {
    value.fold(self) { v =>
      self.buildArn(v)
    }
  } // String

  final def sourceBundleAsScala(value: Option[S3Location]): ApplicationVersionDescription.Builder = {
    value.fold(self) { v =>
      self.sourceBundle(v)
    }
  } // S3Location

  final def dateCreatedAsScala(value: Option[java.time.Instant]): ApplicationVersionDescription.Builder = {
    value.fold(self) { v =>
      self.dateCreated(v)
    }
  } // java.time.Instant

  final def dateUpdatedAsScala(value: Option[java.time.Instant]): ApplicationVersionDescription.Builder = {
    value.fold(self) { v =>
      self.dateUpdated(v)
    }
  } // java.time.Instant

  final def statusAsScala(value: Option[ApplicationVersionStatus]): ApplicationVersionDescription.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  } // ApplicationVersionStatus

}

final class ApplicationVersionDescriptionOps(val self: ApplicationVersionDescription) extends AnyVal {

  final def applicationVersionArnAsScala: Option[String] = Option(self.applicationVersionArn) // String

  final def applicationNameAsScala: Option[String] = Option(self.applicationName) // String

  final def descriptionAsScala: Option[String] = Option(self.description) // String

  final def versionLabelAsScala: Option[String] = Option(self.versionLabel) // String

  final def sourceBuildInformationAsScala: Option[SourceBuildInformation] =
    Option(self.sourceBuildInformation) // SourceBuildInformation

  final def buildArnAsScala: Option[String] = Option(self.buildArn) // String

  final def sourceBundleAsScala: Option[S3Location] = Option(self.sourceBundle) // S3Location

  final def dateCreatedAsScala: Option[java.time.Instant] = Option(self.dateCreated) // java.time.Instant

  final def dateUpdatedAsScala: Option[java.time.Instant] = Option(self.dateUpdated) // java.time.Instant

  final def statusAsScala: Option[ApplicationVersionStatus] = Option(self.status) // ApplicationVersionStatus

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToApplicationVersionDescriptionOps {

  implicit def toApplicationVersionDescriptionBuilderOps(
      v: ApplicationVersionDescription.Builder
  ): ApplicationVersionDescriptionBuilderOps = new ApplicationVersionDescriptionBuilderOps(v)

  implicit def toApplicationVersionDescriptionOps(v: ApplicationVersionDescription): ApplicationVersionDescriptionOps =
    new ApplicationVersionDescriptionOps(v)

}
