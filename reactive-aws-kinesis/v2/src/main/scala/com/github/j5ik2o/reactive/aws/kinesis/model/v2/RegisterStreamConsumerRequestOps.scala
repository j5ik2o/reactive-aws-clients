package com.github.j5ik2o.reactive.aws.kinesis.model.v2

import com.github.j5ik2o.reactive.aws.kinesis.model.{
  RegisterStreamConsumerRequest => ScalaRegisterStreamConsumerRequest
}
import software.amazon.awssdk.services.kinesis.model.{
  RegisterStreamConsumerRequest => JavaRegisterStreamConsumerRequest
}

object RegisterStreamConsumerRequestOps {

  implicit class ScalaRegisterStreamConsumerRequestOps(val self: ScalaRegisterStreamConsumerRequest) extends AnyVal {

    def toJava: JavaRegisterStreamConsumerRequest = {
      val result = JavaRegisterStreamConsumerRequest.builder()
      self.streamARN.foreach(result.streamARN)
      self.consumerName.foreach(result.consumerName)
      result.build()
    }

  }

}
