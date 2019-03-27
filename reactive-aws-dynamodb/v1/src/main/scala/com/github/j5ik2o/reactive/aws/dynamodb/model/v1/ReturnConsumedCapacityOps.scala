// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ReturnConsumedCapacity => ScalaReturnConsumedCapacity, _ }
import com.amazonaws.services.dynamodbv2.model.{ ReturnConsumedCapacity => JavaReturnConsumedCapacity }

object ReturnConsumedCapacityOps {

  implicit class ScalaReturnConsumedCapacityOps(val self: ScalaReturnConsumedCapacity) extends AnyVal {

    def toJava: JavaReturnConsumedCapacity = {
      JavaReturnConsumedCapacity.valueOf(self.entryName)
    }

  }

  implicit class JavaReturnConsumedCapacityOps(val self: String) extends AnyVal {

    def toScala: ScalaReturnConsumedCapacity = {
      ScalaReturnConsumedCapacity.withName(self)
    }

  }

}
