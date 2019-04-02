// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ PutBucketPolicyResponse => ScalaPutBucketPolicyResponse, _ }
import software.amazon.awssdk.services.s3.model.{ PutBucketPolicyResponse => JavaPutBucketPolicyResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object PutBucketPolicyResponseOps {

  implicit class JavaPutBucketPolicyResponseOps(val self: JavaPutBucketPolicyResponse) extends AnyVal {

    def toScala: ScalaPutBucketPolicyResponse = {
      ScalaPutBucketPolicyResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
    }

  }

}