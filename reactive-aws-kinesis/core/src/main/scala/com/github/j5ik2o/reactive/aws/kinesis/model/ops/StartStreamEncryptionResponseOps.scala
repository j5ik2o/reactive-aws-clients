// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import com.github.j5ik2o.reactive.aws.kinesis.model.{
  StartStreamEncryptionResponse => ScalaStartStreamEncryptionResponse,
  _
}
import software.amazon.awssdk.services.kinesis.model.{
  StartStreamEncryptionResponse => JavaStartStreamEncryptionResponse
}

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
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
