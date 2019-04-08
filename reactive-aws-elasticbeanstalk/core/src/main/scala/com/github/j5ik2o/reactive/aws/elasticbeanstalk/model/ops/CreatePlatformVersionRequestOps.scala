// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class CreatePlatformVersionRequestBuilderOps(val self: CreatePlatformVersionRequest.Builder) extends AnyVal {

  final def platformNameAsScala(value: Option[String]): CreatePlatformVersionRequest.Builder = {
    value.fold(self) { v =>
      self.platformName(v)
    }
  } // String

  final def platformVersionAsScala(value: Option[String]): CreatePlatformVersionRequest.Builder = {
    value.fold(self) { v =>
      self.platformVersion(v)
    }
  } // String

  final def platformDefinitionBundleAsScala(value: Option[S3Location]): CreatePlatformVersionRequest.Builder = {
    value.fold(self) { v =>
      self.platformDefinitionBundle(v)
    }
  } // S3Location

  final def environmentNameAsScala(value: Option[String]): CreatePlatformVersionRequest.Builder = {
    value.fold(self) { v =>
      self.environmentName(v)
    }
  } // String

  final def optionSettingsAsScala(
      value: Option[Seq[ConfigurationOptionSetting]]
  ): CreatePlatformVersionRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.optionSettings(v.asJava)
    } // Seq[ConfigurationOptionSetting]
  }

}

final class CreatePlatformVersionRequestOps(val self: CreatePlatformVersionRequest) extends AnyVal {

  final def platformNameAsScala: Option[String] = Option(self.platformName) // String

  final def platformVersionAsScala: Option[String] = Option(self.platformVersion) // String

  final def platformDefinitionBundleAsScala: Option[S3Location] = Option(self.platformDefinitionBundle) // S3Location

  final def environmentNameAsScala: Option[String] = Option(self.environmentName) // String

  final def optionSettingsAsScala: Option[Seq[ConfigurationOptionSetting]] = Option(self.optionSettings).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[ConfigurationOptionSetting]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreatePlatformVersionRequestOps {

  implicit def toCreatePlatformVersionRequestBuilderOps(
      v: CreatePlatformVersionRequest.Builder
  ): CreatePlatformVersionRequestBuilderOps = new CreatePlatformVersionRequestBuilderOps(v)

  implicit def toCreatePlatformVersionRequestOps(v: CreatePlatformVersionRequest): CreatePlatformVersionRequestOps =
    new CreatePlatformVersionRequestOps(v)

}
