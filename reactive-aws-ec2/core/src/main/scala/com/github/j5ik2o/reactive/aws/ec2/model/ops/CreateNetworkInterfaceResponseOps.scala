// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateNetworkInterfaceResponseBuilderOps(val self: CreateNetworkInterfaceResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def networkInterfaceAsScala(value: Option[NetworkInterface]): CreateNetworkInterfaceResponse.Builder = {
            value.fold(self){ v => self.networkInterface(v) }
            } 


}

final class CreateNetworkInterfaceResponseOps(val self: CreateNetworkInterfaceResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def networkInterfaceAsScala: Option[NetworkInterface] = Option(self.networkInterface) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateNetworkInterfaceResponseOps {

implicit def toCreateNetworkInterfaceResponseBuilderOps(v: CreateNetworkInterfaceResponse.Builder): CreateNetworkInterfaceResponseBuilderOps = new CreateNetworkInterfaceResponseBuilderOps(v)

implicit def toCreateNetworkInterfaceResponseOps(v: CreateNetworkInterfaceResponse): CreateNetworkInterfaceResponseOps = new CreateNetworkInterfaceResponseOps(v)

}

