// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v2.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  ContinuousBackupsDescription => ScalaContinuousBackupsDescription,
  _
}
import software.amazon.awssdk.services.dynamodb.model.{
  ContinuousBackupsDescription => JavaContinuousBackupsDescription
}

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ContinuousBackupsDescriptionOps {

  implicit class ScalaContinuousBackupsDescriptionOps(val self: ScalaContinuousBackupsDescription) extends AnyVal {

    def toJava: JavaContinuousBackupsDescription = {
      val result = JavaContinuousBackupsDescription.builder()
      self.continuousBackupsStatus.foreach { v =>
        import ContinuousBackupsStatusOps._; result.continuousBackupsStatus(v.toJava)
      } // String
      self.pointInTimeRecoveryDescription.foreach { v =>
        import PointInTimeRecoveryDescriptionOps._; result.pointInTimeRecoveryDescription(v.toJava)
      } // PointInTimeRecoveryDescription

      result.build()
    }

  }

  implicit class JavaContinuousBackupsDescriptionOps(val self: JavaContinuousBackupsDescription) extends AnyVal {

    def toScala: ScalaContinuousBackupsDescription = {
      ScalaContinuousBackupsDescription()
        .withContinuousBackupsStatus(Option(self.continuousBackupsStatus).map { v =>
          import ContinuousBackupsStatusOps._; v.toScala
        }) // String
        .withPointInTimeRecoveryDescription(Option(self.pointInTimeRecoveryDescription).map { v =>
          import PointInTimeRecoveryDescriptionOps._; v.toScala
        }) // PointInTimeRecoveryDescription
    }

  }

}
