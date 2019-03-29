// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v1.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{ ListShardsResponse => ScalaListShardsResponse, _ }
import com.amazonaws.services.kinesis.model.{ ListShardsResult => JavaListShardsResponse }

import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ListShardsResponseOps {

  implicit class JavaListShardsResponseOps(val self: JavaListShardsResponse) extends AnyVal {

    def toScala: ScalaListShardsResponse = {
      ScalaListShardsResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withShards(Option(self.getShards).map { v =>
          import scala.collection.JavaConverters._, ShardOps._; v.asScala.map(_.toScala)
        }) // Seq[Shard]
        .withNextToken(Option(self.getNextToken)) // String
    }

  }

}
