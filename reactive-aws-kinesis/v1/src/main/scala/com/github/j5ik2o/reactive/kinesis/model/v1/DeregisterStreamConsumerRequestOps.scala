package com.github.j5ik2o.reactive.kinesis.model.v1

import com.amazonaws.services.kinesis.model.{ DeregisterStreamConsumerRequest => JavaDeregisterStreamConsumerRequest }
import com.github.j5ik2o.reactive.kinesis.model.{
  DeregisterStreamConsumerRequest => ScalaDeregisterStreamConsumerRequest
}

object DeregisterStreamConsumerRequestOps {

  implicit class ScalaDeregisterStreamConsumerRequestOps(val self: ScalaDeregisterStreamConsumerRequest)
      extends AnyVal {

    def toJava: JavaDeregisterStreamConsumerRequest = {
      val result = new JavaDeregisterStreamConsumerRequest()
      self.streamARN.foreach(result.setStreamARN)
      self.consumerARN.foreach(result.setConsumerARN)
      self.consumerName.foreach(result.setConsumerName)
      result
    }

  }

}
