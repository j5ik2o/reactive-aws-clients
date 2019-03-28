// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ IndexStatus => ScalaIndexStatus, _ }
import com.amazonaws.services.dynamodbv2.model.{ IndexStatus => JavaIndexStatus }

object IndexStatusOps {

  implicit class ScalaIndexStatusOps(val self: ScalaIndexStatus) extends AnyVal {

    def toJava: JavaIndexStatus = {
      JavaIndexStatus.valueOf(self.entryName)
    }

  }

  implicit class JavaIndexStatusOps(val self: String) extends AnyVal {

    def toScala: ScalaIndexStatus = {
      ScalaIndexStatus.withName(self)
    }

  }

}
