// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{
  DeleteBucketReplicationResponse => ScalaDeleteBucketReplicationResponse,
  _
}
import software.amazon.awssdk.services.s3.model.{
  DeleteBucketReplicationResponse => JavaDeleteBucketReplicationResponse
}

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DeleteBucketReplicationResponseOps {

  implicit class JavaDeleteBucketReplicationResponseOps(val self: JavaDeleteBucketReplicationResponse) extends AnyVal {

    def toScala: ScalaDeleteBucketReplicationResponse = {
      ScalaDeleteBucketReplicationResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
    }

  }

}
