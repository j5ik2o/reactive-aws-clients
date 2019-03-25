package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  UpdateContinuousBackupsRequest => ScalaUpdateContinuousBackupsRequest,
  _
}
import software.amazon.awssdk.services.dynamodb.model.{
  UpdateContinuousBackupsRequest => JavaUpdateContinuousBackupsRequest
}

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object UpdateContinuousBackupsRequestOps {

  implicit class ScalaUpdateContinuousBackupsRequestOps(val self: ScalaUpdateContinuousBackupsRequest) extends AnyVal {

    def toJava: JavaUpdateContinuousBackupsRequest = {
      val result = JavaUpdateContinuousBackupsRequest.builder()
      self.tableName.filter(_.nonEmpty).foreach(v => result.tableName(v)) // String, case String
      self.pointInTimeRecoverySpecification.foreach { v =>
        import PointInTimeRecoverySpecificationOps._; result.pointInTimeRecoverySpecification(v.toJava)
      } // PointInTimeRecoverySpecification

      result.build()
    }

  }

}
