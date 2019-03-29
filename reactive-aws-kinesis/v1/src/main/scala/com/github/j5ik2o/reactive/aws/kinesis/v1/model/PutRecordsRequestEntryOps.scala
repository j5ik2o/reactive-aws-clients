// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v1.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{ PutRecordsRequestEntry => ScalaPutRecordsRequestEntry, _ }
import com.amazonaws.services.kinesis.model.{ PutRecordsRequestEntry => JavaPutRecordsRequestEntry }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object PutRecordsRequestEntryOps {

  implicit class ScalaPutRecordsRequestEntryOps(val self: ScalaPutRecordsRequestEntry) extends AnyVal {

    def toJava: JavaPutRecordsRequestEntry = {
      val result = new JavaPutRecordsRequestEntry()
      self.data.filter(_.nonEmpty).foreach(v => result.withData(java.nio.ByteBuffer.wrap(v))) // SdkBytes
      self.explicitHashKey.filter(_.nonEmpty).foreach(v => result.withExplicitHashKey(v))     // String
      self.partitionKey.filter(_.nonEmpty).foreach(v => result.withPartitionKey(v))           // String

      result
    }

  }

  implicit class JavaPutRecordsRequestEntryOps(val self: JavaPutRecordsRequestEntry) extends AnyVal {

    def toScala: ScalaPutRecordsRequestEntry = {
      ScalaPutRecordsRequestEntry()
        .withData(Option(self.getData).map(_.array())) // SdkBytes
        .withExplicitHashKey(Option(self.getExplicitHashKey)) // String
        .withPartitionKey(Option(self.getPartitionKey)) // String
    }

  }

}
