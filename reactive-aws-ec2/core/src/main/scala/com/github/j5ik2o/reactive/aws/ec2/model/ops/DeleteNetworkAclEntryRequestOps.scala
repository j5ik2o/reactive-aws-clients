// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteNetworkAclEntryRequestBuilderOps(val self: DeleteNetworkAclEntryRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def egressAsScala(value: Option[Boolean]): DeleteNetworkAclEntryRequest.Builder = {
    value.fold(self) { v => self.egress(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkAclIdAsScala(value: Option[String]): DeleteNetworkAclEntryRequest.Builder = {
    value.fold(self) { v => self.networkAclId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ruleNumberAsScala(value: Option[Int]): DeleteNetworkAclEntryRequest.Builder = {
    value.fold(self) { v => self.ruleNumber(v) }
  }

}

final class DeleteNetworkAclEntryRequestOps(val self: DeleteNetworkAclEntryRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def egressAsScala: Option[Boolean] = Option(self.egress)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkAclIdAsScala: Option[String] = Option(self.networkAclId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ruleNumberAsScala: Option[Int] = Option(self.ruleNumber)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteNetworkAclEntryRequestOps {

  implicit def toDeleteNetworkAclEntryRequestBuilderOps(
      v: DeleteNetworkAclEntryRequest.Builder
  ): DeleteNetworkAclEntryRequestBuilderOps = new DeleteNetworkAclEntryRequestBuilderOps(v)

  implicit def toDeleteNetworkAclEntryRequestOps(v: DeleteNetworkAclEntryRequest): DeleteNetworkAclEntryRequestOps =
    new DeleteNetworkAclEntryRequestOps(v)

}
