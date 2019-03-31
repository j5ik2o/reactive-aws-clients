// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ PutObjectTaggingResponse => ScalaPutObjectTaggingResponse, _ }
import software.amazon.awssdk.services.s3.model.{ PutObjectTaggingResponse => JavaPutObjectTaggingResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object PutObjectTaggingResponseOps {

  implicit class JavaPutObjectTaggingResponseOps(val self: JavaPutObjectTaggingResponse) extends AnyVal {

    def toScala: ScalaPutObjectTaggingResponse = {
      ScalaPutObjectTaggingResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withVersionId(Option(self.versionId)) // String
    }

  }

}
