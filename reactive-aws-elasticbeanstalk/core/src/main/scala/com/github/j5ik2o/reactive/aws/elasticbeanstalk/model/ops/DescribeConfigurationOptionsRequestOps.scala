// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class DescribeConfigurationOptionsRequestBuilderOps(val self: DescribeConfigurationOptionsRequest.Builder)
    extends AnyVal {

  final def applicationNameAsScala(value: Option[String]): DescribeConfigurationOptionsRequest.Builder = {
    value.fold(self) { v =>
      self.applicationName(v)
    }
  }

  final def templateNameAsScala(value: Option[String]): DescribeConfigurationOptionsRequest.Builder = {
    value.fold(self) { v =>
      self.templateName(v)
    }
  }

  final def environmentNameAsScala(value: Option[String]): DescribeConfigurationOptionsRequest.Builder = {
    value.fold(self) { v =>
      self.environmentName(v)
    }
  }

  final def solutionStackNameAsScala(value: Option[String]): DescribeConfigurationOptionsRequest.Builder = {
    value.fold(self) { v =>
      self.solutionStackName(v)
    }
  }

  final def platformArnAsScala(value: Option[String]): DescribeConfigurationOptionsRequest.Builder = {
    value.fold(self) { v =>
      self.platformArn(v)
    }
  }

  final def optionsAsScala(value: Option[Seq[OptionSpecification]]): DescribeConfigurationOptionsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.options(v.asJava)
    }
  }

}

final class DescribeConfigurationOptionsRequestOps(val self: DescribeConfigurationOptionsRequest) extends AnyVal {

  final def applicationNameAsScala: Option[String] = Option(self.applicationName)

  final def templateNameAsScala: Option[String] = Option(self.templateName)

  final def environmentNameAsScala: Option[String] = Option(self.environmentName)

  final def solutionStackNameAsScala: Option[String] = Option(self.solutionStackName)

  final def platformArnAsScala: Option[String] = Option(self.platformArn)

  final def optionsAsScala: Option[Seq[OptionSpecification]] = Option(self.options).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

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
