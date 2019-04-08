// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class UpdateSecurityGroupRuleDescriptionsEgressRequestBuilderOps(
    val self: UpdateSecurityGroupRuleDescriptionsEgressRequest.Builder
) extends AnyVal {

  final def groupIdAsScala(value: Option[String]): UpdateSecurityGroupRuleDescriptionsEgressRequest.Builder = {
    value.fold(self) { v =>
      self.groupId(v)
    }
  }

  final def groupNameAsScala(value: Option[String]): UpdateSecurityGroupRuleDescriptionsEgressRequest.Builder = {
    value.fold(self) { v =>
      self.groupName(v)
    }
  }

  final def ipPermissionsAsScala(
      value: Option[Seq[IpPermission]]
  ): UpdateSecurityGroupRuleDescriptionsEgressRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.ipPermissions(v.asJava)
    }
  }

}

final class UpdateSecurityGroupRuleDescriptionsEgressRequestOps(
    val self: UpdateSecurityGroupRuleDescriptionsEgressRequest
) extends AnyVal {

  final def groupIdAsScala: Option[String] = Option(self.groupId)

  final def groupNameAsScala: Option[String] = Option(self.groupName)

  final def ipPermissionsAsScala: Option[Seq[IpPermission]] = Option(self.ipPermissions).map { v =>
    import scala.collection.JavaConverters._; v.asScala
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
