package com.github.j5ik2o.reactive.kinesis.model.v1

import com.amazonaws.services.kinesis.model.{ GetRecordsResult => JavaGetRecordsResponse }
import com.github.j5ik2o.reactive.kinesis.model.{ GetRecordsResponse => ScalaGetRecordsResponse }

import scala.collection.JavaConverters._

object GetRecordsResponseOps {

  import RecordOps._

  implicit class JavaGetRecordsResponseOps(val self: JavaGetRecordsResponse) extends AnyVal {

    def toScala: ScalaGetRecordsResponse = {
      ScalaGetRecordsResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withRecords(Option(self.getRecords).map(_.asScala.map(_.toScala)))
        .withNextShardIterator(Option(self.getNextShardIterator))
        .withMillisBehindLatest(Option(self.getMillisBehindLatest()))
    }

  }

}
