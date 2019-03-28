// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v2.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{ DescribeStreamRequest => ScalaDescribeStreamRequest, _ }
import software.amazon.awssdk.services.kinesis.model.{ DescribeStreamRequest => JavaDescribeStreamRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DescribeStreamRequestOps {

  implicit class ScalaDescribeStreamRequestOps(val self: ScalaDescribeStreamRequest) extends AnyVal {

    def toJava: JavaDescribeStreamRequest = {
      val result = JavaDescribeStreamRequest.builder()
      self.streamName.filter(_.nonEmpty).foreach(v => result.streamName(v))                       // String
      self.limit.map(_.intValue).foreach(v => result.limit(v))                                    // Int
      self.exclusiveStartShardId.filter(_.nonEmpty).foreach(v => result.exclusiveStartShardId(v)) // String

      result.build()
    }

  }

}
