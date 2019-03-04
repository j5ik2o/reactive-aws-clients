package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ DeleteTableRequest => ScalaDeleteTableRequest }
import software.amazon.awssdk.services.dynamodb.model.{ DeleteTableRequest => JavaDeleteTableRequest }

object DeleteTableRequestOps {

  implicit class ScalaDeleteTableRequestOps(val self: ScalaDeleteTableRequest) extends AnyVal {

    def toJava: JavaDeleteTableRequest = {
      val result = JavaDeleteTableRequest.builder()
      self.tableName.foreach(result.tableName)
      result.build()
    }

  }

  implicit class JavaDeleteTableRequestOps(val self: JavaDeleteTableRequest) extends AnyVal {

    def toScala: ScalaDeleteTableRequest = {
      ScalaDeleteTableRequest().withTableName(Option(self.tableName))
    }

  }

}
