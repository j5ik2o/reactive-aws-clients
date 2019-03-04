package com.github.j5ik2o.reactive.aws.kinesis.model.v1

import com.amazonaws.services.kinesis.model.{ ListShardsResult => JavaListShardsResult }
import com.github.j5ik2o.reactive.aws.kinesis.model.{ ListShardsResponse => ScalaListShardsResponse }

import scala.collection.JavaConverters._
object ListShardsResponseOps {

  import ShardOps._

  implicit class JavaListShardsResponseOps(val self: JavaListShardsResult) extends AnyVal {

    def toScala: ScalaListShardsResponse = {
      ScalaListShardsResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withShards(Option(self.getShards).map(_.asScala.map(_.toScala)))
        .withNextToken(Option(self.getNextToken))
    }

  }

}
