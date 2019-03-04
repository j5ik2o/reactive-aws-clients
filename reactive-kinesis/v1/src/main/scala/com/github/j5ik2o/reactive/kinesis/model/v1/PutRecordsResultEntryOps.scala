package com.github.j5ik2o.reactive.kinesis.model.v1

import com.amazonaws.services.kinesis.model.{ PutRecordsResultEntry => JavaPutRecordsResultEntry }
import com.github.j5ik2o.reactive.kinesis.model.{ PutRecordsResultEntry => ScalaPutRecordsResultEntry }

object PutRecordsResultEntryOps {

  implicit class ScalaPutRecordsResultEntryOps(val self: ScalaPutRecordsResultEntry) extends AnyVal {

    def toJava: JavaPutRecordsResultEntry = {
      val result = new JavaPutRecordsResultEntry()
      self.sequenceNumber.foreach(result.setSequenceNumber)
      self.shardId.foreach(result.setShardId)
      self.errorCode.foreach(result.setErrorCode)
      self.errorMessage.foreach(result.setErrorMessage)
      result
    }

  }

  implicit class JavaPutRecordsResultEntryOps(val self: JavaPutRecordsResultEntry) extends AnyVal {

    def toScala: ScalaPutRecordsResultEntry = {
      ScalaPutRecordsResultEntry()
        .withSequenceNumber(Option(self.getSequenceNumber))
        .withShardId(Option(self.getShardId))
        .withErrorCode(Option(self.getErrorCode))
        .withErrorMessage(Option(self.getErrorMessage))
    }

  }

}
