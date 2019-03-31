// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ CreateBucketResponse => ScalaCreateBucketResponse, _ }
import software.amazon.awssdk.services.s3.model.{ CreateBucketResponse => JavaCreateBucketResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object CreateBucketResponseOps {

  implicit class JavaCreateBucketResponseOps(val self: JavaCreateBucketResponse) extends AnyVal {

    def toScala: ScalaCreateBucketResponse = {
      ScalaCreateBucketResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withLocation(Option(self.location)) // String
    }

  }

}
