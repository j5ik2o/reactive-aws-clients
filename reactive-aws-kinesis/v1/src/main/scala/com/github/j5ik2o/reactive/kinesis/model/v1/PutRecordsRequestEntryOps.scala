package com.github.j5ik2o.reactive.kinesis.model.v1

import com.amazonaws.services.kinesis.model.{ PutRecordsRequestEntry => JavaPutRecordsRequestEntry }
import com.github.j5ik2o.reactive.kinesis.model.{ PutRecordsRequestEntry => ScalaPutRecordsRequestEntry }

object PutRecordsRequestEntryOps {

  implicit class ScalaPutRecordsRequestEntryOps(val self: ScalaPutRecordsRequestEntry) extends AnyVal {

    def toJava: JavaPutRecordsRequestEntry = {
      val result = new JavaPutRecordsRequestEntry()
      self.data.foreach(result.setData)
      self.explicitHashKey.foreach(result.setExplicitHashKey)
      self.partitionKey.foreach(result.setPartitionKey)
      result
    }

  }

  implicit class JavaPutRecordsRequestEntryOps(val self: JavaPutRecordsRequestEntry) extends AnyVal {

    def toScala: ScalaPutRecordsRequestEntry = {
      ScalaPutRecordsRequestEntry()
        .withData(Option(self.getData))
        .withExplicitHashKey(Option(self.getExplicitHashKey))
        .withPartitionKey(Option(self.getPartitionKey))
    }

  }

}
