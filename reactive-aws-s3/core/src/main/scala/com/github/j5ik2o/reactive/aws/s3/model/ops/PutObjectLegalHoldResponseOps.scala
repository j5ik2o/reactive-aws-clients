// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ PutObjectLegalHoldResponse => ScalaPutObjectLegalHoldResponse, _ }
import software.amazon.awssdk.services.s3.model.{ PutObjectLegalHoldResponse => JavaPutObjectLegalHoldResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object PutObjectLegalHoldResponseOps {

  implicit class JavaPutObjectLegalHoldResponseOps(val self: JavaPutObjectLegalHoldResponse) extends AnyVal {

    def toScala: ScalaPutObjectLegalHoldResponse = {
      ScalaPutObjectLegalHoldResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withRequestCharged(Option(self.requestCharged).map { v =>
          import RequestChargedOps._; v.toScala
        }) // String
    }

  }

}
