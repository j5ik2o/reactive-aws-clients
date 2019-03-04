package com.github.j5ik2o.reactive.aws.kinesis.model.v2

import com.github.j5ik2o.reactive.aws.kinesis.model.{
  IncreaseStreamRetentionPeriodRequest => ScalaIncreaseStreamRetentionPeriodRequest
}
import software.amazon.awssdk.services.kinesis.model.{
  IncreaseStreamRetentionPeriodRequest => JavaIncreaseStreamRetentionPeriodRequest
}
object IncreaseStreamRetentionPeriodRequestOps {

  implicit class ScalaIncreaseStreamRetentionPeriodRequestOps(val self: ScalaIncreaseStreamRetentionPeriodRequest)
      extends AnyVal {

    def toJava: JavaIncreaseStreamRetentionPeriodRequest = {
      val result = JavaIncreaseStreamRetentionPeriodRequest.builder()
      result.build()
    }

  }

}
