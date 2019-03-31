// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import com.github.j5ik2o.reactive.aws.kinesis.model.{ PutRecordsResponse => ScalaPutRecordsResponse, _ }
import software.amazon.awssdk.services.kinesis.model.{ PutRecordsResponse => JavaPutRecordsResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object PutRecordsResponseOps {

  implicit class JavaPutRecordsResponseOps(val self: JavaPutRecordsResponse) extends AnyVal {

    def toScala: ScalaPutRecordsResponse = {
      ScalaPutRecordsResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withFailedRecordCount(Option(self.failedRecordCount).map(_.intValue)) // Int
        .withRecords(Option(self.records).map { v =>
          import scala.collection.JavaConverters._, PutRecordsResultEntryOps._; v.asScala.map(_.toScala)
        }) // Seq[PutRecordsResultEntry]
        .withEncryptionType(Option(self.encryptionType).map { v =>
          import EncryptionTypeOps._; v.toScala
        }) // String
    }

  }

}
