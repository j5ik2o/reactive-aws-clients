package com.github.j5ik2o.reactive.aws.kinesis.model.v1

import com.amazonaws.services.kinesis.model.{ UpdateShardCountResult => JavaUpdateShardCountResponse }
import com.github.j5ik2o.reactive.aws.kinesis.model.{ UpdateShardCountResponse => ScalaUpdateShardCountResponse }

import scala.collection.JavaConverters._
object UpdateShardCountResponseOps {

  implicit class JavaUpdateShardCountResponseOps(val self: JavaUpdateShardCountResponse) extends AnyVal {

    def toScala: ScalaUpdateShardCountResponse = {
      ScalaUpdateShardCountResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withStreamName(Option(self.getStreamName))
        .withCurrentShardCount(Option(self.getCurrentShardCount))
        .withTargetShardCount(Option(self.getTargetShardCount))
    }

  }

}
