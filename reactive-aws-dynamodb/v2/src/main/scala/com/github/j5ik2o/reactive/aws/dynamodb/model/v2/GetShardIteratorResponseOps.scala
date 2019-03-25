package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ GetShardIteratorResponse => ScalaGetShardIteratorResponse, _ }
import software.amazon.awssdk.services.dynamodb.model.{ GetShardIteratorResponse => JavaGetShardIteratorResponse }

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
