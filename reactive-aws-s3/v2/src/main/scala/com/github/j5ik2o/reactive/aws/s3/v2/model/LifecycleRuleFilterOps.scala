// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ LifecycleRuleFilter => ScalaLifecycleRuleFilter, _ }
import software.amazon.awssdk.services.s3.model.{ LifecycleRuleFilter => JavaLifecycleRuleFilter }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object LifecycleRuleFilterOps {

  implicit class ScalaLifecycleRuleFilterOps(val self: ScalaLifecycleRuleFilter) extends AnyVal {

    def toJava: JavaLifecycleRuleFilter = {
      val result = JavaLifecycleRuleFilter.builder()
      self.prefix.filter(_.nonEmpty).foreach(v => result.prefix(v)) // String
      self.tag.foreach { v =>
        import TagOps._; result.tag(v.toJava)
      } // Tag
      self.and.foreach { v =>
        import LifecycleRuleAndOperatorOps._; result.and(v.toJava)
      } // LifecycleRuleAndOperator

      result.build()
    }

  }

  implicit class JavaLifecycleRuleFilterOps(val self: JavaLifecycleRuleFilter) extends AnyVal {

    def toScala: ScalaLifecycleRuleFilter = {
      ScalaLifecycleRuleFilter()
        .withPrefix(Option(self.prefix)) // String
        .withTag(Option(self.tag).map { v =>
          import TagOps._; v.toScala
        }) // Tag
        .withAnd(Option(self.and).map { v =>
          import LifecycleRuleAndOperatorOps._; v.toScala
        }) // LifecycleRuleAndOperator
    }

  }

}
