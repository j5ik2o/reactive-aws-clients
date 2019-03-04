package com.github.j5ik2o.reactive.kinesis.model.v2

import com.github.j5ik2o.reactive.kinesis.model.{ GetShardIteratorResponse => ScalaGetShardIteratorResponse }
import software.amazon.awssdk.services.kinesis.model.{ GetShardIteratorResponse => JavaGetShardIteratorResponse }

import scala.collection.JavaConverters._
import scala.compat.java8.OptionConverters._

object GetShardIteratorResponseOps {

  implicit class JavaGetShardIteratorResponseOps(val self: JavaGetShardIteratorResponse) extends AnyVal {
    def toScala: ScalaGetShardIteratorResponse = {
      ScalaGetShardIteratorResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withShardIterator(Option(self.shardIterator()))
    }
  }

}
