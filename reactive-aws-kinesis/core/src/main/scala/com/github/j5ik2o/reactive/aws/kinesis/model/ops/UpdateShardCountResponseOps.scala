// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import com.github.j5ik2o.reactive.aws.kinesis.model.{ UpdateShardCountResponse => ScalaUpdateShardCountResponse, _ }
import software.amazon.awssdk.services.kinesis.model.{ UpdateShardCountResponse => JavaUpdateShardCountResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object UpdateShardCountResponseOps {

  implicit class JavaUpdateShardCountResponseOps(val self: JavaUpdateShardCountResponse) extends AnyVal {

    def toScala: ScalaUpdateShardCountResponse = {
      ScalaUpdateShardCountResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withStreamName(Option(self.streamName)) // String
        .withCurrentShardCount(Option(self.currentShardCount).map(_.intValue)) // Int
        .withTargetShardCount(Option(self.targetShardCount).map(_.intValue)) // Int
    }

  }

}
