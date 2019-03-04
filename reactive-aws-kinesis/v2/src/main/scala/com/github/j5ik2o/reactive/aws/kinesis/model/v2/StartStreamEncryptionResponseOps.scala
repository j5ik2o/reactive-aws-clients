package com.github.j5ik2o.reactive.aws.kinesis.model.v2

import com.github.j5ik2o.reactive.aws.kinesis.model.{ StartStreamEncryptionResponse => ScalaStartStreamEncryptionResponse }
import software.amazon.awssdk.services.kinesis.model.{
  StartStreamEncryptionResponse => JavaStartStreamEncryptionResponse
}

import scala.collection.JavaConverters._
import scala.compat.java8.OptionConverters._

object StartStreamEncryptionResponseOps {

  implicit class JavaStartStreamEncryptionResponseOps(val self: JavaStartStreamEncryptionResponse) extends AnyVal {

    def toScala: ScalaStartStreamEncryptionResponse = {
      ScalaStartStreamEncryptionResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
    }

  }

}
