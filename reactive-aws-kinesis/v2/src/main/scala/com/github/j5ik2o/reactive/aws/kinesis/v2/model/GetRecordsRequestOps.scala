// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v2.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{ GetRecordsRequest => ScalaGetRecordsRequest, _ }
import software.amazon.awssdk.services.kinesis.model.{ GetRecordsRequest => JavaGetRecordsRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GetRecordsRequestOps {

  implicit class ScalaGetRecordsRequestOps(val self: ScalaGetRecordsRequest) extends AnyVal {

    def toJava: JavaGetRecordsRequest = {
      val result = JavaGetRecordsRequest.builder()
      self.shardIterator.filter(_.nonEmpty).foreach(v => result.shardIterator(v)) // String
      self.limit.map(_.intValue).foreach(v => result.limit(v))                    // Int

      result.build()
    }

  }

}
