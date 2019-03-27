// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ReturnValue => ScalaReturnValue, _ }
import software.amazon.awssdk.services.dynamodb.model.{ ReturnValue => JavaReturnValue }

object ReturnValueOps {

  implicit class ScalaReturnValueOps(val self: ScalaReturnValue) extends AnyVal {

    def toJava: JavaReturnValue = {
      JavaReturnValue.valueOf(self.entryName)
    }

  }

  implicit class JavaReturnValueOps(val self: JavaReturnValue) extends AnyVal {

    def toScala: ScalaReturnValue = {
      ScalaReturnValue.withName(self.toString)
    }

  }

}
