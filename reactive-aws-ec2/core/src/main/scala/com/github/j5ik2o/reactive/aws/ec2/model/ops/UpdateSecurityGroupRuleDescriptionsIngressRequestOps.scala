// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class UpdateSecurityGroupRuleDescriptionsIngressRequestBuilderOps(
    val self: UpdateSecurityGroupRuleDescriptionsIngressRequest.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupIdAsScala(value: Option[String]): UpdateSecurityGroupRuleDescriptionsIngressRequest.Builder = {
    value.fold(self) { v => self.groupId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupNameAsScala(value: Option[String]): UpdateSecurityGroupRuleDescriptionsIngressRequest.Builder = {
    value.fold(self) { v => self.groupName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipPermissionsAsScala(
      value: Option[Seq[IpPermission]]
  ): UpdateSecurityGroupRuleDescriptionsIngressRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.ipPermissions(v.asJava)
    }
  }

}

final class UpdateSecurityGroupRuleDescriptionsIngressRequestOps(
    val self: UpdateSecurityGroupRuleDescriptionsIngressRequest
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupIdAsScala: Option[String] = Option(self.groupId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupNameAsScala: Option[String] = Option(self.groupName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipPermissionsAsScala: Option[Seq[IpPermission]] =
    Option(self.ipPermissions).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateSecurityGroupRuleDescriptionsIngressRequestOps {

  implicit def toUpdateSecurityGroupRuleDescriptionsIngressRequestBuilderOps(
      v: UpdateSecurityGroupRuleDescriptionsIngressRequest.Builder
  ): UpdateSecurityGroupRuleDescriptionsIngressRequestBuilderOps =
    new UpdateSecurityGroupRuleDescriptionsIngressRequestBuilderOps(v)

  implicit def toUpdateSecurityGroupRuleDescriptionsIngressRequestOps(
      v: UpdateSecurityGroupRuleDescriptionsIngressRequest
  ): UpdateSecurityGroupRuleDescriptionsIngressRequestOps = new UpdateSecurityGroupRuleDescriptionsIngressRequestOps(v)

}
