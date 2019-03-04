package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import java.util.Date

import com.amazonaws.services.dynamodbv2.model.{ PointInTimeRecoveryDescription => JavaPointInTimeRecoveryDescription }
import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  PointInTimeRecoveryStatus,
  PointInTimeRecoveryDescription => ScalaPointInTimeRecoveryDescription
}

object PointInTimeRecoveryDescriptionOps {

  implicit class ScalaPointInTimeRecoveryDescriptionOps(val self: ScalaPointInTimeRecoveryDescription) extends AnyVal {

    def toJava: JavaPointInTimeRecoveryDescription = {
      val result = new JavaPointInTimeRecoveryDescription()
      self.pointInTimeRecoveryStatus.map(_.entryName).foreach(result.setPointInTimeRecoveryStatus)
      self.earliestRestorableDateTime.map(Date.from).foreach(result.setEarliestRestorableDateTime)
      self.latestRestorableDateTime.map(Date.from).foreach(result.setLatestRestorableDateTime)
      result
    }

  }

  implicit class JavaPointInTimeRecoveryDescriptionOps(val self: JavaPointInTimeRecoveryDescription) extends AnyVal {

    def toScala: ScalaPointInTimeRecoveryDescription = {
      ScalaPointInTimeRecoveryDescription()
        .withPointInTimeRecoveryStatus(
          Option(self.getPointInTimeRecoveryStatus).map(PointInTimeRecoveryStatus.withName)
        )
        .withEarliestRestorableDateTime(Option(self.getEarliestRestorableDateTime).map(_.toInstant))
        .withLatestRestorableDateTime(Option(self.getLatestRestorableDateTime).map(_.toInstant))
    }

  }

}
