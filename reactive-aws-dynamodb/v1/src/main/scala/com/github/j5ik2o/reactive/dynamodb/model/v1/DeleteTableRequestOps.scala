package com.github.j5ik2o.reactive.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ DeleteTableRequest => JavaDeleteTableRequest }
import com.github.j5ik2o.reactive.dynamodb.model.{ DeleteTableRequest => ScalaDeleteTableRequest }

object DeleteTableRequestOps {

  implicit class ScalaDeleteTableRequestOps(val self: ScalaDeleteTableRequest) extends AnyVal {

    def toJava: JavaDeleteTableRequest = {
      val result = new JavaDeleteTableRequest
      self.tableName.foreach(result.setTableName)
      result
    }

  }

  implicit class JavaDeleteTableRequestOps(val self: JavaDeleteTableRequest) extends AnyVal {

    def toScala: ScalaDeleteTableRequest = {
      ScalaDeleteTableRequest().withTableName(Option(self.getTableName))
    }

  }

}
