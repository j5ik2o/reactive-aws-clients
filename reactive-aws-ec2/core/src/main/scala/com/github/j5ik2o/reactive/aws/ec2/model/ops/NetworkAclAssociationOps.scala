// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class NetworkAclAssociationBuilderOps(val self: NetworkAclAssociation.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def networkAclAssociationIdAsScala(value: Option[String]): NetworkAclAssociation.Builder = {
            value.fold(self){ v => self.networkAclAssociationId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def networkAclIdAsScala(value: Option[String]): NetworkAclAssociation.Builder = {
            value.fold(self){ v => self.networkAclId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def subnetIdAsScala(value: Option[String]): NetworkAclAssociation.Builder = {
            value.fold(self){ v => self.subnetId(v) }
            } 


}

final class NetworkAclAssociationOps(val self: NetworkAclAssociation) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def networkAclAssociationIdAsScala: Option[String] = Option(self.networkAclAssociationId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def networkAclIdAsScala: Option[String] = Option(self.networkAclId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def subnetIdAsScala: Option[String] = Option(self.subnetId) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToNetworkAclAssociationOps {

implicit def toNetworkAclAssociationBuilderOps(v: NetworkAclAssociation.Builder): NetworkAclAssociationBuilderOps = new NetworkAclAssociationBuilderOps(v)

implicit def toNetworkAclAssociationOps(v: NetworkAclAssociation): NetworkAclAssociationOps = new NetworkAclAssociationOps(v)

}

