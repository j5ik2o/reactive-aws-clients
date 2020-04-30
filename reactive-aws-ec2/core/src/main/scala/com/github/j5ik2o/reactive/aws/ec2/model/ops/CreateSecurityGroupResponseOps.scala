// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateSecurityGroupResponseBuilderOps(val self: CreateSecurityGroupResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def groupIdAsScala(value: Option[String]): CreateSecurityGroupResponse.Builder = {
            value.fold(self){ v => self.groupId(v) }
            } 


}

final class CreateSecurityGroupResponseOps(val self: CreateSecurityGroupResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def groupIdAsScala: Option[String] = Option(self.groupId) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateSecurityGroupResponseOps {

implicit def toCreateSecurityGroupResponseBuilderOps(v: CreateSecurityGroupResponse.Builder): CreateSecurityGroupResponseBuilderOps = new CreateSecurityGroupResponseBuilderOps(v)

implicit def toCreateSecurityGroupResponseOps(v: CreateSecurityGroupResponse): CreateSecurityGroupResponseOps = new CreateSecurityGroupResponseOps(v)

}

