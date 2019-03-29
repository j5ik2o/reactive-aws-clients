// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v1.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{ PutRecordsRequest => ScalaPutRecordsRequest, _ }
import com.amazonaws.services.kinesis.model.{ PutRecordsRequest => JavaPutRecordsRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object PutRecordsRequestOps {

  implicit class ScalaPutRecordsRequestOps(val self: ScalaPutRecordsRequest) extends AnyVal {

    def toJava: JavaPutRecordsRequest = {
      val result = new JavaPutRecordsRequest()
      self.records.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, PutRecordsRequestEntryOps._;
        result.withRecords(v.map(_.toJava).asJava)
      } // Seq[PutRecordsRequestEntry]
      self.streamName.filter(_.nonEmpty).foreach(v => result.withStreamName(v)) // String

      result
    }

  }

}
