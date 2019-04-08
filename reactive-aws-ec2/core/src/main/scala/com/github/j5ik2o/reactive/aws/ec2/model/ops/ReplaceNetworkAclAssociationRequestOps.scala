// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ReplaceNetworkAclAssociationRequestBuilderOps(val self: ReplaceNetworkAclAssociationRequest.Builder)
    extends AnyVal {

  final def associationIdAsScala(value: Option[String]): ReplaceNetworkAclAssociationRequest.Builder = {
    value.fold(self) { v =>
      self.associationId(v)
    }
  }

  final def networkAclIdAsScala(value: Option[String]): ReplaceNetworkAclAssociationRequest.Builder = {
    value.fold(self) { v =>
      self.networkAclId(v)
    }
  }

}

final class ReplaceNetworkAclAssociationRequestOps(val self: ReplaceNetworkAclAssociationRequest) extends AnyVal {

  final def associationIdAsScala: Option[String] = Option(self.associationId)

  final def networkAclIdAsScala: Option[String] = Option(self.networkAclId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToReplaceNetworkAclAssociationRequestOps {

  implicit def toReplaceNetworkAclAssociationRequestBuilderOps(
      v: ReplaceNetworkAclAssociationRequest.Builder
  ): ReplaceNetworkAclAssociationRequestBuilderOps = new ReplaceNetworkAclAssociationRequestBuilderOps(v)

  implicit def toReplaceNetworkAclAssociationRequestOps(
      v: ReplaceNetworkAclAssociationRequest
  ): ReplaceNetworkAclAssociationRequestOps = new ReplaceNetworkAclAssociationRequestOps(v)

}
