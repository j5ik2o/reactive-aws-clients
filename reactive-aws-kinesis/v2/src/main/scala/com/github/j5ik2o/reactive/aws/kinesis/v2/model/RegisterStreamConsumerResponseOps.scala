// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v2.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{
  RegisterStreamConsumerResponse => ScalaRegisterStreamConsumerResponse,
  _
}
import software.amazon.awssdk.services.kinesis.model.{
  RegisterStreamConsumerResponse => JavaRegisterStreamConsumerResponse
}

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object RegisterStreamConsumerResponseOps {

  implicit class JavaRegisterStreamConsumerResponseOps(val self: JavaRegisterStreamConsumerResponse) extends AnyVal {

    def toScala: ScalaRegisterStreamConsumerResponse = {
      ScalaRegisterStreamConsumerResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withConsumer(Option(self.consumer).map { v =>
          import ConsumerOps._; v.toScala
        }) // Consumer
    }

  }

}
