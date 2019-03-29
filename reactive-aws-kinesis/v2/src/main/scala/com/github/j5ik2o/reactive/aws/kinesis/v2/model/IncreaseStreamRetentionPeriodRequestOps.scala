// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v2.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{
  IncreaseStreamRetentionPeriodRequest => ScalaIncreaseStreamRetentionPeriodRequest,
  _
}
import software.amazon.awssdk.services.kinesis.model.{
  IncreaseStreamRetentionPeriodRequest => JavaIncreaseStreamRetentionPeriodRequest
}

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object IncreaseStreamRetentionPeriodRequestOps {

  implicit class ScalaIncreaseStreamRetentionPeriodRequestOps(val self: ScalaIncreaseStreamRetentionPeriodRequest)
      extends AnyVal {

    def toJava: JavaIncreaseStreamRetentionPeriodRequest = {
      val result = JavaIncreaseStreamRetentionPeriodRequest.builder()
      self.streamName.filter(_.nonEmpty).foreach(v => result.streamName(v))                  // String
      self.retentionPeriodHours.map(_.intValue).foreach(v => result.retentionPeriodHours(v)) // Int

      result.build()
    }

  }

}
