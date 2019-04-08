// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class UpdateSecurityGroupRuleDescriptionsIngressResponseBuilderOps(
    val self: UpdateSecurityGroupRuleDescriptionsIngressResponse.Builder
) extends AnyVal {

  final def returnValueAsScala(value: Option[Boolean]): UpdateSecurityGroupRuleDescriptionsIngressResponse.Builder = {
    value.fold(self) { v =>
      self.returnValue(v)
    }
  }

}

final class UpdateSecurityGroupRuleDescriptionsIngressResponseOps(
    val self: UpdateSecurityGroupRuleDescriptionsIngressResponse
) extends AnyVal {

  final def returnValueAsScala: Option[Boolean] = Option(self.returnValue)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateSecurityGroupRuleDescriptionsIngressResponseOps {

  implicit def toUpdateSecurityGroupRuleDescriptionsIngressResponseBuilderOps(
      v: UpdateSecurityGroupRuleDescriptionsIngressResponse.Builder
  ): UpdateSecurityGroupRuleDescriptionsIngressResponseBuilderOps =
    new UpdateSecurityGroupRuleDescriptionsIngressResponseBuilderOps(v)

  implicit def toUpdateSecurityGroupRuleDescriptionsIngressResponseOps(
      v: UpdateSecurityGroupRuleDescriptionsIngressResponse
  ): UpdateSecurityGroupRuleDescriptionsIngressResponseOps =
    new UpdateSecurityGroupRuleDescriptionsIngressResponseOps(v)

}
