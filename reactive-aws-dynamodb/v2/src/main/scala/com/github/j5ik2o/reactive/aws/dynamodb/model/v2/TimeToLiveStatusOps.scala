package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ TimeToLiveStatus => ScalaTimeToLiveStatus, _ }
import software.amazon.awssdk.services.dynamodb.model.{ TimeToLiveStatus => JavaTimeToLiveStatus }

object TimeToLiveStatusOps {

  implicit class ScalaTimeToLiveStatusOps(val self: ScalaTimeToLiveStatus) extends AnyVal {

    def toJava: JavaTimeToLiveStatus = {
      JavaTimeToLiveStatus.valueOf(self.entryName)
    }

  }

  implicit class JavaTimeToLiveStatusOps(val self: JavaTimeToLiveStatus) extends AnyVal {

    def toScala: ScalaTimeToLiveStatus = {
      ScalaTimeToLiveStatus.withName(self.toString)
    }

  }

}
