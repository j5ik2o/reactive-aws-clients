// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteDhcpOptionsRequestBuilderOps(val self: DeleteDhcpOptionsRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def dhcpOptionsIdAsScala(value: Option[String]): DeleteDhcpOptionsRequest.Builder = {
            value.fold(self){ v => self.dhcpOptionsId(v) }
            } 


}

final class DeleteDhcpOptionsRequestOps(val self: DeleteDhcpOptionsRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def dhcpOptionsIdAsScala: Option[String] = Option(self.dhcpOptionsId) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteDhcpOptionsRequestOps {

implicit def toDeleteDhcpOptionsRequestBuilderOps(v: DeleteDhcpOptionsRequest.Builder): DeleteDhcpOptionsRequestBuilderOps = new DeleteDhcpOptionsRequestBuilderOps(v)

implicit def toDeleteDhcpOptionsRequestOps(v: DeleteDhcpOptionsRequest): DeleteDhcpOptionsRequestOps = new DeleteDhcpOptionsRequestOps(v)

}

