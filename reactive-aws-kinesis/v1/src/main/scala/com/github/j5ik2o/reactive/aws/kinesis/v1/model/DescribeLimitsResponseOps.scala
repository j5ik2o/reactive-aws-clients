// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v1.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{ DescribeLimitsResponse => ScalaDescribeLimitsResponse, _ }
import com.amazonaws.services.kinesis.model.{ DescribeLimitsResult => JavaDescribeLimitsResponse }

import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DescribeLimitsResponseOps {

  implicit class JavaDescribeLimitsResponseOps(val self: JavaDescribeLimitsResponse) extends AnyVal {

    def toScala: ScalaDescribeLimitsResponse = {
      ScalaDescribeLimitsResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withShardLimit(Option(self.getShardLimit).map(_.intValue)) // Int
        .withOpenShardCount(Option(self.getOpenShardCount).map(_.intValue)) // Int
    }

  }

}
