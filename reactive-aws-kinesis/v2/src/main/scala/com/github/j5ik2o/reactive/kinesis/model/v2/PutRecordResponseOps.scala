package com.github.j5ik2o.reactive.kinesis.model.v2

import com.github.j5ik2o.reactive.kinesis.model.{ EncryptionType, PutRecordResponse => ScalaJavaPutRecordResponse }
import software.amazon.awssdk.services.kinesis.model.{ PutRecordResponse => JavaPutRecordResponse }

import scala.collection.JavaConverters._
import scala.compat.java8.OptionConverters._

object PutRecordResponseOps {

  implicit class JavaPutRecordResponseOps(val self: JavaPutRecordResponse) extends AnyVal {

    def toScala: ScalaJavaPutRecordResponse = {
      ScalaJavaPutRecordResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withShardId(Some(self.shardId()))
        .withSequenceNumber(Some(self.sequenceNumber()))
        .withEncryptionType(Option(self.encryptionType()).map(_.toString).map(EncryptionType.withName))
    }

  }

}
