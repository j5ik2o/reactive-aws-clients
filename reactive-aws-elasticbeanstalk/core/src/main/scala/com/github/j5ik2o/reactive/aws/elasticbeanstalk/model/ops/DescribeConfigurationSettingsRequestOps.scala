// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class DescribeConfigurationSettingsRequestBuilderOps(val self: DescribeConfigurationSettingsRequest.Builder)
    extends AnyVal {

  final def applicationNameAsScala(value: Option[String]): DescribeConfigurationSettingsRequest.Builder = {
    value.fold(self) { v =>
      self.applicationName(v)
    }
  }

  final def templateNameAsScala(value: Option[String]): DescribeConfigurationSettingsRequest.Builder = {
    value.fold(self) { v =>
      self.templateName(v)
    }
  }

  final def environmentNameAsScala(value: Option[String]): DescribeConfigurationSettingsRequest.Builder = {
    value.fold(self) { v =>
      self.environmentName(v)
    }
  }

}

final class DescribeConfigurationSettingsRequestOps(val self: DescribeConfigurationSettingsRequest) extends AnyVal {

  final def applicationNameAsScala: Option[String] = Option(self.applicationName)

  final def templateNameAsScala: Option[String] = Option(self.templateName)

  final def environmentNameAsScala: Option[String] = Option(self.environmentName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeConfigurationSettingsRequestOps {

  implicit def toDescribeConfigurationSettingsRequestBuilderOps(
      v: DescribeConfigurationSettingsRequest.Builder
  ): DescribeConfigurationSettingsRequestBuilderOps = new DescribeConfigurationSettingsRequestBuilderOps(v)

  implicit def toDescribeConfigurationSettingsRequestOps(
      v: DescribeConfigurationSettingsRequest
  ): DescribeConfigurationSettingsRequestOps = new DescribeConfigurationSettingsRequestOps(v)

}
