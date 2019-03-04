package com.github.j5ik2o.reactive.aws.kinesis.model.v1

import com.amazonaws.services.kinesis.model.{
  DecreaseStreamRetentionPeriodRequest => JavaDecreaseStreamRetentionPeriodRequest
}
import com.github.j5ik2o.reactive.aws.kinesis.model.{
  DecreaseStreamRetentionPeriodRequest => ScalaDecreaseStreamRetentionPeriodRequest
}

object DecreaseStreamRetentionPeriodRequestOps {

  implicit class ScalaDecreaseStreamRetentionPeriodRequestOps(val self: ScalaDecreaseStreamRetentionPeriodRequest)
      extends AnyVal {

    def toJava: JavaDecreaseStreamRetentionPeriodRequest = {
      val result = new JavaDecreaseStreamRetentionPeriodRequest()
      self.streamName.foreach(result.setStreamName)
      self.retentionPeriodHours.foreach(v => result.setRetentionPeriodHours(v))
      result
    }

  }

}
