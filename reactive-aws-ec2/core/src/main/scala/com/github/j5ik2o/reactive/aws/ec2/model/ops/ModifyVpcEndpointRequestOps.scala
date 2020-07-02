// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyVpcEndpointRequestBuilderOps(val self: ModifyVpcEndpointRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcEndpointIdAsScala(value: Option[String]): ModifyVpcEndpointRequest.Builder = {
    value.fold(self) { v => self.vpcEndpointId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resetPolicyAsScala(value: Option[Boolean]): ModifyVpcEndpointRequest.Builder = {
    value.fold(self) { v => self.resetPolicy(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def policyDocumentAsScala(value: Option[String]): ModifyVpcEndpointRequest.Builder = {
    value.fold(self) { v => self.policyDocument(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def addRouteTableIdsAsScala(value: Option[Seq[String]]): ModifyVpcEndpointRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.addRouteTableIds(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def removeRouteTableIdsAsScala(value: Option[Seq[String]]): ModifyVpcEndpointRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.removeRouteTableIds(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def addSubnetIdsAsScala(value: Option[Seq[String]]): ModifyVpcEndpointRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.addSubnetIds(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def removeSubnetIdsAsScala(value: Option[Seq[String]]): ModifyVpcEndpointRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.removeSubnetIds(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def addSecurityGroupIdsAsScala(value: Option[Seq[String]]): ModifyVpcEndpointRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.addSecurityGroupIds(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def removeSecurityGroupIdsAsScala(value: Option[Seq[String]]): ModifyVpcEndpointRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.removeSecurityGroupIds(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def privateDnsEnabledAsScala(value: Option[Boolean]): ModifyVpcEndpointRequest.Builder = {
    value.fold(self) { v => self.privateDnsEnabled(v) }
  }

}

final class ModifyVpcEndpointRequestOps(val self: ModifyVpcEndpointRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcEndpointIdAsScala: Option[String] = Option(self.vpcEndpointId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resetPolicyAsScala: Option[Boolean] = Option(self.resetPolicy)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def policyDocumentAsScala: Option[String] = Option(self.policyDocument)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def addRouteTableIdsAsScala: Option[Seq[String]] =
    Option(self.addRouteTableIds).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def removeRouteTableIdsAsScala: Option[Seq[String]] =
    Option(self.removeRouteTableIds).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def addSubnetIdsAsScala: Option[Seq[String]] =
    Option(self.addSubnetIds).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def removeSubnetIdsAsScala: Option[Seq[String]] =
    Option(self.removeSubnetIds).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def addSecurityGroupIdsAsScala: Option[Seq[String]] =
    Option(self.addSecurityGroupIds).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def removeSecurityGroupIdsAsScala: Option[Seq[String]] =
    Option(self.removeSecurityGroupIds).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
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
