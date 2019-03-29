// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v1.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{ UpdateShardCountResponse => ScalaUpdateShardCountResponse, _ }
import com.amazonaws.services.kinesis.model.{ UpdateShardCountResult => JavaUpdateShardCountResponse }

import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object UpdateShardCountResponseOps {

  implicit class JavaUpdateShardCountResponseOps(val self: JavaUpdateShardCountResponse) extends AnyVal {

    def toScala: ScalaUpdateShardCountResponse = {
      ScalaUpdateShardCountResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withStreamName(Option(self.getStreamName)) // String
        .withCurrentShardCount(Option(self.getCurrentShardCount).map(_.intValue)) // Int
        .withTargetShardCount(Option(self.getTargetShardCount).map(_.intValue)) // Int
    }

  }

}
