// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{
  ListBucketInventoryConfigurationsResponse => ScalaListBucketInventoryConfigurationsResponse,
  _
}
import software.amazon.awssdk.services.s3.model.{
  ListBucketInventoryConfigurationsResponse => JavaListBucketInventoryConfigurationsResponse
}

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ListBucketInventoryConfigurationsResponseOps {

  implicit class JavaListBucketInventoryConfigurationsResponseOps(
      val self: JavaListBucketInventoryConfigurationsResponse
  ) extends AnyVal {

    def toScala: ScalaListBucketInventoryConfigurationsResponse = {
      ScalaListBucketInventoryConfigurationsResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withContinuationToken(Option(self.continuationToken)) // String
        .withInventoryConfigurationList(Option(self.inventoryConfigurationList).map { v =>
          import scala.collection.JavaConverters._, InventoryConfigurationOps._; v.asScala.map(_.toScala)
        }) // Seq[InventoryConfiguration]
        .withIsTruncated(Option(self.isTruncated).map(_.booleanValue)) // Boolean
        .withNextContinuationToken(Option(self.nextContinuationToken)) // String
    }

  }

}
