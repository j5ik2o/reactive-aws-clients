// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class CreatePlatformVersionRequestBuilderOps(val self: CreatePlatformVersionRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformNameAsScala(value: Option[String]): CreatePlatformVersionRequest.Builder = {
    value.fold(self) { v =>
      self.platformName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformVersionAsScala(value: Option[String]): CreatePlatformVersionRequest.Builder = {
    value.fold(self) { v =>
      self.platformVersion(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformDefinitionBundleAsScala(value: Option[S3Location]): CreatePlatformVersionRequest.Builder = {
    value.fold(self) { v =>
      self.platformDefinitionBundle(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentNameAsScala(value: Option[String]): CreatePlatformVersionRequest.Builder = {
    value.fold(self) { v =>
      self.environmentName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def optionSettingsAsScala(
      value: Option[Seq[ConfigurationOptionSetting]]
  ): CreatePlatformVersionRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.optionSettings(v.asJava)
    }
  }

}

final class CreatePlatformVersionRequestOps(val self: CreatePlatformVersionRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformNameAsScala: Option[String] = Option(self.platformName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformVersionAsScala: Option[String] = Option(self.platformVersion)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformDefinitionBundleAsScala: Option[S3Location] = Option(self.platformDefinitionBundle)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentNameAsScala: Option[String] = Option(self.environmentName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def optionSettingsAsScala: Option[Seq[ConfigurationOptionSetting]] = Option(self.optionSettings).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreatePlatformVersionRequestOps {

  implicit def toCreatePlatformVersionRequestBuilderOps(
      v: CreatePlatformVersionRequest.Builder
  ): CreatePlatformVersionRequestBuilderOps = new CreatePlatformVersionRequestBuilderOps(v)

  implicit def toCreatePlatformVersionRequestOps(v: CreatePlatformVersionRequest): CreatePlatformVersionRequestOps =
    new CreatePlatformVersionRequestOps(v)

}
