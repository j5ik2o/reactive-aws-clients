package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ PointInTimeRecoveryDescription => ScalaPointInTimeRecoveryDescription, _ }
import software.amazon.awssdk.services.dynamodb.model.{ PointInTimeRecoveryDescription => JavaPointInTimeRecoveryDescription }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object PointInTimeRecoveryDescriptionOps {

  implicit class ScalaPointInTimeRecoveryDescriptionOps(val self: ScalaPointInTimeRecoveryDescription) extends AnyVal {

    def toJava: JavaPointInTimeRecoveryDescription = {
      val result = JavaPointInTimeRecoveryDescription.builder()
                                          self.pointInTimeRecoveryStatus.foreach{ v => import PointInTimeRecoveryStatusOps._; result.pointInTimeRecoveryStatus(v.toJava) } // String, case Other
                      self.earliestRestorableDateTime.foreach(v => result.earliestRestorableDateTime(v)) // Instant, case java.time.Instant
                      self.latestRestorableDateTime.foreach(v => result.latestRestorableDateTime(v)) // Instant, case java.time.Instant

      result.build()
    }

  }

  implicit class JavaPointInTimeRecoveryDescriptionOps(val self: JavaPointInTimeRecoveryDescription) extends AnyVal {

     def toScala: ScalaPointInTimeRecoveryDescription = {
       ScalaPointInTimeRecoveryDescription()
            .withPointInTimeRecoveryStatus(Option(self.pointInTimeRecoveryStatus).map{ v => import PointInTimeRecoveryStatusOps._; v.toScala}) // String, Map-12
            .withEarliestRestorableDateTime(Option(self.earliestRestorableDateTime)) // Instant, Map-11
            .withLatestRestorableDateTime(Option(self.latestRestorableDateTime)) // Instant, Map-11
     }

   }

}