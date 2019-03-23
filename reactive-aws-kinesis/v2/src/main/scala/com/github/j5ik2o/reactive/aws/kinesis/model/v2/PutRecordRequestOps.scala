package com.github.j5ik2o.reactive.aws.kinesis.model.v2

import com.github.j5ik2o.reactive.aws.kinesis.model.{ PutRecordRequest => ScalaPutRecordRequest }
import software.amazon.awssdk.core.SdkBytes
import software.amazon.awssdk.services.kinesis.model.{ PutRecordRequest => JavaPutRecordRequest }

object PutRecordRequestOps {

  implicit class ScalaPutRecordRequestOps(val self: ScalaPutRecordRequest) extends AnyVal {

    def toJava: JavaPutRecordRequest = {
      val result = JavaPutRecordRequest.builder()
      self.streamName.foreach(result.streamName)
      self.data.map(SdkBytes.fromByteArray).foreach(result.data)
      self.partitionKey.foreach(result.partitionKey)
      self.explicitHashKey.foreach(result.explicitHashKey)
      self.sequenceNumberForOrdering.foreach(result.sequenceNumberForOrdering)
      result.build()
    }

  }

}
