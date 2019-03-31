// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import com.github.j5ik2o.reactive.aws.kinesis.model.{
  DeregisterStreamConsumerResponse => ScalaDeregisterStreamConsumerResponse,
  _
}
import software.amazon.awssdk.services.kinesis.model.{
  DeregisterStreamConsumerResponse => JavaDeregisterStreamConsumerResponse
}

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DeregisterStreamConsumerResponseOps {

  implicit class JavaDeregisterStreamConsumerResponseOps(val self: JavaDeregisterStreamConsumerResponse)
      extends AnyVal {

    def toScala: ScalaDeregisterStreamConsumerResponse = {
      ScalaDeregisterStreamConsumerResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
    }

  }

}
