// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ PutBucketLoggingResponse => ScalaPutBucketLoggingResponse, _ }
import software.amazon.awssdk.services.s3.model.{ PutBucketLoggingResponse => JavaPutBucketLoggingResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object PutBucketLoggingResponseOps {

  implicit class JavaPutBucketLoggingResponseOps(val self: JavaPutBucketLoggingResponse) extends AnyVal {

    def toScala: ScalaPutBucketLoggingResponse = {
      ScalaPutBucketLoggingResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
    }

  }

}
