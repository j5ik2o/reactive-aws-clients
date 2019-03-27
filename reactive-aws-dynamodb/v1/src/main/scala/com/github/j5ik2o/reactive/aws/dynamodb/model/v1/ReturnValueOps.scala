// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ReturnValue => ScalaReturnValue, _ }
import com.amazonaws.services.dynamodbv2.model.{ ReturnValue => JavaReturnValue }

object ReturnValueOps {

  implicit class ScalaReturnValueOps(val self: ScalaReturnValue) extends AnyVal {

    def toJava: JavaReturnValue = {
      JavaReturnValue.valueOf(self.entryName)
    }

  }

  implicit class JavaReturnValueOps(val self: String) extends AnyVal {

    def toScala: ScalaReturnValue = {
      ScalaReturnValue.withName(self)
    }

  }

}
