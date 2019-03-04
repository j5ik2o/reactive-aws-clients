package com.github.j5ik2o.reactive.aws.kinesis.model.v1

import com.amazonaws.services.kinesis.model.{ Record => JavaRecord }
import com.github.j5ik2o.reactive.aws.kinesis.model.{ EncryptionType, Record => ScalaRecord }

object RecordOps {

  implicit class JavaRecordOps(val self: JavaRecord) extends AnyVal {

    def toScala: ScalaRecord = {
      ScalaRecord()
        .withSequenceNumber(Option(self.getSequenceNumber))
        .withApproximateArrivalTimestamp(Option(self.getApproximateArrivalTimestamp).map(_.toInstant))
        .withData(Option(self.getData))
        .withPartitionKey(Option(self.getPartitionKey))
        .withEncryptionType(Option(self.getEncryptionType).map(EncryptionType.withName))
    }

  }

}
