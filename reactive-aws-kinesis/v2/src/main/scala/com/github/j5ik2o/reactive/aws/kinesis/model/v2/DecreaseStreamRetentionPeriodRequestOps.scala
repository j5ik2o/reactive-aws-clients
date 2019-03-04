package com.github.j5ik2o.reactive.aws.kinesis.model.v2

import com.github.j5ik2o.reactive.aws.kinesis.model.{
  DecreaseStreamRetentionPeriodRequest => ScalaDecreaseStreamRetentionPeriodRequest
}
import software.amazon.awssdk.services.kinesis.model.{
  DecreaseStreamRetentionPeriodRequest => JavaDecreaseStreamRetentionPeriodRequest
}

object DecreaseStreamRetentionPeriodRequestOps {

  implicit class ScalaDecreaseStreamRetentionPeriodRequestOps(val self: ScalaDecreaseStreamRetentionPeriodRequest)
      extends AnyVal {

    def toJava: JavaDecreaseStreamRetentionPeriodRequest = {
      val result = JavaDecreaseStreamRetentionPeriodRequest.builder()
      self.streamName.foreach(result.streamName)
      self.retentionPeriodHours.foreach(v => result.retentionPeriodHours(v))
      result.build()
    }

  }

}
