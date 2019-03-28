// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ListStreamsRequest => ScalaListStreamsRequest, _ }
import com.amazonaws.services.dynamodbv2.model.{ ListStreamsRequest => JavaListStreamsRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ListStreamsRequestOps {

  implicit class ScalaListStreamsRequestOps(val self: ScalaListStreamsRequest) extends AnyVal {

    def toJava: JavaListStreamsRequest = {
      val result = new JavaListStreamsRequest()
      self.tableName.filter(_.nonEmpty).foreach(v => result.withTableName(v))                             // String
      self.limit.map(_.intValue).foreach(v => result.withLimit(v))                                        // Int
      self.exclusiveStartStreamArn.filter(_.nonEmpty).foreach(v => result.withExclusiveStartStreamArn(v)) // String

      result
    }

  }

}
