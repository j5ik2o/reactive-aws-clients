// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v2.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{ PutRecordsRequestEntry => ScalaPutRecordsRequestEntry, _ }
import software.amazon.awssdk.services.kinesis.model.{ PutRecordsRequestEntry => JavaPutRecordsRequestEntry }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object PutRecordsRequestEntryOps {

  implicit class ScalaPutRecordsRequestEntryOps(val self: ScalaPutRecordsRequestEntry) extends AnyVal {

    def toJava: JavaPutRecordsRequestEntry = {
      val result = JavaPutRecordsRequestEntry.builder()
      self.data
        .filter(_.nonEmpty).foreach(v => result.data(software.amazon.awssdk.core.SdkBytes.fromByteArray(v))) // SdkBytes
      self.explicitHashKey.filter(_.nonEmpty).foreach(v => result.explicitHashKey(v))                        // String
      self.partitionKey.filter(_.nonEmpty).foreach(v => result.partitionKey(v))                              // String

      result.build()
    }

  }

  implicit class JavaPutRecordsRequestEntryOps(val self: JavaPutRecordsRequestEntry) extends AnyVal {

    def toScala: ScalaPutRecordsRequestEntry = {
      ScalaPutRecordsRequestEntry()
        .withData(Option(self.data).map(_.asByteArray())) // SdkBytes
        .withExplicitHashKey(Option(self.explicitHashKey)) // String
        .withPartitionKey(Option(self.partitionKey)) // String
    }

  }

}
