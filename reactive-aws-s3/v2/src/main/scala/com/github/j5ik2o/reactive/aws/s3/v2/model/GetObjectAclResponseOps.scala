// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ GetObjectAclResponse => ScalaGetObjectAclResponse, _ }
import software.amazon.awssdk.services.s3.model.{ GetObjectAclResponse => JavaGetObjectAclResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GetObjectAclResponseOps {

  implicit class JavaGetObjectAclResponseOps(val self: JavaGetObjectAclResponse) extends AnyVal {

    def toScala: ScalaGetObjectAclResponse = {
      ScalaGetObjectAclResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withOwner(Option(self.owner).map { v =>
          import OwnerOps._; v.toScala
        }) // Owner
        .withGrants(Option(self.grants).map { v =>
          import scala.collection.JavaConverters._, GrantOps._; v.asScala.map(_.toScala)
        }) // Seq[Grant]
        .withRequestCharged(Option(self.requestCharged).map { v =>
          import RequestChargedOps._; v.toScala
        }) // String
    }

  }

}
