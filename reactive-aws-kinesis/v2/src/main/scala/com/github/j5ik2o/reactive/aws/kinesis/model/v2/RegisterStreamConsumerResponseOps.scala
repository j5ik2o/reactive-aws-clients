package com.github.j5ik2o.reactive.aws.kinesis.model.v2

import com.github.j5ik2o.reactive.aws.kinesis.model.{
  RegisterStreamConsumerResponse => ScalaRegisterStreamConsumerResponse
}
import software.amazon.awssdk.services.kinesis.model.{
  RegisterStreamConsumerResponse => JavaRegisterStreamConsumerResponse
}

import scala.collection.JavaConverters._
import scala.compat.java8.OptionConverters._

object RegisterStreamConsumerResponseOps {

  import ConsumerOps._

  implicit class JavaRegisterStreamConsumerResponseOps(val self: JavaRegisterStreamConsumerResponse) extends AnyVal {

    def toScala: ScalaRegisterStreamConsumerResponse = {
      ScalaRegisterStreamConsumerResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withConsumer(Option(self.consumer()).map(_.toScala))
    }

  }

}
