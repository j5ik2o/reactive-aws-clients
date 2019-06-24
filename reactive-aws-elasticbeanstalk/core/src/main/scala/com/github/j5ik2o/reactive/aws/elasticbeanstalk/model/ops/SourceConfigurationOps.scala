// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class SourceConfigurationBuilderOps(val self: SourceConfiguration.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def applicationNameAsScala(value: Option[String]): SourceConfiguration.Builder = {
    value.fold(self) { v =>
      self.applicationName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def templateNameAsScala(value: Option[String]): SourceConfiguration.Builder = {
    value.fold(self) { v =>
      self.templateName(v)
    }
  }

}

final class SourceConfigurationOps(val self: SourceConfiguration) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def applicationNameAsScala: Option[String] = Option(self.applicationName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def templateNameAsScala: Option[String] = Option(self.templateName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSourceConfigurationOps {

  implicit def toSourceConfigurationBuilderOps(v: SourceConfiguration.Builder): SourceConfigurationBuilderOps =
    new SourceConfigurationBuilderOps(v)

  implicit def toSourceConfigurationOps(v: SourceConfiguration): SourceConfigurationOps = new SourceConfigurationOps(v)

}
