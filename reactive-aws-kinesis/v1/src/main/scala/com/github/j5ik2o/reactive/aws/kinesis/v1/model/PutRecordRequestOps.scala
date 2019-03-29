// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v1.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{ PutRecordRequest => ScalaPutRecordRequest, _ }
import com.amazonaws.services.kinesis.model.{ PutRecordRequest => JavaPutRecordRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object PutRecordRequestOps {

  implicit class ScalaPutRecordRequestOps(val self: ScalaPutRecordRequest) extends AnyVal {

    def toJava: JavaPutRecordRequest = {
      val result = new JavaPutRecordRequest()
      self.streamName.filter(_.nonEmpty).foreach(v => result.withStreamName(v))                               // String
      self.data.filter(_.nonEmpty).foreach(v => result.withData(java.nio.ByteBuffer.wrap(v)))                 // SdkBytes
      self.partitionKey.filter(_.nonEmpty).foreach(v => result.withPartitionKey(v))                           // String
      self.explicitHashKey.filter(_.nonEmpty).foreach(v => result.withExplicitHashKey(v))                     // String
      self.sequenceNumberForOrdering.filter(_.nonEmpty).foreach(v => result.withSequenceNumberForOrdering(v)) // String

      result
    }

  }

}
