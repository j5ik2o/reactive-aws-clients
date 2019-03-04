package com.github.j5ik2o.reactive.aws.kinesis.model.v2

import com.github.j5ik2o.reactive.aws.kinesis.model.{ ListShardsResponse => ScalaListShardsResponse }
import software.amazon.awssdk.services.kinesis.model.{ ListShardsResponse => JavaListShardsResponse }

import scala.collection.JavaConverters._
import scala.compat.java8.OptionConverters._

object ListShardsResponseOps {

  import ShardOps._

  implicit class JavaListShardsResponseOps(val self: JavaListShardsResponse) extends AnyVal {

    def toScala: ScalaListShardsResponse = {
      ScalaListShardsResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withShards(Option(self.shards()).map(_.asScala.map(_.toScala)))
        .withNextToken(Option(self.nextToken()))
    }

  }

}
