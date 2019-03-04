package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  PointInTimeRecoveryStatus,
  PointInTimeRecoveryDescription => ScalaPointInTimeRecoveryDescription
}
import software.amazon.awssdk.services.dynamodb.model.{
  PointInTimeRecoveryDescription => JavaPointInTimeRecoveryDescription
}
object PointInTimeRecoveryDescriptionOps {

  implicit class ScalaPointInTimeRecoveryDescriptionOps(val self: ScalaPointInTimeRecoveryDescription) extends AnyVal {

    def toJava: JavaPointInTimeRecoveryDescription = {
      val result = JavaPointInTimeRecoveryDescription.builder()
      self.pointInTimeRecoveryStatus.map(_.entryName).foreach(result.pointInTimeRecoveryStatus)
      self.earliestRestorableDateTime.foreach(result.earliestRestorableDateTime)
      self.latestRestorableDateTime.foreach(result.latestRestorableDateTime)
      result.build()
    }

  }

  implicit class JavaPointInTimeRecoveryDescriptionOps(val self: JavaPointInTimeRecoveryDescription) extends AnyVal {

    def toScala: ScalaPointInTimeRecoveryDescription = {
      ScalaPointInTimeRecoveryDescription()
        .withPointInTimeRecoveryStatus(
          Option(self.pointInTimeRecoveryStatus).map(_.toString).map(PointInTimeRecoveryStatus.withName)
        )
        .withEarliestRestorableDateTime(Option(self.earliestRestorableDateTime))
        .withLatestRestorableDateTime(Option(self.latestRestorableDateTime))
    }

  }

}
