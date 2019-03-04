package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ DescribeLimitsRequest => JavaDescribeLimitsRequest }
import com.github.j5ik2o.reactive.aws.dynamodb.model.{ DescribeLimitsRequest => ScalaDescribeLimitsRequest }

object DescribeLimitsRequestOps {

  implicit class ScalaDescribeLimitsRequestOps(val self: ScalaDescribeLimitsRequest) extends AnyVal {

    def toJava: JavaDescribeLimitsRequest = {
      val result = new JavaDescribeLimitsRequest()
      result
    }

  }

  implicit class JavaDescribeLimitsRequestOps(val self: JavaDescribeLimitsRequest) extends AnyVal {

    def toScala: ScalaDescribeLimitsRequest = {
      ScalaDescribeLimitsRequest()
    }

  }

}
