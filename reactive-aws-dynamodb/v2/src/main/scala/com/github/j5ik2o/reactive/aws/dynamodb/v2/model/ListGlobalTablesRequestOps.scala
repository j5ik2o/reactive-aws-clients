// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v2.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ListGlobalTablesRequest => ScalaListGlobalTablesRequest, _ }
import software.amazon.awssdk.services.dynamodb.model.{ ListGlobalTablesRequest => JavaListGlobalTablesRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ListGlobalTablesRequestOps {

  implicit class ScalaListGlobalTablesRequestOps(val self: ScalaListGlobalTablesRequest) extends AnyVal {

    def toJava: JavaListGlobalTablesRequest = {
      val result = JavaListGlobalTablesRequest.builder()
      self.exclusiveStartGlobalTableName
        .filter(_.nonEmpty).foreach(v => result.exclusiveStartGlobalTableName(v)) // String
      self.limit.map(_.intValue).foreach(v => result.limit(v))                    // Int
      self.regionName.filter(_.nonEmpty).foreach(v => result.regionName(v))       // String

      result.build()
    }

  }

}
