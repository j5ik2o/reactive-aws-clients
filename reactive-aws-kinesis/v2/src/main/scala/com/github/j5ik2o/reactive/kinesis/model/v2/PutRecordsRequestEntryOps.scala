package com.github.j5ik2o.reactive.kinesis.model.v2

import com.github.j5ik2o.reactive.kinesis.model.{ PutRecordsRequestEntry => ScalaPutRecordsRequestEntry }
import software.amazon.awssdk.core.SdkBytes
import software.amazon.awssdk.services.kinesis.model.{ PutRecordsRequestEntry => JavaPutRecordsRequestEntry }

object PutRecordsRequestEntryOps {

  implicit class ScalaPutRecordsRequestEntryOps(val self: ScalaPutRecordsRequestEntry) extends AnyVal {

    def toJava: JavaPutRecordsRequestEntry = {
      val result = JavaPutRecordsRequestEntry.builder()
      self.data.map(SdkBytes.fromByteBuffer).foreach(result.data)
      self.explicitHashKey.foreach(result.explicitHashKey)
      self.partitionKey.foreach(result.partitionKey)
      result.build()
    }

  }

  implicit class JavaPutRecordsRequestEntryOps(val self: JavaPutRecordsRequestEntry) extends AnyVal {

    def toScala: ScalaPutRecordsRequestEntry = {
      ScalaPutRecordsRequestEntry()
        .withData(Option(self.data()).map(_.asByteBuffer()))
        .withExplicitHashKey(Option(self.explicitHashKey()))
        .withPartitionKey(Option(self.partitionKey()))
    }

  }

}
