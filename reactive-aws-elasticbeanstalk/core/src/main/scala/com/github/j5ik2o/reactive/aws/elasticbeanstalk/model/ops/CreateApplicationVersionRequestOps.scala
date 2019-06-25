// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class CreateApplicationVersionRequestBuilderOps(val self: CreateApplicationVersionRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def applicationNameAsScala(value: Option[String]): CreateApplicationVersionRequest.Builder = {
    value.fold(self) { v =>
      self.applicationName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionLabelAsScala(value: Option[String]): CreateApplicationVersionRequest.Builder = {
    value.fold(self) { v =>
      self.versionLabel(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): CreateApplicationVersionRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceBuildInformationAsScala(
      value: Option[SourceBuildInformation]
  ): CreateApplicationVersionRequest.Builder = {
    value.fold(self) { v =>
      self.sourceBuildInformation(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceBundleAsScala(value: Option[S3Location]): CreateApplicationVersionRequest.Builder = {
    value.fold(self) { v =>
      self.sourceBundle(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def buildConfigurationAsScala(value: Option[BuildConfiguration]): CreateApplicationVersionRequest.Builder = {
    value.fold(self) { v =>
      self.buildConfiguration(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def autoCreateApplicationAsScala(value: Option[Boolean]): CreateApplicationVersionRequest.Builder = {
    value.fold(self) { v =>
      self.autoCreateApplication(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def processAsScala(value: Option[Boolean]): CreateApplicationVersionRequest.Builder = {
    value.fold(self) { v =>
      self.process(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Seq[Tag]]): CreateApplicationVersionRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

}

final class CreateApplicationVersionRequestOps(val self: CreateApplicationVersionRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def applicationNameAsScala: Option[String] = Option(self.applicationName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionLabelAsScala: Option[String] = Option(self.versionLabel)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceBuildInformationAsScala: Option[SourceBuildInformation] = Option(self.sourceBuildInformation)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceBundleAsScala: Option[S3Location] = Option(self.sourceBundle)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def buildConfigurationAsScala: Option[BuildConfiguration] = Option(self.buildConfiguration)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def autoCreateApplicationAsScala: Option[Boolean] = Option(self.autoCreateApplication)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def processAsScala: Option[Boolean] = Option(self.process)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

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
