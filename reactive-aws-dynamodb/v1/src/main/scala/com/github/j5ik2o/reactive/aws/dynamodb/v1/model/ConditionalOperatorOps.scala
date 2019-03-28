// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ConditionalOperator => ScalaConditionalOperator, _ }
import com.amazonaws.services.dynamodbv2.model.{ ConditionalOperator => JavaConditionalOperator }

object ConditionalOperatorOps {

  implicit class ScalaConditionalOperatorOps(val self: ScalaConditionalOperator) extends AnyVal {

    def toJava: JavaConditionalOperator = {
      JavaConditionalOperator.valueOf(self.entryName)
    }

  }

  implicit class JavaConditionalOperatorOps(val self: String) extends AnyVal {

    def toScala: ScalaConditionalOperator = {
      ScalaConditionalOperator.withName(self)
    }

  }

}
