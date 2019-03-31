// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ GetBucketTaggingResponse => ScalaGetBucketTaggingResponse, _ }
import software.amazon.awssdk.services.s3.model.{ GetBucketTaggingResponse => JavaGetBucketTaggingResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GetBucketTaggingResponseOps {

  implicit class JavaGetBucketTaggingResponseOps(val self: JavaGetBucketTaggingResponse) extends AnyVal {

    def toScala: ScalaGetBucketTaggingResponse = {
      ScalaGetBucketTaggingResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withTagSet(Option(self.tagSet).map { v =>
          import scala.collection.JavaConverters._, TagOps._; v.asScala.map(_.toScala)
        }) // Seq[Tag]
    }

  }

}
