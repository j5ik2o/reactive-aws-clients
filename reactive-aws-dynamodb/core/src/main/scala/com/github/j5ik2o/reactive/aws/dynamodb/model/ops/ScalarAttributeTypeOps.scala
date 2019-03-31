// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ScalarAttributeType => ScalaScalarAttributeType, _ }
import software.amazon.awssdk.services.dynamodb.model.{ ScalarAttributeType => JavaScalarAttributeType }

object ScalarAttributeTypeOps {

  implicit class ScalaScalarAttributeTypeOps(val self: ScalaScalarAttributeType) extends AnyVal {

    def toJava: JavaScalarAttributeType = {
      JavaScalarAttributeType.valueOf(self.entryName)
    }

  }

  implicit class JavaScalarAttributeTypeOps(val self: JavaScalarAttributeType) extends AnyVal {

    def toScala: ScalaScalarAttributeType = {
      ScalaScalarAttributeType.withName(self.toString)
    }

  }

}
