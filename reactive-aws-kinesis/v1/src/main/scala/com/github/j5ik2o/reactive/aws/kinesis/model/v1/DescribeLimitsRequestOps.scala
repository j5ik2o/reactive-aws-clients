package com.github.j5ik2o.reactive.aws.kinesis.model.v1

import com.amazonaws.services.kinesis.model.{ DescribeLimitsRequest => JavaDescribeLimitsRequest }
import com.github.j5ik2o.reactive.aws.kinesis.model.{ DescribeLimitsRequest => ScalaDescribeLimitsRequest }

object DescribeLimitsRequestOps {

  implicit class ScalaDescribeLimitsRequestOps(val self: ScalaDescribeLimitsRequest) extends AnyVal {

    def toJava: JavaDescribeLimitsRequest = {
      val result = new JavaDescribeLimitsRequest()
      result
    }

  }

}
