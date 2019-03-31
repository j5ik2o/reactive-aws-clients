// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ GetBucketVersioningResponse => ScalaGetBucketVersioningResponse, _ }
import software.amazon.awssdk.services.s3.model.{ GetBucketVersioningResponse => JavaGetBucketVersioningResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GetBucketVersioningResponseOps {

  implicit class JavaGetBucketVersioningResponseOps(val self: JavaGetBucketVersioningResponse) extends AnyVal {

    def toScala: ScalaGetBucketVersioningResponse = {
      ScalaGetBucketVersioningResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withStatus(Option(self.status).map { v =>
          import BucketVersioningStatusOps._; v.toScala
        }) // String
        .withMfaDelete(Option(self.mfaDelete).map { v =>
          import MFADeleteStatusOps._; v.toScala
        }) // String
    }

  }

}
