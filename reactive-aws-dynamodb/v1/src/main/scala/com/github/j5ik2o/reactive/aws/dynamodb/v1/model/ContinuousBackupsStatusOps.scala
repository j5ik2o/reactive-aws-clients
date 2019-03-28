// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ContinuousBackupsStatus => ScalaContinuousBackupsStatus, _ }
import com.amazonaws.services.dynamodbv2.model.{ ContinuousBackupsStatus => JavaContinuousBackupsStatus }

object ContinuousBackupsStatusOps {

  implicit class ScalaContinuousBackupsStatusOps(val self: ScalaContinuousBackupsStatus) extends AnyVal {

    def toJava: JavaContinuousBackupsStatus = {
      JavaContinuousBackupsStatus.valueOf(self.entryName)
    }

  }

  implicit class JavaContinuousBackupsStatusOps(val self: String) extends AnyVal {

    def toScala: ScalaContinuousBackupsStatus = {
      ScalaContinuousBackupsStatus.withName(self)
    }

  }

}
