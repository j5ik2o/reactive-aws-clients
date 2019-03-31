// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ ObjectLockRule => ScalaObjectLockRule, _ }
import software.amazon.awssdk.services.s3.model.{ ObjectLockRule => JavaObjectLockRule }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ObjectLockRuleOps {

  implicit class ScalaObjectLockRuleOps(val self: ScalaObjectLockRule) extends AnyVal {

    def toJava: JavaObjectLockRule = {
      val result = JavaObjectLockRule.builder()
      self.defaultRetention.foreach { v =>
        import DefaultRetentionOps._; result.defaultRetention(v.toJava)
      } // DefaultRetention

      result.build()
    }

  }

  implicit class JavaObjectLockRuleOps(val self: JavaObjectLockRule) extends AnyVal {

    def toScala: ScalaObjectLockRule = {
      ScalaObjectLockRule()
        .withDefaultRetention(Option(self.defaultRetention).map { v =>
          import DefaultRetentionOps._; v.toScala
        }) // DefaultRetention
    }

  }

}
