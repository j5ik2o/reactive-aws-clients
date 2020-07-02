// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class TargetNetworkBuilderOps(val self: TargetNetwork.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def associationIdAsScala(value: Option[String]): TargetNetwork.Builder = {
    value.fold(self) { v => self.associationId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcIdAsScala(value: Option[String]): TargetNetwork.Builder = {
    value.fold(self) { v => self.vpcId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def targetNetworkIdAsScala(value: Option[String]): TargetNetwork.Builder = {
    value.fold(self) { v => self.targetNetworkId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientVpnEndpointIdAsScala(value: Option[String]): TargetNetwork.Builder = {
    value.fold(self) { v => self.clientVpnEndpointId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[AssociationStatus]): TargetNetwork.Builder = {
    value.fold(self) { v => self.status(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def securityGroupsAsScala(value: Option[Seq[String]]): TargetNetwork.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.securityGroups(v.asJava)
    }
  }

}

final class TargetNetworkOps(val self: TargetNetwork) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def associationIdAsScala: Option[String] = Option(self.associationId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcIdAsScala: Option[String] = Option(self.vpcId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def targetNetworkIdAsScala: Option[String] = Option(self.targetNetworkId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientVpnEndpointIdAsScala: Option[String] = Option(self.clientVpnEndpointId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[AssociationStatus] = Option(self.status)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def securityGroupsAsScala: Option[Seq[String]] =
    Option(self.securityGroups).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTargetNetworkOps {

  implicit def toTargetNetworkBuilderOps(v: TargetNetwork.Builder): TargetNetworkBuilderOps =
    new TargetNetworkBuilderOps(v)

  implicit def toTargetNetworkOps(v: TargetNetwork): TargetNetworkOps = new TargetNetworkOps(v)

}
