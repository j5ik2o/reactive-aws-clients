// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{
  DeleteBucketLifecycleResponse => ScalaDeleteBucketLifecycleResponse,
  _
}
import software.amazon.awssdk.services.s3.model.{ DeleteBucketLifecycleResponse => JavaDeleteBucketLifecycleResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DeleteBucketLifecycleResponseOps {

  implicit class JavaDeleteBucketLifecycleResponseOps(val self: JavaDeleteBucketLifecycleResponse) extends AnyVal {

    def toScala: ScalaDeleteBucketLifecycleResponse = {
      ScalaDeleteBucketLifecycleResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
    }

  }

}
