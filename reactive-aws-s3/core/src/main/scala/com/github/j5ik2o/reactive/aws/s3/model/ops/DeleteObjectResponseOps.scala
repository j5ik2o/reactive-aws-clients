// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ DeleteObjectResponse => ScalaDeleteObjectResponse, _ }
import software.amazon.awssdk.services.s3.model.{ DeleteObjectResponse => JavaDeleteObjectResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DeleteObjectResponseOps {

  implicit class JavaDeleteObjectResponseOps(val self: JavaDeleteObjectResponse) extends AnyVal {

    def toScala: ScalaDeleteObjectResponse = {
      ScalaDeleteObjectResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withDeleteMarker(Option(self.deleteMarker).map(_.booleanValue)) // Boolean
        .withVersionId(Option(self.versionId)) // String
        .withRequestCharged(Option(self.requestCharged).map { v =>
          import RequestChargedOps._; v.toScala
        }) // String
    }

  }

}
