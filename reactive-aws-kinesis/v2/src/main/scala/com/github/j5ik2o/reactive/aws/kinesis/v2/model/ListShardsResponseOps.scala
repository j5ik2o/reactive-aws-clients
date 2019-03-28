// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v2.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{ ListShardsResponse => ScalaListShardsResponse, _ }
import software.amazon.awssdk.services.kinesis.model.{ ListShardsResponse => JavaListShardsResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ListShardsResponseOps {

  implicit class JavaListShardsResponseOps(val self: JavaListShardsResponse) extends AnyVal {

    def toScala: ScalaListShardsResponse = {
      ScalaListShardsResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withShards(Option(self.shards).map { v =>
          import scala.collection.JavaConverters._, ShardOps._; v.asScala.map(_.toScala)
        }) // Seq[Shard]
        .withNextToken(Option(self.nextToken)) // String
    }

  }

}
