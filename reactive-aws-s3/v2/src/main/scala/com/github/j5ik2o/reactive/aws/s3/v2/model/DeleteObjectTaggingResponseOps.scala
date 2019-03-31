// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ DeleteObjectTaggingResponse => ScalaDeleteObjectTaggingResponse, _ }
import software.amazon.awssdk.services.s3.model.{ DeleteObjectTaggingResponse => JavaDeleteObjectTaggingResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DeleteObjectTaggingResponseOps {

  implicit class JavaDeleteObjectTaggingResponseOps(val self: JavaDeleteObjectTaggingResponse) extends AnyVal {

    def toScala: ScalaDeleteObjectTaggingResponse = {
      ScalaDeleteObjectTaggingResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withVersionId(Option(self.versionId)) // String
    }

  }

}
