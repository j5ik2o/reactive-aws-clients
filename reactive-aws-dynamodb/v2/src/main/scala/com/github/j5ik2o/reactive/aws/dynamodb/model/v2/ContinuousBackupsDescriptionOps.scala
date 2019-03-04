package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  ContinuousBackupsStatus,
  ContinuousBackupsDescription => ScalaContinuousBackupsDescription
}
import software.amazon.awssdk.services.dynamodb.model.{
  ContinuousBackupsDescription => JavaContinuousBackupsDescription
}

object ContinuousBackupsDescriptionOps {

  import PointInTimeRecoveryDescriptionOps._

  implicit class ScalaContinuousBackupsDescriptionOps(val self: ScalaContinuousBackupsDescription) extends AnyVal {

    def toJava: JavaContinuousBackupsDescription = {
      val result = JavaContinuousBackupsDescription.builder()
      self.continuousBackupsStatus.map(_.entryName).foreach(result.continuousBackupsStatus)
      self.pointInTimeRecoveryDescription.map(_.toJava).foreach(result.pointInTimeRecoveryDescription)
      result.build()
    }

  }

  implicit class JavaContinuousBackupsDescriptionOps(val self: JavaContinuousBackupsDescription) extends AnyVal {

    def toScala: ScalaContinuousBackupsDescription = {
      ScalaContinuousBackupsDescription()
        .withContinuousBackupsStatus(
          Option(self.continuousBackupsStatus).map(_.toString).map(ContinuousBackupsStatus.withName)
        )
        .withPointInTimeRecoveryDescription(Option(self.pointInTimeRecoveryDescription).map(_.toScala))
    }

  }

}
