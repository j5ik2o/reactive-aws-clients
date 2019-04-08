// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class UpdateSecurityGroupRuleDescriptionsIngressRequestBuilderOps(
    val self: UpdateSecurityGroupRuleDescriptionsIngressRequest.Builder
) extends AnyVal {

  final def groupIdAsScala(value: Option[String]): UpdateSecurityGroupRuleDescriptionsIngressRequest.Builder = {
    value.fold(self) { v =>
      self.groupId(v)
    }
  }

  final def groupNameAsScala(value: Option[String]): UpdateSecurityGroupRuleDescriptionsIngressRequest.Builder = {
    value.fold(self) { v =>
      self.groupName(v)
    }
  }

  final def ipPermissionsAsScala(
      value: Option[Seq[IpPermission]]
  ): UpdateSecurityGroupRuleDescriptionsIngressRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.ipPermissions(v.asJava)
    }
  }

}

final class UpdateSecurityGroupRuleDescriptionsIngressRequestOps(
    val self: UpdateSecurityGroupRuleDescriptionsIngressRequest
) extends AnyVal {

  final def groupIdAsScala: Option[String] = Option(self.groupId)

  final def groupNameAsScala: Option[String] = Option(self.groupName)

  final def ipPermissionsAsScala: Option[Seq[IpPermission]] = Option(self.ipPermissions).map { v =>
    import scala.collection.JavaConverters._; v.asScala
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
