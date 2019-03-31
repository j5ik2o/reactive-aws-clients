// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  PointInTimeRecoveryDescription => ScalaPointInTimeRecoveryDescription,
  _
}
import software.amazon.awssdk.services.dynamodb.model.{
  PointInTimeRecoveryDescription => JavaPointInTimeRecoveryDescription
}

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object PointInTimeRecoveryDescriptionOps {

  implicit class ScalaPointInTimeRecoveryDescriptionOps(val self: ScalaPointInTimeRecoveryDescription) extends AnyVal {

    def toJava: JavaPointInTimeRecoveryDescription = {
      val result = JavaPointInTimeRecoveryDescription.builder()
      self.pointInTimeRecoveryStatus.foreach { v =>
        import PointInTimeRecoveryStatusOps._; result.pointInTimeRecoveryStatus(v.toJava)
      } // String
      self.earliestRestorableDateTime.foreach(v => result.earliestRestorableDateTime(v)) // Instant
      self.latestRestorableDateTime.foreach(v => result.latestRestorableDateTime(v))     // Instant

      result.build()
    }

  }

  implicit class JavaPointInTimeRecoveryDescriptionOps(val self: JavaPointInTimeRecoveryDescription) extends AnyVal {

    def toScala: ScalaPointInTimeRecoveryDescription = {
      ScalaPointInTimeRecoveryDescription()
        .withPointInTimeRecoveryStatus(Option(self.pointInTimeRecoveryStatus).map { v =>
          import PointInTimeRecoveryStatusOps._; v.toScala
        }) // String
        .withEarliestRestorableDateTime(Option(self.earliestRestorableDateTime)) // Instant
        .withLatestRestorableDateTime(Option(self.latestRestorableDateTime)) // Instant
    }

  }

}
