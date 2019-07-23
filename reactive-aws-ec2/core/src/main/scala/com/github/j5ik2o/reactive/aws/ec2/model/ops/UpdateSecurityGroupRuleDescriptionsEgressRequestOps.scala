// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class UpdateSecurityGroupRuleDescriptionsEgressRequestBuilderOps(
    val self: UpdateSecurityGroupRuleDescriptionsEgressRequest.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupIdAsScala(value: Option[String]): UpdateSecurityGroupRuleDescriptionsEgressRequest.Builder = {
    value.fold(self) { v =>
      self.groupId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupNameAsScala(value: Option[String]): UpdateSecurityGroupRuleDescriptionsEgressRequest.Builder = {
    value.fold(self) { v =>
      self.groupName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipPermissionsAsScala(
      value: Option[Seq[IpPermission]]
  ): UpdateSecurityGroupRuleDescriptionsEgressRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.ipPermissions(v.asJava)
    }
  }

}

final class UpdateSecurityGroupRuleDescriptionsEgressRequestOps(
    val self: UpdateSecurityGroupRuleDescriptionsEgressRequest
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupIdAsScala: Option[String] = Option(self.groupId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupNameAsScala: Option[String] = Option(self.groupName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipPermissionsAsScala: Option[Seq[IpPermission]] = Option(self.ipPermissions).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateSecurityGroupRuleDescriptionsEgressRequestOps {

  implicit def toUpdateSecurityGroupRuleDescriptionsEgressRequestBuilderOps(
      v: UpdateSecurityGroupRuleDescriptionsEgressRequest.Builder
  ): UpdateSecurityGroupRuleDescriptionsEgressRequestBuilderOps =
    new UpdateSecurityGroupRuleDescriptionsEgressRequestBuilderOps(v)

  implicit def toUpdateSecurityGroupRuleDescriptionsEgressRequestOps(
      v: UpdateSecurityGroupRuleDescriptionsEgressRequest
  ): UpdateSecurityGroupRuleDescriptionsEgressRequestOps = new UpdateSecurityGroupRuleDescriptionsEgressRequestOps(v)

}
