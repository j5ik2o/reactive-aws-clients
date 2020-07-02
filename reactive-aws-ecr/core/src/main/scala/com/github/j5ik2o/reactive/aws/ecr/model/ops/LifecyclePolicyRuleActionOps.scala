// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class LifecyclePolicyRuleActionBuilderOps(val self: LifecyclePolicyRuleAction.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala(value: Option[ImageActionType]): LifecyclePolicyRuleAction.Builder = {
    value.fold(self) { v => self.`type`(v) }
  }

}

final class LifecyclePolicyRuleActionOps(val self: LifecyclePolicyRuleAction) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala: Option[ImageActionType] = Option(self.`type`)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLifecyclePolicyRuleActionOps {

  implicit def toLifecyclePolicyRuleActionBuilderOps(
      v: LifecyclePolicyRuleAction.Builder
  ): LifecyclePolicyRuleActionBuilderOps = new LifecyclePolicyRuleActionBuilderOps(v)

  implicit def toLifecyclePolicyRuleActionOps(v: LifecyclePolicyRuleAction): LifecyclePolicyRuleActionOps =
    new LifecyclePolicyRuleActionOps(v)

}
