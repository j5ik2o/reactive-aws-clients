// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ FilterRuleName => ScalaFilterRuleName, _ }
import software.amazon.awssdk.services.s3.model.{ FilterRuleName => JavaFilterRuleName }

object FilterRuleNameOps {

  implicit class ScalaFilterRuleNameOps(val self: ScalaFilterRuleName) extends AnyVal {

    def toJava: JavaFilterRuleName = {
      JavaFilterRuleName.valueOf(self.entryName)
    }

  }

  implicit class JavaFilterRuleNameOps(val self: JavaFilterRuleName) extends AnyVal {

    def toScala: ScalaFilterRuleName = {
      ScalaFilterRuleName.withName(self.toString)
    }

  }

}
