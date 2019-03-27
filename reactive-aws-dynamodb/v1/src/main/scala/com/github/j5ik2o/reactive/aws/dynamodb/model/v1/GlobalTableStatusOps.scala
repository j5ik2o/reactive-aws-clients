// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ GlobalTableStatus => ScalaGlobalTableStatus, _ }
import com.amazonaws.services.dynamodbv2.model.{ GlobalTableStatus => JavaGlobalTableStatus }

object GlobalTableStatusOps {

  implicit class ScalaGlobalTableStatusOps(val self: ScalaGlobalTableStatus) extends AnyVal {

    def toJava: JavaGlobalTableStatus = {
      JavaGlobalTableStatus.valueOf(self.entryName)
    }

  }

  implicit class JavaGlobalTableStatusOps(val self: String) extends AnyVal {

    def toScala: ScalaGlobalTableStatus = {
      ScalaGlobalTableStatus.withName(self)
    }

  }

}
