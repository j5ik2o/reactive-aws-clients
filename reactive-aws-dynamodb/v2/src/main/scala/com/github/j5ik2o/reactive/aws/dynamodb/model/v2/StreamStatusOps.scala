package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ StreamStatus => ScalaStreamStatus, _ }
import software.amazon.awssdk.services.dynamodb.model.{ StreamStatus => JavaStreamStatus }

object StreamStatusOps {

  implicit class ScalaStreamStatusOps(val self: ScalaStreamStatus) extends AnyVal {

    def toJava: JavaStreamStatus = {
        JavaStreamStatus.valueOf(self.entryName)
    }

  }

  implicit class JavaStreamStatusOps(val self: JavaStreamStatus) extends AnyVal {

     def toScala: ScalaStreamStatus = {
        ScalaStreamStatus.withName(self.toString)
     }

   }

}