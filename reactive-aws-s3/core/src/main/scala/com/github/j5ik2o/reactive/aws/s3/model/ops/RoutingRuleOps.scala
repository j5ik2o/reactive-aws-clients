// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ RoutingRule => ScalaRoutingRule, _ }
import software.amazon.awssdk.services.s3.model.{ RoutingRule => JavaRoutingRule }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object RoutingRuleOps {

  implicit class ScalaRoutingRuleOps(val self: ScalaRoutingRule) extends AnyVal {

    def toJava: JavaRoutingRule = {
      val result = JavaRoutingRule.builder()
      self.condition.foreach { v =>
        import ConditionOps._; result.condition(v.toJava)
      } // Condition
      self.redirect.foreach { v =>
        import RedirectOps._; result.redirect(v.toJava)
      } // Redirect

      result.build()
    }

  }

  implicit class JavaRoutingRuleOps(val self: JavaRoutingRule) extends AnyVal {

    def toScala: ScalaRoutingRule = {
      ScalaRoutingRule()
        .withCondition(Option(self.condition).map { v =>
          import ConditionOps._; v.toScala
        }) // Condition
        .withRedirect(Option(self.redirect).map { v =>
          import RedirectOps._; v.toScala
        }) // Redirect
    }

  }

}
