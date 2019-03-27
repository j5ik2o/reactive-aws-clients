// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  UpdateContinuousBackupsRequest => ScalaUpdateContinuousBackupsRequest,
  _
}
import com.amazonaws.services.dynamodbv2.model.{ UpdateContinuousBackupsRequest => JavaUpdateContinuousBackupsRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object UpdateContinuousBackupsRequestOps {

  implicit class ScalaUpdateContinuousBackupsRequestOps(val self: ScalaUpdateContinuousBackupsRequest) extends AnyVal {

    def toJava: JavaUpdateContinuousBackupsRequest = {
      val result = new JavaUpdateContinuousBackupsRequest()
      self.tableName.filter(_.nonEmpty).foreach(v => result.withTableName(v)) // String
      self.pointInTimeRecoverySpecification.foreach { v =>
        import PointInTimeRecoverySpecificationOps._; result.withPointInTimeRecoverySpecification(v.toJava)
      } // PointInTimeRecoverySpecification

      result
    }

  }

}
