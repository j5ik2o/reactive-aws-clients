// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class CreateApplicationVersionRequestBuilderOps(val self: CreateApplicationVersionRequest.Builder)
    extends AnyVal {

  final def applicationNameAsScala(value: Option[String]): CreateApplicationVersionRequest.Builder = {
    value.fold(self) { v =>
      self.applicationName(v)
    }
  }

  final def versionLabelAsScala(value: Option[String]): CreateApplicationVersionRequest.Builder = {
    value.fold(self) { v =>
      self.versionLabel(v)
    }
  }

  final def descriptionAsScala(value: Option[String]): CreateApplicationVersionRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def sourceBuildInformationAsScala(
      value: Option[SourceBuildInformation]
  ): CreateApplicationVersionRequest.Builder = {
    value.fold(self) { v =>
      self.sourceBuildInformation(v)
    }
  }

  final def sourceBundleAsScala(value: Option[S3Location]): CreateApplicationVersionRequest.Builder = {
    value.fold(self) { v =>
      self.sourceBundle(v)
    }
  }

  final def buildConfigurationAsScala(value: Option[BuildConfiguration]): CreateApplicationVersionRequest.Builder = {
    value.fold(self) { v =>
      self.buildConfiguration(v)
    }
  }

  final def autoCreateApplicationAsScala(value: Option[Boolean]): CreateApplicationVersionRequest.Builder = {
    value.fold(self) { v =>
      self.autoCreateApplication(v)
    }
  }

  final def processAsScala(value: Option[Boolean]): CreateApplicationVersionRequest.Builder = {
    value.fold(self) { v =>
      self.process(v)
    }
  }

}

final class CreateApplicationVersionRequestOps(val self: CreateApplicationVersionRequest) extends AnyVal {

  final def applicationNameAsScala: Option[String] = Option(self.applicationName)

  final def versionLabelAsScala: Option[String] = Option(self.versionLabel)

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def sourceBuildInformationAsScala: Option[SourceBuildInformation] = Option(self.sourceBuildInformation)

  final def sourceBundleAsScala: Option[S3Location] = Option(self.sourceBundle)

  final def buildConfigurationAsScala: Option[BuildConfiguration] = Option(self.buildConfiguration)

  final def autoCreateApplicationAsScala: Option[Boolean] = Option(self.autoCreateApplication)

  final def processAsScala: Option[Boolean] = Option(self.process)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateApplicationVersionRequestOps {

  implicit def toCreateApplicationVersionRequestBuilderOps(
      v: CreateApplicationVersionRequest.Builder
  ): CreateApplicationVersionRequestBuilderOps = new CreateApplicationVersionRequestBuilderOps(v)

  implicit def toCreateApplicationVersionRequestOps(
      v: CreateApplicationVersionRequest
  ): CreateApplicationVersionRequestOps = new CreateApplicationVersionRequestOps(v)

}
