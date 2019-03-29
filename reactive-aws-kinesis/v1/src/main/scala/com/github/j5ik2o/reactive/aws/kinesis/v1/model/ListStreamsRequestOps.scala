// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v1.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{ ListStreamsRequest => ScalaListStreamsRequest, _ }
import com.amazonaws.services.kinesis.model.{ ListStreamsRequest => JavaListStreamsRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ListStreamsRequestOps {

  implicit class ScalaListStreamsRequestOps(val self: ScalaListStreamsRequest) extends AnyVal {

    def toJava: JavaListStreamsRequest = {
      val result = new JavaListStreamsRequest()
      self.limit.map(_.intValue).foreach(v => result.withLimit(v))                                          // Int
      self.exclusiveStartStreamName.filter(_.nonEmpty).foreach(v => result.withExclusiveStartStreamName(v)) // String

      result
    }

  }

}
