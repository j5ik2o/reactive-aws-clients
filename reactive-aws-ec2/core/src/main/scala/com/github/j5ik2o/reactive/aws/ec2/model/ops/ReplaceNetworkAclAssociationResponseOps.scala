// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ReplaceNetworkAclAssociationResponseBuilderOps(val self: ReplaceNetworkAclAssociationResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def newAssociationIdAsScala(value: Option[String]): ReplaceNetworkAclAssociationResponse.Builder = {
    value.fold(self) { v =>
      self.newAssociationId(v)
    }
  }

}

final class ReplaceNetworkAclAssociationResponseOps(val self: ReplaceNetworkAclAssociationResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def newAssociationIdAsScala: Option[String] = Option(self.newAssociationId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToReplaceNetworkAclAssociationResponseOps {

  implicit def toReplaceNetworkAclAssociationResponseBuilderOps(
      v: ReplaceNetworkAclAssociationResponse.Builder
  ): ReplaceNetworkAclAssociationResponseBuilderOps = new ReplaceNetworkAclAssociationResponseBuilderOps(v)

  implicit def toReplaceNetworkAclAssociationResponseOps(
      v: ReplaceNetworkAclAssociationResponse
  ): ReplaceNetworkAclAssociationResponseOps = new ReplaceNetworkAclAssociationResponseOps(v)

}
