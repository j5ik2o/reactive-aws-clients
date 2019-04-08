// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyVpcEndpointServiceConfigurationRequestBuilderOps(
    val self: ModifyVpcEndpointServiceConfigurationRequest.Builder
) extends AnyVal {

  final def serviceIdAsScala(value: Option[String]): ModifyVpcEndpointServiceConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.serviceId(v)
    }
  }

  final def acceptanceRequiredAsScala(value: Option[Boolean]): ModifyVpcEndpointServiceConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.acceptanceRequired(v)
    }
  }

  final def addNetworkLoadBalancerArnsAsScala(
      value: Option[Seq[String]]
  ): ModifyVpcEndpointServiceConfigurationRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.addNetworkLoadBalancerArns(v.asJava)
    }
  }

  final def removeNetworkLoadBalancerArnsAsScala(
      value: Option[Seq[String]]
  ): ModifyVpcEndpointServiceConfigurationRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.removeNetworkLoadBalancerArns(v.asJava)
    }
  }

}

final class ModifyVpcEndpointServiceConfigurationRequestOps(val self: ModifyVpcEndpointServiceConfigurationRequest)
    extends AnyVal {

  final def serviceIdAsScala: Option[String] = Option(self.serviceId)

  final def acceptanceRequiredAsScala: Option[Boolean] = Option(self.acceptanceRequired)

  final def addNetworkLoadBalancerArnsAsScala: Option[Seq[String]] = Option(self.addNetworkLoadBalancerArns).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def removeNetworkLoadBalancerArnsAsScala: Option[Seq[String]] = Option(self.removeNetworkLoadBalancerArns).map {
    v =>
      import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifyVpcEndpointServiceConfigurationRequestOps {

  implicit def toModifyVpcEndpointServiceConfigurationRequestBuilderOps(
      v: ModifyVpcEndpointServiceConfigurationRequest.Builder
  ): ModifyVpcEndpointServiceConfigurationRequestBuilderOps =
    new ModifyVpcEndpointServiceConfigurationRequestBuilderOps(v)

  implicit def toModifyVpcEndpointServiceConfigurationRequestOps(
      v: ModifyVpcEndpointServiceConfigurationRequest
  ): ModifyVpcEndpointServiceConfigurationRequestOps = new ModifyVpcEndpointServiceConfigurationRequestOps(v)

}
