package com.github.j5ik2o.reactive.aws.kinesis.model.v2

import com.github.j5ik2o.reactive.aws.kinesis.model.{ PutRecordsRequest => ScalaPutRecordsRequest }
import software.amazon.awssdk.services.kinesis.model.{ PutRecordsRequest => JavaPutRecordsRequest }

import scala.collection.JavaConverters._

object PutRecordsRequestOps {

  import PutRecordsRequestEntryOps._

  implicit class ScalaPutRecordsRequestOps(val self: ScalaPutRecordsRequest) extends AnyVal {

    def toJava: JavaPutRecordsRequest = {
      val result = JavaPutRecordsRequest.builder()
      self.records.map(_.map(_.toJava).asJava).foreach(result.records)
      self.streamName.foreach(result.streamName)
      result.build()
    }

  }

}
