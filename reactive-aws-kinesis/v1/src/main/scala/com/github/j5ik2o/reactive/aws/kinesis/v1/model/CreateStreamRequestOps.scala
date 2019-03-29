// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v1.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{ CreateStreamRequest => ScalaCreateStreamRequest, _ }
import com.amazonaws.services.kinesis.model.{ CreateStreamRequest => JavaCreateStreamRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object CreateStreamRequestOps {

  implicit class ScalaCreateStreamRequestOps(val self: ScalaCreateStreamRequest) extends AnyVal {

    def toJava: JavaCreateStreamRequest = {
      val result = new JavaCreateStreamRequest()
      self.streamName.filter(_.nonEmpty).foreach(v => result.withStreamName(v)) // String
      self.shardCount.map(_.intValue).foreach(v => result.withShardCount(v))    // Int

      result
    }

  }

}
