// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v1.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{
  RegisterStreamConsumerResponse => ScalaRegisterStreamConsumerResponse,
  _
}
import com.amazonaws.services.kinesis.model.{ RegisterStreamConsumerResult => JavaRegisterStreamConsumerResponse }

import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object RegisterStreamConsumerResponseOps {

  implicit class JavaRegisterStreamConsumerResponseOps(val self: JavaRegisterStreamConsumerResponse) extends AnyVal {

    def toScala: ScalaRegisterStreamConsumerResponse = {
      ScalaRegisterStreamConsumerResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withConsumer(Option(self.getConsumer).map { v =>
          import ConsumerOps._; v.toScala
        }) // Consumer
    }

  }

}
