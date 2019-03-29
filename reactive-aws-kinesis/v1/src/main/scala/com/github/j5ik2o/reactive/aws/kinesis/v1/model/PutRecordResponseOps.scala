// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v1.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{ PutRecordResponse => ScalaPutRecordResponse, _ }
import com.amazonaws.services.kinesis.model.{ PutRecordResult => JavaPutRecordResponse }

import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object PutRecordResponseOps {

  implicit class JavaPutRecordResponseOps(val self: JavaPutRecordResponse) extends AnyVal {

    def toScala: ScalaPutRecordResponse = {
      ScalaPutRecordResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withShardId(Option(self.getShardId)) // String
        .withSequenceNumber(Option(self.getSequenceNumber)) // String
        .withEncryptionType(Option(self.getEncryptionType).map { v =>
          import EncryptionTypeOps._; v.toScala
        }) // String
    }

  }

}
