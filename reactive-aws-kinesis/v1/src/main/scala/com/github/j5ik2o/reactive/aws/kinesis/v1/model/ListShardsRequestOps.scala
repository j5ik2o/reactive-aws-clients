// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v1.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{ ListShardsRequest => ScalaListShardsRequest, _ }
import com.amazonaws.services.kinesis.model.{ ListShardsRequest => JavaListShardsRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ListShardsRequestOps {

  implicit class ScalaListShardsRequestOps(val self: ScalaListShardsRequest) extends AnyVal {

    def toJava: JavaListShardsRequest = {
      val result = new JavaListShardsRequest()
      self.streamName.filter(_.nonEmpty).foreach(v => result.withStreamName(v))                       // String
      self.nextToken.filter(_.nonEmpty).foreach(v => result.withNextToken(v))                         // String
      self.exclusiveStartShardId.filter(_.nonEmpty).foreach(v => result.withExclusiveStartShardId(v)) // String
      self.maxResults.map(_.intValue).foreach(v => result.withMaxResults(v))                          // Int
      self.streamCreationTimestamp
        .map(java.util.Date.from).foreach(v => result.withStreamCreationTimestamp(v)) // Instant

      result
    }

  }

}
