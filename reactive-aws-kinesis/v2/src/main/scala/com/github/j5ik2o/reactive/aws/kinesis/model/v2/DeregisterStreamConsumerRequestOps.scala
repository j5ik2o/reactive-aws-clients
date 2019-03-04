package com.github.j5ik2o.reactive.aws.kinesis.model.v2

import com.github.j5ik2o.reactive.aws.kinesis.model.{
  DeregisterStreamConsumerRequest => ScalaDeregisterStreamConsumerRequest
}
import software.amazon.awssdk.services.kinesis.model.{
  DeregisterStreamConsumerRequest => JavaDeregisterStreamConsumerRequest
}
object DeregisterStreamConsumerRequestOps {

  implicit class ScalaDeregisterStreamConsumerRequestOps(val self: ScalaDeregisterStreamConsumerRequest)
      extends AnyVal {

    def toJava: JavaDeregisterStreamConsumerRequest = {
      val result = JavaDeregisterStreamConsumerRequest.builder()
      self.streamARN.foreach(result.streamARN)
      self.consumerARN.foreach(result.consumerARN)
      self.consumerName.foreach(result.consumerName)
      result.build()
    }

  }

}
