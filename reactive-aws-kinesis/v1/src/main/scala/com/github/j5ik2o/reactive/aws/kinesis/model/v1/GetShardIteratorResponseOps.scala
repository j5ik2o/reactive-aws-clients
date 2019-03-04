package com.github.j5ik2o.reactive.aws.kinesis.model.v1

import com.amazonaws.services.kinesis.model.{ GetShardIteratorResult => JavaGetShardIteratorResult }
import com.github.j5ik2o.reactive.aws.kinesis.model.{ GetShardIteratorResponse => ScalaGetShardIteratorResponse }

import scala.collection.JavaConverters._
object GetShardIteratorResponseOps {

  implicit class JavaGetShardIteratorResponseOps(val self: JavaGetShardIteratorResult) extends AnyVal {
    def toScala: ScalaGetShardIteratorResponse = {
      ScalaGetShardIteratorResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withShardIterator(Option(self.getShardIterator()))
    }
  }

}
