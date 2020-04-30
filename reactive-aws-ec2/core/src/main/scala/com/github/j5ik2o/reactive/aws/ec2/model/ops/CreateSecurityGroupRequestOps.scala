// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateSecurityGroupRequestBuilderOps(val self: CreateSecurityGroupRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def descriptionAsScala(value: Option[String]): CreateSecurityGroupRequest.Builder = {
            value.fold(self){ v => self.description(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def groupNameAsScala(value: Option[String]): CreateSecurityGroupRequest.Builder = {
            value.fold(self){ v => self.groupName(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def vpcIdAsScala(value: Option[String]): CreateSecurityGroupRequest.Builder = {
            value.fold(self){ v => self.vpcId(v) }
            } 


}

final class CreateSecurityGroupRequestOps(val self: CreateSecurityGroupRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def descriptionAsScala: Option[String] = Option(self.description) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def groupNameAsScala: Option[String] = Option(self.groupName) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def vpcIdAsScala: Option[String] = Option(self.vpcId) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateSecurityGroupRequestOps {

implicit def toCreateSecurityGroupRequestBuilderOps(v: CreateSecurityGroupRequest.Builder): CreateSecurityGroupRequestBuilderOps = new CreateSecurityGroupRequestBuilderOps(v)

implicit def toCreateSecurityGroupRequestOps(v: CreateSecurityGroupRequest): CreateSecurityGroupRequestOps = new CreateSecurityGroupRequestOps(v)

}

