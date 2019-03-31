// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ LifecycleRuleAndOperator => ScalaLifecycleRuleAndOperator, _ }
import software.amazon.awssdk.services.s3.model.{ LifecycleRuleAndOperator => JavaLifecycleRuleAndOperator }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object LifecycleRuleAndOperatorOps {

  implicit class ScalaLifecycleRuleAndOperatorOps(val self: ScalaLifecycleRuleAndOperator) extends AnyVal {

    def toJava: JavaLifecycleRuleAndOperator = {
      val result = JavaLifecycleRuleAndOperator.builder()
      self.prefix.filter(_.nonEmpty).foreach(v => result.prefix(v)) // String
      self.tags.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, TagOps._; result.tags(v.map(_.toJava).asJava)
      } // Seq[Tag]

      result.build()
    }

  }

  implicit class JavaLifecycleRuleAndOperatorOps(val self: JavaLifecycleRuleAndOperator) extends AnyVal {

    def toScala: ScalaLifecycleRuleAndOperator = {
      ScalaLifecycleRuleAndOperator()
        .withPrefix(Option(self.prefix)) // String
        .withTags(Option(self.tags).map { v =>
          import scala.collection.JavaConverters._, TagOps._; v.asScala.map(_.toScala)
        }) // Seq[Tag]
    }

  }

}
