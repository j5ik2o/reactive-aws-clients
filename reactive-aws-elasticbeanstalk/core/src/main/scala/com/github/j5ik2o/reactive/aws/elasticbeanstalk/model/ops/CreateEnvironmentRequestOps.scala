// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class CreateEnvironmentRequestBuilderOps(val self: CreateEnvironmentRequest.Builder) extends AnyVal {

  final def applicationNameAsScala(value: Option[String]): CreateEnvironmentRequest.Builder = {
    value.fold(self) { v =>
      self.applicationName(v)
    }
  } // String

  final def environmentNameAsScala(value: Option[String]): CreateEnvironmentRequest.Builder = {
    value.fold(self) { v =>
      self.environmentName(v)
    }
  } // String

  final def groupNameAsScala(value: Option[String]): CreateEnvironmentRequest.Builder = {
    value.fold(self) { v =>
      self.groupName(v)
    }
  } // String

  final def descriptionAsScala(value: Option[String]): CreateEnvironmentRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  } // String

  final def cnamePrefixAsScala(value: Option[String]): CreateEnvironmentRequest.Builder = {
    value.fold(self) { v =>
      self.cnamePrefix(v)
    }
  } // String

  final def tierAsScala(value: Option[EnvironmentTier]): CreateEnvironmentRequest.Builder = {
    value.fold(self) { v =>
      self.tier(v)
    }
  } // EnvironmentTier

  final def tagsAsScala(value: Option[Seq[Tag]]): CreateEnvironmentRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    } // Seq[Tag]
  }

  final def versionLabelAsScala(value: Option[String]): CreateEnvironmentRequest.Builder = {
    value.fold(self) { v =>
      self.versionLabel(v)
    }
  } // String

  final def templateNameAsScala(value: Option[String]): CreateEnvironmentRequest.Builder = {
    value.fold(self) { v =>
      self.templateName(v)
    }
  } // String

  final def solutionStackNameAsScala(value: Option[String]): CreateEnvironmentRequest.Builder = {
    value.fold(self) { v =>
      self.solutionStackName(v)
    }
  } // String

  final def platformArnAsScala(value: Option[String]): CreateEnvironmentRequest.Builder = {
    value.fold(self) { v =>
      self.platformArn(v)
    }
  } // String

  final def optionSettingsAsScala(value: Option[Seq[ConfigurationOptionSetting]]): CreateEnvironmentRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.optionSettings(v.asJava)
    } // Seq[ConfigurationOptionSetting]
  }

  final def optionsToRemoveAsScala(value: Option[Seq[OptionSpecification]]): CreateEnvironmentRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.optionsToRemove(v.asJava)
    } // Seq[OptionSpecification]
  }

}

final class CreateEnvironmentRequestOps(val self: CreateEnvironmentRequest) extends AnyVal {

  final def applicationNameAsScala: Option[String] = Option(self.applicationName) // String

  final def environmentNameAsScala: Option[String] = Option(self.environmentName) // String

  final def groupNameAsScala: Option[String] = Option(self.groupName) // String

  final def descriptionAsScala: Option[String] = Option(self.description) // String

  final def cnamePrefixAsScala: Option[String] = Option(self.cnamePrefix) // String

  final def tierAsScala: Option[EnvironmentTier] = Option(self.tier) // EnvironmentTier

  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[Tag]

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
trait ToCreateEnvironmentRequestOps {

  implicit def toCreateEnvironmentRequestBuilderOps(
      v: CreateEnvironmentRequest.Builder
  ): CreateEnvironmentRequestBuilderOps = new CreateEnvironmentRequestBuilderOps(v)

  implicit def toCreateEnvironmentRequestOps(v: CreateEnvironmentRequest): CreateEnvironmentRequestOps =
    new CreateEnvironmentRequestOps(v)

}
