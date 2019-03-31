// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ GetBucketReplicationResponse => ScalaGetBucketReplicationResponse, _ }
import software.amazon.awssdk.services.s3.model.{ GetBucketReplicationResponse => JavaGetBucketReplicationResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GetBucketReplicationResponseOps {

  implicit class JavaGetBucketReplicationResponseOps(val self: JavaGetBucketReplicationResponse) extends AnyVal {

    def toScala: ScalaGetBucketReplicationResponse = {
      ScalaGetBucketReplicationResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withReplicationConfiguration(Option(self.replicationConfiguration).map { v =>
          import ReplicationConfigurationOps._; v.toScala
        }) // ReplicationConfiguration
    }

  }

}
