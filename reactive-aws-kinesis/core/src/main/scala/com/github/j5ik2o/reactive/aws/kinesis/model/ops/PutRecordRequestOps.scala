// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import com.github.j5ik2o.reactive.aws.kinesis.model.{ PutRecordRequest => ScalaPutRecordRequest, _ }
import software.amazon.awssdk.services.kinesis.model.{ PutRecordRequest => JavaPutRecordRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object PutRecordRequestOps {

  implicit class ScalaPutRecordRequestOps(val self: ScalaPutRecordRequest) extends AnyVal {

    def toJava: JavaPutRecordRequest = {
      val result = JavaPutRecordRequest.builder()
      self.streamName.filter(_.nonEmpty).foreach(v => result.streamName(v))                               // String
      self.data.foreach(v => result.data(v))                                                              // SdkBytes
      self.partitionKey.filter(_.nonEmpty).foreach(v => result.partitionKey(v))                           // String
      self.explicitHashKey.filter(_.nonEmpty).foreach(v => result.explicitHashKey(v))                     // String
      self.sequenceNumberForOrdering.filter(_.nonEmpty).foreach(v => result.sequenceNumberForOrdering(v)) // String

      result.build()
    }

  }

}
