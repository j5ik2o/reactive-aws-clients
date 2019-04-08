// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class RoutingRuleBuilderOps(val self: RoutingRule.Builder) extends AnyVal {

  final def conditionAsScala(value: Option[Condition]): RoutingRule.Builder = {
    value.fold(self) { v =>
      self.condition(v)
    }
  }

  final def redirectAsScala(value: Option[Redirect]): RoutingRule.Builder = {
    value.fold(self) { v =>
      self.redirect(v)
    }
  }

}

final class RoutingRuleOps(val self: RoutingRule) extends AnyVal {

  final def conditionAsScala: Option[Condition] = Option(self.condition)

  final def redirectAsScala: Option[Redirect] = Option(self.redirect)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRoutingRuleOps {

  implicit def toRoutingRuleBuilderOps(v: RoutingRule.Builder): RoutingRuleBuilderOps = new RoutingRuleBuilderOps(v)

  implicit def toRoutingRuleOps(v: RoutingRule): RoutingRuleOps = new RoutingRuleOps(v)

}
