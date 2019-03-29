// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v1.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{
  IncreaseStreamRetentionPeriodRequest => ScalaIncreaseStreamRetentionPeriodRequest,
  _
}
import com.amazonaws.services.kinesis.model.{
  IncreaseStreamRetentionPeriodRequest => JavaIncreaseStreamRetentionPeriodRequest
}

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object IncreaseStreamRetentionPeriodRequestOps {

  implicit class ScalaIncreaseStreamRetentionPeriodRequestOps(val self: ScalaIncreaseStreamRetentionPeriodRequest)
      extends AnyVal {

    def toJava: JavaIncreaseStreamRetentionPeriodRequest = {
      val result = new JavaIncreaseStreamRetentionPeriodRequest()
      self.streamName.filter(_.nonEmpty).foreach(v => result.withStreamName(v))                  // String
      self.retentionPeriodHours.map(_.intValue).foreach(v => result.withRetentionPeriodHours(v)) // Int

      result
    }

  }

}
