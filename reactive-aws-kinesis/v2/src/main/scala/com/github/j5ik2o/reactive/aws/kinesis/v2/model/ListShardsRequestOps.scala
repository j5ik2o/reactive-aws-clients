// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v2.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{ ListShardsRequest => ScalaListShardsRequest, _ }
import software.amazon.awssdk.services.kinesis.model.{ ListShardsRequest => JavaListShardsRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ListShardsRequestOps {

  implicit class ScalaListShardsRequestOps(val self: ScalaListShardsRequest) extends AnyVal {

    def toJava: JavaListShardsRequest = {
      val result = JavaListShardsRequest.builder()
      self.streamName.filter(_.nonEmpty).foreach(v => result.streamName(v))                       // String
      self.nextToken.filter(_.nonEmpty).foreach(v => result.nextToken(v))                         // String
      self.exclusiveStartShardId.filter(_.nonEmpty).foreach(v => result.exclusiveStartShardId(v)) // String
      self.maxResults.map(_.intValue).foreach(v => result.maxResults(v))                          // Int
      self.streamCreationTimestamp.foreach(v => result.streamCreationTimestamp(v))                // Instant

      result.build()
    }

  }

}
