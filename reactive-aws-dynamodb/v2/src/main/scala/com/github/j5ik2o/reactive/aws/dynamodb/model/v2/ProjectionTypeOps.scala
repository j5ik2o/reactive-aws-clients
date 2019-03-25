package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ProjectionType => ScalaProjectionType, _ }
import software.amazon.awssdk.services.dynamodb.model.{ ProjectionType => JavaProjectionType }

object ProjectionTypeOps {

  implicit class ScalaProjectionTypeOps(val self: ScalaProjectionType) extends AnyVal {

    def toJava: JavaProjectionType = {
        JavaProjectionType.valueOf(self.entryName)
    }

  }

  implicit class JavaProjectionTypeOps(val self: JavaProjectionType) extends AnyVal {

     def toScala: ScalaProjectionType = {
        ScalaProjectionType.withName(self.toString)
     }

   }

}