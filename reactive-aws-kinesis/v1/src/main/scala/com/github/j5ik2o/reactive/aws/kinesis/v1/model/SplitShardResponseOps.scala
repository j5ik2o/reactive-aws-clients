// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v1.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{ SplitShardResponse => ScalaSplitShardResponse, _ }
import com.amazonaws.services.kinesis.model.{ SplitShardResult => JavaSplitShardResponse }

import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object SplitShardResponseOps {

  implicit class JavaSplitShardResponseOps(val self: JavaSplitShardResponse) extends AnyVal {

    def toScala: ScalaSplitShardResponse = {
      ScalaSplitShardResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
    }

  }

}
