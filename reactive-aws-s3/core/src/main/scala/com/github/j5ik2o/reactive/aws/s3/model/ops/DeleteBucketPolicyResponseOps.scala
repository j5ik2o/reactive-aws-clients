// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ DeleteBucketPolicyResponse => ScalaDeleteBucketPolicyResponse, _ }
import software.amazon.awssdk.services.s3.model.{ DeleteBucketPolicyResponse => JavaDeleteBucketPolicyResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DeleteBucketPolicyResponseOps {

  implicit class JavaDeleteBucketPolicyResponseOps(val self: JavaDeleteBucketPolicyResponse) extends AnyVal {

    def toScala: ScalaDeleteBucketPolicyResponse = {
      ScalaDeleteBucketPolicyResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
    }

  }

}
