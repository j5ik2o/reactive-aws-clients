// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import com.github.j5ik2o.reactive.aws.kinesis.model.{
  IncreaseStreamRetentionPeriodResponse => ScalaIncreaseStreamRetentionPeriodResponse,
  _
}
import software.amazon.awssdk.services.kinesis.model.{
  IncreaseStreamRetentionPeriodResponse => JavaIncreaseStreamRetentionPeriodResponse
}

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object IncreaseStreamRetentionPeriodResponseOps {

  implicit class JavaIncreaseStreamRetentionPeriodResponseOps(val self: JavaIncreaseStreamRetentionPeriodResponse)
      extends AnyVal {

    def toScala: ScalaIncreaseStreamRetentionPeriodResponse = {
      ScalaIncreaseStreamRetentionPeriodResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
    }

  }

}
