package com.github.j5ik2o.reactive.kinesis.model.v1

import com.amazonaws.services.kinesis.model.{
  IncreaseStreamRetentionPeriodRequest => JavaIncreaseStreamRetentionPeriodRequest
}
import com.github.j5ik2o.reactive.kinesis.model.{
  IncreaseStreamRetentionPeriodRequest => ScalaIncreaseStreamRetentionPeriodRequest
}

object IncreaseStreamRetentionPeriodRequestOps {

  implicit class ScalaIncreaseStreamRetentionPeriodRequestOps(val self: ScalaIncreaseStreamRetentionPeriodRequest)
      extends AnyVal {

    def toJava: JavaIncreaseStreamRetentionPeriodRequest = {
      val result = new JavaIncreaseStreamRetentionPeriodRequest()
      result
    }

  }

}
