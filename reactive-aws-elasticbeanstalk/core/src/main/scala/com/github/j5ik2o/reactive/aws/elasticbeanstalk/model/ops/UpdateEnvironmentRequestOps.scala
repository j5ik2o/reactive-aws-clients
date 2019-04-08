// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class UpdateEnvironmentRequestBuilderOps(val self: UpdateEnvironmentRequest.Builder) extends AnyVal {

  final def applicationNameAsScala(value: Option[String]): UpdateEnvironmentRequest.Builder = {
    value.fold(self) { v =>
      self.applicationName(v)
    }
  } // String

  final def environmentIdAsScala(value: Option[String]): UpdateEnvironmentRequest.Builder = {
    value.fold(self) { v =>
      self.environmentId(v)
    }
  } // String

  final def environmentNameAsScala(value: Option[String]): UpdateEnvironmentRequest.Builder = {
    value.fold(self) { v =>
      self.environmentName(v)
    }
  } // String

  final def groupNameAsScala(value: Option[String]): UpdateEnvironmentRequest.Builder = {
    value.fold(self) { v =>
      self.groupName(v)
    }
  } // String

  final def descriptionAsScala(value: Option[String]): UpdateEnvironmentRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  } // String

  final def tierAsScala(value: Option[EnvironmentTier]): UpdateEnvironmentRequest.Builder = {
    value.fold(self) { v =>
      self.tier(v)
    }
  } // EnvironmentTier

  final def versionLabelAsScala(value: Option[String]): UpdateEnvironmentRequest.Builder = {
    value.fold(self) { v =>
      self.versionLabel(v)
    }
  } // String

  final def templateNameAsScala(value: Option[String]): UpdateEnvironmentRequest.Builder = {
    value.fold(self) { v =>
      self.templateName(v)
    }
  } // String

  final def solutionStackNameAsScala(value: Option[String]): UpdateEnvironmentRequest.Builder = {
    value.fold(self) { v =>
      self.solutionStackName(v)
    }
  } // String

  final def platformArnAsScala(value: Option[String]): UpdateEnvironmentRequest.Builder = {
    value.fold(self) { v =>
      self.platformArn(v)
    }
  } // String

  final def optionSettingsAsScala(value: Option[Seq[ConfigurationOptionSetting]]): UpdateEnvironmentRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.optionSettings(v.asJava)
    } // Seq[ConfigurationOptionSetting]
  }

  final def optionsToRemoveAsScala(value: Option[Seq[OptionSpecification]]): UpdateEnvironmentRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.optionsToRemove(v.asJava)
    } // Seq[OptionSpecification]
  }

}

final class UpdateEnvironmentRequestOps(val self: UpdateEnvironmentRequest) extends AnyVal {

  final def applicationNameAsScala: Option[String] = Option(self.applicationName) // String

  final def environmentIdAsScala: Option[String] = Option(self.environmentId) // String

  final def environmentNameAsScala: Option[String] = Option(self.environmentName) // String

  final def groupNameAsScala: Option[String] = Option(self.groupName) // String

  final def descriptionAsScala: Option[String] = Option(self.description) // String

  final def tierAsScala: Option[EnvironmentTier] = Option(self.tier) // EnvironmentTier

  final def versionLabelAsScala: Option[String] = Option(self.versionLabel) // String

  final def templateNameAsScala: Option[String] = Option(self.templateName) // String

  final def solutionStackNameAsScala: Option[String] = Option(self.solutionStackName) // String

  final def platformArnAsScala: Option[String] = Option(self.platformArn) // String

  final def optionSettingsAsScala: Option[Seq[ConfigurationOptionSetting]] = Option(self.optionSettings).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[ConfigurationOptionSetting]

  final def optionsToRemoveAsScala: Option[Seq[OptionSpecification]] = Option(self.optionsToRemove).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[OptionSpecification]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateEnvironmentRequestOps {

  implicit def toUpdateEnvironmentRequestBuilderOps(
      v: UpdateEnvironmentRequest.Builder
  ): UpdateEnvironmentRequestBuilderOps = new UpdateEnvironmentRequestBuilderOps(v)

  implicit def toUpdateEnvironmentRequestOps(v: UpdateEnvironmentRequest): UpdateEnvironmentRequestOps =
    new UpdateEnvironmentRequestOps(v)

}
