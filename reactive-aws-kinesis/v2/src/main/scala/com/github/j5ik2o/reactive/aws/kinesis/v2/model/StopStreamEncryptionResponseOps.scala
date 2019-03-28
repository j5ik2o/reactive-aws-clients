// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v2.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{
  StopStreamEncryptionResponse => ScalaStopStreamEncryptionResponse,
  _
}
import software.amazon.awssdk.services.kinesis.model.{
  StopStreamEncryptionResponse => JavaStopStreamEncryptionResponse
}

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object StopStreamEncryptionResponseOps {

  implicit class JavaStopStreamEncryptionResponseOps(val self: JavaStopStreamEncryptionResponse) extends AnyVal {

    def toScala: ScalaStopStreamEncryptionResponse = {
      ScalaStopStreamEncryptionResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
    }

  }

}
