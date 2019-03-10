package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import java.util.Date

import com.amazonaws.services.dynamodbv2.model.{
  RestoreTableToPointInTimeRequest => JavaRestoreTableToPointInTimeRequest
}
import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  RestoreTableToPointInTimeRequest => ScalaRestoreTableToPointInTimeRequest
}

object RestoreTableToPointInTimeRequestOps {

  implicit class ScalaRestoreTableToPointInTimeRequestOps(val self: ScalaRestoreTableToPointInTimeRequest)
      extends AnyVal {

    def toJava: JavaRestoreTableToPointInTimeRequest = {
      val result = new JavaRestoreTableToPointInTimeRequest()
      self.sourceTableName.foreach(result.setSourceTableName)
      self.targetTableName.foreach(result.setTargetTableName)
      self.useLatestRestorableTime.foreach(v => result.setUseLatestRestorableTime(v))
      self.restoreDateTime.map(Date.from).foreach(result.setRestoreDateTime)
      result
    }

  }

  implicit class JavaRestoreTableToPointInTimeRequestOps(val self: JavaRestoreTableToPointInTimeRequest)
      extends AnyVal {

    def toScala: ScalaRestoreTableToPointInTimeRequest = {
      ScalaRestoreTableToPointInTimeRequest()
        .withSourceTableName(Option(self.getSourceTableName))
        .withTargetTableName(Option(self.getTargetTableName))
        .withUseLatestRestorableTime(Option(self.getUseLatestRestorableTime).map(_.booleanValue()))
        .withRestoreDateTime(Option(self.getRestoreDateTime).map(_.toInstant))
    }

  }

}
