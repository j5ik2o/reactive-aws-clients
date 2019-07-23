// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyVpcEndpointServiceConfigurationRequestBuilderOps(
    val self: ModifyVpcEndpointServiceConfigurationRequest.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serviceIdAsScala(value: Option[String]): ModifyVpcEndpointServiceConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.serviceId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def acceptanceRequiredAsScala(value: Option[Boolean]): ModifyVpcEndpointServiceConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.acceptanceRequired(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def addNetworkLoadBalancerArnsAsScala(
      value: Option[Seq[String]]
  ): ModifyVpcEndpointServiceConfigurationRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.addNetworkLoadBalancerArns(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def removeNetworkLoadBalancerArnsAsScala(
      value: Option[Seq[String]]
  ): ModifyVpcEndpointServiceConfigurationRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.removeNetworkLoadBalancerArns(v.asJava)
    }
  }

}

final class ModifyVpcEndpointServiceConfigurationRequestOps(val self: ModifyVpcEndpointServiceConfigurationRequest)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serviceIdAsScala: Option[String] = Option(self.serviceId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def acceptanceRequiredAsScala: Option[Boolean] = Option(self.acceptanceRequired)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def addNetworkLoadBalancerArnsAsScala: Option[Seq[String]] = Option(self.addNetworkLoadBalancerArns).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def removeNetworkLoadBalancerArnsAsScala: Option[Seq[String]] = Option(self.removeNetworkLoadBalancerArns).map {
    v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
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
