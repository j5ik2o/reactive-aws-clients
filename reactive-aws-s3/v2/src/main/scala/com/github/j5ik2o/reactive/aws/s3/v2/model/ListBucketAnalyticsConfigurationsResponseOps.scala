// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{
  ListBucketAnalyticsConfigurationsResponse => ScalaListBucketAnalyticsConfigurationsResponse,
  _
}
import software.amazon.awssdk.services.s3.model.{
  ListBucketAnalyticsConfigurationsResponse => JavaListBucketAnalyticsConfigurationsResponse
}

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ListBucketAnalyticsConfigurationsResponseOps {

  implicit class JavaListBucketAnalyticsConfigurationsResponseOps(
      val self: JavaListBucketAnalyticsConfigurationsResponse
  ) extends AnyVal {

    def toScala: ScalaListBucketAnalyticsConfigurationsResponse = {
      ScalaListBucketAnalyticsConfigurationsResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withIsTruncated(Option(self.isTruncated).map(_.booleanValue)) // Boolean
        .withContinuationToken(Option(self.continuationToken)) // String
        .withNextContinuationToken(Option(self.nextContinuationToken)) // String
        .withAnalyticsConfigurationList(Option(self.analyticsConfigurationList).map { v =>
          import scala.collection.JavaConverters._, AnalyticsConfigurationOps._; v.asScala.map(_.toScala)
        }) // Seq[AnalyticsConfiguration]
    }

  }

}
