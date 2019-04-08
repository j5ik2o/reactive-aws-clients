// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class TargetNetworkBuilderOps(val self: TargetNetwork.Builder) extends AnyVal {

  final def associationIdAsScala(value: Option[String]): TargetNetwork.Builder = {
    value.fold(self) { v =>
      self.associationId(v)
    }
  }

  final def vpcIdAsScala(value: Option[String]): TargetNetwork.Builder = {
    value.fold(self) { v =>
      self.vpcId(v)
    }
  }

  final def targetNetworkIdAsScala(value: Option[String]): TargetNetwork.Builder = {
    value.fold(self) { v =>
      self.targetNetworkId(v)
    }
  }

  final def clientVpnEndpointIdAsScala(value: Option[String]): TargetNetwork.Builder = {
    value.fold(self) { v =>
      self.clientVpnEndpointId(v)
    }
  }

  final def statusAsScala(value: Option[AssociationStatus]): TargetNetwork.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  final def securityGroupsAsScala(value: Option[Seq[String]]): TargetNetwork.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.securityGroups(v.asJava)
    }
  }

}

final class TargetNetworkOps(val self: TargetNetwork) extends AnyVal {

  final def associationIdAsScala: Option[String] = Option(self.associationId)

  final def vpcIdAsScala: Option[String] = Option(self.vpcId)

  final def targetNetworkIdAsScala: Option[String] = Option(self.targetNetworkId)

  final def clientVpnEndpointIdAsScala: Option[String] = Option(self.clientVpnEndpointId)

  final def statusAsScala: Option[AssociationStatus] = Option(self.status)

  final def securityGroupsAsScala: Option[Seq[String]] = Option(self.securityGroups).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTargetNetworkOps {

  implicit def toTargetNetworkBuilderOps(v: TargetNetwork.Builder): TargetNetworkBuilderOps =
    new TargetNetworkBuilderOps(v)

  implicit def toTargetNetworkOps(v: TargetNetwork): TargetNetworkOps = new TargetNetworkOps(v)

}
