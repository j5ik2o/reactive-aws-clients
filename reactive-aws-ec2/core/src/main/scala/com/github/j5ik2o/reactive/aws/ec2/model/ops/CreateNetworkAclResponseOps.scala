// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateNetworkAclResponseBuilderOps(val self: CreateNetworkAclResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkAclAsScala(value: Option[NetworkAcl]): CreateNetworkAclResponse.Builder = {
    value.fold(self) { v =>
      self.networkAcl(v)
    }
  }

}

final class CreateNetworkAclResponseOps(val self: CreateNetworkAclResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkAclAsScala: Option[NetworkAcl] = Option(self.networkAcl)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateNetworkAclResponseOps {

  implicit def toCreateNetworkAclResponseBuilderOps(
      v: CreateNetworkAclResponse.Builder
  ): CreateNetworkAclResponseBuilderOps = new CreateNetworkAclResponseBuilderOps(v)

  implicit def toCreateNetworkAclResponseOps(v: CreateNetworkAclResponse): CreateNetworkAclResponseOps =
    new CreateNetworkAclResponseOps(v)

}
