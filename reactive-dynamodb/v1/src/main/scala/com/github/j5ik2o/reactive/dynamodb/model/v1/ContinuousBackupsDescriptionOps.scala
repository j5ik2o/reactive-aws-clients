package com.github.j5ik2o.reactive.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ ContinuousBackupsDescription => JavaContinuousBackupsDescription }
import com.github.j5ik2o.reactive.dynamodb.model.{
  ContinuousBackupsStatus,
  ContinuousBackupsDescription => ScalaContinuousBackupsDescription
}

object ContinuousBackupsDescriptionOps {

  import PointInTimeRecoveryDescriptionOps._

  implicit class ScalaContinuousBackupsDescriptionOps(val self: ScalaContinuousBackupsDescription) extends AnyVal {

    def toJava: JavaContinuousBackupsDescription = {
      val result = new JavaContinuousBackupsDescription()
      self.continuousBackupsStatus.map(_.entryName).foreach(result.setContinuousBackupsStatus)
      self.pointInTimeRecoveryDescription.map(_.toJava).foreach(result.setPointInTimeRecoveryDescription)
      result
    }

  }

  implicit class JavaContinuousBackupsDescriptionOps(val self: JavaContinuousBackupsDescription) extends AnyVal {

    def toScala: ScalaContinuousBackupsDescription = {
      ScalaContinuousBackupsDescription()
        .withContinuousBackupsStatus(Option(self.getContinuousBackupsStatus).map(ContinuousBackupsStatus.withName))
        .withPointInTimeRecoveryDescription(Option(self.getPointInTimeRecoveryDescription).map(_.toScala))
    }

  }

}
