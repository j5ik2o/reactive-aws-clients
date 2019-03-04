package com.github.j5ik2o.reactive.aws.kinesis.model.v2

import com.github.j5ik2o.reactive.aws.kinesis.model.{ UpdateShardCountResponse => ScalaUpdateShardCountResponse }
import software.amazon.awssdk.services.kinesis.model.{ UpdateShardCountResponse => JavaUpdateShardCountResponse }

import scala.collection.JavaConverters._
import scala.compat.java8.OptionConverters._

object UpdateShardCountResponseOps {

  implicit class JavaUpdateShardCountResponseOps(val self: JavaUpdateShardCountResponse) extends AnyVal {

    def toScala: ScalaUpdateShardCountResponse = {
      ScalaUpdateShardCountResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withStreamName(Option(self.streamName()))
        .withCurrentShardCount(Option(self.currentShardCount()))
        .withTargetShardCount(Option(self.targetShardCount()))
    }

  }

}
