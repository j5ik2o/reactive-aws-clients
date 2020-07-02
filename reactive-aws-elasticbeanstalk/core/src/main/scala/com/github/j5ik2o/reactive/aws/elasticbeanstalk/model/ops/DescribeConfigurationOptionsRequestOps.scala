// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class DescribeConfigurationOptionsRequestBuilderOps(val self: DescribeConfigurationOptionsRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def applicationNameAsScala(value: Option[String]): DescribeConfigurationOptionsRequest.Builder = {
    value.fold(self) { v => self.applicationName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def templateNameAsScala(value: Option[String]): DescribeConfigurationOptionsRequest.Builder = {
    value.fold(self) { v => self.templateName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentNameAsScala(value: Option[String]): DescribeConfigurationOptionsRequest.Builder = {
    value.fold(self) { v => self.environmentName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def solutionStackNameAsScala(value: Option[String]): DescribeConfigurationOptionsRequest.Builder = {
    value.fold(self) { v => self.solutionStackName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformArnAsScala(value: Option[String]): DescribeConfigurationOptionsRequest.Builder = {
    value.fold(self) { v => self.platformArn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def optionsAsScala(value: Option[Seq[OptionSpecification]]): DescribeConfigurationOptionsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.options(v.asJava)
    }
  }

}

final class DescribeConfigurationOptionsRequestOps(val self: DescribeConfigurationOptionsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def applicationNameAsScala: Option[String] = Option(self.applicationName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def templateNameAsScala: Option[String] = Option(self.templateName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentNameAsScala: Option[String] = Option(self.environmentName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def solutionStackNameAsScala: Option[String] = Option(self.solutionStackName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformArnAsScala: Option[String] = Option(self.platformArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def optionsAsScala: Option[Seq[OptionSpecification]] =
    Option(self.options).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeConfigurationOptionsRequestOps {

  implicit def toDescribeConfigurationOptionsRequestBuilderOps(
      v: DescribeConfigurationOptionsRequest.Builder
  ): DescribeConfigurationOptionsRequestBuilderOps = new DescribeConfigurationOptionsRequestBuilderOps(v)

  implicit def toDescribeConfigurationOptionsRequestOps(
      v: DescribeConfigurationOptionsRequest
  ): DescribeConfigurationOptionsRequestOps = new DescribeConfigurationOptionsRequestOps(v)

}
