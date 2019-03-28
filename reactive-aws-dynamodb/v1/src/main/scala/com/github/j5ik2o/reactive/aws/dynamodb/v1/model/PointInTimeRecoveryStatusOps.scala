// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ PointInTimeRecoveryStatus => ScalaPointInTimeRecoveryStatus, _ }
import com.amazonaws.services.dynamodbv2.model.{ PointInTimeRecoveryStatus => JavaPointInTimeRecoveryStatus }

object PointInTimeRecoveryStatusOps {

  implicit class ScalaPointInTimeRecoveryStatusOps(val self: ScalaPointInTimeRecoveryStatus) extends AnyVal {

    def toJava: JavaPointInTimeRecoveryStatus = {
      JavaPointInTimeRecoveryStatus.valueOf(self.entryName)
    }

  }

  implicit class JavaPointInTimeRecoveryStatusOps(val self: String) extends AnyVal {

    def toScala: ScalaPointInTimeRecoveryStatus = {
      ScalaPointInTimeRecoveryStatus.withName(self)
    }

  }

}
