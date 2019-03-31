// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ HeadBucketResponse => ScalaHeadBucketResponse, _ }
import software.amazon.awssdk.services.s3.model.{ HeadBucketResponse => JavaHeadBucketResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object HeadBucketResponseOps {

  implicit class JavaHeadBucketResponseOps(val self: JavaHeadBucketResponse) extends AnyVal {

    def toScala: ScalaHeadBucketResponse = {
      ScalaHeadBucketResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
    }

  }

}
