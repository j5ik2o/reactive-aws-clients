package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  PointInTimeRecoverySpecification => ScalaPointInTimeRecoverySpecification,
  _
}
import software.amazon.awssdk.services.dynamodb.model.{
  PointInTimeRecoverySpecification => JavaPointInTimeRecoverySpecification
}

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object PointInTimeRecoverySpecificationOps {

  implicit class ScalaPointInTimeRecoverySpecificationOps(val self: ScalaPointInTimeRecoverySpecification)
      extends AnyVal {

    def toJava: JavaPointInTimeRecoverySpecification = {
      val result = JavaPointInTimeRecoverySpecification.builder()
      self.pointInTimeRecoveryEnabled.map(_.booleanValue).foreach(v => result.pointInTimeRecoveryEnabled(v)) // Boolean

      result.build()
    }

  }

  implicit class JavaPointInTimeRecoverySpecificationOps(val self: JavaPointInTimeRecoverySpecification)
      extends AnyVal {

    def toScala: ScalaPointInTimeRecoverySpecification = {
      ScalaPointInTimeRecoverySpecification()
        .withPointInTimeRecoveryEnabled(Option(self.pointInTimeRecoveryEnabled).map(_.booleanValue)) // Boolean
    }

  }

}
