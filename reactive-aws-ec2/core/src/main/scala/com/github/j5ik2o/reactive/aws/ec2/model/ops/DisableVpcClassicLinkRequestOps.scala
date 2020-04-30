// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DisableVpcClassicLinkRequestBuilderOps(val self: DisableVpcClassicLinkRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def vpcIdAsScala(value: Option[String]): DisableVpcClassicLinkRequest.Builder = {
            value.fold(self){ v => self.vpcId(v) }
            } 


}

final class DisableVpcClassicLinkRequestOps(val self: DisableVpcClassicLinkRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def vpcIdAsScala: Option[String] = Option(self.vpcId) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDisableVpcClassicLinkRequestOps {

implicit def toDisableVpcClassicLinkRequestBuilderOps(v: DisableVpcClassicLinkRequest.Builder): DisableVpcClassicLinkRequestBuilderOps = new DisableVpcClassicLinkRequestBuilderOps(v)

implicit def toDisableVpcClassicLinkRequestOps(v: DisableVpcClassicLinkRequest): DisableVpcClassicLinkRequestOps = new DisableVpcClassicLinkRequestOps(v)

}

