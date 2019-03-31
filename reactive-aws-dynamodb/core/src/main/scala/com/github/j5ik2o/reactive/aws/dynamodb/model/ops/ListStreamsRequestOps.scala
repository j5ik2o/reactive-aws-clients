// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ListStreamsRequest => ScalaListStreamsRequest, _ }
import software.amazon.awssdk.services.dynamodb.model.{ ListStreamsRequest => JavaListStreamsRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ListStreamsRequestOps {

  implicit class ScalaListStreamsRequestOps(val self: ScalaListStreamsRequest) extends AnyVal {

    def toJava: JavaListStreamsRequest = {
      val result = JavaListStreamsRequest.builder()
      self.tableName.filter(_.nonEmpty).foreach(v => result.tableName(v))                             // String
      self.limit.map(_.intValue).foreach(v => result.limit(v))                                        // Int
      self.exclusiveStartStreamArn.filter(_.nonEmpty).foreach(v => result.exclusiveStartStreamArn(v)) // String

      result.build()
    }

  }

}
