// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ ServerSideEncryptionRule => ScalaServerSideEncryptionRule, _ }
import software.amazon.awssdk.services.s3.model.{ ServerSideEncryptionRule => JavaServerSideEncryptionRule }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ServerSideEncryptionRuleOps {

  implicit class ScalaServerSideEncryptionRuleOps(val self: ScalaServerSideEncryptionRule) extends AnyVal {

    def toJava: JavaServerSideEncryptionRule = {
      val result = JavaServerSideEncryptionRule.builder()
      self.applyServerSideEncryptionByDefault.foreach { v =>
        import ServerSideEncryptionByDefaultOps._; result.applyServerSideEncryptionByDefault(v.toJava)
      } // ServerSideEncryptionByDefault

      result.build()
    }

  }

  implicit class JavaServerSideEncryptionRuleOps(val self: JavaServerSideEncryptionRule) extends AnyVal {

    def toScala: ScalaServerSideEncryptionRule = {
      ScalaServerSideEncryptionRule()
        .withApplyServerSideEncryptionByDefault(Option(self.applyServerSideEncryptionByDefault).map { v =>
          import ServerSideEncryptionByDefaultOps._; v.toScala
        }) // ServerSideEncryptionByDefault
    }

  }

}
