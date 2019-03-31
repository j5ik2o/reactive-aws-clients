// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{
  ListBucketMetricsConfigurationsResponse => ScalaListBucketMetricsConfigurationsResponse,
  _
}
import software.amazon.awssdk.services.s3.model.{
  ListBucketMetricsConfigurationsResponse => JavaListBucketMetricsConfigurationsResponse
}

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ListBucketMetricsConfigurationsResponseOps {

  implicit class JavaListBucketMetricsConfigurationsResponseOps(val self: JavaListBucketMetricsConfigurationsResponse)
      extends AnyVal {

    def toScala: ScalaListBucketMetricsConfigurationsResponse = {
      ScalaListBucketMetricsConfigurationsResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withIsTruncated(Option(self.isTruncated).map(_.booleanValue)) // Boolean
        .withContinuationToken(Option(self.continuationToken)) // String
        .withNextContinuationToken(Option(self.nextContinuationToken)) // String
        .withMetricsConfigurationList(Option(self.metricsConfigurationList).map { v =>
          import scala.collection.JavaConverters._, MetricsConfigurationOps._; v.asScala.map(_.toScala)
        }) // Seq[MetricsConfiguration]
    }

  }

}
