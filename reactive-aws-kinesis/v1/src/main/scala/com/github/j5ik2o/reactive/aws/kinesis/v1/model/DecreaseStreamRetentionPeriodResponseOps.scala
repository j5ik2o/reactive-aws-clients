// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v1.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{
  DecreaseStreamRetentionPeriodResponse => ScalaDecreaseStreamRetentionPeriodResponse,
  _
}
import com.amazonaws.services.kinesis.model.{
  DecreaseStreamRetentionPeriodResult => JavaDecreaseStreamRetentionPeriodResponse
}

import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DecreaseStreamRetentionPeriodResponseOps {

  implicit class JavaDecreaseStreamRetentionPeriodResponseOps(val self: JavaDecreaseStreamRetentionPeriodResponse)
      extends AnyVal {

    def toScala: ScalaDecreaseStreamRetentionPeriodResponse = {
      ScalaDecreaseStreamRetentionPeriodResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
    }

  }

}
