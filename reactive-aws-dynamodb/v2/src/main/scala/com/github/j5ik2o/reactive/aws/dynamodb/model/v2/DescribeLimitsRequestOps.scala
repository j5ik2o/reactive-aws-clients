package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ DescribeLimitsRequest => ScalaDescribeLimitsRequest }
import software.amazon.awssdk.services.dynamodb.model.{ DescribeLimitsRequest => JavaDescribeLimitsRequest }

object DescribeLimitsRequestOps {

  implicit class ScalaDescribeLimitsRequestOps(val self: ScalaDescribeLimitsRequest) extends AnyVal {

    def toJava: JavaDescribeLimitsRequest = {
      val result = JavaDescribeLimitsRequest.builder()
      result.build()
    }

  }

  implicit class JavaDescribeLimitsRequestOps(val self: JavaDescribeLimitsRequest) extends AnyVal {

    def toScala: ScalaDescribeLimitsRequest = {
      ScalaDescribeLimitsRequest()
    }

  }

}
