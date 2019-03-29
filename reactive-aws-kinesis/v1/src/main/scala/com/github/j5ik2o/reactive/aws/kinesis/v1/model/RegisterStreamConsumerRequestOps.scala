// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v1.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{
  RegisterStreamConsumerRequest => ScalaRegisterStreamConsumerRequest,
  _
}
import com.amazonaws.services.kinesis.model.{ RegisterStreamConsumerRequest => JavaRegisterStreamConsumerRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object RegisterStreamConsumerRequestOps {

  implicit class ScalaRegisterStreamConsumerRequestOps(val self: ScalaRegisterStreamConsumerRequest) extends AnyVal {

    def toJava: JavaRegisterStreamConsumerRequest = {
      val result = new JavaRegisterStreamConsumerRequest()
      self.streamARN.filter(_.nonEmpty).foreach(v => result.withStreamARN(v))       // String
      self.consumerName.filter(_.nonEmpty).foreach(v => result.withConsumerName(v)) // String

      result
    }

  }

}
