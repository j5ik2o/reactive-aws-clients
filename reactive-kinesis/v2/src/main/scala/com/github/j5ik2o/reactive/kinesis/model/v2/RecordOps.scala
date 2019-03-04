package com.github.j5ik2o.reactive.kinesis.model.v2

import com.github.j5ik2o.reactive.kinesis.model.{ EncryptionType, Record => ScalaRecord }
import software.amazon.awssdk.services.kinesis.model.{ Record => JavaRecord }

object RecordOps {

  implicit class JavaRecordOps(val self: JavaRecord) extends AnyVal {

    def toScala: ScalaRecord = {
      ScalaRecord()
        .withSequenceNumber(Option(self.sequenceNumber()))
        .withApproximateArrivalTimestamp(Option(self.approximateArrivalTimestamp()))
        .withData(Option(self.data()).map(_.asByteBuffer()))
        .withPartitionKey(Option(self.partitionKey()))
        .withEncryptionType(Option(self.encryptionType()).map(_.toString).map(EncryptionType.withName))
    }

  }

}
