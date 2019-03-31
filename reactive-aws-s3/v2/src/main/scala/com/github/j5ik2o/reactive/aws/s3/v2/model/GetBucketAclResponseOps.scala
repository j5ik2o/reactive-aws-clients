// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ GetBucketAclResponse => ScalaGetBucketAclResponse, _ }
import software.amazon.awssdk.services.s3.model.{ GetBucketAclResponse => JavaGetBucketAclResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GetBucketAclResponseOps {

  implicit class JavaGetBucketAclResponseOps(val self: JavaGetBucketAclResponse) extends AnyVal {

    def toScala: ScalaGetBucketAclResponse = {
      ScalaGetBucketAclResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withOwner(Option(self.owner).map { v =>
          import OwnerOps._; v.toScala
        }) // Owner
        .withGrants(Option(self.grants).map { v =>
          import scala.collection.JavaConverters._, GrantOps._; v.asScala.map(_.toScala)
        }) // Seq[Grant]
    }

  }

}
