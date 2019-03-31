// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ GlobalTableStatus => ScalaGlobalTableStatus, _ }
import software.amazon.awssdk.services.dynamodb.model.{ GlobalTableStatus => JavaGlobalTableStatus }

object GlobalTableStatusOps {

  implicit class ScalaGlobalTableStatusOps(val self: ScalaGlobalTableStatus) extends AnyVal {

    def toJava: JavaGlobalTableStatus = {
      JavaGlobalTableStatus.valueOf(self.entryName)
    }

  }

  implicit class JavaGlobalTableStatusOps(val self: JavaGlobalTableStatus) extends AnyVal {

    def toScala: ScalaGlobalTableStatus = {
      ScalaGlobalTableStatus.withName(self.toString)
    }

  }

}
