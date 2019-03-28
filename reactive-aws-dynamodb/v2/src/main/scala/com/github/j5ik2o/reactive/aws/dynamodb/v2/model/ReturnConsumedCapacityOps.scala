// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v2.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ReturnConsumedCapacity => ScalaReturnConsumedCapacity, _ }
import software.amazon.awssdk.services.dynamodb.model.{ ReturnConsumedCapacity => JavaReturnConsumedCapacity }

object ReturnConsumedCapacityOps {

  implicit class ScalaReturnConsumedCapacityOps(val self: ScalaReturnConsumedCapacity) extends AnyVal {

    def toJava: JavaReturnConsumedCapacity = {
      JavaReturnConsumedCapacity.valueOf(self.entryName)
    }

  }

  implicit class JavaReturnConsumedCapacityOps(val self: JavaReturnConsumedCapacity) extends AnyVal {

    def toScala: ScalaReturnConsumedCapacity = {
      ScalaReturnConsumedCapacity.withName(self.toString)
    }

  }

}
