package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{
  PointInTimeRecoverySpecification => JavaPointInTimeRecoverySpecification
}
import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  PointInTimeRecoverySpecification => ScalaPointInTimeRecoverySpecification
}

object PointInTimeRecoverySpecificationOps {

  implicit class ScalaPointInTimeRecoverySpecificationOps(val self: ScalaPointInTimeRecoverySpecification)
      extends AnyVal {

    def toJava: JavaPointInTimeRecoverySpecification = {
      val result = new JavaPointInTimeRecoverySpecification()
      self.pointInTimeRecoveryEnabled.foreach(v => result.setPointInTimeRecoveryEnabled(v))
      result
    }

  }

  implicit class JavaPointInTimeRecoverySpecificationOps(val self: JavaPointInTimeRecoverySpecification)
      extends AnyVal {

    def toScala: ScalaPointInTimeRecoverySpecification = {
      ScalaPointInTimeRecoverySpecification()
        .withPointInTimeRecoveryEnabled(Option(self.getPointInTimeRecoveryEnabled).map(_.booleanValue()))
    }

  }

}
