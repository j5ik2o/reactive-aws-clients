// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class UpdateEnvironmentRequestBuilderOps(val self: UpdateEnvironmentRequest.Builder) extends AnyVal {

  final def applicationNameAsScala(value: Option[String]): UpdateEnvironmentRequest.Builder = {
    value.fold(self) { v =>
      self.applicationName(v)
    }
  }

  final def environmentIdAsScala(value: Option[String]): UpdateEnvironmentRequest.Builder = {
    value.fold(self) { v =>
      self.environmentId(v)
    }
  }

  final def environmentNameAsScala(value: Option[String]): UpdateEnvironmentRequest.Builder = {
    value.fold(self) { v =>
      self.environmentName(v)
    }
  }

  final def groupNameAsScala(value: Option[String]): UpdateEnvironmentRequest.Builder = {
    value.fold(self) { v =>
      self.groupName(v)
    }
  }

  final def descriptionAsScala(value: Option[String]): UpdateEnvironmentRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def tierAsScala(value: Option[EnvironmentTier]): UpdateEnvironmentRequest.Builder = {
    value.fold(self) { v =>
      self.tier(v)
    }
  }

  final def versionLabelAsScala(value: Option[String]): UpdateEnvironmentRequest.Builder = {
    value.fold(self) { v =>
      self.versionLabel(v)
    }
  }

  final def templateNameAsScala(value: Option[String]): UpdateEnvironmentRequest.Builder = {
    value.fold(self) { v =>
      self.templateName(v)
    }
  }

  final def solutionStackNameAsScala(value: Option[String]): UpdateEnvironmentRequest.Builder = {
    value.fold(self) { v =>
      self.solutionStackName(v)
    }
  }

  final def platformArnAsScala(value: Option[String]): UpdateEnvironmentRequest.Builder = {
    value.fold(self) { v =>
      self.platformArn(v)
    }
  }

  final def optionSettingsAsScala(value: Option[Seq[ConfigurationOptionSetting]]): UpdateEnvironmentRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.optionSettings(v.asJava)
    }
  }

  final def optionsToRemoveAsScala(value: Option[Seq[OptionSpecification]]): UpdateEnvironmentRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.optionsToRemove(v.asJava)
    }
  }

}

final class UpdateEnvironmentRequestOps(val self: UpdateEnvironmentRequest) extends AnyVal {

  final def applicationNameAsScala: Option[String] = Option(self.applicationName)

  final def environmentIdAsScala: Option[String] = Option(self.environmentId)

  final def environmentNameAsScala: Option[String] = Option(self.environmentName)

  final def groupNameAsScala: Option[String] = Option(self.groupName)

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def tierAsScala: Option[EnvironmentTier] = Option(self.tier)

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
trait ToUpdateEnvironmentRequestOps {

  implicit def toUpdateEnvironmentRequestBuilderOps(
      v: UpdateEnvironmentRequest.Builder
  ): UpdateEnvironmentRequestBuilderOps = new UpdateEnvironmentRequestBuilderOps(v)

  implicit def toUpdateEnvironmentRequestOps(v: UpdateEnvironmentRequest): UpdateEnvironmentRequestOps =
    new UpdateEnvironmentRequestOps(v)

}
