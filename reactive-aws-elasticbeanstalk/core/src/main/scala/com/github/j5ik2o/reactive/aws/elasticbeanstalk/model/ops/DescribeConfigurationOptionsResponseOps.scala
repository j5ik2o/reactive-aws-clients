// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class DescribeConfigurationOptionsResponseBuilderOps(val self: DescribeConfigurationOptionsResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def solutionStackNameAsScala(value: Option[String]): DescribeConfigurationOptionsResponse.Builder = {
    value.fold(self) { v => self.solutionStackName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformArnAsScala(value: Option[String]): DescribeConfigurationOptionsResponse.Builder = {
    value.fold(self) { v => self.platformArn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def optionsAsScala(
      value: Option[Seq[ConfigurationOptionDescription]]
  ): DescribeConfigurationOptionsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.options(v.asJava)
    }
  }

}

final class DescribeConfigurationOptionsResponseOps(val self: DescribeConfigurationOptionsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def solutionStackNameAsScala: Option[String] = Option(self.solutionStackName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformArnAsScala: Option[String] = Option(self.platformArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def optionsAsScala: Option[Seq[ConfigurationOptionDescription]] =
    Option(self.options).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeConfigurationOptionsResponseOps {

  implicit def toDescribeConfigurationOptionsResponseBuilderOps(
      v: DescribeConfigurationOptionsResponse.Builder
  ): DescribeConfigurationOptionsResponseBuilderOps = new DescribeConfigurationOptionsResponseBuilderOps(v)

  implicit def toDescribeConfigurationOptionsResponseOps(
      v: DescribeConfigurationOptionsResponse
  ): DescribeConfigurationOptionsResponseOps = new DescribeConfigurationOptionsResponseOps(v)

}
