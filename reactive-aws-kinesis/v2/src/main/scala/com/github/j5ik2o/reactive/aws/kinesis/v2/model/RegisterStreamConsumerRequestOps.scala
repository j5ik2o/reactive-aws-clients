// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v2.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{
  RegisterStreamConsumerRequest => ScalaRegisterStreamConsumerRequest,
  _
}
import software.amazon.awssdk.services.kinesis.model.{
  RegisterStreamConsumerRequest => JavaRegisterStreamConsumerRequest
}

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object RegisterStreamConsumerRequestOps {

  implicit class ScalaRegisterStreamConsumerRequestOps(val self: ScalaRegisterStreamConsumerRequest) extends AnyVal {

    def toJava: JavaRegisterStreamConsumerRequest = {
      val result = JavaRegisterStreamConsumerRequest.builder()
      self.streamARN.filter(_.nonEmpty).foreach(v => result.streamARN(v))       // String
      self.consumerName.filter(_.nonEmpty).foreach(v => result.consumerName(v)) // String

      result.build()
    }

  }

}
