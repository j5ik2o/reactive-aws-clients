// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ TableStatus => ScalaTableStatus, _ }
import com.amazonaws.services.dynamodbv2.model.{ TableStatus => JavaTableStatus }

object TableStatusOps {

  implicit class ScalaTableStatusOps(val self: ScalaTableStatus) extends AnyVal {

    def toJava: JavaTableStatus = {
      JavaTableStatus.valueOf(self.entryName)
    }

  }

  implicit class JavaTableStatusOps(val self: String) extends AnyVal {

    def toScala: ScalaTableStatus = {
      ScalaTableStatus.withName(self)
    }

  }

}
