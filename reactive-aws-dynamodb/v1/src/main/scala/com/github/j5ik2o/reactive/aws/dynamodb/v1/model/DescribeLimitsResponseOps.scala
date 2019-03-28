// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ DescribeLimitsResponse => ScalaDescribeLimitsResponse, _ }
import com.amazonaws.services.dynamodbv2.model.{ DescribeLimitsResult => JavaDescribeLimitsResponse }

import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DescribeLimitsResponseOps {

  implicit class JavaDescribeLimitsResponseOps(val self: JavaDescribeLimitsResponse) extends AnyVal {

    def toScala: ScalaDescribeLimitsResponse = {
      ScalaDescribeLimitsResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withAccountMaxReadCapacityUnits(Option(self.getAccountMaxReadCapacityUnits).map(_.longValue)) // Long
        .withAccountMaxWriteCapacityUnits(Option(self.getAccountMaxWriteCapacityUnits).map(_.longValue)) // Long
        .withTableMaxReadCapacityUnits(Option(self.getTableMaxReadCapacityUnits).map(_.longValue)) // Long
        .withTableMaxWriteCapacityUnits(Option(self.getTableMaxWriteCapacityUnits).map(_.longValue)) // Long
    }

  }

}
