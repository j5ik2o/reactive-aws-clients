// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v2.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{ ListStreamsRequest => ScalaListStreamsRequest, _ }
import software.amazon.awssdk.services.kinesis.model.{ ListStreamsRequest => JavaListStreamsRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ListStreamsRequestOps {

  implicit class ScalaListStreamsRequestOps(val self: ScalaListStreamsRequest) extends AnyVal {

    def toJava: JavaListStreamsRequest = {
      val result = JavaListStreamsRequest.builder()
      self.limit.map(_.intValue).foreach(v => result.limit(v))                                          // Int
      self.exclusiveStartStreamName.filter(_.nonEmpty).foreach(v => result.exclusiveStartStreamName(v)) // String

      result.build()
    }

  }

}
