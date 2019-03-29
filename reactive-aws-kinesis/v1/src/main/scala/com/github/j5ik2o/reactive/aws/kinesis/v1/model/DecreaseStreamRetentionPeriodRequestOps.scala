// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v1.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{
  DecreaseStreamRetentionPeriodRequest => ScalaDecreaseStreamRetentionPeriodRequest,
  _
}
import com.amazonaws.services.kinesis.model.{
  DecreaseStreamRetentionPeriodRequest => JavaDecreaseStreamRetentionPeriodRequest
}

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DecreaseStreamRetentionPeriodRequestOps {

  implicit class ScalaDecreaseStreamRetentionPeriodRequestOps(val self: ScalaDecreaseStreamRetentionPeriodRequest)
      extends AnyVal {

    def toJava: JavaDecreaseStreamRetentionPeriodRequest = {
      val result = new JavaDecreaseStreamRetentionPeriodRequest()
      self.streamName.filter(_.nonEmpty).foreach(v => result.withStreamName(v))                  // String
      self.retentionPeriodHours.map(_.intValue).foreach(v => result.withRetentionPeriodHours(v)) // Int

      result
    }

  }

}
