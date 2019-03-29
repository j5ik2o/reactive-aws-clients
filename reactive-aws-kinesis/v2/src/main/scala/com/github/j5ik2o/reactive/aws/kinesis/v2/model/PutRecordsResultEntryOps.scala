// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v2.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{ PutRecordsResultEntry => ScalaPutRecordsResultEntry, _ }
import software.amazon.awssdk.services.kinesis.model.{ PutRecordsResultEntry => JavaPutRecordsResultEntry }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object PutRecordsResultEntryOps {

  implicit class ScalaPutRecordsResultEntryOps(val self: ScalaPutRecordsResultEntry) extends AnyVal {

    def toJava: JavaPutRecordsResultEntry = {
      val result = JavaPutRecordsResultEntry.builder()
      self.sequenceNumber.filter(_.nonEmpty).foreach(v => result.sequenceNumber(v)) // String
      self.shardId.filter(_.nonEmpty).foreach(v => result.shardId(v))               // String
      self.errorCode.filter(_.nonEmpty).foreach(v => result.errorCode(v))           // String
      self.errorMessage.filter(_.nonEmpty).foreach(v => result.errorMessage(v))     // String

      result.build()
    }

  }

  implicit class JavaPutRecordsResultEntryOps(val self: JavaPutRecordsResultEntry) extends AnyVal {

    def toScala: ScalaPutRecordsResultEntry = {
      ScalaPutRecordsResultEntry()
        .withSequenceNumber(Option(self.sequenceNumber)) // String
        .withShardId(Option(self.shardId)) // String
        .withErrorCode(Option(self.errorCode)) // String
        .withErrorMessage(Option(self.errorMessage)) // String
    }

  }

}
