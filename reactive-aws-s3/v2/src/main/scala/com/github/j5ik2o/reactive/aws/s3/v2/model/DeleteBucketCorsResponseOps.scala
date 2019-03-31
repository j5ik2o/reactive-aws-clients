// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ DeleteBucketCorsResponse => ScalaDeleteBucketCorsResponse, _ }
import software.amazon.awssdk.services.s3.model.{ DeleteBucketCorsResponse => JavaDeleteBucketCorsResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DeleteBucketCorsResponseOps {

  implicit class JavaDeleteBucketCorsResponseOps(val self: JavaDeleteBucketCorsResponse) extends AnyVal {

    def toScala: ScalaDeleteBucketCorsResponse = {
      ScalaDeleteBucketCorsResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
    }

  }

}
