package com.github.j5ik2o.reactive.dynamodb.model.v2

import com.github.j5ik2o.reactive.dynamodb.model.{
  UpdateContinuousBackupsRequest => ScalaUpdateContinuousBackupsRequest
}
import software.amazon.awssdk.services.dynamodb.model.{
  UpdateContinuousBackupsRequest => JavaUpdateContinuousBackupsRequest
}

object UpdateContinuousBackupsRequestOps {

  import PointInTimeRecoverySpecificationOps._

  implicit class ScalaUpdateContinuousBackupsRequestOps(val self: ScalaUpdateContinuousBackupsRequest) extends AnyVal {

    def toJava: JavaUpdateContinuousBackupsRequest = {
      val result = JavaUpdateContinuousBackupsRequest.builder()
      self.tableName.foreach(result.tableName)
      self.pointInTimeRecoverySpecification.map(_.toJava).foreach(result.pointInTimeRecoverySpecification)
      result.build()
    }
  }

  implicit class JavaUpdateContinuousBackupsRequestOps(val self: JavaUpdateContinuousBackupsRequest) extends AnyVal {

    def toScala: ScalaUpdateContinuousBackupsRequest = {
      ScalaUpdateContinuousBackupsRequest()
        .withTableName(Option(self.tableName))
        .withPointInTimeRecoverySpecification(Option(self.pointInTimeRecoverySpecification).map(_.toScala))
    }

  }

}
