// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ DescribeStreamRequest => ScalaDescribeStreamRequest, _ }
import com.amazonaws.services.dynamodbv2.model.{ DescribeStreamRequest => JavaDescribeStreamRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DescribeStreamRequestOps {

  implicit class ScalaDescribeStreamRequestOps(val self: ScalaDescribeStreamRequest) extends AnyVal {

    def toJava: JavaDescribeStreamRequest = {
      val result = new JavaDescribeStreamRequest()
      self.streamArn.filter(_.nonEmpty).foreach(v => result.withStreamArn(v))                         // String
      self.limit.map(_.intValue).foreach(v => result.withLimit(v))                                    // Int
      self.exclusiveStartShardId.filter(_.nonEmpty).foreach(v => result.withExclusiveStartShardId(v)) // String

      result
    }

  }

}
