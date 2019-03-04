package com.github.j5ik2o.reactive.kinesis.model.v2

import com.github.j5ik2o.reactive.kinesis.model.{ EncryptionType, PutRecordsResponse => ScalaPutRecordsResponse }
import software.amazon.awssdk.services.kinesis.model.{ PutRecordsResponse => JavaPutRecordsResponse }

import scala.collection.JavaConverters._
import scala.compat.java8.OptionConverters._

object PutRecordsResponseOps {

  import PutRecordsResultEntryOps._

  implicit class JavaPutRecordsResponseOps(val self: JavaPutRecordsResponse) extends AnyVal {
    def toScala: ScalaPutRecordsResponse = {
      ScalaPutRecordsResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withFailedRecordCount(Option(self.failedRecordCount()))
        .withRecords(Option(self.records()).map(_.asScala.map(_.toScala)))
        .withEncryptionType(Option(self.encryptionType()).map(_.toString).map(EncryptionType.withName))
    }

  }

}
