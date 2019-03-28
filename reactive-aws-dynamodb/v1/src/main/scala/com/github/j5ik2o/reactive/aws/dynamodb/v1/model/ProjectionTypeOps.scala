// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ProjectionType => ScalaProjectionType, _ }
import com.amazonaws.services.dynamodbv2.model.{ ProjectionType => JavaProjectionType }

object ProjectionTypeOps {

  implicit class ScalaProjectionTypeOps(val self: ScalaProjectionType) extends AnyVal {

    def toJava: JavaProjectionType = {
      JavaProjectionType.valueOf(self.entryName)
    }

  }

  implicit class JavaProjectionTypeOps(val self: String) extends AnyVal {

    def toScala: ScalaProjectionType = {
      ScalaProjectionType.withName(self)
    }

  }

}
