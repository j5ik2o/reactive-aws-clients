package com.github.j5ik2o.reactive.aws.kinesis.model.v1

import com.amazonaws.services.kinesis.model.{ PutRecordRequest => JavaPutRecordRequest }
import com.github.j5ik2o.reactive.aws.kinesis.model.{ PutRecordRequest => ScalaPutRecordRequest }

object PutRecordRequestOps {

  implicit class ScalaPutRecordRequestOps(val self: ScalaPutRecordRequest) extends AnyVal {

    def toJava: JavaPutRecordRequest = {
      val result = new JavaPutRecordRequest()
      self.streamName.foreach(result.setStreamName)
      self.data.foreach(result.setData)
      self.partitionKey.foreach(result.setPartitionKey)
      self.explicitHashKey.foreach(result.setExplicitHashKey)
      self.sequenceNumberForOrdering.foreach(result.setSequenceNumberForOrdering)
      result
    }

  }

}
