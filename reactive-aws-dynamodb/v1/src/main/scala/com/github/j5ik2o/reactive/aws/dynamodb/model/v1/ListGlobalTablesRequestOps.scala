package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ ListGlobalTablesRequest => JavaListGlobalTablesRequest }
import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ListGlobalTablesRequest => ScalaListGlobalTablesRequest }

object ListGlobalTablesRequestOps {

  implicit class ScalaListGlobalTablesRequestOps(val self: ScalaListGlobalTablesRequest) extends AnyVal {

    def toJava: JavaListGlobalTablesRequest = {
      val result = new JavaListGlobalTablesRequest()
      self.exclusiveStartGlobalTableName.foreach(result.setExclusiveStartGlobalTableName)
      self.limit.foreach(v => result.setLimit(v))
      self.regionName.foreach(result.setRegionName)
      result
    }

  }

  implicit class JavaListGlobalTablesRequestOps(val self: JavaListGlobalTablesRequest) extends AnyVal {

    def toScala: ScalaListGlobalTablesRequest = {
      ScalaListGlobalTablesRequest()
        .withExclusiveStartGlobalTableName(Option(self.getExclusiveStartGlobalTableName))
        .withLimit(Option(self.getLimit)).withRegionName(Option(self.getRegionName))
    }

  }

}
