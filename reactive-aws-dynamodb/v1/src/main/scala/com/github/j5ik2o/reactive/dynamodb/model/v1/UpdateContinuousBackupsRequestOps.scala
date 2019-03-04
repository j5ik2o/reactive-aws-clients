package com.github.j5ik2o.reactive.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ UpdateContinuousBackupsRequest => JavaUpdateContinuousBackupsRequest }
import com.github.j5ik2o.reactive.dynamodb.model.{
  UpdateContinuousBackupsRequest => ScalaUpdateContinuousBackupsRequest
}

object UpdateContinuousBackupsRequestOps {

  import PointInTimeRecoverySpecificationOps._

  implicit class ScalaUpdateContinuousBackupsRequestOps(val self: ScalaUpdateContinuousBackupsRequest) extends AnyVal {

    def toJava: JavaUpdateContinuousBackupsRequest = {
      val result = new JavaUpdateContinuousBackupsRequest()
      self.tableName.foreach(result.setTableName)
      self.pointInTimeRecoverySpecification.map(_.toJava).foreach(result.setPointInTimeRecoverySpecification)
      result
    }
  }

  implicit class JavaUpdateContinuousBackupsRequestOps(val self: JavaUpdateContinuousBackupsRequest) extends AnyVal {

    def toScala: ScalaUpdateContinuousBackupsRequest = {
      ScalaUpdateContinuousBackupsRequest()
        .withTableName(Option(self.getTableName))
        .withPointInTimeRecoverySpecification(Option(self.getPointInTimeRecoverySpecification).map(_.toScala))
    }

  }

}
