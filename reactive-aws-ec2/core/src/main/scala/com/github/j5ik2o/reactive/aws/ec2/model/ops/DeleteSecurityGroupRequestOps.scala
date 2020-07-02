// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteSecurityGroupRequestBuilderOps(val self: DeleteSecurityGroupRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupIdAsScala(value: Option[String]): DeleteSecurityGroupRequest.Builder = {
    value.fold(self) { v => self.groupId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupNameAsScala(value: Option[String]): DeleteSecurityGroupRequest.Builder = {
    value.fold(self) { v => self.groupName(v) }
  }

}

final class DeleteSecurityGroupRequestOps(val self: DeleteSecurityGroupRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupIdAsScala: Option[String] = Option(self.groupId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupNameAsScala: Option[String] = Option(self.groupName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteSecurityGroupRequestOps {

  implicit def toDeleteSecurityGroupRequestBuilderOps(
      v: DeleteSecurityGroupRequest.Builder
  ): DeleteSecurityGroupRequestBuilderOps = new DeleteSecurityGroupRequestBuilderOps(v)

  implicit def toDeleteSecurityGroupRequestOps(v: DeleteSecurityGroupRequest): DeleteSecurityGroupRequestOps =
    new DeleteSecurityGroupRequestOps(v)

}
