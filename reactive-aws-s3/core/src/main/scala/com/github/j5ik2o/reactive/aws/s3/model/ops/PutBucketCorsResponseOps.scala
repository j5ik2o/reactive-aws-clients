// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ PutBucketCorsResponse => ScalaPutBucketCorsResponse, _ }
import software.amazon.awssdk.services.s3.model.{ PutBucketCorsResponse => JavaPutBucketCorsResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object PutBucketCorsResponseOps {

  implicit class JavaPutBucketCorsResponseOps(val self: JavaPutBucketCorsResponse) extends AnyVal {

    def toScala: ScalaPutBucketCorsResponse = {
      ScalaPutBucketCorsResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
    }

  }

}
