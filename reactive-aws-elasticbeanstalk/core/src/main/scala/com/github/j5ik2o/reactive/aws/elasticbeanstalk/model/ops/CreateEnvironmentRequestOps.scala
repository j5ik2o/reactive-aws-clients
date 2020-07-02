// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class CreateEnvironmentRequestBuilderOps(val self: CreateEnvironmentRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def applicationNameAsScala(value: Option[String]): CreateEnvironmentRequest.Builder = {
    value.fold(self) { v => self.applicationName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentNameAsScala(value: Option[String]): CreateEnvironmentRequest.Builder = {
    value.fold(self) { v => self.environmentName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupNameAsScala(value: Option[String]): CreateEnvironmentRequest.Builder = {
    value.fold(self) { v => self.groupName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): CreateEnvironmentRequest.Builder = {
    value.fold(self) { v => self.description(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cnamePrefixAsScala(value: Option[String]): CreateEnvironmentRequest.Builder = {
    value.fold(self) { v => self.cnamePrefix(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tierAsScala(value: Option[EnvironmentTier]): CreateEnvironmentRequest.Builder = {
    value.fold(self) { v => self.tier(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Seq[Tag]]): CreateEnvironmentRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionLabelAsScala(value: Option[String]): CreateEnvironmentRequest.Builder = {
    value.fold(self) { v => self.versionLabel(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def templateNameAsScala(value: Option[String]): CreateEnvironmentRequest.Builder = {
    value.fold(self) { v => self.templateName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def solutionStackNameAsScala(value: Option[String]): CreateEnvironmentRequest.Builder = {
    value.fold(self) { v => self.solutionStackName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformArnAsScala(value: Option[String]): CreateEnvironmentRequest.Builder = {
    value.fold(self) { v => self.platformArn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def optionSettingsAsScala(value: Option[Seq[ConfigurationOptionSetting]]): CreateEnvironmentRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.optionSettings(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def optionsToRemoveAsScala(value: Option[Seq[OptionSpecification]]): CreateEnvironmentRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.optionsToRemove(v.asJava)
    }
  }

}

final class CreateEnvironmentRequestOps(val self: CreateEnvironmentRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def applicationNameAsScala: Option[String] = Option(self.applicationName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentNameAsScala: Option[String] = Option(self.environmentName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupNameAsScala: Option[String] = Option(self.groupName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cnamePrefixAsScala: Option[String] = Option(self.cnamePrefix)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tierAsScala: Option[EnvironmentTier] = Option(self.tier)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Seq[Tag]] =
    Option(self.tags).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionLabelAsScala: Option[String] = Option(self.versionLabel)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def templateNameAsScala: Option[String] = Option(self.templateName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def solutionStackNameAsScala: Option[String] = Option(self.solutionStackName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformArnAsScala: Option[String] = Option(self.platformArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def optionSettingsAsScala: Option[Seq[ConfigurationOptionSetting]] =
    Option(self.optionSettings).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def optionsToRemoveAsScala: Option[Seq[OptionSpecification]] =
    Option(self.optionsToRemove).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateEnvironmentRequestOps {

  implicit def toCreateEnvironmentRequestBuilderOps(
      v: CreateEnvironmentRequest.Builder
  ): CreateEnvironmentRequestBuilderOps = new CreateEnvironmentRequestBuilderOps(v)

  implicit def toCreateEnvironmentRequestOps(v: CreateEnvironmentRequest): CreateEnvironmentRequestOps =
    new CreateEnvironmentRequestOps(v)

}
