package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ContinuousBackupsStatus => ScalaContinuousBackupsStatus, _ }
import software.amazon.awssdk.services.dynamodb.model.{ ContinuousBackupsStatus => JavaContinuousBackupsStatus }

object ContinuousBackupsStatusOps {

  implicit class ScalaContinuousBackupsStatusOps(val self: ScalaContinuousBackupsStatus) extends AnyVal {

    def toJava: JavaContinuousBackupsStatus = {
        JavaContinuousBackupsStatus.valueOf(self.entryName)
    }

  }

  implicit class JavaContinuousBackupsStatusOps(val self: JavaContinuousBackupsStatus) extends AnyVal {

     def toScala: ScalaContinuousBackupsStatus = {
        ScalaContinuousBackupsStatus.withName(self.toString)
     }

   }

}