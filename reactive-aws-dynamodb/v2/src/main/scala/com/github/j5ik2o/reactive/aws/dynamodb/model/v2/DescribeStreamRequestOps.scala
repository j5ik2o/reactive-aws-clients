package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ DescribeStreamRequest => ScalaDescribeStreamRequest, _ }
import software.amazon.awssdk.services.dynamodb.model.{ DescribeStreamRequest => JavaDescribeStreamRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DescribeStreamRequestOps {

  implicit class ScalaDescribeStreamRequestOps(val self: ScalaDescribeStreamRequest) extends AnyVal {

    def toJava: JavaDescribeStreamRequest = {
      val result = JavaDescribeStreamRequest.builder()
      self.streamArn.filter(_.nonEmpty).foreach(v => result.streamArn(v))                         // String
      self.limit.map(_.intValue).foreach(v => result.limit(v))                                    // Int
      self.exclusiveStartShardId.filter(_.nonEmpty).foreach(v => result.exclusiveStartShardId(v)) // String

      result.build()
    }

  }

}
