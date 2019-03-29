// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v1.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{ PutRecordsResultEntry => ScalaPutRecordsResultEntry, _ }
import com.amazonaws.services.kinesis.model.{ PutRecordsResultEntry => JavaPutRecordsResultEntry }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object PutRecordsResultEntryOps {

  implicit class ScalaPutRecordsResultEntryOps(val self: ScalaPutRecordsResultEntry) extends AnyVal {

    def toJava: JavaPutRecordsResultEntry = {
      val result = new JavaPutRecordsResultEntry()
      self.sequenceNumber.filter(_.nonEmpty).foreach(v => result.withSequenceNumber(v)) // String
      self.shardId.filter(_.nonEmpty).foreach(v => result.withShardId(v))               // String
      self.errorCode.filter(_.nonEmpty).foreach(v => result.withErrorCode(v))           // String
      self.errorMessage.filter(_.nonEmpty).foreach(v => result.withErrorMessage(v))     // String

      result
    }

  }

  implicit class JavaPutRecordsResultEntryOps(val self: JavaPutRecordsResultEntry) extends AnyVal {

    def toScala: ScalaPutRecordsResultEntry = {
      ScalaPutRecordsResultEntry()
        .withSequenceNumber(Option(self.getSequenceNumber)) // String
        .withShardId(Option(self.getShardId)) // String
        .withErrorCode(Option(self.getErrorCode)) // String
        .withErrorMessage(Option(self.getErrorMessage)) // String
    }

  }

}
