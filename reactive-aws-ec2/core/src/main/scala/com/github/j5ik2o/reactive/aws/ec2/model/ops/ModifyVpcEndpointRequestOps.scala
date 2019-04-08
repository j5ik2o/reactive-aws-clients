// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyVpcEndpointRequestBuilderOps(val self: ModifyVpcEndpointRequest.Builder) extends AnyVal {

  final def vpcEndpointIdAsScala(value: Option[String]): ModifyVpcEndpointRequest.Builder = {
    value.fold(self) { v =>
      self.vpcEndpointId(v)
    }
  }

  final def resetPolicyAsScala(value: Option[Boolean]): ModifyVpcEndpointRequest.Builder = {
    value.fold(self) { v =>
      self.resetPolicy(v)
    }
  }

  final def policyDocumentAsScala(value: Option[String]): ModifyVpcEndpointRequest.Builder = {
    value.fold(self) { v =>
      self.policyDocument(v)
    }
  }

  final def addRouteTableIdsAsScala(value: Option[Seq[String]]): ModifyVpcEndpointRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.addRouteTableIds(v.asJava)
    }
  }

  final def removeRouteTableIdsAsScala(value: Option[Seq[String]]): ModifyVpcEndpointRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.removeRouteTableIds(v.asJava)
    }
  }

  final def addSubnetIdsAsScala(value: Option[Seq[String]]): ModifyVpcEndpointRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.addSubnetIds(v.asJava)
    }
  }

  final def removeSubnetIdsAsScala(value: Option[Seq[String]]): ModifyVpcEndpointRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.removeSubnetIds(v.asJava)
    }
  }

  final def addSecurityGroupIdsAsScala(value: Option[Seq[String]]): ModifyVpcEndpointRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.addSecurityGroupIds(v.asJava)
    }
  }

  final def removeSecurityGroupIdsAsScala(value: Option[Seq[String]]): ModifyVpcEndpointRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.removeSecurityGroupIds(v.asJava)
    }
  }

  final def privateDnsEnabledAsScala(value: Option[Boolean]): ModifyVpcEndpointRequest.Builder = {
    value.fold(self) { v =>
      self.privateDnsEnabled(v)
    }
  }

}

final class ModifyVpcEndpointRequestOps(val self: ModifyVpcEndpointRequest) extends AnyVal {

  final def vpcEndpointIdAsScala: Option[String] = Option(self.vpcEndpointId)

  final def resetPolicyAsScala: Option[Boolean] = Option(self.resetPolicy)

  final def policyDocumentAsScala: Option[String] = Option(self.policyDocument)

  final def addRouteTableIdsAsScala: Option[Seq[String]] = Option(self.addRouteTableIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def removeRouteTableIdsAsScala: Option[Seq[String]] = Option(self.removeRouteTableIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def addSubnetIdsAsScala: Option[Seq[String]] = Option(self.addSubnetIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def removeSubnetIdsAsScala: Option[Seq[String]] = Option(self.removeSubnetIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def addSecurityGroupIdsAsScala: Option[Seq[String]] = Option(self.addSecurityGroupIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def removeSecurityGroupIdsAsScala: Option[Seq[String]] = Option(self.removeSecurityGroupIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def privateDnsEnabledAsScala: Option[Boolean] = Option(self.privateDnsEnabled)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifyVpcEndpointRequestOps {

  implicit def toModifyVpcEndpointRequestBuilderOps(
      v: ModifyVpcEndpointRequest.Builder
  ): ModifyVpcEndpointRequestBuilderOps = new ModifyVpcEndpointRequestBuilderOps(v)

  implicit def toModifyVpcEndpointRequestOps(v: ModifyVpcEndpointRequest): ModifyVpcEndpointRequestOps =
    new ModifyVpcEndpointRequestOps(v)

}
