package com.github.j5ik2o.reactive.kinesis.model.v1

import com.amazonaws.services.kinesis.model.{ RegisterStreamConsumerResult => JavaRegisterStreamConsumerResponse }
import com.github.j5ik2o.reactive.kinesis.model.{
  RegisterStreamConsumerResponse => ScalaRegisterStreamConsumerResponse
}

import scala.collection.JavaConverters._

object RegisterStreamConsumerResponseOps {

  import ConsumerOps._

  implicit class JavaRegisterStreamConsumerResponseOps(val self: JavaRegisterStreamConsumerResponse) extends AnyVal {

    def toScala: ScalaRegisterStreamConsumerResponse = {
      ScalaRegisterStreamConsumerResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withConsumer(Option(self.getConsumer).map(_.toScala))
    }

  }

}
