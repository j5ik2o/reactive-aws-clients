package com.github.j5ik2o.reactive.aws.kinesis.model.v2

import com.github.j5ik2o.reactive.aws.kinesis.model.{ ListStreamConsumersResponse => ScalaListStreamConsumersResponse }
import software.amazon.awssdk.services.kinesis.model.{ ListStreamConsumersResponse => JavaListStreamConsumersResponse }

import scala.collection.JavaConverters._
import scala.compat.java8.OptionConverters._

object ListStreamConsumersResponseOps {

  import ConsumerOps._

  implicit class JavaListStreamConsumersResponseOps(val self: JavaListStreamConsumersResponse) extends AnyVal {

    def toScala: ScalaListStreamConsumersResponse = {
      ScalaListStreamConsumersResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withConsumers(Option(self.consumers()).map(_.asScala.map(_.toScala)))
    }

  }

}
