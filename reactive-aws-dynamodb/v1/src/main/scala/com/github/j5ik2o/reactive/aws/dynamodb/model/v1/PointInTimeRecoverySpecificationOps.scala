// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  PointInTimeRecoverySpecification => ScalaPointInTimeRecoverySpecification,
  _
}
import com.amazonaws.services.dynamodbv2.model.{
  PointInTimeRecoverySpecification => JavaPointInTimeRecoverySpecification
}

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object PointInTimeRecoverySpecificationOps {

  implicit class ScalaPointInTimeRecoverySpecificationOps(val self: ScalaPointInTimeRecoverySpecification)
      extends AnyVal {

    def toJava: JavaPointInTimeRecoverySpecification = {
      val result = new JavaPointInTimeRecoverySpecification()
      self.pointInTimeRecoveryEnabled
        .map(_.booleanValue).foreach(v => result.withPointInTimeRecoveryEnabled(v)) // Boolean

      result
    }

  }

  implicit class JavaPointInTimeRecoverySpecificationOps(val self: JavaPointInTimeRecoverySpecification)
      extends AnyVal {

    def toScala: ScalaPointInTimeRecoverySpecification = {
      ScalaPointInTimeRecoverySpecification()
        .withPointInTimeRecoveryEnabled(Option(self.getPointInTimeRecoveryEnabled).map(_.booleanValue)) // Boolean
    }

  }

}
