package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ DescribeLimitsResponse => ScalaDescribeLimitsResponse }
import software.amazon.awssdk.services.dynamodb.model.{ DescribeLimitsResponse => JavaDescribeLimitsResponse }

import scala.collection.JavaConverters._
import scala.compat.java8.OptionConverters._

object DescribeLimitsResponseOps {

  implicit class JavaDescribeLimitsResponseOps(val self: JavaDescribeLimitsResponse) extends AnyVal {

    def toScala: ScalaDescribeLimitsResponse = {
      ScalaDescribeLimitsResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withAccountMaxReadCapacityUnits(Option(self.accountMaxReadCapacityUnits).map(_.longValue()))
        .withAccountMaxWriteCapacityUnits(Option(self.accountMaxWriteCapacityUnits).map(_.longValue()))
        .withTableMaxReadCapacityUnits(Option(self.tableMaxReadCapacityUnits).map(_.longValue()))
        .withTableMaxWriteCapacityUnits(Option(self.tableMaxWriteCapacityUnits).map(_.longValue()))
    }
  }

}
