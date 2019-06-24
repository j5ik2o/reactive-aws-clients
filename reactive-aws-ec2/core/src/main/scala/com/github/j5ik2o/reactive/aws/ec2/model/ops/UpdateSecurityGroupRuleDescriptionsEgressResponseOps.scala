// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class UpdateSecurityGroupRuleDescriptionsEgressResponseBuilderOps(
    val self: UpdateSecurityGroupRuleDescriptionsEgressResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def returnValueAsScala(value: Option[Boolean]): UpdateSecurityGroupRuleDescriptionsEgressResponse.Builder = {
    value.fold(self) { v =>
      self.returnValue(v)
    }
  }

}

final class UpdateSecurityGroupRuleDescriptionsEgressResponseOps(
    val self: UpdateSecurityGroupRuleDescriptionsEgressResponse
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def returnValueAsScala: Option[Boolean] = Option(self.returnValue)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateSecurityGroupRuleDescriptionsEgressResponseOps {

  implicit def toUpdateSecurityGroupRuleDescriptionsEgressResponseBuilderOps(
      v: UpdateSecurityGroupRuleDescriptionsEgressResponse.Builder
  ): UpdateSecurityGroupRuleDescriptionsEgressResponseBuilderOps =
    new UpdateSecurityGroupRuleDescriptionsEgressResponseBuilderOps(v)

  implicit def toUpdateSecurityGroupRuleDescriptionsEgressResponseOps(
      v: UpdateSecurityGroupRuleDescriptionsEgressResponse
  ): UpdateSecurityGroupRuleDescriptionsEgressResponseOps = new UpdateSecurityGroupRuleDescriptionsEgressResponseOps(v)

}
