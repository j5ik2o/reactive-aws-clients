package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  ReturnValuesOnConditionCheckFailure => ScalaReturnValuesOnConditionCheckFailure,
  _
}
import software.amazon.awssdk.services.dynamodb.model.{
  ReturnValuesOnConditionCheckFailure => JavaReturnValuesOnConditionCheckFailure
}

object ReturnValuesOnConditionCheckFailureOps {

  implicit class ScalaReturnValuesOnConditionCheckFailureOps(val self: ScalaReturnValuesOnConditionCheckFailure)
      extends AnyVal {

    def toJava: JavaReturnValuesOnConditionCheckFailure = {
      JavaReturnValuesOnConditionCheckFailure.valueOf(self.entryName)
    }

  }

  implicit class JavaReturnValuesOnConditionCheckFailureOps(val self: JavaReturnValuesOnConditionCheckFailure)
      extends AnyVal {

    def toScala: ScalaReturnValuesOnConditionCheckFailure = {
      ScalaReturnValuesOnConditionCheckFailure.withName(self.toString)
    }

  }

}
