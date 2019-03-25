package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ TableStatus => ScalaTableStatus, _ }
import software.amazon.awssdk.services.dynamodb.model.{ TableStatus => JavaTableStatus }

object TableStatusOps {

  implicit class ScalaTableStatusOps(val self: ScalaTableStatus) extends AnyVal {

    def toJava: JavaTableStatus = {
      JavaTableStatus.valueOf(self.entryName)
    }

  }

  implicit class JavaTableStatusOps(val self: JavaTableStatus) extends AnyVal {

    def toScala: ScalaTableStatus = {
      ScalaTableStatus.withName(self.toString)
    }

  }

}
