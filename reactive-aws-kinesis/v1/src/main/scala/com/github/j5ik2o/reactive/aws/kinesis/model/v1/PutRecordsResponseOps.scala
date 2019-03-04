package com.github.j5ik2o.reactive.aws.kinesis.model.v1

import com.amazonaws.services.kinesis.model.{ PutRecordsResult => JavaPutRecordsResponse }
import com.github.j5ik2o.reactive.aws.kinesis.model.{ EncryptionType, PutRecordsResponse => ScalaPutRecordsResponse }

import scala.collection.JavaConverters._

object PutRecordsResponseOps {

  import PutRecordsResultEntryOps._

  implicit class JavaPutRecordsResponseOps(val self: JavaPutRecordsResponse) extends AnyVal {
    def toScala: ScalaPutRecordsResponse = {
      ScalaPutRecordsResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withFailedRecordCount(Option(self.getFailedRecordCount()))
        .withRecords(Option(self.getRecords).map(_.asScala.map(_.toScala)))
        .withEncryptionType(Option(self.getEncryptionType).map(EncryptionType.withName))
    }

  }

}
