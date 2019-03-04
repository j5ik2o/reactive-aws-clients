package com.github.j5ik2o.reactive.aws.kinesis.model.v1

import com.amazonaws.services.kinesis.model.{
  DecreaseStreamRetentionPeriodResult => JavaDecreaseStreamRetentionPeriodResponse
}
import com.github.j5ik2o.reactive.aws.kinesis.model.{
  DecreaseStreamRetentionPeriodResponse => ScalaDecreaseStreamRetentionPeriodResponse
}

import scala.collection.JavaConverters._

object DecreaseStreamRetentionPeriodResponseOps {
  implicit class JavaDecreaseStreamRetentionPeriodResponseOps(val self: JavaDecreaseStreamRetentionPeriodResponse) {

    def toScala: ScalaDecreaseStreamRetentionPeriodResponse = {
      ScalaDecreaseStreamRetentionPeriodResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))

    }

  }
}
