package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ PointInTimeRecoveryStatus => ScalaPointInTimeRecoveryStatus, _ }
import software.amazon.awssdk.services.dynamodb.model.{ PointInTimeRecoveryStatus => JavaPointInTimeRecoveryStatus }

object PointInTimeRecoveryStatusOps {

  implicit class ScalaPointInTimeRecoveryStatusOps(val self: ScalaPointInTimeRecoveryStatus) extends AnyVal {

    def toJava: JavaPointInTimeRecoveryStatus = {
      JavaPointInTimeRecoveryStatus.valueOf(self.entryName)
    }

  }

  implicit class JavaPointInTimeRecoveryStatusOps(val self: JavaPointInTimeRecoveryStatus) extends AnyVal {

    def toScala: ScalaPointInTimeRecoveryStatus = {
      ScalaPointInTimeRecoveryStatus.withName(self.toString)
    }

  }

}
