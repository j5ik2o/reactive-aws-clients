// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{
  GetBucketPolicyStatusResponse => ScalaGetBucketPolicyStatusResponse,
  _
}
import software.amazon.awssdk.services.s3.model.{ GetBucketPolicyStatusResponse => JavaGetBucketPolicyStatusResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GetBucketPolicyStatusResponseOps {

  implicit class JavaGetBucketPolicyStatusResponseOps(val self: JavaGetBucketPolicyStatusResponse) extends AnyVal {

    def toScala: ScalaGetBucketPolicyStatusResponse = {
      ScalaGetBucketPolicyStatusResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withPolicyStatus(Option(self.policyStatus).map { v =>
          import PolicyStatusOps._; v.toScala
        }) // PolicyStatus
    }

  }

}
