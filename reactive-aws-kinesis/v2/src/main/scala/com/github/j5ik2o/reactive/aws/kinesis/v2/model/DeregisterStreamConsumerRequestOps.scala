// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v2.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{
  DeregisterStreamConsumerRequest => ScalaDeregisterStreamConsumerRequest,
  _
}
import software.amazon.awssdk.services.kinesis.model.{
  DeregisterStreamConsumerRequest => JavaDeregisterStreamConsumerRequest
}

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DeregisterStreamConsumerRequestOps {

  implicit class ScalaDeregisterStreamConsumerRequestOps(val self: ScalaDeregisterStreamConsumerRequest)
      extends AnyVal {

    def toJava: JavaDeregisterStreamConsumerRequest = {
      val result = JavaDeregisterStreamConsumerRequest.builder()
      self.streamARN.filter(_.nonEmpty).foreach(v => result.streamARN(v))       // String
      self.consumerName.filter(_.nonEmpty).foreach(v => result.consumerName(v)) // String
      self.consumerARN.filter(_.nonEmpty).foreach(v => result.consumerARN(v))   // String

      result.build()
    }

  }

}
