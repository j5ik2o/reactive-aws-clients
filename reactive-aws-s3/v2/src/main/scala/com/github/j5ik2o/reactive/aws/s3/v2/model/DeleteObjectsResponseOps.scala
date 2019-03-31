// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ DeleteObjectsResponse => ScalaDeleteObjectsResponse, _ }
import software.amazon.awssdk.services.s3.model.{ DeleteObjectsResponse => JavaDeleteObjectsResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DeleteObjectsResponseOps {

  implicit class JavaDeleteObjectsResponseOps(val self: JavaDeleteObjectsResponse) extends AnyVal {

    def toScala: ScalaDeleteObjectsResponse = {
      ScalaDeleteObjectsResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withDeleted(Option(self.deleted).map { v =>
          import scala.collection.JavaConverters._, DeletedObjectOps._; v.asScala.map(_.toScala)
        }) // Seq[DeletedObject]
        .withRequestCharged(Option(self.requestCharged).map { v =>
          import RequestChargedOps._; v.toScala
        }) // String
        .withErrors(Option(self.errors).map { v =>
          import scala.collection.JavaConverters._, S3ErrorOps._; v.asScala.map(_.toScala)
        }) // Seq[S3Error]
    }

  }

}
