// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ GetBucketWebsiteResponse => ScalaGetBucketWebsiteResponse, _ }
import software.amazon.awssdk.services.s3.model.{ GetBucketWebsiteResponse => JavaGetBucketWebsiteResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GetBucketWebsiteResponseOps {

  implicit class JavaGetBucketWebsiteResponseOps(val self: JavaGetBucketWebsiteResponse) extends AnyVal {

    def toScala: ScalaGetBucketWebsiteResponse = {
      ScalaGetBucketWebsiteResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withRedirectAllRequestsTo(Option(self.redirectAllRequestsTo).map { v =>
          import RedirectAllRequestsToOps._; v.toScala
        }) // RedirectAllRequestsTo
        .withIndexDocument(Option(self.indexDocument).map { v =>
          import IndexDocumentOps._; v.toScala
        }) // IndexDocument
        .withErrorDocument(Option(self.errorDocument).map { v =>
          import ErrorDocumentOps._; v.toScala
        }) // ErrorDocument
        .withRoutingRules(Option(self.routingRules).map { v =>
          import scala.collection.JavaConverters._, RoutingRuleOps._; v.asScala.map(_.toScala)
        }) // Seq[RoutingRule]
    }

  }

}
