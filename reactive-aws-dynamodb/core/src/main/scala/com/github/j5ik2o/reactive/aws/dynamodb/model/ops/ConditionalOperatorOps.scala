// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ConditionalOperator => ScalaConditionalOperator, _ }
import software.amazon.awssdk.services.dynamodb.model.{ ConditionalOperator => JavaConditionalOperator }

object ConditionalOperatorOps {

  implicit class ScalaConditionalOperatorOps(val self: ScalaConditionalOperator) extends AnyVal {

    def toJava: JavaConditionalOperator = {
      JavaConditionalOperator.valueOf(self.entryName)
    }

  }

  implicit class JavaConditionalOperatorOps(val self: JavaConditionalOperator) extends AnyVal {

    def toScala: ScalaConditionalOperator = {
      ScalaConditionalOperator.withName(self.toString)
    }

  }

}
