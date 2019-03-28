// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  PointInTimeRecoveryDescription => ScalaPointInTimeRecoveryDescription,
  _
}
import com.amazonaws.services.dynamodbv2.model.{ PointInTimeRecoveryDescription => JavaPointInTimeRecoveryDescription }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object PointInTimeRecoveryDescriptionOps {

  implicit class ScalaPointInTimeRecoveryDescriptionOps(val self: ScalaPointInTimeRecoveryDescription) extends AnyVal {

    def toJava: JavaPointInTimeRecoveryDescription = {
      val result = new JavaPointInTimeRecoveryDescription()
      self.pointInTimeRecoveryStatus.foreach { v =>
        import PointInTimeRecoveryStatusOps._; result.withPointInTimeRecoveryStatus(v.toJava)
      } // String
      self.earliestRestorableDateTime
        .map(java.util.Date.from).foreach(v => result.withEarliestRestorableDateTime(v)) // Instant
      self.latestRestorableDateTime
        .map(java.util.Date.from).foreach(v => result.withLatestRestorableDateTime(v)) // Instant

      result
    }

  }

  implicit class JavaPointInTimeRecoveryDescriptionOps(val self: JavaPointInTimeRecoveryDescription) extends AnyVal {

    def toScala: ScalaPointInTimeRecoveryDescription = {
      ScalaPointInTimeRecoveryDescription()
        .withPointInTimeRecoveryStatus(Option(self.getPointInTimeRecoveryStatus).map { v =>
          import PointInTimeRecoveryStatusOps._; v.toScala
        }) // String
        .withEarliestRestorableDateTime(Option(self.getEarliestRestorableDateTime).map(_.toInstant)) // Instant
        .withLatestRestorableDateTime(Option(self.getLatestRestorableDateTime).map(_.toInstant)) // Instant
    }

  }

}
