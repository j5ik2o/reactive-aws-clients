// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v2.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ DescribeLimitsResponse => ScalaDescribeLimitsResponse, _ }
import software.amazon.awssdk.services.dynamodb.model.{ DescribeLimitsResponse => JavaDescribeLimitsResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DescribeLimitsResponseOps {

  implicit class JavaDescribeLimitsResponseOps(val self: JavaDescribeLimitsResponse) extends AnyVal {

    def toScala: ScalaDescribeLimitsResponse = {
      ScalaDescribeLimitsResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withAccountMaxReadCapacityUnits(Option(self.accountMaxReadCapacityUnits).map(_.longValue)) // Long
        .withAccountMaxWriteCapacityUnits(Option(self.accountMaxWriteCapacityUnits).map(_.longValue)) // Long
        .withTableMaxReadCapacityUnits(Option(self.tableMaxReadCapacityUnits).map(_.longValue)) // Long
        .withTableMaxWriteCapacityUnits(Option(self.tableMaxWriteCapacityUnits).map(_.longValue)) // Long
    }

  }

}
