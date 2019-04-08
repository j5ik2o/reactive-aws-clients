// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateVpcEndpointRequestBuilderOps(val self: CreateVpcEndpointRequest.Builder) extends AnyVal {

  final def vpcEndpointTypeAsScala(value: Option[VpcEndpointType]): CreateVpcEndpointRequest.Builder = {
    value.fold(self) { v =>
      self.vpcEndpointType(v)
    }
  }

  final def vpcIdAsScala(value: Option[String]): CreateVpcEndpointRequest.Builder = {
    value.fold(self) { v =>
      self.vpcId(v)
    }
  }

  final def serviceNameAsScala(value: Option[String]): CreateVpcEndpointRequest.Builder = {
    value.fold(self) { v =>
      self.serviceName(v)
    }
  }

  final def policyDocumentAsScala(value: Option[String]): CreateVpcEndpointRequest.Builder = {
    value.fold(self) { v =>
      self.policyDocument(v)
    }
  }

  final def routeTableIdsAsScala(value: Option[Seq[String]]): CreateVpcEndpointRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.routeTableIds(v.asJava)
    }
  }

  final def subnetIdsAsScala(value: Option[Seq[String]]): CreateVpcEndpointRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.subnetIds(v.asJava)
    }
  }

  final def securityGroupIdsAsScala(value: Option[Seq[String]]): CreateVpcEndpointRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.securityGroupIds(v.asJava)
    }
  }

  final def clientTokenAsScala(value: Option[String]): CreateVpcEndpointRequest.Builder = {
    value.fold(self) { v =>
      self.clientToken(v)
    }
  }

  final def privateDnsEnabledAsScala(value: Option[Boolean]): CreateVpcEndpointRequest.Builder = {
    value.fold(self) { v =>
      self.privateDnsEnabled(v)
    }
  }

}

final class CreateVpcEndpointRequestOps(val self: CreateVpcEndpointRequest) extends AnyVal {

  final def vpcEndpointTypeAsScala: Option[VpcEndpointType] = Option(self.vpcEndpointType)

  final def vpcIdAsScala: Option[String] = Option(self.vpcId)

  final def serviceNameAsScala: Option[String] = Option(self.serviceName)

  final def policyDocumentAsScala: Option[String] = Option(self.policyDocument)

  final def routeTableIdsAsScala: Option[Seq[String]] = Option(self.routeTableIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def subnetIdsAsScala: Option[Seq[String]] = Option(self.subnetIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def securityGroupIdsAsScala: Option[Seq[String]] = Option(self.securityGroupIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def clientTokenAsScala: Option[String] = Option(self.clientToken)

  final def privateDnsEnabledAsScala: Option[Boolean] = Option(self.privateDnsEnabled)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateVpcEndpointRequestOps {

  implicit def toCreateVpcEndpointRequestBuilderOps(
      v: CreateVpcEndpointRequest.Builder
  ): CreateVpcEndpointRequestBuilderOps = new CreateVpcEndpointRequestBuilderOps(v)

  implicit def toCreateVpcEndpointRequestOps(v: CreateVpcEndpointRequest): CreateVpcEndpointRequestOps =
    new CreateVpcEndpointRequestOps(v)

}
