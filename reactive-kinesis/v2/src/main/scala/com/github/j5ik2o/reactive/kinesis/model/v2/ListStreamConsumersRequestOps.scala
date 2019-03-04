package com.github.j5ik2o.reactive.kinesis.model.v2

import com.github.j5ik2o.reactive.kinesis.model.{ ListStreamConsumersRequest => ScalaListStreamConsumersRequest }
import software.amazon.awssdk.services.kinesis.model.{ ListStreamConsumersRequest => JavaListStreamConsumersRequest }

object ListStreamConsumersRequestOps {

  implicit class ScalaListStreamConsumersRequestOps(val self: ScalaListStreamConsumersRequest) extends AnyVal {

    def toJava: JavaListStreamConsumersRequest = {
      val result = JavaListStreamConsumersRequest.builder()
      self.streamARN.foreach(result.streamARN)
      self.nextToken.foreach(result.nextToken)
      self.maxResults.foreach(v => result.maxResults(v))
      self.streamCreationTimestamp.foreach(result.streamCreationTimestamp)
      result.build()
    }

  }

}
