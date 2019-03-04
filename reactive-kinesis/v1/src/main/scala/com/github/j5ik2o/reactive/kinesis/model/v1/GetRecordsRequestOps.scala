package com.github.j5ik2o.reactive.kinesis.model.v1

import com.amazonaws.services.kinesis.model.{ GetRecordsRequest => JavaGetRecordsRequest }
import com.github.j5ik2o.reactive.kinesis.model.{ GetRecordsRequest => ScalaGetRecordsRequest }

object GetRecordsRequestOps {

  implicit class ScalaGetRecordsRequestOps(val self: ScalaGetRecordsRequest) extends AnyVal {

    def toJava: JavaGetRecordsRequest = {
      val result = new JavaGetRecordsRequest()
      self.shardIterator.foreach(result.setShardIterator)
      self.limit.foreach(v => result.setLimit(v))
      result
    }

  }

}
