// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ GetBucketLocationResponse => ScalaGetBucketLocationResponse, _ }
import software.amazon.awssdk.services.s3.model.{ GetBucketLocationResponse => JavaGetBucketLocationResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GetBucketLocationResponseOps {

  implicit class JavaGetBucketLocationResponseOps(val self: JavaGetBucketLocationResponse) extends AnyVal {

    def toScala: ScalaGetBucketLocationResponse = {
      ScalaGetBucketLocationResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withLocationConstraint(Option(self.locationConstraint).map { v =>
          import BucketLocationConstraintOps._; v.toScala
        }) // String
    }

  }

}
