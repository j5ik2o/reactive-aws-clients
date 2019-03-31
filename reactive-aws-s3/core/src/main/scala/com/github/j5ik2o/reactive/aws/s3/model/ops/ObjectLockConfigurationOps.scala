// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ ObjectLockConfiguration => ScalaObjectLockConfiguration, _ }
import software.amazon.awssdk.services.s3.model.{ ObjectLockConfiguration => JavaObjectLockConfiguration }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ObjectLockConfigurationOps {

  implicit class ScalaObjectLockConfigurationOps(val self: ScalaObjectLockConfiguration) extends AnyVal {

    def toJava: JavaObjectLockConfiguration = {
      val result = JavaObjectLockConfiguration.builder()
      self.objectLockEnabled.foreach { v =>
        import ObjectLockEnabledOps._; result.objectLockEnabled(v.toJava)
      } // String
      self.rule.foreach { v =>
        import ObjectLockRuleOps._; result.rule(v.toJava)
      } // ObjectLockRule

      result.build()
    }

  }

  implicit class JavaObjectLockConfigurationOps(val self: JavaObjectLockConfiguration) extends AnyVal {

    def toScala: ScalaObjectLockConfiguration = {
      ScalaObjectLockConfiguration()
        .withObjectLockEnabled(Option(self.objectLockEnabled).map { v =>
          import ObjectLockEnabledOps._; v.toScala
        }) // String
        .withRule(Option(self.rule).map { v =>
          import ObjectLockRuleOps._; v.toScala
        }) // ObjectLockRule
    }

  }

}
