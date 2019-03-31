// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ PutBucketWebsiteResponse => ScalaPutBucketWebsiteResponse, _ }
import software.amazon.awssdk.services.s3.model.{ PutBucketWebsiteResponse => JavaPutBucketWebsiteResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object PutBucketWebsiteResponseOps {

  implicit class JavaPutBucketWebsiteResponseOps(val self: JavaPutBucketWebsiteResponse) extends AnyVal {

    def toScala: ScalaPutBucketWebsiteResponse = {
      ScalaPutBucketWebsiteResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
    }

  }

}
