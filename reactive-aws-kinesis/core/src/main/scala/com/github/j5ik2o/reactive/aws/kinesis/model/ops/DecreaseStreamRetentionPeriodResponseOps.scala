// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import com.github.j5ik2o.reactive.aws.kinesis.model.{
  DecreaseStreamRetentionPeriodResponse => ScalaDecreaseStreamRetentionPeriodResponse,
  _
}
import software.amazon.awssdk.services.kinesis.model.{
  DecreaseStreamRetentionPeriodResponse => JavaDecreaseStreamRetentionPeriodResponse
}

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DecreaseStreamRetentionPeriodResponseOps {

  implicit class JavaDecreaseStreamRetentionPeriodResponseOps(val self: JavaDecreaseStreamRetentionPeriodResponse)
      extends AnyVal {

    def toScala: ScalaDecreaseStreamRetentionPeriodResponse = {
      ScalaDecreaseStreamRetentionPeriodResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
    }

  }

}
