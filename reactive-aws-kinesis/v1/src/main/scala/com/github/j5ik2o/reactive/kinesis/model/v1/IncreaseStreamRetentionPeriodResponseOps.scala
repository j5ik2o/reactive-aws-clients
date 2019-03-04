package com.github.j5ik2o.reactive.kinesis.model.v1

import com.amazonaws.services.kinesis.model.{
  IncreaseStreamRetentionPeriodResult => JavaIncreaseStreamRetentionPeriodResponse
}
import com.github.j5ik2o.reactive.kinesis.model.{
  IncreaseStreamRetentionPeriodResponse => ScalaIncreaseStreamRetentionPeriodResponse
}

import scala.collection.JavaConverters._
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
