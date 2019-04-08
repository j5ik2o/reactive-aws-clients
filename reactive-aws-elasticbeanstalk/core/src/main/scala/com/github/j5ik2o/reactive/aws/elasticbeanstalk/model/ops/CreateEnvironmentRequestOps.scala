// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class CreateEnvironmentRequestBuilderOps(val self: CreateEnvironmentRequest.Builder) extends AnyVal {

  final def applicationNameAsScala(value: Option[String]): CreateEnvironmentRequest.Builder = {
    value.fold(self) { v =>
      self.applicationName(v)
    }
  }

  final def environmentNameAsScala(value: Option[String]): CreateEnvironmentRequest.Builder = {
    value.fold(self) { v =>
      self.environmentName(v)
    }
  }

  final def groupNameAsScala(value: Option[String]): CreateEnvironmentRequest.Builder = {
    value.fold(self) { v =>
      self.groupName(v)
    }
  }

  final def descriptionAsScala(value: Option[String]): CreateEnvironmentRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def cnamePrefixAsScala(value: Option[String]): CreateEnvironmentRequest.Builder = {
    value.fold(self) { v =>
      self.cnamePrefix(v)
    }
  }

  final def tierAsScala(value: Option[EnvironmentTier]): CreateEnvironmentRequest.Builder = {
    value.fold(self) { v =>
      self.tier(v)
    }
  }

  final def tagsAsScala(value: Option[Seq[Tag]]): CreateEnvironmentRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    }
  }

  final def versionLabelAsScala(value: Option[String]): CreateEnvironmentRequest.Builder = {
    value.fold(self) { v =>
      self.versionLabel(v)
    }
  }

  final def templateNameAsScala(value: Option[String]): CreateEnvironmentRequest.Builder = {
    value.fold(self) { v =>
      self.templateName(v)
    }
  }

  final def solutionStackNameAsScala(value: Option[String]): CreateEnvironmentRequest.Builder = {
    value.fold(self) { v =>
      self.solutionStackName(v)
    }
  }

  final def platformArnAsScala(value: Option[String]): CreateEnvironmentRequest.Builder = {
    value.fold(self) { v =>
      self.platformArn(v)
    }
  }

  final def optionSettingsAsScala(value: Option[Seq[ConfigurationOptionSetting]]): CreateEnvironmentRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.optionSettings(v.asJava)
    }
  }

  final def optionsToRemoveAsScala(value: Option[Seq[OptionSpecification]]): CreateEnvironmentRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.optionsToRemove(v.asJava)
    }
  }

}

final class CreateEnvironmentRequestOps(val self: CreateEnvironmentRequest) extends AnyVal {

  final def applicationNameAsScala: Option[String] = Option(self.applicationName)

  final def environmentNameAsScala: Option[String] = Option(self.environmentName)

  final def groupNameAsScala: Option[String] = Option(self.groupName)

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def cnamePrefixAsScala: Option[String] = Option(self.cnamePrefix)

  final def tierAsScala: Option[EnvironmentTier] = Option(self.tier)

  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def versionLabelAsScala: Option[String] = Option(self.versionLabel)

  final def templateNameAsScala: Option[String] = Option(self.templateName)

  final def solutionStackNameAsScala: Option[String] = Option(self.solutionStackName)

  final def platformArnAsScala: Option[String] = Option(self.platformArn)

  final def optionSettingsAsScala: Option[Seq[ConfigurationOptionSetting]] = Option(self.optionSettings).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def optionsToRemoveAsScala: Option[Seq[OptionSpecification]] = Option(self.optionsToRemove).map { v =>
    import scala.collection.JavaConverters._; v.asScala
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
