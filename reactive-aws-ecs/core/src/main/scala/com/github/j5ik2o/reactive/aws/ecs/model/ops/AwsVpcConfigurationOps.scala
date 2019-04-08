// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class AwsVpcConfigurationBuilderOps(val self: AwsVpcConfiguration.Builder) extends AnyVal {

  final def subnetsAsScala(value: Option[Seq[String]]): AwsVpcConfiguration.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.subnets(v.asJava)
    }
  }

  final def securityGroupsAsScala(value: Option[Seq[String]]): AwsVpcConfiguration.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.securityGroups(v.asJava)
    }
  }

  final def assignPublicIpAsScala(value: Option[AssignPublicIp]): AwsVpcConfiguration.Builder = {
    value.fold(self) { v =>
      self.assignPublicIp(v)
    }
  }

}

final class AwsVpcConfigurationOps(val self: AwsVpcConfiguration) extends AnyVal {

  final def subnetsAsScala: Option[Seq[String]] = Option(self.subnets).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def securityGroupsAsScala: Option[Seq[String]] = Option(self.securityGroups).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def assignPublicIpAsScala: Option[AssignPublicIp] = Option(self.assignPublicIp)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAwsVpcConfigurationOps {

  implicit def toAwsVpcConfigurationBuilderOps(v: AwsVpcConfiguration.Builder): AwsVpcConfigurationBuilderOps =
    new AwsVpcConfigurationBuilderOps(v)

  implicit def toAwsVpcConfigurationOps(v: AwsVpcConfiguration): AwsVpcConfigurationOps = new AwsVpcConfigurationOps(v)

}
