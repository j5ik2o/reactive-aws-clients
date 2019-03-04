package com.github.j5ik2o.reactive.dynamodb.model.v2

import com.github.j5ik2o.reactive.dynamodb.model.{ ListTablesRequest => ScalaListTablesRequest }
import software.amazon.awssdk.services.dynamodb.model.{ ListTablesRequest => JavaListTablesRequest }

object ListTablesRequestOps {

  implicit class ScalaListTablesRequestOps(val self: ScalaListTablesRequest) extends AnyVal {

    def toJava: JavaListTablesRequest = {
      val result = JavaListTablesRequest.builder()
      self.exclusiveStartTableName.foreach(result.exclusiveStartTableName)
      self.limit.foreach(v => result.limit(v))
      result.build()
    }

  }

  implicit class JavaListTablesRequestOps(val self: JavaListTablesRequest) extends AnyVal {

    def toScala: ScalaListTablesRequest = {
      ScalaListTablesRequest()
        .withExclusiveStartTableName(Option(self.exclusiveStartTableName)).withLimit(Option(self.limit))
    }

  }

}
