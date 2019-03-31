// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import com.github.j5ik2o.reactive.aws.kinesis.model.{ CreateStreamRequest => ScalaCreateStreamRequest, _ }
import software.amazon.awssdk.services.kinesis.model.{ CreateStreamRequest => JavaCreateStreamRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object CreateStreamRequestOps {

  implicit class ScalaCreateStreamRequestOps(val self: ScalaCreateStreamRequest) extends AnyVal {

    def toJava: JavaCreateStreamRequest = {
      val result = JavaCreateStreamRequest.builder()
      self.streamName.filter(_.nonEmpty).foreach(v => result.streamName(v)) // String
      self.shardCount.map(_.intValue).foreach(v => result.shardCount(v))    // Int

      result.build()
    }

  }

}
