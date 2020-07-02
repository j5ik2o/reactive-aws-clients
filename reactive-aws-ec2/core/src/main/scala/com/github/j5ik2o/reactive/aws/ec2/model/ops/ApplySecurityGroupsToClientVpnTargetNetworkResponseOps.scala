// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ApplySecurityGroupsToClientVpnTargetNetworkResponseBuilderOps(
    val self: ApplySecurityGroupsToClientVpnTargetNetworkResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def securityGroupIdsAsScala(
      value: Option[Seq[String]]
  ): ApplySecurityGroupsToClientVpnTargetNetworkResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.securityGroupIds(v.asJava)
    }
  }

}

final class ApplySecurityGroupsToClientVpnTargetNetworkResponseOps(
    val self: ApplySecurityGroupsToClientVpnTargetNetworkResponse
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def securityGroupIdsAsScala: Option[Seq[String]] =
    Option(self.securityGroupIds).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToApplySecurityGroupsToClientVpnTargetNetworkResponseOps {

  implicit def toApplySecurityGroupsToClientVpnTargetNetworkResponseBuilderOps(
      v: ApplySecurityGroupsToClientVpnTargetNetworkResponse.Builder
  ): ApplySecurityGroupsToClientVpnTargetNetworkResponseBuilderOps =
    new ApplySecurityGroupsToClientVpnTargetNetworkResponseBuilderOps(v)

  implicit def toApplySecurityGroupsToClientVpnTargetNetworkResponseOps(
      v: ApplySecurityGroupsToClientVpnTargetNetworkResponse
  ): ApplySecurityGroupsToClientVpnTargetNetworkResponseOps =
    new ApplySecurityGroupsToClientVpnTargetNetworkResponseOps(v)

}
