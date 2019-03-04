package com.github.j5ik2o.reactive.aws.kinesis.model.v1

import com.amazonaws.services.kinesis.model.{ PutRecordsRequest => JavaPutRecordsRequest }
import com.github.j5ik2o.reactive.aws.kinesis.model.{ PutRecordsRequest => ScalaPutRecordsRequest }

import scala.collection.JavaConverters._

object PutRecordsRequestOps {

  import PutRecordsRequestEntryOps._

  implicit class ScalaPutRecordsRequestOps(val self: ScalaPutRecordsRequest) extends AnyVal {

    def toJava: JavaPutRecordsRequest = {
      val result = new JavaPutRecordsRequest()
      self.records.map(_.map(_.toJava).asJava).foreach(result.setRecords)
      self.streamName.foreach(result.setStreamName)
      result
    }

  }

}
