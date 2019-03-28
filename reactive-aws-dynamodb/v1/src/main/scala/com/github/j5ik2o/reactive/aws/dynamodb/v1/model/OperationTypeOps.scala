// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ OperationType => ScalaOperationType, _ }
import com.amazonaws.services.dynamodbv2.model.{ OperationType => JavaOperationType }

object OperationTypeOps {

  implicit class ScalaOperationTypeOps(val self: ScalaOperationType) extends AnyVal {

    def toJava: JavaOperationType = {
      JavaOperationType.valueOf(self.entryName)
    }

  }

  implicit class JavaOperationTypeOps(val self: String) extends AnyVal {

    def toScala: ScalaOperationType = {
      ScalaOperationType.withName(self)
    }

  }

}
