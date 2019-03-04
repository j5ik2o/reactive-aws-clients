package com.github.j5ik2o.reactive.dynamodb.model.v2

import com.github.j5ik2o.reactive.dynamodb.model.{
  RestoreTableToPointInTimeRequest => ScalaRestoreTableToPointInTimeRequest
}
import software.amazon.awssdk.services.dynamodb.model.{
  RestoreTableToPointInTimeRequest => JavaRestoreTableToPointInTimeRequest
}

object RestoreTableToPointInTimeRequestOps {

  implicit class ScalaRestoreTableToPointInTimeRequestOps(val self: ScalaRestoreTableToPointInTimeRequest)
      extends AnyVal {

    def toJava: JavaRestoreTableToPointInTimeRequest = {
      val result = JavaRestoreTableToPointInTimeRequest.builder()
      self.sourceTableName.foreach(result.sourceTableName)
      self.targetTableName.foreach(result.targetTableName)
      self.useLatestRestorableTime.foreach(v => result.useLatestRestorableTime(v))
      self.restoreDateTime.foreach(result.restoreDateTime)
      result.build()
    }

  }

  implicit class JavaRestoreTableToPointInTimeRequestOps(val self: JavaRestoreTableToPointInTimeRequest)
      extends AnyVal {

    def toScala: ScalaRestoreTableToPointInTimeRequest = {
      ScalaRestoreTableToPointInTimeRequest()
        .withSourceTableName(Option(self.sourceTableName))
        .withTargetTableName(Option(self.targetTableName))
        .withUseLatestRestorableTime(Option(self.useLatestRestorableTime))
        .withRestoreDateTime(Option(self.restoreDateTime))
    }

  }

}
