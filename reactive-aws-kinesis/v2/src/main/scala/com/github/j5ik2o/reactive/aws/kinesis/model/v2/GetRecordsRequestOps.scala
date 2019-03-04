package com.github.j5ik2o.reactive.aws.kinesis.model.v2

import com.github.j5ik2o.reactive.aws.kinesis.model.{ GetRecordsRequest => ScalaGetRecordsRequest }
import software.amazon.awssdk.services.kinesis.model.{ GetRecordsRequest => JavaGetRecordsRequest }

object GetRecordsRequestOps {

  implicit class ScalaGetRecordsRequestOps(val self: ScalaGetRecordsRequest) extends AnyVal {

    def toJava: JavaGetRecordsRequest = {
      val result = JavaGetRecordsRequest.builder()
      self.shardIterator.foreach(result.shardIterator)
      self.limit.foreach(v => result.limit(v))
      result.build()
    }

  }

}
