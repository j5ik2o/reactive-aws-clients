// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ GetBucketLoggingResponse => ScalaGetBucketLoggingResponse, _ }
import software.amazon.awssdk.services.s3.model.{ GetBucketLoggingResponse => JavaGetBucketLoggingResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GetBucketLoggingResponseOps {

  implicit class JavaGetBucketLoggingResponseOps(val self: JavaGetBucketLoggingResponse) extends AnyVal {

    def toScala: ScalaGetBucketLoggingResponse = {
      ScalaGetBucketLoggingResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withLoggingEnabled(Option(self.loggingEnabled).map { v =>
          import LoggingEnabledOps._; v.toScala
        }) // LoggingEnabled
    }

  }

}
