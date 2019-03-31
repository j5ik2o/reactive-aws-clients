// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import com.github.j5ik2o.reactive.aws.kinesis.model.{ GetShardIteratorResponse => ScalaGetShardIteratorResponse, _ }
import software.amazon.awssdk.services.kinesis.model.{ GetShardIteratorResponse => JavaGetShardIteratorResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GetShardIteratorResponseOps {

  implicit class JavaGetShardIteratorResponseOps(val self: JavaGetShardIteratorResponse) extends AnyVal {

    def toScala: ScalaGetShardIteratorResponse = {
      ScalaGetShardIteratorResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withShardIterator(Option(self.shardIterator)) // String
    }

  }

}
