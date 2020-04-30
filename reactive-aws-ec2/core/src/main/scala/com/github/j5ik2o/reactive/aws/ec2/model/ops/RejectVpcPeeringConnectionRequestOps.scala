// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class RejectVpcPeeringConnectionRequestBuilderOps(val self: RejectVpcPeeringConnectionRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def vpcPeeringConnectionIdAsScala(value: Option[String]): RejectVpcPeeringConnectionRequest.Builder = {
            value.fold(self){ v => self.vpcPeeringConnectionId(v) }
            } 


}

final class RejectVpcPeeringConnectionRequestOps(val self: RejectVpcPeeringConnectionRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def vpcPeeringConnectionIdAsScala: Option[String] = Option(self.vpcPeeringConnectionId) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRejectVpcPeeringConnectionRequestOps {

implicit def toRejectVpcPeeringConnectionRequestBuilderOps(v: RejectVpcPeeringConnectionRequest.Builder): RejectVpcPeeringConnectionRequestBuilderOps = new RejectVpcPeeringConnectionRequestBuilderOps(v)

implicit def toRejectVpcPeeringConnectionRequestOps(v: RejectVpcPeeringConnectionRequest): RejectVpcPeeringConnectionRequestOps = new RejectVpcPeeringConnectionRequestOps(v)

}

