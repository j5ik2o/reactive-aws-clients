// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ GetObjectLegalHoldResponse => ScalaGetObjectLegalHoldResponse, _ }
import software.amazon.awssdk.services.s3.model.{ GetObjectLegalHoldResponse => JavaGetObjectLegalHoldResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GetObjectLegalHoldResponseOps {

  implicit class JavaGetObjectLegalHoldResponseOps(val self: JavaGetObjectLegalHoldResponse) extends AnyVal {

    def toScala: ScalaGetObjectLegalHoldResponse = {
      ScalaGetObjectLegalHoldResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withLegalHold(Option(self.legalHold).map { v =>
          import ObjectLockLegalHoldOps._; v.toScala
        }) // ObjectLockLegalHold
    }

  }

}