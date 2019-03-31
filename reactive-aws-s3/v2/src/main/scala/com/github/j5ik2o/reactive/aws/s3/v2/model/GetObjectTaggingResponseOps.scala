// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ GetObjectTaggingResponse => ScalaGetObjectTaggingResponse, _ }
import software.amazon.awssdk.services.s3.model.{ GetObjectTaggingResponse => JavaGetObjectTaggingResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GetObjectTaggingResponseOps {

  implicit class JavaGetObjectTaggingResponseOps(val self: JavaGetObjectTaggingResponse) extends AnyVal {

    def toScala: ScalaGetObjectTaggingResponse = {
      ScalaGetObjectTaggingResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withVersionId(Option(self.versionId)) // String
        .withTagSet(Option(self.tagSet).map { v =>
          import scala.collection.JavaConverters._, TagOps._; v.asScala.map(_.toScala)
        }) // Seq[Tag]
    }

  }

}
