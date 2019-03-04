package com.github.j5ik2o.reactive.aws.kinesis.model.v2

import com.github.j5ik2o.reactive.aws.kinesis.model.{ GetRecordsResponse => ScalaGetRecordsResponse }
import software.amazon.awssdk.services.kinesis.model.{ GetRecordsResponse => JavaGetRecordsResponse }

import scala.collection.JavaConverters._
import scala.compat.java8.OptionConverters._

object GetRecordsResponseOps {

  import RecordOps._

  implicit class JavaGetRecordsResponseOps(val self: JavaGetRecordsResponse) extends AnyVal {

    def toScala: ScalaGetRecordsResponse = {
      ScalaGetRecordsResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withRecords(Option(self.records()).map(_.asScala.map(_.toScala)))
        .withNextShardIterator(Option(self.nextShardIterator()))
        .withMillisBehindLatest(Option(self.millisBehindLatest()))
    }

  }

}
