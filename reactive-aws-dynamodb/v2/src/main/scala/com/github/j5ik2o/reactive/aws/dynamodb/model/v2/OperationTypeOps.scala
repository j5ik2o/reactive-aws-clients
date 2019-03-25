package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ OperationType => ScalaOperationType, _ }
import software.amazon.awssdk.services.dynamodb.model.{ OperationType => JavaOperationType }

object OperationTypeOps {

  implicit class ScalaOperationTypeOps(val self: ScalaOperationType) extends AnyVal {

    def toJava: JavaOperationType = {
      JavaOperationType.valueOf(self.entryName)
    }

  }

  implicit class JavaOperationTypeOps(val self: JavaOperationType) extends AnyVal {

    def toScala: ScalaOperationType = {
      ScalaOperationType.withName(self.toString)
    }

  }

}
