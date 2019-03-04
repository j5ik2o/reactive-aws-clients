package com.github.j5ik2o.reactive.dynamodb.model.v2

import com.github.j5ik2o.reactive.dynamodb.model.{ ListGlobalTablesRequest => ScalaListGlobalTablesRequest }
import software.amazon.awssdk.services.dynamodb.model.{ ListGlobalTablesRequest => JavaListGlobalTablesRequest }

object ListGlobalTablesRequestOps {

  implicit class ScalaListGlobalTablesRequestOps(val self: ScalaListGlobalTablesRequest) extends AnyVal {

    def toJava: JavaListGlobalTablesRequest = {
      val result = JavaListGlobalTablesRequest.builder()
      self.exclusiveStartGlobalTableName.foreach(result.exclusiveStartGlobalTableName)
      self.limit.foreach(v => result.limit(v))
      self.regionName.foreach(result.regionName)
      result.build()
    }

  }

  implicit class JavaListGlobalTablesRequestOps(val self: JavaListGlobalTablesRequest) extends AnyVal {

    def toScala: ScalaListGlobalTablesRequest = {
      ScalaListGlobalTablesRequest()
        .withExclusiveStartGlobalTableName(Option(self.exclusiveStartGlobalTableName))
        .withLimit(Option(self.limit))
        .withRegionName(Option(self.regionName))
    }

  }

}
