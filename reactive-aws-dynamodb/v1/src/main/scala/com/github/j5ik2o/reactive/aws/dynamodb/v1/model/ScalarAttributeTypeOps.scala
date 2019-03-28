// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ScalarAttributeType => ScalaScalarAttributeType, _ }
import com.amazonaws.services.dynamodbv2.model.{ ScalarAttributeType => JavaScalarAttributeType }

object ScalarAttributeTypeOps {

  implicit class ScalaScalarAttributeTypeOps(val self: ScalaScalarAttributeType) extends AnyVal {

    def toJava: JavaScalarAttributeType = {
      JavaScalarAttributeType.valueOf(self.entryName)
    }

  }

  implicit class JavaScalarAttributeTypeOps(val self: String) extends AnyVal {

    def toScala: ScalaScalarAttributeType = {
      ScalaScalarAttributeType.withName(self)
    }

  }

}
