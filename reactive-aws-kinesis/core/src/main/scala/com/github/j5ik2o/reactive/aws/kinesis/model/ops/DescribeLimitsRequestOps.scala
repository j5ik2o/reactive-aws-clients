// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import com.github.j5ik2o.reactive.aws.kinesis.model.{ DescribeLimitsRequest => ScalaDescribeLimitsRequest, _ }
import software.amazon.awssdk.services.kinesis.model.{ DescribeLimitsRequest => JavaDescribeLimitsRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DescribeLimitsRequestOps {

  implicit class ScalaDescribeLimitsRequestOps(val self: ScalaDescribeLimitsRequest) extends AnyVal {

    def toJava: JavaDescribeLimitsRequest = {
      val result = JavaDescribeLimitsRequest.builder()

      result.build()
    }

  }

}
