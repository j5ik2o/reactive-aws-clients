// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ ListBucketsResponse => ScalaListBucketsResponse, _ }
import software.amazon.awssdk.services.s3.model.{ ListBucketsResponse => JavaListBucketsResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ListBucketsResponseOps {

  implicit class JavaListBucketsResponseOps(val self: JavaListBucketsResponse) extends AnyVal {

    def toScala: ScalaListBucketsResponse = {
      ScalaListBucketsResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withBuckets(Option(self.buckets).map { v =>
          import scala.collection.JavaConverters._, BucketOps._; v.asScala.map(_.toScala)
        }) // Seq[Bucket]
        .withOwner(Option(self.owner).map { v =>
          import OwnerOps._; v.toScala
        }) // Owner
    }

  }

}
