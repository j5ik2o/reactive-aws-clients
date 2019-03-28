// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ TimeToLiveStatus => ScalaTimeToLiveStatus, _ }
import com.amazonaws.services.dynamodbv2.model.{ TimeToLiveStatus => JavaTimeToLiveStatus }

object TimeToLiveStatusOps {

  implicit class ScalaTimeToLiveStatusOps(val self: ScalaTimeToLiveStatus) extends AnyVal {

    def toJava: JavaTimeToLiveStatus = {
      JavaTimeToLiveStatus.valueOf(self.entryName)
    }

  }

  implicit class JavaTimeToLiveStatusOps(val self: String) extends AnyVal {

    def toScala: ScalaTimeToLiveStatus = {
      ScalaTimeToLiveStatus.withName(self)
    }

  }

}
