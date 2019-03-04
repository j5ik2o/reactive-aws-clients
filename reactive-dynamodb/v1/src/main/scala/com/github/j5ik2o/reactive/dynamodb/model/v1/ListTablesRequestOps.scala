package com.github.j5ik2o.reactive.dynamodb.model.v1
import com.amazonaws.services.dynamodbv2.model.{ ListTablesRequest => JavaListTablesRequest }
import com.github.j5ik2o.reactive.dynamodb.model.{ ListTablesRequest => ScalaListTablesRequest }

object ListTablesRequestOps {

  implicit class ScalaListTablesRequestOps(val self: ScalaListTablesRequest) extends AnyVal {

    def toJava: JavaListTablesRequest = {
      val result = new JavaListTablesRequest()
      self.exclusiveStartTableName.foreach(result.setExclusiveStartTableName)
      self.limit.foreach(v => result.setLimit(v))
      result
    }

  }

  implicit class JavaListTablesRequestOps(val self: JavaListTablesRequest) extends AnyVal {

    def toScala: ScalaListTablesRequest = {
      ScalaListTablesRequest()
        .withExclusiveStartTableName(Option(self.getExclusiveStartTableName)).withLimit(Option(self.getLimit))
    }

  }

}
