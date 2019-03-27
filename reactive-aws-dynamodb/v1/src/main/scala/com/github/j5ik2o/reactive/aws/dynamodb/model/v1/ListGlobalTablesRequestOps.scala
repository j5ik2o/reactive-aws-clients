// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ListGlobalTablesRequest => ScalaListGlobalTablesRequest, _ }
import com.amazonaws.services.dynamodbv2.model.{ ListGlobalTablesRequest => JavaListGlobalTablesRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ListGlobalTablesRequestOps {

  implicit class ScalaListGlobalTablesRequestOps(val self: ScalaListGlobalTablesRequest) extends AnyVal {

    def toJava: JavaListGlobalTablesRequest = {
      val result = new JavaListGlobalTablesRequest()
      self.exclusiveStartGlobalTableName
        .filter(_.nonEmpty).foreach(v => result.withExclusiveStartGlobalTableName(v)) // String
      self.limit.map(_.intValue).foreach(v => result.withLimit(v))                    // Int
      self.regionName.filter(_.nonEmpty).foreach(v => result.withRegionName(v))       // String

      result
    }

  }

}
