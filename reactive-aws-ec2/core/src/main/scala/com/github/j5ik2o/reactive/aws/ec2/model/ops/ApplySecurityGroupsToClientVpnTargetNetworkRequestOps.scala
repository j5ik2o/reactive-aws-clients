// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ApplySecurityGroupsToClientVpnTargetNetworkRequestBuilderOps(
    val self: ApplySecurityGroupsToClientVpnTargetNetworkRequest.Builder
) extends AnyVal {

  final def clientVpnEndpointIdAsScala(
      value: Option[String]
  ): ApplySecurityGroupsToClientVpnTargetNetworkRequest.Builder = {
    value.fold(self) { v =>
      self.clientVpnEndpointId(v)
    }
  }

  final def vpcIdAsScala(value: Option[String]): ApplySecurityGroupsToClientVpnTargetNetworkRequest.Builder = {
    value.fold(self) { v =>
      self.vpcId(v)
    }
  }

  final def securityGroupIdsAsScala(
      value: Option[Seq[String]]
  ): ApplySecurityGroupsToClientVpnTargetNetworkRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.securityGroupIds(v.asJava)
    }
  }

}

final class ApplySecurityGroupsToClientVpnTargetNetworkRequestOps(
    val self: ApplySecurityGroupsToClientVpnTargetNetworkRequest
) extends AnyVal {

  final def clientVpnEndpointIdAsScala: Option[String] = Option(self.clientVpnEndpointId)

  final def vpcIdAsScala: Option[String] = Option(self.vpcId)

  final def securityGroupIdsAsScala: Option[Seq[String]] = Option(self.securityGroupIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToApplySecurityGroupsToClientVpnTargetNetworkRequestOps {

  implicit def toApplySecurityGroupsToClientVpnTargetNetworkRequestBuilderOps(
      v: ApplySecurityGroupsToClientVpnTargetNetworkRequest.Builder
  ): ApplySecurityGroupsToClientVpnTargetNetworkRequestBuilderOps =
    new ApplySecurityGroupsToClientVpnTargetNetworkRequestBuilderOps(v)

  implicit def toApplySecurityGroupsToClientVpnTargetNetworkRequestOps(
      v: ApplySecurityGroupsToClientVpnTargetNetworkRequest
  ): ApplySecurityGroupsToClientVpnTargetNetworkRequestOps =
    new ApplySecurityGroupsToClientVpnTargetNetworkRequestOps(v)

}
