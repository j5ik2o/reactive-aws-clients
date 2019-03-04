package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ DescribeLimitsResult => JavaDescribeLimitsResponse }
import com.github.j5ik2o.reactive.aws.dynamodb.model.{ DescribeLimitsResponse => ScalaDescribeLimitsResponse }

import scala.collection.JavaConverters._

object DescribeLimitsResponseOps {

  implicit class JavaDescribeLimitsResponseOps(val self: JavaDescribeLimitsResponse) extends AnyVal {

    def toScala: ScalaDescribeLimitsResponse = {
      ScalaDescribeLimitsResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withAccountMaxReadCapacityUnits(Option(self.getAccountMaxReadCapacityUnits))
        .withAccountMaxWriteCapacityUnits(Option(self.getAccountMaxWriteCapacityUnits))
        .withTableMaxReadCapacityUnits(Option(self.getTableMaxReadCapacityUnits))
        .withTableMaxWriteCapacityUnits(Option(self.getTableMaxWriteCapacityUnits))
    }
  }

}
