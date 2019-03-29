// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v1.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{
  DeregisterStreamConsumerRequest => ScalaDeregisterStreamConsumerRequest,
  _
}
import com.amazonaws.services.kinesis.model.{ DeregisterStreamConsumerRequest => JavaDeregisterStreamConsumerRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DeregisterStreamConsumerRequestOps {

  implicit class ScalaDeregisterStreamConsumerRequestOps(val self: ScalaDeregisterStreamConsumerRequest)
      extends AnyVal {

    def toJava: JavaDeregisterStreamConsumerRequest = {
      val result = new JavaDeregisterStreamConsumerRequest()
      self.streamARN.filter(_.nonEmpty).foreach(v => result.withStreamARN(v))       // String
      self.consumerName.filter(_.nonEmpty).foreach(v => result.withConsumerName(v)) // String
      self.consumerARN.filter(_.nonEmpty).foreach(v => result.withConsumerARN(v))   // String

      result
    }

  }

}
