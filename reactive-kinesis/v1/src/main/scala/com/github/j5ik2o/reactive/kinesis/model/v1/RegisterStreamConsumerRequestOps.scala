package com.github.j5ik2o.reactive.kinesis.model.v1

import com.amazonaws.services.kinesis.model.{ RegisterStreamConsumerRequest => JavaRegisterStreamConsumerRequest }
import com.github.j5ik2o.reactive.kinesis.model.{ RegisterStreamConsumerRequest => ScalaRegisterStreamConsumerRequest }

object RegisterStreamConsumerRequestOps {

  implicit class ScalaRegisterStreamConsumerRequestOps(val self: ScalaRegisterStreamConsumerRequest) extends AnyVal {

    def toJava: JavaRegisterStreamConsumerRequest = {
      val result = new JavaRegisterStreamConsumerRequest()
      self.streamARN.foreach(result.setStreamARN)
      self.consumerName.foreach(result.setConsumerName)
      result
    }

  }

}
