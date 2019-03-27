// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  ReturnValuesOnConditionCheckFailure => ScalaReturnValuesOnConditionCheckFailure,
  _
}
import com.amazonaws.services.dynamodbv2.model.{
  ReturnValuesOnConditionCheckFailure => JavaReturnValuesOnConditionCheckFailure
}

object ReturnValuesOnConditionCheckFailureOps {

  implicit class ScalaReturnValuesOnConditionCheckFailureOps(val self: ScalaReturnValuesOnConditionCheckFailure)
      extends AnyVal {

    def toJava: JavaReturnValuesOnConditionCheckFailure = {
      JavaReturnValuesOnConditionCheckFailure.valueOf(self.entryName)
    }

  }

  implicit class JavaReturnValuesOnConditionCheckFailureOps(val self: String) extends AnyVal {

    def toScala: ScalaReturnValuesOnConditionCheckFailure = {
      ScalaReturnValuesOnConditionCheckFailure.withName(self)
    }

  }

}
