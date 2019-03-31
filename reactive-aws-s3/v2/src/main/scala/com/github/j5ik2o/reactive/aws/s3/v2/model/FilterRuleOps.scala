// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ FilterRule => ScalaFilterRule, _ }
import software.amazon.awssdk.services.s3.model.{ FilterRule => JavaFilterRule }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object FilterRuleOps {

  implicit class ScalaFilterRuleOps(val self: ScalaFilterRule) extends AnyVal {

    def toJava: JavaFilterRule = {
      val result = JavaFilterRule.builder()
      self.name.foreach { v =>
        import FilterRuleNameOps._; result.name(v.toJava)
      } // String
      self.value.filter(_.nonEmpty).foreach(v => result.value(v)) // String

      result.build()
    }

  }

  implicit class JavaFilterRuleOps(val self: JavaFilterRule) extends AnyVal {

    def toScala: ScalaFilterRule = {
      ScalaFilterRule()
        .withName(Option(self.name).map { v =>
          import FilterRuleNameOps._; v.toScala
        }) // String
        .withValue(Option(self.value)) // String
    }

  }

}
