// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteNetworkAclRequestBuilderOps(val self: DeleteNetworkAclRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def networkAclIdAsScala(value: Option[String]): DeleteNetworkAclRequest.Builder = {
            value.fold(self){ v => self.networkAclId(v) }
            } 


}

final class DeleteNetworkAclRequestOps(val self: DeleteNetworkAclRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def networkAclIdAsScala: Option[String] = Option(self.networkAclId) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteNetworkAclRequestOps {

implicit def toDeleteNetworkAclRequestBuilderOps(v: DeleteNetworkAclRequest.Builder): DeleteNetworkAclRequestBuilderOps = new DeleteNetworkAclRequestBuilderOps(v)

implicit def toDeleteNetworkAclRequestOps(v: DeleteNetworkAclRequest): DeleteNetworkAclRequestOps = new DeleteNetworkAclRequestOps(v)

}

