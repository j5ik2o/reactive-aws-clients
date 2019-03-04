package com.github.j5ik2o.reactive.kinesis.model.v2

import com.github.j5ik2o.reactive.kinesis.model.{ DescribeLimitsRequest => ScalaDescribeLimitsRequest }
import software.amazon.awssdk.services.kinesis.model.{ DescribeLimitsRequest => JavaDescribeLimitsRequest }

object DescribeLimitsRequestOps {

  implicit class ScalaDescribeLimitsRequestOps(val self: ScalaDescribeLimitsRequest) extends AnyVal {

    def toJava: JavaDescribeLimitsRequest = {
      val result = JavaDescribeLimitsRequest.builder()
      result.build()
    }

  }

}
