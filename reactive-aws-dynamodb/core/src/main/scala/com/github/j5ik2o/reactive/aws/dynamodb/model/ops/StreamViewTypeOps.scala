// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ StreamViewType => ScalaStreamViewType, _ }
import software.amazon.awssdk.services.dynamodb.model.{ StreamViewType => JavaStreamViewType }

object StreamViewTypeOps {

  implicit class ScalaStreamViewTypeOps(val self: ScalaStreamViewType) extends AnyVal {

    def toJava: JavaStreamViewType = {
      JavaStreamViewType.valueOf(self.entryName)
    }

  }

  implicit class JavaStreamViewTypeOps(val self: JavaStreamViewType) extends AnyVal {

    def toScala: ScalaStreamViewType = {
      ScalaStreamViewType.withName(self.toString)
    }

  }

}
