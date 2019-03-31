// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ DeleteBucketTaggingResponse => ScalaDeleteBucketTaggingResponse, _ }
import software.amazon.awssdk.services.s3.model.{ DeleteBucketTaggingResponse => JavaDeleteBucketTaggingResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DeleteBucketTaggingResponseOps {

  implicit class JavaDeleteBucketTaggingResponseOps(val self: JavaDeleteBucketTaggingResponse) extends AnyVal {

    def toScala: ScalaDeleteBucketTaggingResponse = {
      ScalaDeleteBucketTaggingResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
    }

  }

}
