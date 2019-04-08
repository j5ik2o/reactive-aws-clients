// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class ApplicationVersionDescriptionBuilderOps(val self: ApplicationVersionDescription.Builder) extends AnyVal {

  final def applicationVersionArnAsScala(value: Option[String]): ApplicationVersionDescription.Builder = {
    value.fold(self) { v =>
      self.applicationVersionArn(v)
    }
  }

  final def applicationNameAsScala(value: Option[String]): ApplicationVersionDescription.Builder = {
    value.fold(self) { v =>
      self.applicationName(v)
    }
  }

  final def descriptionAsScala(value: Option[String]): ApplicationVersionDescription.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def versionLabelAsScala(value: Option[String]): ApplicationVersionDescription.Builder = {
    value.fold(self) { v =>
      self.versionLabel(v)
    }
  }

  final def sourceBuildInformationAsScala(
      value: Option[SourceBuildInformation]
  ): ApplicationVersionDescription.Builder = {
    value.fold(self) { v =>
      self.sourceBuildInformation(v)
    }
  }

  final def buildArnAsScala(value: Option[String]): ApplicationVersionDescription.Builder = {
    value.fold(self) { v =>
      self.buildArn(v)
    }
  }

  final def sourceBundleAsScala(value: Option[S3Location]): ApplicationVersionDescription.Builder = {
    value.fold(self) { v =>
      self.sourceBundle(v)
    }
  }

  final def dateCreatedAsScala(value: Option[java.time.Instant]): ApplicationVersionDescription.Builder = {
    value.fold(self) { v =>
      self.dateCreated(v)
    }
  }

  final def dateUpdatedAsScala(value: Option[java.time.Instant]): ApplicationVersionDescription.Builder = {
    value.fold(self) { v =>
      self.dateUpdated(v)
    }
  }

  final def statusAsScala(value: Option[ApplicationVersionStatus]): ApplicationVersionDescription.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

}

final class ApplicationVersionDescriptionOps(val self: ApplicationVersionDescription) extends AnyVal {

  final def applicationVersionArnAsScala: Option[String] = Option(self.applicationVersionArn)

  final def applicationNameAsScala: Option[String] = Option(self.applicationName)

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def versionLabelAsScala: Option[String] = Option(self.versionLabel)

  final def sourceBuildInformationAsScala: Option[SourceBuildInformation] = Option(self.sourceBuildInformation)

  final def buildArnAsScala: Option[String] = Option(self.buildArn)

  final def sourceBundleAsScala: Option[S3Location] = Option(self.sourceBundle)

  final def dateCreatedAsScala: Option[java.time.Instant] = Option(self.dateCreated)

  final def dateUpdatedAsScala: Option[java.time.Instant] = Option(self.dateUpdated)

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
