package com.github.j5ik2o.reactive.kinesis.model.v1

import com.amazonaws.services.kinesis.model.{ PutRecordResult => JavaPutRecordResponse }
import com.github.j5ik2o.reactive.kinesis.model.{ EncryptionType, PutRecordResponse => ScalaJavaPutRecordResponse }

import scala.collection.JavaConverters._
object PutRecordResponseOps {

  implicit class JavaPutRecordResponseOps(val self: JavaPutRecordResponse) extends AnyVal {

    def toScala: ScalaJavaPutRecordResponse = {
      ScalaJavaPutRecordResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withShardId(Some(self.getShardId))
        .withSequenceNumber(Some(self.getSequenceNumber))
        .withEncryptionType(Option(self.getEncryptionType).map(EncryptionType.withName))
    }

  }

}
