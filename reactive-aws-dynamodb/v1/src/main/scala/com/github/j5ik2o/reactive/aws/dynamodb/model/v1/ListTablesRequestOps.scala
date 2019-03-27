// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ListTablesRequest => ScalaListTablesRequest, _ }
import com.amazonaws.services.dynamodbv2.model.{ ListTablesRequest => JavaListTablesRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ListTablesRequestOps {

  implicit class ScalaListTablesRequestOps(val self: ScalaListTablesRequest) extends AnyVal {

    def toJava: JavaListTablesRequest = {
      val result = new JavaListTablesRequest()
      self.exclusiveStartTableName.filter(_.nonEmpty).foreach(v => result.withExclusiveStartTableName(v)) // String
      self.limit.map(_.intValue).foreach(v => result.withLimit(v))                                        // Int

      result
    }

  }

}
