package com.github.j5ik2o.reactive.kinesis.model.v1

import java.util.Date

import com.amazonaws.services.kinesis.model.{ ListStreamConsumersRequest => JavaListStreamConsumersRequest }
import com.github.j5ik2o.reactive.kinesis.model.{ ListStreamConsumersRequest => ScalaListStreamConsumersRequest }

object ListStreamConsumersRequestOps {

  implicit class ScalaListStreamConsumersRequestOps(val self: ScalaListStreamConsumersRequest) extends AnyVal {

    def toJava: JavaListStreamConsumersRequest = {
      val result = new JavaListStreamConsumersRequest()
      self.streamARN.foreach(result.setStreamARN)
      self.nextToken.foreach(result.setNextToken)
      self.maxResults.foreach(v => result.setMaxResults(v))
      self.streamCreationTimestamp.map(Date.from).foreach(result.setStreamCreationTimestamp)
      result
    }

  }

}
