// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v1.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{ PutRecordsResponse => ScalaPutRecordsResponse, _ }
import com.amazonaws.services.kinesis.model.{ PutRecordsResult => JavaPutRecordsResponse }

import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object PutRecordsResponseOps {

  implicit class JavaPutRecordsResponseOps(val self: JavaPutRecordsResponse) extends AnyVal {

    def toScala: ScalaPutRecordsResponse = {
      ScalaPutRecordsResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withFailedRecordCount(Option(self.getFailedRecordCount).map(_.intValue)) // Int
        .withRecords(Option(self.getRecords).map { v =>
          import scala.collection.JavaConverters._, PutRecordsResultEntryOps._; v.asScala.map(_.toScala)
        }) // Seq[PutRecordsResultEntry]
        .withEncryptionType(Option(self.getEncryptionType).map { v =>
          import EncryptionTypeOps._; v.toScala
        }) // String
    }

  }

}
