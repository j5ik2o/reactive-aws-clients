// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v1.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{
  IncreaseStreamRetentionPeriodResponse => ScalaIncreaseStreamRetentionPeriodResponse,
  _
}
import com.amazonaws.services.kinesis.model.{
  IncreaseStreamRetentionPeriodResult => JavaIncreaseStreamRetentionPeriodResponse
}

import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object IncreaseStreamRetentionPeriodResponseOps {

  implicit class JavaIncreaseStreamRetentionPeriodResponseOps(val self: JavaIncreaseStreamRetentionPeriodResponse)
      extends AnyVal {

    def toScala: ScalaIncreaseStreamRetentionPeriodResponse = {
      ScalaIncreaseStreamRetentionPeriodResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
    }

  }

}
