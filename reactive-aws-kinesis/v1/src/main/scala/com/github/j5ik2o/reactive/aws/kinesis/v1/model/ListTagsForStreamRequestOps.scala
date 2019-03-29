// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v1.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{ ListTagsForStreamRequest => ScalaListTagsForStreamRequest, _ }
import com.amazonaws.services.kinesis.model.{ ListTagsForStreamRequest => JavaListTagsForStreamRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ListTagsForStreamRequestOps {

  implicit class ScalaListTagsForStreamRequestOps(val self: ScalaListTagsForStreamRequest) extends AnyVal {

    def toJava: JavaListTagsForStreamRequest = {
      val result = new JavaListTagsForStreamRequest()
      self.streamName.filter(_.nonEmpty).foreach(v => result.withStreamName(v))                     // String
      self.exclusiveStartTagKey.filter(_.nonEmpty).foreach(v => result.withExclusiveStartTagKey(v)) // String
      self.limit.map(_.intValue).foreach(v => result.withLimit(v))                                  // Int

      result
    }

  }

}
