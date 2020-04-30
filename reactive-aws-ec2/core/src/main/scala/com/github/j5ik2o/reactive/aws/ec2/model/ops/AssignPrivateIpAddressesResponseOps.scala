// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class AssignPrivateIpAddressesResponseBuilderOps(val self: AssignPrivateIpAddressesResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def networkInterfaceIdAsScala(value: Option[String]): AssignPrivateIpAddressesResponse.Builder = {
            value.fold(self){ v => self.networkInterfaceId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def assignedPrivateIpAddressesAsScala(value: Option[Seq[AssignedPrivateIpAddress]]): AssignPrivateIpAddressesResponse.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.assignedPrivateIpAddresses(v.asJava) } 
            }


}

final class AssignPrivateIpAddressesResponseOps(val self: AssignPrivateIpAddressesResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def networkInterfaceIdAsScala: Option[String] = Option(self.networkInterfaceId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def assignedPrivateIpAddressesAsScala: Option[Seq[AssignedPrivateIpAddress]] = Option(self.assignedPrivateIpAddresses).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAssignPrivateIpAddressesResponseOps {

implicit def toAssignPrivateIpAddressesResponseBuilderOps(v: AssignPrivateIpAddressesResponse.Builder): AssignPrivateIpAddressesResponseBuilderOps = new AssignPrivateIpAddressesResponseBuilderOps(v)

implicit def toAssignPrivateIpAddressesResponseOps(v: AssignPrivateIpAddressesResponse): AssignPrivateIpAddressesResponseOps = new AssignPrivateIpAddressesResponseOps(v)

}

