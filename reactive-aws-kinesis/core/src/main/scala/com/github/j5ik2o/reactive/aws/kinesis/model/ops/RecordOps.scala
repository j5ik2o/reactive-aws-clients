// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import com.github.j5ik2o.reactive.aws.kinesis.model.{ Record => ScalaRecord, _ }
import software.amazon.awssdk.services.kinesis.model.{ Record => JavaRecord }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object RecordOps {

  implicit class ScalaRecordOps(val self: ScalaRecord) extends AnyVal {

    def toJava: JavaRecord = {
      val result = JavaRecord.builder()
      self.sequenceNumber.filter(_.nonEmpty).foreach(v => result.sequenceNumber(v))        // String
      self.approximateArrivalTimestamp.foreach(v => result.approximateArrivalTimestamp(v)) // Instant
      self.data
        .filter(_.nonEmpty).foreach(v => result.data(software.amazon.awssdk.core.SdkBytes.fromByteArray(v))) // SdkBytes
      self.partitionKey.filter(_.nonEmpty).foreach(v => result.partitionKey(v))                              // String
      self.encryptionType.foreach { v =>
        import EncryptionTypeOps._; result.encryptionType(v.toJava)
      } // String

      result.build()
    }

  }

  implicit class JavaRecordOps(val self: JavaRecord) extends AnyVal {

    def toScala: ScalaRecord = {
      ScalaRecord()
        .withSequenceNumber(Option(self.sequenceNumber)) // String
        .withApproximateArrivalTimestamp(Option(self.approximateArrivalTimestamp)) // Instant
        .withData(Option(self.data).map(_.asByteArray())) // SdkBytes
        .withPartitionKey(Option(self.partitionKey)) // String
        .withEncryptionType(Option(self.encryptionType).map { v =>
          import EncryptionTypeOps._; v.toScala
        }) // String
    }

  }

}
