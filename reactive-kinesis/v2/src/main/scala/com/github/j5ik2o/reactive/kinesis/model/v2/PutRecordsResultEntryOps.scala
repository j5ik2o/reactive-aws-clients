package com.github.j5ik2o.reactive.kinesis.model.v2

import com.github.j5ik2o.reactive.kinesis.model.{ PutRecordsResultEntry => ScalaPutRecordsResultEntry }
import software.amazon.awssdk.services.kinesis.model.{ PutRecordsResultEntry => JavaPutRecordsResultEntry }

object PutRecordsResultEntryOps {

  implicit class ScalaPutRecordsResultEntryOps(val self: ScalaPutRecordsResultEntry) extends AnyVal {

    def toJava: JavaPutRecordsResultEntry = {
      val result = JavaPutRecordsResultEntry.builder()
      self.sequenceNumber.foreach(result.sequenceNumber)
      self.shardId.foreach(result.shardId)
      self.errorCode.foreach(result.errorCode)
      self.errorMessage.foreach(result.errorMessage)
      result.build()
    }

  }

  implicit class JavaPutRecordsResultEntryOps(val self: JavaPutRecordsResultEntry) extends AnyVal {

    def toScala: ScalaPutRecordsResultEntry = {
      ScalaPutRecordsResultEntry()
        .withSequenceNumber(Option(self.sequenceNumber()))
        .withShardId(Option(self.shardId()))
        .withErrorCode(Option(self.errorCode()))
        .withErrorMessage(Option(self.errorMessage()))
    }

  }

}
