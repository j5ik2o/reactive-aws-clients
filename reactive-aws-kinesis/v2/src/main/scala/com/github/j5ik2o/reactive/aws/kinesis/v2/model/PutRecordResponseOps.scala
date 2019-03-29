// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v2.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{ PutRecordResponse => ScalaPutRecordResponse, _ }
import software.amazon.awssdk.services.kinesis.model.{ PutRecordResponse => JavaPutRecordResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object PutRecordResponseOps {

  implicit class JavaPutRecordResponseOps(val self: JavaPutRecordResponse) extends AnyVal {

    def toScala: ScalaPutRecordResponse = {
      ScalaPutRecordResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withShardId(Option(self.shardId)) // String
        .withSequenceNumber(Option(self.sequenceNumber)) // String
        .withEncryptionType(Option(self.encryptionType).map { v =>
          import EncryptionTypeOps._; v.toScala
        }) // String
    }

  }

}
