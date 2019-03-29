// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v2.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{ ListTagsForStreamRequest => ScalaListTagsForStreamRequest, _ }
import software.amazon.awssdk.services.kinesis.model.{ ListTagsForStreamRequest => JavaListTagsForStreamRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ListTagsForStreamRequestOps {

  implicit class ScalaListTagsForStreamRequestOps(val self: ScalaListTagsForStreamRequest) extends AnyVal {

    def toJava: JavaListTagsForStreamRequest = {
      val result = JavaListTagsForStreamRequest.builder()
      self.streamName.filter(_.nonEmpty).foreach(v => result.streamName(v))                     // String
      self.exclusiveStartTagKey.filter(_.nonEmpty).foreach(v => result.exclusiveStartTagKey(v)) // String
      self.limit.map(_.intValue).foreach(v => result.limit(v))                                  // Int

      result.build()
    }

  }

}
