// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ RestoreObjectResponse => ScalaRestoreObjectResponse, _ }
import software.amazon.awssdk.services.s3.model.{ RestoreObjectResponse => JavaRestoreObjectResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object RestoreObjectResponseOps {

  implicit class JavaRestoreObjectResponseOps(val self: JavaRestoreObjectResponse) extends AnyVal {

    def toScala: ScalaRestoreObjectResponse = {
      ScalaRestoreObjectResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withRequestCharged(Option(self.requestCharged).map { v =>
          import RequestChargedOps._; v.toScala
        }) // String
        .withRestoreOutputPath(Option(self.restoreOutputPath)) // String
    }

  }

}
