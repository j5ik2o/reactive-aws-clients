// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ StreamViewType => ScalaStreamViewType, _ }
import com.amazonaws.services.dynamodbv2.model.{ StreamViewType => JavaStreamViewType }

object StreamViewTypeOps {

  implicit class ScalaStreamViewTypeOps(val self: ScalaStreamViewType) extends AnyVal {

    def toJava: JavaStreamViewType = {
      JavaStreamViewType.valueOf(self.entryName)
    }

  }

  implicit class JavaStreamViewTypeOps(val self: String) extends AnyVal {

    def toScala: ScalaStreamViewType = {
      ScalaStreamViewType.withName(self)
    }

  }

}
