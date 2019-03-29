// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v2.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{
  DecreaseStreamRetentionPeriodRequest => ScalaDecreaseStreamRetentionPeriodRequest,
  _
}
import software.amazon.awssdk.services.kinesis.model.{
  DecreaseStreamRetentionPeriodRequest => JavaDecreaseStreamRetentionPeriodRequest
}

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DecreaseStreamRetentionPeriodRequestOps {

  implicit class ScalaDecreaseStreamRetentionPeriodRequestOps(val self: ScalaDecreaseStreamRetentionPeriodRequest)
      extends AnyVal {

    def toJava: JavaDecreaseStreamRetentionPeriodRequest = {
      val result = JavaDecreaseStreamRetentionPeriodRequest.builder()
      self.streamName.filter(_.nonEmpty).foreach(v => result.streamName(v))                  // String
      self.retentionPeriodHours.map(_.intValue).foreach(v => result.retentionPeriodHours(v)) // Int

      result.build()
    }

  }

}
