// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import com.github.j5ik2o.reactive.aws.kinesis.model.{ ListStreamConsumersRequest => ScalaListStreamConsumersRequest, _ }
import software.amazon.awssdk.services.kinesis.model.{ ListStreamConsumersRequest => JavaListStreamConsumersRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ListStreamConsumersRequestOps {

  implicit class ScalaListStreamConsumersRequestOps(val self: ScalaListStreamConsumersRequest) extends AnyVal {

    def toJava: JavaListStreamConsumersRequest = {
      val result = JavaListStreamConsumersRequest.builder()
      self.streamARN.filter(_.nonEmpty).foreach(v => result.streamARN(v))          // String
      self.nextToken.filter(_.nonEmpty).foreach(v => result.nextToken(v))          // String
      self.maxResults.map(_.intValue).foreach(v => result.maxResults(v))           // Int
      self.streamCreationTimestamp.foreach(v => result.streamCreationTimestamp(v)) // Instant

      result.build()
    }

  }

}
