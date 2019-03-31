// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ GetBucketPolicyResponse => ScalaGetBucketPolicyResponse, _ }
import software.amazon.awssdk.services.s3.model.{ GetBucketPolicyResponse => JavaGetBucketPolicyResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GetBucketPolicyResponseOps {

  implicit class JavaGetBucketPolicyResponseOps(val self: JavaGetBucketPolicyResponse) extends AnyVal {

    def toScala: ScalaGetBucketPolicyResponse = {
      ScalaGetBucketPolicyResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withPolicy(Option(self.policy)) // String
    }

  }

}
