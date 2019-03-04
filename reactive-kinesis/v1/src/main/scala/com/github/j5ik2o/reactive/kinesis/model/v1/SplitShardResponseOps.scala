package com.github.j5ik2o.reactive.kinesis.model.v1

import com.amazonaws.services.kinesis.model.{ SplitShardResult => JavaSplitShardResponse }
import com.github.j5ik2o.reactive.kinesis.model.{ SplitShardResponse => ScalaSplitShardResponse }

import scala.collection.JavaConverters._

object SplitShardResponseOps {

  implicit class JavaSplitShardResponseOps(val self: JavaSplitShardResponse) extends AnyVal {

    def toScala: ScalaSplitShardResponse = {
      ScalaSplitShardResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))

    }

  }

}
