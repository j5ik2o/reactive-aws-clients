// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v2.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ IndexStatus => ScalaIndexStatus, _ }
import software.amazon.awssdk.services.dynamodb.model.{ IndexStatus => JavaIndexStatus }

object IndexStatusOps {

  implicit class ScalaIndexStatusOps(val self: ScalaIndexStatus) extends AnyVal {

    def toJava: JavaIndexStatus = {
      JavaIndexStatus.valueOf(self.entryName)
    }

  }

  implicit class JavaIndexStatusOps(val self: JavaIndexStatus) extends AnyVal {

    def toScala: ScalaIndexStatus = {
      ScalaIndexStatus.withName(self.toString)
    }

  }

}
