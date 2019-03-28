// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  ContinuousBackupsDescription => ScalaContinuousBackupsDescription,
  _
}
import com.amazonaws.services.dynamodbv2.model.{ ContinuousBackupsDescription => JavaContinuousBackupsDescription }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ContinuousBackupsDescriptionOps {

  implicit class ScalaContinuousBackupsDescriptionOps(val self: ScalaContinuousBackupsDescription) extends AnyVal {

    def toJava: JavaContinuousBackupsDescription = {
      val result = new JavaContinuousBackupsDescription()
      self.continuousBackupsStatus.foreach { v =>
        import ContinuousBackupsStatusOps._; result.withContinuousBackupsStatus(v.toJava)
      } // String
      self.pointInTimeRecoveryDescription.foreach { v =>
        import PointInTimeRecoveryDescriptionOps._; result.withPointInTimeRecoveryDescription(v.toJava)
      } // PointInTimeRecoveryDescription

      result
    }

  }

  implicit class JavaContinuousBackupsDescriptionOps(val self: JavaContinuousBackupsDescription) extends AnyVal {

    def toScala: ScalaContinuousBackupsDescription = {
      ScalaContinuousBackupsDescription()
        .withContinuousBackupsStatus(Option(self.getContinuousBackupsStatus).map { v =>
          import ContinuousBackupsStatusOps._; v.toScala
        }) // String
        .withPointInTimeRecoveryDescription(Option(self.getPointInTimeRecoveryDescription).map { v =>
          import PointInTimeRecoveryDescriptionOps._; v.toScala
        }) // PointInTimeRecoveryDescription
    }

  }

}
