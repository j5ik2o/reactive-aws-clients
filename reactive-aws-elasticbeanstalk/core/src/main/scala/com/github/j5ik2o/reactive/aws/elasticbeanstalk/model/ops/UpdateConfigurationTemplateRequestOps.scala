// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class UpdateConfigurationTemplateRequestBuilderOps(val self: UpdateConfigurationTemplateRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def applicationNameAsScala(value: Option[String]): UpdateConfigurationTemplateRequest.Builder = {
    value.fold(self) { v =>
      self.applicationName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def templateNameAsScala(value: Option[String]): UpdateConfigurationTemplateRequest.Builder = {
    value.fold(self) { v =>
      self.templateName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): UpdateConfigurationTemplateRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def optionSettingsAsScala(
      value: Option[Seq[ConfigurationOptionSetting]]
  ): UpdateConfigurationTemplateRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.optionSettings(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def optionsToRemoveAsScala(
      value: Option[Seq[OptionSpecification]]
  ): UpdateConfigurationTemplateRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.optionsToRemove(v.asJava)
    }
  }

}

final class UpdateConfigurationTemplateRequestOps(val self: UpdateConfigurationTemplateRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def applicationNameAsScala: Option[String] = Option(self.applicationName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def templateNameAsScala: Option[String] = Option(self.templateName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def optionSettingsAsScala: Option[Seq[ConfigurationOptionSetting]] = Option(self.optionSettings).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def optionsToRemoveAsScala: Option[Seq[OptionSpecification]] = Option(self.optionsToRemove).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateConfigurationTemplateRequestOps {

  implicit def toUpdateConfigurationTemplateRequestBuilderOps(
      v: UpdateConfigurationTemplateRequest.Builder
  ): UpdateConfigurationTemplateRequestBuilderOps = new UpdateConfigurationTemplateRequestBuilderOps(v)

  implicit def toUpdateConfigurationTemplateRequestOps(
      v: UpdateConfigurationTemplateRequest
  ): UpdateConfigurationTemplateRequestOps = new UpdateConfigurationTemplateRequestOps(v)

}
