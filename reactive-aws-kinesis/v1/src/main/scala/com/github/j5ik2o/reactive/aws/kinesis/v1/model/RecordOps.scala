// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v1.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{ Record => ScalaRecord, _ }
import com.amazonaws.services.kinesis.model.{ Record => JavaRecord }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object RecordOps {

  implicit class ScalaRecordOps(val self: ScalaRecord) extends AnyVal {

    def toJava: JavaRecord = {
      val result = new JavaRecord()
      self.sequenceNumber.filter(_.nonEmpty).foreach(v => result.withSequenceNumber(v)) // String
      self.approximateArrivalTimestamp
        .map(java.util.Date.from).foreach(v => result.withApproximateArrivalTimestamp(v))     // Instant
      self.data.filter(_.nonEmpty).foreach(v => result.withData(java.nio.ByteBuffer.wrap(v))) // SdkBytes
      self.partitionKey.filter(_.nonEmpty).foreach(v => result.withPartitionKey(v))           // String
      self.encryptionType.foreach { v =>
        import EncryptionTypeOps._; result.withEncryptionType(v.toJava)
      } // String

      result
    }

  }

  implicit class JavaRecordOps(val self: JavaRecord) extends AnyVal {

    def toScala: ScalaRecord = {
      ScalaRecord()
        .withSequenceNumber(Option(self.getSequenceNumber)) // String
        .withApproximateArrivalTimestamp(Option(self.getApproximateArrivalTimestamp).map(_.toInstant)) // Instant
        .withData(Option(self.getData).map(_.array())) // SdkBytes
        .withPartitionKey(Option(self.getPartitionKey)) // String
        .withEncryptionType(Option(self.getEncryptionType).map { v =>
          import EncryptionTypeOps._; v.toScala
        }) // String
    }

  }

}
